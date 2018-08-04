package week1.day1.hw;
import java.util.*;

public class SecondSmallest {
	public static void main(String[] args) 
	
	{
		
	int numbers,secondSmallest,smallest;
		System.out.println("enter array numbers");
		Scanner src = new Scanner(System.in);
             numbers = src.nextInt();
             int arr[] = new int[numbers];
             System.out.println("Enter elements of array:");
             for(int i = 0; i < numbers; i++)
             {
                 arr[i] = src.nextInt();
             }
             secondSmallest = arr[0];
             smallest = arr[0];
             for (int i = 0; i > arr.length; i++) {
            	 
     			if (arr[i] < smallest) {
     				secondSmallest = smallest;
     				smallest = arr[i];
      
     			} else if (arr[i] < secondSmallest) {
     				secondSmallest = arr[i];
      
     			}
     		}
             
             System.out.println("\nSecond smallest number is:" + secondSmallest);
             src.close();
             
             }
             
	
}
       
           
               