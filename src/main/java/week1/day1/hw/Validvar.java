package week1.day1.hw;

public class Validvar {

	public static void main(String[] args) {

			      char ch1, ch2,ch3;
			      ch1 = 'A';
			      ch2 = '1';
			      ch3 ='*';
			     
    
			      boolean b1, b2,b3;

			     
			      b1 = Character.isLetterOrDigit(ch1);
			      b2 = Character.isLetterOrDigit(ch2);
			      b3 = Character.isLetterOrDigit(ch3);

			      String str1 = ch1 + " is a valid variable " + b1;
			      String str2 = ch2 + " is a valid variable " + b2;
			      String str3 = ch3 + " is valid variable " + b3;


			     
			      System.out.println( str1 );
			      System.out.println( str2 );
			      System.out.println( str3 );
			      
			      
			   }
			}


