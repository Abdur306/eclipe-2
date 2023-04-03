package FileHandling;
import java.io.*;
public class ReaderinArray {

	public static void main(String[] args) throws FileNotFoundException {
     File file=new File("C:\\Users\\Administrator\\Desktop\\Abdur\\Zoho.txt");
		FileReader fr=new FileReader(file);
		System.out.println(file.length());
		char c[]=new char[(int)file.length()];
		try {
			fr.read(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(char p:c)
			System.out.print(p);
		
		
	}
}
