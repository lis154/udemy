package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


        UniLibrary library = context.getBean("libraryBean", UniLibrary.class);
        SchoolLibrary library2 = context.getBean("libraryBean2", SchoolLibrary.class);
//        library.getBook();
//        library2.getBook();
//        library.getMagazin();
        library.returnBook();
        context.close();
    }
}
