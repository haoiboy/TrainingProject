package day02;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Thread01 {
    class Res {
        public String username;
        public char sex;
        /**
         * flag 默认值==false
         * flag false 输入线程可以输入值 输出线程先拿到锁 释放锁
         * flag true 输出线程可以输出值
         */
        public boolean flag = false;

    }

    class InputThread extends Thread {
        private Res res;

        public InputThread(Res res) {
            this.res = res;
        }

        @Override
        public void run() {
            int count = 0;
            while (true) {
                synchronized (res) {
                    if (res.flag){
                        try {
                            res.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (count == 0) {
                        res.username = "于圣军";
                        res.sex = '男';
                    } else {
                        res.username = "小薇";
                        res.sex = '女';
                    }
                    //输出线程 输出值
                    res.flag = true;
                    //唤醒输出线程
                    res.notify();
                }
                count = (count + 1) % 2;
            }
        }
    }

    /**
     * 输出线程
     */
    class OutputThread extends Thread {
        private Res res;

        public OutputThread(Res res) {
            this.res = res;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (res) {
                    if (!res.flag) {
                        //如果res.flag=false 则，输出的线程主动释放锁
                        try {
                            res.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(res.username + "," + res.sex);
                    //输出完毕 交给输入线程继续输入
                    res.flag = false;
                    res.notify();

                }

            }
        }
    }

    public static void main(String[] args) {
        new Thread01().print();
    }

    public void print() {
        //全局对象
        Res res = new Res();
        //输入线程
        InputThread inputThread = new InputThread(res);
        OutputThread outputThread = new OutputThread(res);
        inputThread.start();
        outputThread.start();

    }
}
