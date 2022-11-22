package Class05;

public class Test02 {
    public static void main(String[] args) {
       // Constant constant=new Constant();
//        if(constant.COOE==300){//javaweb开发时
//            System.out.println("成功");
//        }
        int code=500;
//        System.out.println(Constant.CODE_200);
        if(Constant.CODE_200 ==code){
            System.out.println("成功");
            return;
        }
        if(Constant.CODE_500 ==code){
            System.out.println("错误");
            return;
        }
        if(Constant.CODE_404 == code){
            System.out.println("找不到");
            return;
        }
    }

}
