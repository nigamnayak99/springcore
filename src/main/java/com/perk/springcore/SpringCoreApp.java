package com.perk.springcore;

import com.perk.springcore.Collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringCoreApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("file:src/main/resources/config/SetterInjectionConfig.xml");
        Student student1 = (Student) applicationContext1.getBean("student1");
        System.out.println("Setter Injection :" +student1);

        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("file:src/main/resources/config/SetterInjectionWithPSchema.xml");
        Student student2 = (Student) applicationContext2.getBean("student2");
        Student student3 = (Student) applicationContext2.getBean("student3");
        System.out.println("Setter Injection With P Schema: " +student2);
        System.out.println("Setter Injection With P Schema: " +student3);

        ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("file:src/main/resources/config/SetterInjectionWithCollectionsConfig.xml");
        Employee employee1 = (Employee) applicationContext3.getBean("employee1");
        System.out.println("Setter Injection With Collections: " +employee1);
    }
}
