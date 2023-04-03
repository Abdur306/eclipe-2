package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo1 {
public static void main(String[] args) {

	 // map method used in this put(),isEmpty(),keySet(),values(),get(),entrySet()
	
	HashMap<Integer,String>marr=new HashMap<>();
	marr.put(103, "Abdur");
	marr.put(109, "jameel");
	marr.put(101, "anas");
	marr.put(104, "kunal");
	marr.put(110, "jameel");
	marr.put(109, "kavin");
	marr.put(103, "Ram");
	System.out.println("Key value :"+marr.keySet());
	System.out.println("Value values :"+marr.values());
	System.out.println("value is = "+marr.get(101));
	System.out.println(marr);
	//marr.remove(104);
	//System.out.println(marr);
	Set a=(Set)marr.entrySet();
	System.out.println(a);
	//marr.remove(101,"anas");
//	System.out.println(marr);
}
}
