package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
    Cat myCat = context.getBean("myPet", Cat.class);
    myCat.setName("Miri");
        Cat yourCat = context.getBean("myPet", Cat.class);
yourCat.setName("Barsik");
        System.out.println(myCat == yourCat);
        System.out.println(myCat.getName() + "      " + yourCat.getName());
        context.close();

    }
}
