package spring_introduction;

import org.springframework.stereotype.Component;


public class Dog implements Pet {

    public Dog() {
        System.out.println("Create dog");
    }

    public void say() {
        System.out.println("Bow-Bow");
    }

    public void init(){
        System.out.println("Class dog init method");
    }

    public void destroy(){
        System.out.println("Class dog destroy method");
    }


}
