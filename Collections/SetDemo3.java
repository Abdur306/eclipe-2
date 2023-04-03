package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 {
public static void main(String[] args) {

	ArrayList<Integer>arr=new ArrayList<>();
	arr.add(8);
	arr.add(2);
	arr.add(6);
	arr.add(8);
	arr.add(4);
	arr.add(2);
	arr.add(6 );
	System.out.println(arr.size());
	System.out.println(arr+" ");
	
	
	Set<Integer>sar=new HashSet<>(arr);
	System.out.println(sar.size());
//	System.out.println(sar+" ");
	Iterator<Integer>it=sar.iterator();
	while(it.hasNext()) {
		System.out.print(it.next()+" ");
	}
	
	
	
}
}

