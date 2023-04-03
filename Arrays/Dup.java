package Arrays;

import java.util.Scanner;

public class Dup {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					a[j]=1000;
					count++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]!=1000)
				System.out.print(a[i]+", ");
		}
		for(int i=0;i<count;i++)
			System.out.print("- ,");

	}

}
