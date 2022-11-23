package Class09;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Dog extends Animal{


    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("我是狗类，我喜欢吃骨头");
    }

    public void jump() {
        System.out.println("我是狗类，我要跳高啦");
    }
}
