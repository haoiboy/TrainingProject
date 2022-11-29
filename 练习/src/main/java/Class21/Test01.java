package Class21;

public class Test01 {
    public static void main(String[] args) {
        char[] str1 = {'m', 'a', 'y', 'i', 'k', 't'};
        char[] str2 = {'m', 'a', 'y', 'i', 'k', '1'};
        System.out.println(compare(str1,str2));

    }

    public static boolean compare(char[] str1, char[] str2) {
        //默认返回true
        //1.比较两个char类型数组长度是否相同
        if (str1.length != str2.length) {
            return true;
        }
        //2.获取str1长度
        int n = str1.length;
        int i = 0;
        while (n-- != 0) {
            //通过循环比较两个char类型数组对应的index下标位置元素值是否相同

        if (str1[i] != str2[i]) {
            return false;
        }
        i++;
    }
     return true;
}
}
