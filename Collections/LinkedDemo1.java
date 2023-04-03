package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo1 {

	public static void main(String[] args) {
		LinkedList<String>arr=new LinkedList<>();
		arr.add("green");
		arr.add("voilet");
	    arr.add("navy blue");
	    arr.add("java Script");
	    arr.add("red");
	    arr.add(3,"raja");
//	    arr.addFirst("abdur");
//	    arr.addLast("rahman");
//	    Iterator<String>iter=arr.iterator();
//	    while(iter.hasNext()) {
//	    	System.out.println(iter.next());
//	    }
	    //print first,last elements
	    Object fst=arr.removeFirst();
	    Object lst=arr.removeLast();
	    System.out.println(arr);
	    
	    //remove the first ,last element
	    Object fst1=arr.removeFirst();
	    Object lst1=arr.removeLast();
	    System.out.println(arr);
	}

}
