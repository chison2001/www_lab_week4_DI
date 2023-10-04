package org.example;

import org.example.auto_wiring.Department;
import org.example.beans.Class_;
import org.example.beans.Student;
import org.example.xmlbased.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student st1 = context.getBean("st2", Student.class);
        System.out.println(st1);
        Student st2 = context.getBean("st3", Student.class);
        System.out.println(st2);

        ApplicationContext context2 = new ClassPathXmlApplicationContext("collectionbeans.xml");
        Person p1 = context2.getBean("person", Person.class);
        System.out.println(p1);

        ApplicationContext context3 = new ClassPathXmlApplicationContext("literalvaluebeans.xml");
        Class_ class1 = context3.getBean("lop", Class_.class);
        System.out.println(class1);

        ApplicationContext context4 = new ClassPathXmlApplicationContext("auto_wiring.xml");
        Department dept1 = context4.getBean("dept1", Department.class);
        Department dept2 = context4.getBean("dept2", Department.class);
        Department dept3 = context4.getBean("dept3", Department.class);
        Department dept4 = context4.getBean("dept4", Department.class);

        System.out.println(dept1);
        System.out.println(dept2);
        System.out.println(dept3);
        System.out.println(dept4);




    }
}