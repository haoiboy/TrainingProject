package Class10;

public class Test01 {
    public static void main(String[] args) {
MinXinDoor minXinDoor=new MinXinDoor("美心门",200,400);
minXinDoor.open();
minXinDoor.close();
        System.out.println("我是"+minXinDoor.getName()+",宽度"
                +minXinDoor.getWidth()+",高度"+minXinDoor.getHeight());
        System.out.println("-----------");
        PanPanDoor panPanDoor=new PanPanDoor("盼盼门",200,400);
        panPanDoor.open();
        panPanDoor.close();
        panPanDoor.alarm();
        System.out.println("我是"+panPanDoor.getName()+",宽度"
                +panPanDoor.getWidth()+",高度"+panPanDoor.getHeight());
    }
}
