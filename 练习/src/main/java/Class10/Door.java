package Class10;

public abstract class Door {
    private String name;
    private int width;
    private int height;

    public Door(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public abstract void open();//开门
    public abstract void close();//关门

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
