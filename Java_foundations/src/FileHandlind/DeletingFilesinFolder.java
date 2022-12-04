package FileHandlind;

import java.io.File;

public class DeletingFilesinFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File folder = new File ("C:\\Users\\dines\\OneDrive\\Desktop\\new");
		
		File[] fileNames = folder.listFiles();
		
		for(File file:fileNames)
		{
			try {
				Thread.sleep(2000);
				file.delete();
				System.out.println(file.getName()+"has been deleted");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		folder.delete();
		System.out.println("Folder and files inside are deleted");
	}

}
