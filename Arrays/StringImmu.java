package Arrays;

public class StringImmu {
public static void main(String[] args) {
	String str1="abdur";
	System.out.println(str1.hashCode());
	str1="rahman";
	System.out.println(str1.hashCode());
	str1= str1.concat("rahman");
	System.out.println(str1.hashCode());
}
}
