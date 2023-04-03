package FileHandling;
import java.io.*;
public class FileWriteRead {

	public static void main(String[] args) throws IOException {
		
Abu a=new Abu();
a.met();
	}                  //********* File Reader & Writter *************//

}
class Abu{
	public void met() throws IOException {
		File f1=new File("C:\\Users\\Administrator\\Desktop\\Abdur\\Permutation.java");
//	
//		System.out.println(f1.exists());
//		FileWriter fw=new FileWriter(f1);
//		fw.write(100) ;
//		fw.write("im a abdur");
//		fw.flush();
//		fw.close();
		FileReader fr=new FileReader(f1);
		int output=fr.read();
		while(output!=-1) {
			System.out.print((char)output);
			output=fr.read();
		}
	}
}
