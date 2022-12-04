package org.NWSpringdemo.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext apcontext = new ClassPathXmlApplicationContext("beans-info.xml");
//        ApplicationContext apcontext2 = new ClassPathXmlApplicationContext("beans-info.xml");
        
        Car Dinesh = (Car)apcontext.getBean("mycar");
        System.out.println(Dinesh);
//        Object Raja = (Car)apcontext.getBean("mycar");
//        System.out.println(Raja);
        
//        
         Bike mybike = (Bike)apcontext.getBean("mybike");
         System.out.println(mybike);
//        Bike mybike2 = (Bike)apcontext.getBean("mybike");
//        System.out.println(mybike2);
//        
//        Bike mybike3 = (Bike)apcontext2.getBean("mybike");
//        System.out.println(mybike3);
//        Bike mybike4 = (Bike)apcontext2.getBean("mybike");
//        System.out.println(mybike4);
        
        
//      assigning values using contructor
        
        
        
    	
    }
}
