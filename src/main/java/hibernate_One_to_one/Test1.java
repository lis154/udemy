package hibernate_One_to_one;


import hibernate_One_to_one.entity.Detail;
import hibernate_One_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).
                addAnnotatedClass(Detail.class).buildSessionFactory();

       try {
//           Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Kolya", "Ivanov", "HR", 500);
//            Detail detail = new Detail("Onega", "sss99999", "sa@asf");
//           employee.setEmpDetail(detail);
//           session.beginTransaction();
//
//            session.save(employee);
//
//
//           session.getTransaction().commit();
//
//           System.out.println("done");

//           Session session = factory.getCurrentSession();
//
//           Employee employee = new Employee("Oleg", "Smirnov", "IT", 700);
//           Detail detail = new Detail("Moskov", "sss44999", "sa@as44f");
//           employee.setEmpDetail(detail);
//           session.beginTransaction();
//           session.save(employee);
//           session.getTransaction().commit();
//           System.out.println("done");


//           Session session = factory.getCurrentSession();
//
//
//
//           session.beginTransaction();
//            Employee emp = session.get(Employee.class, 10);
//           System.out.println(emp.getEmpDetail());
//           session.getTransaction().commit();
//           System.out.println("done");

           Session session = factory.getCurrentSession();



           session.beginTransaction();
           Employee emp = session.get(Employee.class, 2);
           session.delete(emp);
           session.getTransaction().commit();
           System.out.println("done");

       } finally {

           factory.close();
       }

    }
}
