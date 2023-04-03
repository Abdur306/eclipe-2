package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerializeDemo	 {

	public static void main(String[] args) throws IOException {
		Abdur ar[]=new Abdur[2];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++) {
		String name=s.next();
		int age=s.nextInt();
		ar[i]=new Abdur(name,age);
		}
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Serila.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(ar);
            oos.flush();
            oos.close();
            System.out.println("Serial donyy!@");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class Abdur implements Serializable{
	String name;
	int age;
	
	public Abdur(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
			return name+" "+age;
	}
}