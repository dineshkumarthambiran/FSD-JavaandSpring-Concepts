package FileHandlind.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentSerialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner s = new Scanner(System.in);
		StudentSerialisation student1 = new StudentSerialisation();
		System.out.println("enter the id and name of student");
		student1.setSid(5);
		student1.setsName("dina");
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos =  new FileOutputStream("C:\\Users\\dines\\OneDrive\\Desktop\\myobj.bin");
			System.out.println("file opened");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(student1);
			System.out.println("Successfully preserved");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("unable to preserve");
			e.printStackTrace();
		}
		finally
		{
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
