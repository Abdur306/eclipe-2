package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedDemo4Merge {

	public static void main(String[] args) {

		List<String>ar1=new LinkedList<>();
		ar1.add("red");
		ar1.add("blue");
		ar1.add("green");
		ar1.add("yellow");
		ar1.add("voilet");
		
		List<String>ar2=new LinkedList<>();
		ar2.addAll(ar1);
		ar2.add("pink");
		ar2.add("maroon");
		List<String>arr3=new LinkedList<>();
		for(String a:ar2) {
			arr3.add(ar1.contains(a)?a:"no");
		}
		System.out.println(arr3);
		}
}

