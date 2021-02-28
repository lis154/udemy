package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Dog implements Pet {

    public Dog() {
        System.out.println("Create dog");
    }

    public void say() {
        System.out.println("Bow-Bow");
    }


    @PostConstruct
    public void init(){
        System.out.println("Class dog init method");
    }


    @PreDestroy
    public void destroy(){
        System.out.println("Class dog destroy method");
    }




}
