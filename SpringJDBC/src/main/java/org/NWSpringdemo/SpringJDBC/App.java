package org.NWSpringdemo.SpringJDBC;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {	Scanner s = new Scanner(System.in);
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans-info.xml");
//    	this is for building connection and calling crud method
    	
    	EmployeeCrud Crud = (EmployeeCrud) context.getBean("empcrud");
    	
//    	by this we create object for employee   
    	Employee employee = (Employee) context.getBean("employee");
//    	System.out.println("enter the id");
//    	employee.setEid(s.nextInt());
//    	System.out.println("enter the name");
//    	employee.setEname(s.next());
//    	System.out.println("enter the location");
//    	employee.setLocation(s.next());
//    	System.out.println("enter the salary");
//    	employee.setSalary(s.nextInt());
//    	
//    	Crud.insertARecord(employee);
//    	Crud.updateARecord(employee);
    	
//    	Crud.deleteARecord(employee);
//    	System.out.println("enter the id");
//    	employee.setEid(s.nextInt());
//    	
//    	Crud.getAllrecords().stream().forEach(System.out::println);
    	
    	Crud.getAllrecordsUsingRowMap().stream().forEach(System.out::println);
    
    	
    	
    	
    }
}
