package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		
     LinkedHashSet<String>lhs=new LinkedHashSet<>();
     lhs.add("abdur");
     lhs.add("rahman");
     lhs.add("jameel");
     lhs.add("haroon");
     lhs.add("shoba");
     lhs.add("suthis");
     
     Object obj[]=lhs.toArray();
     for(Object a:obj) {
    	 System.out.print(a+" ");
     }
     
//     Iterator item=lhs.iterator();
//      while(item.hasNext()) {
//    	  System.out.println(item.next());
//      }
  //   System.out.println(lhs.isEmpty());
    //System.out.println( lhs.contains("gopal"));
     

	}
}
