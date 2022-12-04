package FileHandlind.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDeserializeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ObjectInputStream ois =null;
		 try {
			  FileInputStream fis = new FileInputStream("C:\\\\Users\\\\dines\\\\OneDrive\\\\Desktop\\\\myobj.bin");  
			  ois = new ObjectInputStream(fis);
			  StudentSerialisation student = (StudentSerialisation)ois.readObject();
			  System.out.println("The preserved file is deserialized");
			  System.out.println(student.getSid());
			  System.out.println(student.getsName());
		 }
		 catch(IOException | ClassNotFoundException e)
		 {
			 System.out.println(e.getMessage());
		 }
		 finally
		 {
			 try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		
		
	}
	
}
