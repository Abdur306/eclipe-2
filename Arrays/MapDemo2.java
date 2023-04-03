package Arrays;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo2 {
public static void main(String[] args) {
	HashMap<String,String>ma=new HashMap<>();
	ma.put("d", "Sumai");
	ma.put("f", "junai");
	ma.put("C", "Aayisha");
	ma.put("a", "Aafiya");
	ma.put("E", "Abdul");
	ma.put("b", "Zakira");
	ma.put("G", "Mohideen");
	for(String al:ma.keySet()) {
		System.out.print(al);
	}
	for(String name:ma.values()) {
		System.out.println(name);
	}
	Iterator<Entry<String,String>>iterate=ma.entrySet().iterator();
//	System.out.println("The Elements are ");
	while(iterate.hasNext()) {
	//	System.out.print(iterate.next()+" ");
	}
	
	Iterator<String>it2=ma.keySet().iterator();
	//System.out.println("Key Values are");
	while(it2.hasNext()) {
		//System.out.println(it2.next());
	}
	Iterator< String>it3=ma.values().iterator();
//	System.out.println("Values are ");
	while(it3.hasNext()) {
	//	System.out.println(it3.next());
	}
	
}
}
