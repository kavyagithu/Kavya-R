package tandemloop;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the terms");
		
		int n=s.nextInt();
		
		
		for(int i=1;i<=n;i++) {
		int a=2*i-1;
				System.out.print(a);
				if(i<n) {
					System.out.print(",");
				}
			
		}
		// TODO Auto-generated method stub

	}

}
