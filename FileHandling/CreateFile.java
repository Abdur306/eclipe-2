package FileHandling;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		
Project pp=new Project();
pp.Show();
	}

}
class Project{
	
	public void Show() {
		
		File file=new File("C:\\Users\\Administrator\\Desktop\\Abdur");
		File[] filefolder=file.listFiles();
		for(File f:filefolder) {
			if(f.isFile()) {
		 String filename=f.getName();
		 int last=filename.lastIndexOf(".");
		 String getname=filename.substring(last+1);
		 if(getname.equals("java"))
			 System.out.println(filename);
		}
		}
	}
}
 