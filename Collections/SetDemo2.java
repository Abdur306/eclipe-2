package Collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		Array arry=new Array();
		arry.met();

	}
}
class Array{
	
	public void met() {
		ArrayList<Integer>arr=new ArrayList<>();
	arr.add(20);
	arr.add(30);
	arr.add(100);
	arr.add(45);
	arr.add(58);
	arr.add(28);
	arr.add(20);
	
	TreeSet<Integer>trr=new TreeSet<>(arr);
	for(int a:trr) {
		System.out.print(a+" ");
	}
	
	}		
}
