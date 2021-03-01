package aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcats {

    @Pointcut("execution(* abc* (..))")
    public void allAddMethods(){}
}
