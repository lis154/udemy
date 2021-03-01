package spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component ("catBean")
//@Primary
public class Cat implements Pet{

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat() {
        System.out.println("create cat Bean");
    }

    @Override
    public void say() {
        System.out.println("May-May");
    }

    @PostConstruct
    public void init(){
        System.out.println("Class cat init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class cat destroy method");
    }
}
