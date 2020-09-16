//package Maybe;
//import java.util.Scanner;
//
//class Nodee
//{
//	int data;
//	Nodee next;
//	Nodee prev;
//	Nodee(int data)
//	{
//		this.data=data;
//	}
//}
//
//public class Question_10 {
//	static Nodee head=null;
//	
//	static void PrintElements()
//	{
//		Nodee temp_1=head;
//		while(temp_1.next!=head)
//		{
//			System.out.print(temp_1.data+" ");
//			temp_1=temp_1.next;
//		}
//		System.out.print(temp_1.data+" ");
//		System.out.println();
//	}
//	
//	
//	static void EnterTheList()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the no. of elements: ");
//		int n=sc.nextInt();
//		
//		Nodee temp=null;
//		for(int i=1; i<=n; i++)
//		{
//			System.out.println("Enter element "+i);
//			int value=sc.nextInt();
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
//		head.prev=temp;
//		temp.next=head;
//		
//		PrintElements();
//	}
//
//	static void EnterAtSpecificLocation()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the index after which u need to enter new element (NOTE::INDEX START FROM 1): ");
//		int n=sc.nextInt();
//		Nodee temp=head;
//		if(n==0)
//		{
//			System.out.println("Enter the value of element to be entered: ");
//			int key=sc.nextInt();
//			Nodee a=new Nodee(key);
//			a.prev=head.prev;
//			head.prev.next=a;
//			head.prev=a;
//			a.next=head;
//			head=a;
//		}
//		else
//		{
//			for(int i=1; i<n; i++)
//			{
//				temp=temp.next;
//			}
//			System.out.println("Enter the value of element to be entered: ");
//			int key=sc.nextInt();
//			Nodee a=new Nodee(key);
//			a.next=temp.next;
//			a.prev=temp;
//			temp.next.prev=a;
//			temp.next=a;
//			
//		}	
//		PrintElements();
//	}
//
//	static void DeleteAtSpecificPosition()
//	{
//		Scanner sc=new Scanner(System.in);
//		Nodee temp=head;
//		Nodee temp_2=null;
//		System.out.println("Enter the index of element you want to delete (NOTE::INDEX START FROM 1): ");
//		int n=sc.nextInt();
//		
//		if(n==1)
//		{
//			head.prev.next=head.next;
//			head.next.prev=head.prev;
//			temp_2=head.next;
//			head.next=null;
//			head.prev=null;
//			head=temp_2;
//		}
//		else
//		{
//			for(int i=1; i<n-1 ;i++)
//			{
//				temp=temp.next;
//			}
//			
//			temp_2=temp.next;
//			temp.next=temp.next.next;
//			temp_2.next.prev=temp_2.prev;
//			temp_2.next=null;
//			temp_2.prev=null;
//			temp_2=null;
//		}
//		
//			PrintElements();	
//	}
//
//	static void Options()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the task you want to do by pressing the number :");
//		System.out.println("1) To enter element at specific position");
//		System.out.println("2) To delete element at specific positon");
//		System.out.println("3) EXIT THE PROGRAM");
//		int n=sc.nextInt();
//		switch(n)
//		{
//			
//			case 1: EnterAtSpecificLocation(); Options();
//			break;
//			
//			case 2: DeleteAtSpecificPosition(); Options();
//			break;
//			
//			case 3: 
//			break;
//			
//			default: System.out.println("Wrong option choosen !!!");
//						Options();
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		EnterTheList();
//		Options();
//
//	}
//
//}
//
