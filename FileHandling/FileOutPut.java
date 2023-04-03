package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class FileOutPut {

	public static void main(String[] args) throws IOException {
	Details arr[]=new Details[3];
	Scanner s=new Scanner(System.in);
	System.out.println("Name , Age , Address");
	for(int i=0;i<3;i++) {
		String name=s.next();
		int age=s.nextInt();
		String address=s.next();
		arr[i]=new Details(name,age,address);
	}//System.out.println(Arrays.toString(arr));
    try {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Abdur\\Fileout.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(arr);
		System.out.println("Serialized");
		oos.close();fos.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

class Details implements Serializable{
	
	String name;
	int age;
	String address;
	
	public String toString() {
		return name+" "+age+" "+address;
	}
	
	public Details(String name,int age,String address) {
	this.name=name;
	this.age=age;
	this.address=address;
	}
}