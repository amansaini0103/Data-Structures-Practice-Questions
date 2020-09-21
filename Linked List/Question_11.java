package Maybe;

import java.util.Scanner;

class Node
{
	int data;
	Node next;
	Node prev;
	Node agla;
	Node(int data)
	{
		this.data=data;
	}
}

public class Question_11 {
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
		Node temp_1=head;
		while(temp_1!=null)
		{
			System.out.print(temp_1.data+" ");
			temp_1=temp_1.agla;
		}
		System.out.println();
	}
	
	static void EnterTheList()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements: ");
		int n=sc.nextInt();
		
		Node temp=null;
		System.out.println("Please enter sorted list: ");
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
				new_node.prev=temp;
				temp.next=new_node;
				temp=new_node;	
			}
		}
		System.out.print("Input list : ");
		PrintElements();
		RearrangeAccordingToSituation(n);
	}
	
	static void RearrangeAccordingToSituation(int n)
	{
		Node temp=head;
		if(n%2==0)
		{
			for(int i=1;i<=(n/2)-1;i++)
			{
				temp=temp.next;
			}
		}
		else
		{
			for(int i=1;i<=n/2;i++)
			{
				temp=temp.next;
			}
		}

		head_2=temp.next;
		temp.next=null;
		head_2.prev=null;
		
		temp=head;
		Node temp_2=head_2;
		while(temp_2.next!=null)
		{
			temp_2=temp_2.next;
		}
		
		while(temp!=null && temp_2!=null)
		{
			temp.agla=temp_2;
			temp=temp.next;
			temp_2.agla=temp;
			temp_2=temp_2.prev;
		}
		System.out.print("Output list: ");
		PrintElements_2();
		
	}
	


	
	public static void main(String[] args) {
		
		EnterTheList();

	}

}

