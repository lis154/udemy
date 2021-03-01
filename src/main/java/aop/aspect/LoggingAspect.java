package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution (* aop.UniLibrary.*(..))")
//    private void allMethodsFromUnilabrary(){}
//
//    @Pointcut("execution (void aop.UniLibrary.returnMagazin())")
//    private void returnMagazinFromUnilabrary(){}
//
//    @Pointcut("allMethodsFromUnilabrary() && !returnMagazinFromUnilabrary()")
//    private void allMethodExcetRetunMagazinFromUnilabrary(){}
//
//    @Before("allMethodExcetRetunMagazinFromUnilabrary()")
//    public void beforeAllMethodExcetRetunMagazinAdvice(){
//        System.out.println("beforeAllMethodExcetRetunMagazinAdvice: writing log #10");
//    }

//    @Pointcut ("execution (v* aop.UniLibrary.get*())")
//    public void allGetMethodsFromUnilabrary(){}
//
//    @Pointcut ("execution (v* aop.UniLibrary.return*())")
//    public void allReturnMethodsFromUnilabrary(){}
//
//    @Pointcut("allGetMethodsFromUnilabrary() || allReturnMethodsFromUnilabrary()")
//    public void allGetOrReturnMethodsFromUnilabrary(){}
//
//
//    @Before("allGetMethodsFromUnilabrary()")
//    public void beforeGetLoginAdvice(){
//        System.out.println("beforeGetLoginAdvice: writing og #1");
//    }
//
//    @Before("allReturnMethodsFromUnilabrary()")
//    public void beforeReturnLoginAdvice(){
//        System.out.println("beforeReturnLoginAdvice: writing og# 2");
//    }
//
//    @Before("allGetOrReturnMethodsFromUnilabrary()")
//    public void beforGerOrReturnLogicAdvice(){
//        System.out.println("beforGerOrReturnLogicAdvice: writing log #3 ");
//    }







    //@Before("execution(public void  aop.SchoolLibrary.getBook())")
//    @Before("execution(public void  get* (aop.Book))")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice : попытка получить книгу");
//    }



    @Before("aop.aspect.MyPointcats.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature =   " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
           Object[] arguments = joinPoint.getArgs();
           for (Object obj:arguments){
               if(obj instanceof Book){
                   Book book = (Book)obj;
                   System.out.println("информация о книге: название книги - " + book.getName() + " " + book.getAuthor());
               } else if (obj instanceof String){
                   System.out.println("Книгу в библиотеку добавляет = " + obj);
               }
           }
        }


        System.out.println("beforeGetLoggingAdvice : логирование попытки получить книгу/журнал");
        System.out.println("_______________________________");
    }




    //@Before("execution(public void returnBook())")
//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeGetBookAdvice : попытка вернуть книгу");
//    }

}
