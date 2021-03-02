package hibernate_one_to_many_by;



import hibernate_one_to_many_by.entity.Department;
import hibernate_one_to_many_by.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.hql.internal.classic.SelectPathExpressionParser;

public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).
                addAnnotatedClass(Department.class).buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            Department department = new Department("It", 300, 1200);
//            Employee employee1 = new Employee("Ilya", "Lapshinov", 800);
//            Employee employee2= new Employee("Dima", "Ivanov", 500);
//
//            department.addEmployeToDepartment(employee1);
//            department.addEmployeToDepartment(employee2);
//
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//            System.out.println("done");
//**********************************************************************
            session = factory.getCurrentSession();




            session.beginTransaction();
          //  Department department = session.get(Department.class ,1);
          //  System.out.println(department);
          //  System.out.println(department.getEmps());

            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee);
            System.out.println(employee.getDepartment());

            session.getTransaction().commit();
            System.out.println("done");

        } finally {
            session.close();
            factory.close();
        }

    }
}
