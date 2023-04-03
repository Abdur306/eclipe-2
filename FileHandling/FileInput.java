package FileHandling;



import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileInput {

	public static void main(String[] args) {
     		
    Details []arr;
    try {
   FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Abdur\\Fileout.txt");
   ObjectInputStream ois=new ObjectInputStream(fis);
    }
    catch(Exception e) {
    	e.printStackTrace();
    }
	}
}

