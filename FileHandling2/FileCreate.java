package FileHandling2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {

	public static void main(String[] args) throws IOException   {
	Scanner s=new Scanner(System.in);
		File f1=new File("C:\\Users\\Administrator\\Documents\\AbuFile.txt");
		System.out.println(f1.exists());
			FileWriter fw=new FileWriter(f1);
		String str="Abdur is a in incubation @ zoho";
		System.out.println("Write into file");
		String str2=s.nextLine();
		fw.write(str);
		fw.write(str2);
		fw.close();
		
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine()) {
			//String str1=sc.nextLine();
			System.out.println(sc.nextLine());
		}
		
		Scanner sc1=new Scanner(f1);
		
	}
}
