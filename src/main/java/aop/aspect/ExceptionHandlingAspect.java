package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("aop.aspect.MyPointcats.allAddMethods()")
    public void beforAddExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: лови исключения при попытке получить книгу/журнал");
        System.out.println("_______________________________");
    }
}
