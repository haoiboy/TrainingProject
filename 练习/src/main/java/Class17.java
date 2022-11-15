public class Class17 {
    public static void main(String[] args) {
        /**
         * 定义一个方法 ，比较两个int类型数据是否相同
         * 1.定义方法：
         * 方法的返回值为boolean类型，如果返回true 则两个数组中的元素值都是相同的
         * 参数为两个数组(int[] arr1,int[] arr2)
         * 2.比较两个数组长度是否相同
         * 3.使用for循环比较数组内容
         */
        int[] arr1={11,22,33,44,55,66};
        int[] arr2={11,22,33,44,55,66};
        boolean compare=compare(arr1,arr2);
        System.out.println(compare);
    }

    /**
     *
     * @param arr1 数组1
     * @param arr2 数组2
     * @return boolean 如果返回true ，则两个数组中的元素都是相同的 否则不相同
     */
    public  static boolean  compare(int[] arr1,int[] arr2){
//1.判断两个数组长度是否相同
        if(arr1.length!=arr2.length)    {
            return  false;
        }
        //循环遍历数组中的元素值是否相同
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
             return  false;
            }
        }
        return  true;
    }
}
