package Class10;

public class PanPanDoor extends Door implements Alarm{
    public PanPanDoor(String name, int width, int height) {
        super(name, width, height);
    }

    public void open() {
        System.out.println("我是盼盼门，自动指纹开门");
    }

    public void close() {
        System.out.println("我是盼盼门，自动关门");
    }
    public void alarm(){
        System.out.println("我是盼盼门我可以自动报警");
    }

}
