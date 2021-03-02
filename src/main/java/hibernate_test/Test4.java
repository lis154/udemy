package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

       try {
           Session session = factory.getCurrentSession();
           session.beginTransaction();

          // Employee employee = session.get(Employee.class, 5);
//           List<Employee> emps =  session.createQuery("from Employee where name = 'Elena'").getResultList();
//           for (int i = 0; i < emps.size(); i++) {
//                emps.get(i).setSalary(1000);
//           }

           session.createQuery("update Employee set salary = '6000' where name = 'Ilya'").executeUpdate();

          // employee.setSalary(5000);
           session.getTransaction().commit();
          // System.out.println(employee);
           System.out.println("done");
       } finally {
           factory.close();
       }

    }
}
