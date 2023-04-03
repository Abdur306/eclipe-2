package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo2 {

	public static void main(String[] args) {
		LinkedList<String>arr=new LinkedList<>();
		arr.add("red");
		arr.add("blue");
		arr.add("green");
		arr.add("yellow");
		arr.add("white");
		//Collections.swap(arr, 2,4 );
		//Collections.shuffle(arr);
		for(String a:arr) {
		//System.out.println("1st linked list"+a);
		}
		LinkedList<Integer>arr2=new LinkedList<>();
		arr2.add(2);
		arr2.add(0);
		arr2.add(5);
		for(int a1:arr2) {
		//	System.out.println("2nd linked list"+a1);
		}
		LinkedList arr3=new LinkedList<>();
		arr3.addAll(arr);
		arr3.addAll(arr2);
		System.out.println("PeekFirst : "+arr3.poll());
		Iterator iter=arr3.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}

