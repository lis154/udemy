package hibernate_One_to_one;


import hibernate_One_to_one.entity.Detail;
import hibernate_One_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).
                addAnnotatedClass(Detail.class).buildSessionFactory();

        Session session = null;
       try {
           Employee employee = new Employee("Misha2", "Sidorov2", "HR", 900);
           Detail detail = new Detail("Onega4", "sss99223999", "sa3@2asf");
           detail.setEmployee(employee);
           employee.setEmpDetail(detail);
           session = factory.getCurrentSession();

           session.beginTransaction();
            session.save(detail);
           session.getTransaction().commit();
           System.out.println("done");

       } finally {
            session.close();
           factory.close();
       }

    }
}
