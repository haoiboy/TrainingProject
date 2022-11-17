public class WeightDemo {
    public static void main(String[] args) {
        Weight w1=new Weight();
        w1.setAge(21);
        w1.setName("张三");
        System.out.println(w1.toString());
        Weight w2=new Weight("赵四",23);
        System.out.println(w2.toString());
    }
}
