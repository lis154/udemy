package spring_introduction;

import org.springframework.stereotype.Component;

@Component ("catBean")
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

    public void init(){
        System.out.println("Class cat init method");
    }

    public void destroy(){
        System.out.println("Class cat destroy method");
    }
}
