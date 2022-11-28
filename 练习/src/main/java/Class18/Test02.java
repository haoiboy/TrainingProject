package Class18;

public class Test02 {
    public static void main(String[] args) {
        String str1="mayikt";
        String str2="mayikt";
        //比较两个字符串的值是否相等，如果是就返回true，否则返回false
         boolean result=str1.equals(str2);
        System.out.println(result);
        String str3=null;
      //  System.out.println(str3.equals(str1));
        System.out.println(str1.equals(str3));
        //equals 比较时，前面如果是null.equals(比较)报错
        //空指针错误
    }
}
