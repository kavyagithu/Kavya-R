package tandemloop;

import java.util.Scanner;

public class Calculator {
	
	double add(double a,double b) {
		return a+b ;
		
	}
	double sub(double a,double b) {
	return a-b;
		
	}
	double mul(double a,double b) {
		return a*b;
		
	}
	double div(double a,double b) {
		return a/b ;
		
	}



	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the value 1");
		 double a=s.nextDouble();
		 
		System.out.println("enter the value 2");
		 double b=s.nextDouble();
		 
		 Calculator c=new Calculator();
		 double ans=0;
		 
		 System.out.println("enter the operation");
		 String result=s.next();
		 
		 switch(result) {
		 case "addition":
		  ans= c.add(a,b);
		 break;
		 
		 case "subtraction":
			  ans=c.sub(a, b);
			 break;
			 
		 case "multiplication":
			  ans=c.mul(a, b);
			 break;
			 
		 case "division":
			 if(b!=0) {
			 ans=c.div(a, b);
			 }
			 else {
				 System.out.println("divide by zero");
				 return;
			 }
			 break;
			 
			 default:System.out.println("invalid");
			 return;
			 
		 
		 
		 }
		 System.out.println("result = " + ans);
		 
		
		
		// TODO Auto-generated method stub

	}

}
