package aop;

import org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveRepositoriesAutoConfiguration;
import org.springframework.stereotype.Component;

import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Ilya Lapshinov", 4, 5);
        Student st2 = new Student("Mihail Ivanov", 1, 4);
        Student st3 = new Student("Elena Sidorova", 1, 4);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents");
        System.out.println(students);
        return students;
    }


}
