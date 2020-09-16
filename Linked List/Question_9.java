//package Maybe;
//import java.util.Scanner;
//
//class Nodee
//{
//	String data;
//	Nodee next;
//	Nodee prev;
//	Nodee(String value)
//	{
//		this.data=value;
//	}
//}
//
//public class Question_9 {
//	static Nodee head=null;
//	
//	static void PrintElements()
//	{
//		Nodee temp_1=head;
//		while(temp_1!=null)
//		{
//			System.out.print(temp_1.data+" ");
//			temp_1=temp_1.next;
//		}
//		System.out.println();
//	}
//	
//	
//	static void EnterTheList()
//	{
//		Scanner sc=new Scanner(System.in);
//		Scanner sc1=new Scanner(System.in);
//		System.out.println("Enter the no. of elements(**Strings**): ");
//		int n=sc.nextInt();
//		
//		Nodee temp=null;
//		for(int i=1; i<=n; i++)
//		{
//			System.out.println("Enter element "+i);
//			String value=sc1.nextLine();
//			Nodee new_node=new Nodee(value);
//			if(i==1)
//			{
//				head=new_node;
//				temp=new_node;
//			}
//			else
//			{
//				new_node.prev=temp;
//				temp.next=new_node;
//				temp=new_node;			
//			}
//		}
//		PrintElements();
//		rotateLinkedList(n);
//	}
//	
//	static void rotateLinkedList(int a)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the node number after which you need to rotate the list: ");
//		int n=sc.nextInt();
//		if(n==a)
//		{
//			PrintElements();
//		}
//		else
//		{
//			Nodee temp=head;
//			for(int i=1; i<n; i++)
//			{
//				temp=temp.next;
//			}
//			Nodee temp_2=temp.next;
//			while(temp_2.next!=null)
//			{
//				temp_2=temp_2.next;
//			}
//			temp_2.next=head;
//			head.prev=temp_2;
//			head=temp.next;
//			temp.next=null;
//			head.prev=null;
//			
//			PrintElements();
//		}
//		
//		
//	}
//
//	public static void main(String[] args) {
//		
//		EnterTheList();
//		
//
//	}
//
//}
//
