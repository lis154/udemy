package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

@Component("personBean")
public class Person {
   // @Autowired
   // @Qualifier("catBean")
    private Pet pet;

   // @Value("${person.surname}")
    private String surname;
   // @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Create Person");
//        this.pet = pet;
//    }


//    public Person() {
//        System.out.println("Create Person");
//    }

    public void callYourPet(){
        System.out.println("Hello< pet");
        pet.say();
    }


    public void setPet(Pet pet) {
        System.out.println("Class person - set pet");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
