package array_practice;
import java.util.*;
public class Question_11 {

  public static void main(String[] args)
{
    int no,x=1,i,j;
    System.out.print("Enter the number of rows ");
    Scanner scan = new Scanner(System.in);
		    no = scan.nextInt();
    for(i=0;i<no;i++)
    {
        for(j=0;j<=i;j++)
        {
            if (j==0||i==0)
                x=1;
            else
               x=x*(i-j+1)/j;
            System.out.print(" "+x);
        }
        System.out.print("\n");
    }
}
}