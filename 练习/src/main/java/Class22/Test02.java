package Class22;

import java.util.Arrays;

public class Test02 {

    public static void main(String[] args) {
String str="97,43,65,87,54";
String[] strArr=str.split(",");
//2.将字符串数组转换成int类型
int[] intArr=new int[strArr.length];
//3.遍历String 字符串数组
        for(int i=0;i<strArr.length;i++){
            //4.将字符串转化成int类型赋值给 strArr[i]
            intArr[i]= Integer.parseInt(strArr[i]);
        }
        Arrays.sort(intArr);
        for(int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]+"," );
            if(i!=intArr.length-1){
                System.out.println(",");


        }
    }
}}
