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

public class Question_5 {
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
	
	static void EnterTheList()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements list: ");
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
		System.out.print("Original linked list : ");
		PrintElements();
		Pair_wise_swap();
	}
	
	static void Pair_wise_swap()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			int temp_value =temp.data;
			temp.data=temp.next.data;
			temp.next.data=temp_value;
			if(temp.next.next==null)
			{
				break;
			}
			temp=temp.next.next;
		}
		System.out.print("Updated linked list after swap : ");
		PrintElements();
	}

	
	public static void main(String[] args) {
		
		EnterTheList();
	
		

	}

}

