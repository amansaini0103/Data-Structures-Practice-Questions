package Maybe;
import java.util.Scanner;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
	}
}

public class Question_7 { 
	static Node head=null;
	static Node head_2=null;
	
	static void EnterTheList()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements for list 1: ");
		int n=sc.nextInt();
		
		Node temp=null;
		for(int i=1; i<=n; i++)
		{
			System.out.println("Enter element "+i);
			int value=sc.nextInt();
			Node new_node=new Node(value);
			if(i==1)
			{
				head=new_node;
				temp=new_node;
			}
			else
			{
				temp.next=new_node;
				temp=new_node;
				
			}
		}
	
		
	}
	
	static void EnterTheList2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements for list 2: ");
		int n=sc.nextInt();
		
		Node temp=null;
		for(int i=1; i<=n; i++)
		{
			System.out.println("Enter element "+i);
			int value=sc.nextInt();
			Node new_node=new Node(value);
			if(i==1)
			{
				head_2=new_node;
				temp=new_node;
			}
			else
			{
				temp.next=new_node;
				temp=new_node;	
			}
		}
		
 
	}
	
	static void shuffleMerge()
	{
		Node temp=head;
		Node temp_2=head_2;
		Node temp_3=head;
		Node temp_4=head_2;
		while(temp!=null && temp_2!=null)
		{
			temp_3=temp.next;
			temp.next=temp_2;
			temp=temp_3;
			temp_4=temp_2.next;
			temp_2.next=temp_3;
			temp_2=temp_4;
					
		}
//FROM HERE WE ARE PRINTING THE LIST
		Node temp_1=head;
		while(temp_1!=null)
		{
			System.out.print(temp_1.data+" ");
			temp_1=temp_1.next;
		}

			while(temp_4!=null)
			{
				System.out.print(temp_4.data+" ");
				temp_4=temp_4.next;
			}

	}
	public static void main(String[] args) {

		EnterTheList();
		EnterTheList2();
		shuffleMerge();	
		
	
		

	}

}

