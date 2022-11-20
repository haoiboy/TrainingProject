package Practice;

public class Class15 {
    public static void main(String[] args) {
        /**
         * 小游戏：逢7报数
         * 1.数据在1~100之间，用for循环实现数据的获取
         * 2.根据规则，用if语句实现数据的判断，要么个位是7，要么十位是7，要么能被7整除
         * 解析：x%10==7   x/10%10==7     x%7==0
         * 3.在控制台输出满足规则的数据
         */
        System.out.println("逢7过");
        for(int x=1;x<100;x++){
            if(x%10==7||x/10%10==7||x%7==0){
                System.out.println(x);
            }
        }
    }
}
