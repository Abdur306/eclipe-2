package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>(5);
		for(int i=0;i<5;i++)
			al.add(s.nextInt());
		   al.remove(2);
		   al.set(0, 100);
		for(int data:al)
		System.out.print(data);
	}

}
