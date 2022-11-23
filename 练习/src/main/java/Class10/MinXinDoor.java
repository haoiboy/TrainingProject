package Class10;

public class MinXinDoor extends Door{


    public MinXinDoor(String name, int width, int height) {
        super(name, width, height);
    }

    public void open() {
        System.out.println("我是美心门，可以自动开门");
    }

    public void close() {
        System.out.println("我是美心门，可以自动关门");
    }
}
