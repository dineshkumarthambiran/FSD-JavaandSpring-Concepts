package org.NWSpringdemo.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class App 
{
    public static void main( String[] args )
    {

//       using bean factory 
        ClassPathResource resource = new ClassPathResource("beans-info.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Car bean = (Car) factory.getBean("mycar");
//        System.out.println("using bean factory");
        System.out.println(bean);
 
        
//        using application context type1
        
        ApplicationContext Apcontext = new ClassPathXmlApplicationContext("beans-info.xml");
        Car bean2 = (Car) Apcontext.getBean("Dinesh");
//        System.out.println("using ApplicationContext ClassPathXmlApplicationContext ");
        System.out.println(bean2);

        
//         using application context type2
        
        ApplicationContext Apfilecontext = new FileSystemXmlApplicationContext("C:\\Users\\dines\\Documents\\workspace-spring-tool-suite-4-4.15.3.RELEASE\\SpringDemo\\src\\main\\resources\\beans-info.xml");
        Car bean3 = (Car) Apfilecontext.getBean("Raja");
//        System.out.println("using ApplicationContext FileSystemXmlApplicationContext ");
        System.out.println(bean3);

        
//         using application context type3

        ApplicationContext Apannotcontext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Car bean4 = Apannotcontext.getBean(Car.class);
//        System.out.println("using ApplicationContext AnnotationConfigApplicationContext ");
        System.out.println(bean4);
        
//        assigning values with the constructor
    }
    
   
}
