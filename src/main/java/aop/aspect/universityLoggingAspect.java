package aop.aspect;

import aop.Student;
import ch.qos.logback.classic.spi.IThrowableProxy;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class universityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentLogginAdvice(){
        System.out.println("beforeGetStudentLogginAdvice: логируем получения списка студентов перед методом getStudents()");
    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentLogginAdvice(List<Student> students){
//        for (int i = 0; i < students.size(); i++) {
//            Student student = students.get(i);
//            String nameSurname = student.getNameSurname();
//            nameSurname = "Mr. " + nameSurname;
//            student.setNameSurname(nameSurname);
//
//            double avgGrade = student.getAvgGrade();
//            avgGrade = avgGrade + 1;
//            student.setAvgGrade(avgGrade);
//        }
//
//
//
//
//        System.out.println("aftereGetStudentLogginAdvice:логируем получения списка студентов после метода getStudents()");
//    }

    @AfterThrowing (pointcut = "execution (* getStudents())", throwing = "exeption")
    public void afterThrowingGetStudentsAdvice(Throwable exeption){
        System.out.println("afterThrowingGetStudentsAdvice: логируем выброс исключения + " + exeption);
    }
}
