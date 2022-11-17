public class Phone {
    /**
     * 手机类抽象的概念
     * 1.成员属性(1.手机品牌（brand）2.手机价格（price）)
     * 2.成员方法
     *属性类型  属性名称
     */
    String brand;//品牌
    double price;//价格
    //拨打电话方法
    public  void call(String brand){
        System.out.println("使用"+brand+"手机拨打电话");
    }
    //发送短信方法
    public void sendMsg(){
        System.out.println("发送短信");
    }


}
