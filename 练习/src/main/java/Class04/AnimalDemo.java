package Class04;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat1=new Cat("小猫A",3);
        Cat cat2=new Cat("小猫B",3);
        System.out.println(cat1.getName()+","+cat1.getAge());
        System.out.println(cat2.getName()+","+cat2.getAge());
        System.out.println("------------");
        Dog dog1=new Dog("小狗A",2);
        Dog dog2=new Dog("小狗B",1);
        System.out.println(dog1.getName()+","+dog1.getAge());
        System.out.println(dog2.getName()+","+dog2.getAge());
    }



}
