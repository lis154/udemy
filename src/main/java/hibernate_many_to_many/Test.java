package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                                    addAnnotatedClass(Child.class).addAnnotatedClass(Section.class).buildSessionFactory();
        Session session = null;

        try{
            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Ilya", 5);
//            Child child2 = new Child("Dima", 6);
//            Child child3 = new Child("Kolya", 4);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("done");
        // **************************************************************

//            Section section1 = new Section("Voleibol");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor", 7);
////            Child child2 = new Child("Dima", 6);
////            Child child3 = new Child("Kolya", 4);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);


//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//          //  session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("done");

//*************************************************************************
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 5);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("done");


            //*************************************************************************

            session.beginTransaction();

            Child child = session.get(Child.class, 5);
            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();
            System.out.println("done");
        }finally {

        }
    }
}
