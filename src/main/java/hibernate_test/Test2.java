package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

       try {
           Session session = factory.getCurrentSession();

           Employee emp = new Employee("Oleg", "Sidorov", "HR", 600);
           session.beginTransaction();
           session.save(emp);
          // session.getTransaction().commit();

           int myId = emp.getId();

         //  Session session2 = factory.getCurrentSession();
         //  session2.beginTransaction();
           Employee employee2 = session.get(Employee.class, myId);
           session.getTransaction().commit();
           System.out.println(employee2);
           System.out.println("done");
       } finally {
           factory.close();
       }

    }
}
