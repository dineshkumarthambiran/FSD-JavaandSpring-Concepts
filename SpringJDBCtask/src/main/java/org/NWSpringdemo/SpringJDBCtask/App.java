package org.NWSpringdemo.SpringJDBCtask;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-info.xml");
        
//       for creating connection to database
        
        DepartmentCrud Crud = (DepartmentCrud) context.getBean("deptcrud");
        
        Department department = (Department) context.getBean("dept");
        
        Scanner s = new Scanner(System.in);

        
        while(true)  
        {  
            System.out.println("Welcome to the Department database ");  
            System.out.println("Choose 1 to insert");  
            System.out.println("Choose 2 to update");  
            System.out.println("Choose 3 to delete");  
            System.out.println("Choose 4 to View All Records");  
            System.out.println("Choose 5 to find a Record"); 
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user for crud ops
            
            int choice = s.nextInt();  
            switch(choice)  
            {  
//            insert operation
                case 1:  
				

						System.out.println("enter the dept id");
						department.setDeptid(s.nextInt());
						System.out.println("enter the dept name");
						department.setDeptname(s.next());
						System.out.println("enter the location");
						department.setLocation(s.next());
			
						Crud.insertARecord(department);
						
						System.out.println("");
						System.out.println("Here is your updated database"); 
						
						Crud.getAllrecords().stream().forEach(System.out::println);
						System.out.println(""); 
				break;  
				
//   		update operation
               case 2:  
	            	   System.out.println("enter the dept id");
						department.setDeptid(s.nextInt());
						System.out.println("enter the dept name");
						department.setDeptname(s.next());
						System.out.println("enter the location");
						department.setLocation(s.next());
			
						Crud.updateARecord(department);
						
						System.out.println("");
						System.out.println("Here is your updated database"); 
						
						Crud.getAllrecords().stream().forEach(System.out::println);
						System.out.println("");
									
					
				break;  
				
//             delete operation
				case 3:  
						System.out.println("enter the dept id");
						department.setDeptid(s.nextInt());
			
						Crud.deleteARecord(department);
						
						System.out.println("");
						System.out.println("Here is your updated database"); 
						
						Crud.getAllrecords().stream().forEach(System.out::println);
						System.out.println("");
									
						 
				break;  
	
//			get all records
				case 4:  
					
						Crud.getAllrecords().stream().forEach(System.out::println);
									
						System.out.println("");  
				break;  
				
//			finding a record				
				case 5:  
					
					System.out.println("enter the dept id");
					department.setDeptid(s.nextInt());
		
					Crud.findARecord(department).stream().forEach(System.out::println);;
								
					System.out.println("");  
			break;  
            }
        }
        
        
        
    }
}
