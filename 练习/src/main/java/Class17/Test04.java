package Class17;

public class Test04 {
    public static void main(String[] args) {
        //Class17.Student@38cccef 包名和类名组合
        Student stu = new Student();
        stu.setName("阿波");
        stu.setAge(22);
        /**jdk 底层分装好 提供API
         * 学会查看 jdk 底层分装的 Java源码
         */

        System.out.println(stu);
        System.out.println(stu.getClass().getName() + "@" + Integer.toHexString(stu.hashCode()));
        System.out.println(stu.toString());
        /**
         *   public void println(Object x) {
         *         String s = String.valueOf(x);
         *         synchronized (this) {
         *             print(s);
         *             newLine();
         *         }
         *      String s = String.valueOf(x);
         *
         *       public static String valueOf(Object obj) {
         *         return (obj == null) ? "null" : obj.toString();
         *     }
         *     底层是如何实现的？
         *     1.   String.valueOf(x);
         *     2. String.valueOf 底层是如何实现的
         *     通过三元表达式判断该对象是否为null
         *     如果是为null 则返回一个空字符串，
         *     不为空 则调用obj（父类中的）.toString()
         *     3.   return (obj == null) ? "null" : obj.toString();
         *     4.obj（父类中的）.toString()
         *     getClass().getName()----获取该类中的完整路径地址Class17.Student@
         *     hashCode()值转化成字符串的拼接
         *     5.return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
    }
}
