package Maybe;
import java.util.Scanner;

class Nodee
{
	String data;
	Nodee next;
	Nodee prev;
	Nodee(String data)
	{
		this.data=data;
	}
}

public class Question_12 {
	static Nodee head=null;
	
	static void PrintElements()
	{
		Nodee temp_1=head;
		while(temp_1.next!=head)
		{
			System.out.print(temp_1.data+" ");
			temp_1=temp_1.next;
		}
		System.out.print(temp_1.data+" ");
		System.out.println();
	}
	
	
	static void EnterTheList()
	{
		Scanner sc_1=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of students wanted to play: ");
		int n=sc.nextInt();
		if(n==0)
		{
			Options();
		}
		else
		{
			Nodee temp=null;
			for(int i=1; i<=n; i++)
			{
				System.out.println("Enter name of student "+i);
				String value=sc_1.nextLine();
				Nodee new_node=new Nodee(value);
				if(i==1)
				{
					head=new_node;
					temp=new_node;
				}
				else
				{
					new_node.prev=temp;
					temp.next=new_node;
					temp=new_node;			
				}
			}
			head.prev=temp;
			temp.next=head;
			
			PrintElements();
			PlayTheGame();
		}
		
	}
	
	static void PlayTheGame()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count-out number: ");
		int n=sc.nextInt();
		
		while(head.next!=head)
		{
			Nodee temp=head;
			for(int i=1; i<n; i++)
			{
				temp=temp.next;
			}
			
			Nodee temp_2=temp.next;
			temp_2.prev=temp.prev;
			temp.prev.next=temp_2;
			temp.prev=null;
			temp.next=null;
			head=temp_2;

		}
		System.out.println(head.data+" is the winner...");
	}

	static void Options()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the task you want to do by pressing the number :");
		System.out.println("1) TO PLAY");
		System.out.println("2) EXIT THE GAME");
		int n=sc.nextInt();
		switch(n)
		{
			
			case 1: EnterTheList(); Options();
			break;

			case 2: 
			break;
			
			default: System.out.println("Wrong option choosen !!!");
						Options();
		}
	}
	
	
	public static void main(String[] args) {
		
		Options();
		
		
	}

}

