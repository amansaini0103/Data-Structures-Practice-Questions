package array_practice;
import java.util.*;
public class Question_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for (int i = (arr.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j<=i; j++)
		      {
		         if (arr[j-1] > arr[j])
		         {
		              int temp = arr[j-1];
		              arr[j-1] = arr[j];
		              arr[j] = temp;
		   } 
		         } 
		      } 
		int answer=arr[n-1]-arr[0];
		System.out.println("The difference between highest & lowest is:"+answer);
		}

}


