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

public class Question_3 {
	static Node head=null;
	static Node head_2=null;
	
	static void PrintElements()
	{
		Node temp_1=head;
		while(temp_1!=null)
		{
			System.out.print(temp_1.data+" ");
			temp_1=temp_1.next;
		}
		System.out.println();
	}
	
	static void PrintElements_2()
	{
		Node temp_1=head_2;
		while(temp_1!=null)
		{
			System.out.print(temp_1.data+" ");
			temp_1=temp_1.next;
		}
		System.out.println();
	}
	
	
	static void EnterTheList()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements for 1st list: ");
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
		PrintElements();
	}
	
	static void EnterTheList_2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements for 2nd list: ");
		int n=sc.nextInt();
		
		Node temp_1=null;
		for(int i=1; i<=n; i++)
		{
			System.out.println("Enter element "+i);
			int value=sc.nextInt();
			Node new_node_2=new Node(value);
			if(i==1)
			{
				head_2=new_node_2;
				temp_1=new_node_2;
			}
			else
			{
				temp_1.next=new_node_2;
				temp_1=new_node_2;
				
			}
		}
		PrintElements_2();
	}
	
	static void findIdentical()
	{
		Node temp=head;
		Node temp_1=head_2;
		
		while(temp.next!=null && temp_1.next!=null)
		{
			if(temp.data!=temp_1.data)
			{
				System.out.println("Not identical");
				break;
			}
			else
			{
				temp=temp.next;
				temp_1=temp_1.next;
			}
		}
		if(temp.next==null)
		{
			System.out.println("Linked list's are identical");
		}
		
		else
		{
			System.out.println("Not identical");
		}
	}
	
	public static void main(String[] args) {
		
		EnterTheList();
		EnterTheList_2();
		findIdentical();

	}

}
