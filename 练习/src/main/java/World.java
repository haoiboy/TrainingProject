public class World {
    private String name;
    private int age;
    /**
     * 构造方法 方法的名与类名是一样的
     *无参构造方法 有参构造方法
     */
    //有参构造
  public World(String name){
        this.name=name;
    }
    public World(String name,int age){
      this.name=name;
      this.age=age;
    }
    public World(int age){
      this.age=age;
    }


        public World(){
        System.out.println("World 已经开始初始化了");
    }

    public String show(){
        return name+"-"+age;
    }
}
