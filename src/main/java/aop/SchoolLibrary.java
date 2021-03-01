package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean2")
public class SchoolLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Мы берем книгу SchoolLibrary");
    }
}
