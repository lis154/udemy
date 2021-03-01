package aop;

import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

@Component("libraryBean")
public class UniLibrary {

    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary = ");
        System.out.println("_______________________________");
    }

    public String returnBook(){
        int n = 10 / 0;
        System.out.println("Мы возвращаем книгу из UniLibrary" );
        return "Война и мир";
    }

    public void getMagazin(){
        System.out.println("Мы берем журнал из UniLibrary  ");
        System.out.println("_______________________________");
    }

    public void returnMagazin(){
        System.out.println("Мы возвращаем журнал из UniLibrary" );
        System.out.println("_______________________________");
    }

    public void addBook(String personName, Book book){
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("_______________________________");
    }

    public void addMagazin(){
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("_______________________________");
    }




    public void getAllBook (String name, int age){
        System.out.println("берем все  " + name + "  " + age);
    }
}
