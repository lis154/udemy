package aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLogicAspect {

    @Around("execution (public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: В библиотеку пытаются вернуть книгу");

        long begin = System.currentTimeMillis();
        Object targetMethodresult = null;

        try {
            targetMethodresult = proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение + " + e);
           // targetMethodresult = "неизвестное название книги";
            throw e;
        }



        long end = System.currentTimeMillis();
        System.out.println("Time = " + (end - begin));

        System.out.println("aroundReturnBookLoggingAdvice: В библиотеку успешно вернули книгу");

        return targetMethodresult;
    }
}
