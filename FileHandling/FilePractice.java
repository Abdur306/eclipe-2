package FileHandling;
import java.io.*;
public class FilePractice {

	public static void main(String[] args) throws IOException {
		Blueprint bp=new Blueprint();
		bp.act();

	}

}
class Blueprint{
	
	public void act() throws IOException {
		File file=new File("C:\\Users\\Administrator\\Desktop\\Abdur\\welcome.txt");
		FileWriter fw=new FileWriter(file);
		fw.write("Hi Abdur rahman from Zoho \n");
		fw.write("The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela\r\n"
				+ "The way to get started is to quit talking and begin doing. -Walt Disney\r\n"
				+ "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking. -Steve Jobs\r\n"
				+ "If life were predictable it would cease to be life, and be without flavor. -Eleanor Roosevelt\r\n"
				+ "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough. -Oprah Winfrey\r\n"				+ "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success. -James Cameron\r\n"
				+ "Life is what happens when you're busy making other plans. -John Lennon");
		fw.flush();
		fw.close();
		FileReader fr=new FileReader(file);
		int op;//=fr.read();
		//while(op!=-1) {
		for(op=fr.read();op!=-1;) {
			System.out.print((char)op);
			op=fr.read();
		}
		
	}
}