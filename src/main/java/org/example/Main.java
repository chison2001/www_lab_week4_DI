package org.example;

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




    }
}