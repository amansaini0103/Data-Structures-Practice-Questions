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

public class Question_2 {
	static Node head=null;
	
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
		System.out.println("Enter the no. of elements: ");
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
	
	static void swap_first_and_last_node()
	{
		Node temp=head;
		Node temp_2=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next.next=head.next;
		head.next=null;
		head=temp.next;
		temp.next=temp_2;
		PrintElements();		
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
		
		PrintElements();
	}
	
	static void FirstAndLastOccurance()
	{
		Node temp=head;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element whose first & last occurance you want to check: ");
		int n=sc.nextInt();
		int count=1;
		while(temp.next!=null)
		{
			if(temp.data==n)
			{
				System.out.println(n+" occured 1st time on "+count+" position");
				break;
			}
			count=count+1;
			temp=temp.next;
		}
		Node temp1=head;
		int count1=1;
		int count_2=0;
		while(temp1.next!=null)
		{
			
			if(temp1.data==n)
			{
				count_2=count1;
			}
			count1=count1+1;
			temp1=temp1.next;
			
			
		}
		System.out.println(n+" occured last time on "+count_2+" position");
	}
	
	static void removeduplicate() {
        Node temp1 = null, temp2 = null;
        temp1 = head;

        
        while (temp1 != null && temp1.next != null) {
            temp2 = temp1;
            while (temp2.next != null) {

                
                if (temp1.data == temp2.next.data) 
                {
                    temp2.next = temp2.next.next;
                }
                else
                	{
                    temp2 = temp2.next;
                    }
            }
            temp1 = temp1.next;
        }
        
        PrintElements();
    }
		
	
	static void Delete_Alternative_Nodes()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			if(temp.next.next==null)
			{
				temp.next=null;
				break;
			}
			temp.next=temp.next.next;
			temp=temp.next;
		}
		PrintElements();
	}
		
	static void Options()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the task you want to do by pressing the number :");
		System.out.println("1) Swapping the first and last node of a singly linked list");
		System.out.println("2) Pairwise swap elements of a given linked list");
		System.out.println("3) Get the position of first and last occurrence of an element in a single LinkedList");
		System.out.println("4) Remove duplicates from an unsorted linked list");
		System.out.println("5) Delete alternate nodes of a Linked List");
		System.out.println("6) EXIT THE PROGRAM");
		int n=sc.nextInt();
		switch(n)
		{
			case 1: swap_first_and_last_node(); Options();
			break;
			
			case 2: Pair_wise_swap(); Options();
			break;
			
			case 3: FirstAndLastOccurance(); Options();
			break;
			
			case 4: removeduplicate(); Options();
			break;
			
			case 5: Delete_Alternative_Nodes(); Options();
			break;
			
			case 6: 
			break;
			
			default: System.out.println("Wrong option choosen !!!");
						Options();
		}
	}
	
	public static void main(String[] args) {
		
		EnterTheList();
		Options();

	}

}

