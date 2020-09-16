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

public class Question_6 {
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
	
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to convert it into binary form: ");
		int n=sc.nextInt();
		
		
		int i=1;
		Node temp=null;
		while(n>0)
		{
			Node new_node=new Node(n%2);
			n=n/2;
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
		i=i+1;
		}
		
		PrintElements();
	}

}


