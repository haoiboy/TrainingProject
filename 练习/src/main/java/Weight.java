public class Weight {
    //成员变量
    private String name;
    private  int age;
    //无参和有参构造函数
    public  Weight(){
        this("王五",29);//this调用到其他的构造函数
        System.out.println("我是无参构造函数....");
    }
    public  Weight(String name,int age){
        System.out.println("通过有参构造给成员属性赋值");
        this.name=name;
        this.age=age;

    }

    /**
     *  成员方法 提供get和set方法
     *  get 获取该对象中成员属性值
     *  set 给对象中成员属性 赋值
     * @param 张三
     */
    public void setName(String name){
         this.name=name;
    }
    public void setAge(int age){

        this.age=age;
    }
    public String getName(){
return name;
    }
    public  int getAge(){
        return  age;
    }

    /**
     * 返回该类中所有的成员变量值
     * @return
     */
    public  String toString(){
        return name+"-"+age;
}

    public static void main(String[] args) {
        Weight weight = new Weight();
    }
}
