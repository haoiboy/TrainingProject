package day02;
public class Test02 {
    public static void main(String[] args) {
        Test02 test02 = new Test02();
//        MessageInterface messageInterface=()->  test02.objGet();
//        System.out.println(messageInterface.getMessage());

//        MessageInterface messageInterface = test02::objGet;
//        System.out.println(messageInterface.getMessage());
    }
    public String objGet(){
        return "zhaoyun";
    }
}
