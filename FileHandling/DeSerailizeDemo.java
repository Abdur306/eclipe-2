package FileHandling;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class DeSerailizeDemo {

	public static void main(String[] args) {
	
		Abdur ar[];
		try {
			FileInputStream fis=new FileInputStream("C:\\Serila.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ar=(Abdur[])(ois.readObject());
			for(int i=0;i<ar.length;i++) {
				System.out.println(ar[i]);
			}
			fis.close();
			ois.close();
		
		} catch (Exception e) {
				e.printStackTrace();
		}

	}
	
}
