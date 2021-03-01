package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

         Book book = context.getBean("book", Book.class);

        UniLibrary library = context.getBean("libraryBean", UniLibrary.class);
        SchoolLibrary library2 = context.getBean("libraryBean2", SchoolLibrary.class);
        library.getBook();
//        library2.getBook();
        library.getMagazin();
        library.addBook("Ivanov", book);
        library.addMagazin();
//        library.returnBook();
//        library.addBook();
//        library.getAllBook("book", 20);
        context.close();
    }
}
