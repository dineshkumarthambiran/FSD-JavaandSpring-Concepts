package org.NWSpringdemo.BeanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =  new ClassPathXmlApplicationContext("bean-info.xml");
       
//       first way of managing lifecycle
       Mentor dinesh = (Mentor) context.getBean("mymentor");
       System.out.println(dinesh);
       Student dina = (Student) context.getBean("student");
       System.out.println(dina);
       
//       second way using anotation
       School school = (School) context.getBean("school");
       System.out.println(school);
       
       Hostel hostel = (Hostel) context.getBean("hostel");
       System.out.println(hostel);
       
       
       
       
        
        
        ((AbstractApplicationContext)context).registerShutdownHook();
    }
}
