package FileHandling;
import java.io.*;
public class BuffRdWtr {

	public static void main(String[] args) {
		
Buf bb=new Buf();
bb.Bshow();
	}
}
class  Buf{
	public void Bshow() {
		File fl=new File("C:\\Users\\Administrator\\Desktop\\Abdur\\rewt.txt");
		try {
			FileWriter fw=new FileWriter(fl,true);
			BufferedWriter bFw=new BufferedWriter(fw);
			bFw.write("Tamil");
			bFw.newLine();
			bFw.write("English");
			bFw.newLine();
			bFw.write("Maths");
			bFw.newLine();
			bFw.flush();
			bFw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader  fr = new FileReader(fl);
		BufferedReader bFr=new BufferedReader(fr);
		try {
			String Line=bFr.readLine();
			while(Line!=null) {
				System.out.println(Line);
				Line=bFr.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	  
	  
	}
}
