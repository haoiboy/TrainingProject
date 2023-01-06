package day01;

public class Test03 {
    public static void main(String[] args) {
        //1.使用匿名内部类调用
        OrderService orderService1=new OrderService(){
            @Override
            public String get(int i,int j){
                return i+"--"+j;
            }
        };
        System.out.println(orderService1.get(1,2));
        //使用lambda调用有参函数构造
        OrderService orderService=(i,j)->{
            return i+"--"+j;
        };
orderService.get(1,2);


        String S=((OrderService) (i,j)-> i+"--"+j).get(1,2);
        System.out.println(S);
    }
}
