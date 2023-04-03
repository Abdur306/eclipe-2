package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedDemo3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		LinkedList<Integer> ll=new LinkedList();
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
			ll.add(i,s.nextInt());
		
		List<Integer>arr=new ArrayList<>(ll);
        for(int a:arr)
        	System.out.println(a);

	}

}
