package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class AlDemo {

	public static  void main(String[] args) {
Scanner s=new Scanner(System.in);
	ArrayList al=new ArrayList();	
	al.add(4);
	al.add(10);
	al.add(8);
	al.add(6);
	//al.add(3,200);
	al.add(2);
	al.add(5);
//	al.remove(2);
	//al.add(1,30);
	System.out.println(al);
	al.set(1, 2);
	//al.add(al);
	System.out.println(al);
	//System.out.println(al.isEmpty());
//	ArrayList al1=new ArrayList<>();
//	al1.add("A");
//	al1.add("B");
//
//   // al1.add(al);
//    al.clear();
//    System.out.println(al);
//    
    }
}
/*int n=s.nextInt();
		ArrayList<Integer>al1=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++) {
			al1.add(i,s.nextInt());
		}
		for(int a:al1)
			System.out.print(a);
	
	}*/