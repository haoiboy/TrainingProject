package Practice;

public class Class05 {
    /**
     * void 方法  没有任何返回值
     */
    public  static  int getMax(int a){
        return a;//getMax 方法 return 返回值 返回值要与方法定义的数据类型要匹配

    }

    public static void main(String[] args) {
        int max=getMax(10);
        System.out.println("max:"+max);
    }
}
