package Arrays;

import java.util.Scanner;

public class StrBuild {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuilder strb=new StringBuilder(s.next());
		strb.append(" rahman");
		strb.insert(0,"M.");
		strb.replace(2, 7, "jameel");
	
		System.out.println(strb.length());
		System.out.println(strb);
	}

}
