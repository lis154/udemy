package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public String returnBook(){
        System.out.println("Мы возвращаем книгу из UniLibrary");
        return null;
    }

    public void getMagazin(){
        System.out.println("Мы берем журнал из UniLibrary");
    }
}
