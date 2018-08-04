package week2.seleniumday1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 
		  int i,fact=1,number; 
		  Scanner scan = new Scanner(System.in);
		  System.out.println("enter the number");
		  number = scan.nextInt();
		  scan.close();

		 
			  for(i=1;i<=number;i++)
			  {    
			      fact=fact*i;    
			  }    
			  System.out.println("Factorial of "+number+" is: "+fact);    
			 }  
			 



	}


