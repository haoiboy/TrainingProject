package Class12;

public class MayiktA {
    private int code=200;
    private int age=33;

        public void Mayikt() {
            class MayiktB {//局部内部类
                public void mayiktB() {
                    System.out.println("我是局部内部类...mayiktB");
                    System.out.println(code);
                    System.out.println(age);
                }
            }
            MayiktB mayiktB = new MayiktB();
            mayiktB.mayiktB();
        }
        public void show(){
            System.out.println("我是");
        }
    }


