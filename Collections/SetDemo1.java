package Collections;

import java.util.HashSet;

public class SetDemo1 {

	public static void main(String[] args) {
		Abdur abu=new Abdur();
		abu.met();

	}
}
class Abdur{ 
	
	public void met() {
	HashSet<Integer>hs=new HashSet<>();
    hs.add(10);
    hs.add(20);
    hs.add(30);
    hs.add(40);
    hs.add(20);
    hs.add(10);
    hs.add(25);
System.out.println("Set is :");
    for(int a:hs) {
    	System.out.print(a+" ");
    }
}
}
