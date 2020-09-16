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
//public class Question_8 {
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
//		PrintElements();
//	}
//	
//	static void EnterAtBeginning()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the element to enter at starting: ");
//		int key=sc.nextInt();
//		Nodee a=new Nodee(key);
//		head.prev=a;
//		a.next=head;
//		head=a;
//		PrintElements();
//	}
//	
//	static void EnterAtEnd()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the element to enter at the end: ");
//		int key=sc.nextInt();
//		Nodee a=new Nodee(key);
//		Nodee temp_2=head;
//		while(temp_2.next!=null)
//		{
//			temp_2=temp_2.next;
//		}
//		a.prev=temp_2;
//		temp_2.next=a;
//		
//		PrintElements();
//		
//	}
//	
//	static void EnterAtSpecificLocation()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the index after which u need to enter new element (NOTE::INDEX START FROM 1): ");
//		int n=sc.nextInt();
//		Nodee temp=head;
//		for(int i=1; i<n; i++)
//		{
//			temp=temp.next;
//		}
//		System.out.println("Enter the value of element to be entered: ");
//		int key=sc.nextInt();
//		Nodee a=new Nodee(key);
//		a.next=temp.next;
//		a.prev=temp;
//		temp.next.prev=a;
//		temp.next=a;
//		PrintElements();
//		
//	}
//	
//	static void DeleteAtStarting()
//	{
//		Nodee temp=head;
//		head=head.next;
//		temp.next=null;
//		head.prev=null;
//		PrintElements();
//	}
//	
//	static void DeleteAtEnd()
//	{
//		Nodee temp=head;
//		while(temp.next.next!=null)
//		{
//			temp=temp.next;
//		}
//		temp.next.prev=null;
//		temp.next=null;
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
//		if(n==1)
//		{
//			DeleteAtStarting();
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
//			
//			PrintElements();
//		}	
//		
//	}
//	
//	static void TraverseReverse()
//	{
//		Nodee temp_1=head;
//		while(temp_1.next!=null)
//		{
//			temp_1=temp_1.next;
//		}
//		while(temp_1!=null)
//		{
//			System.out.print(temp_1.data+" ");
//			temp_1=temp_1.prev;
//		}
//		
//		System.out.println();
//	}
//	
//	static void Options()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the task you want to do by pressing the number :");
//		System.out.println("1) To enter element in starting ");
//		System.out.println("2) To enter element at end");
//		System.out.println("3) To enter element at specific position");
//		System.out.println("4) To delete element at starting");
//		System.out.println("5) To delete element at end");
//		System.out.println("6) To delete element at specific positon");
//		System.out.println("7) To traverse forward");
//		System.out.println("8) To traverse reverse");
//		System.out.println("9) EXIT THE PROGRAM");
//		int n=sc.nextInt();
//		switch(n)
//		{
//			case 1: EnterAtBeginning(); Options();
//			break;
//			
//			case 2: EnterAtEnd(); Options();
//			break;
//			
//			case 3: EnterAtSpecificLocation(); Options();
//			break;
//			
//			case 4: DeleteAtStarting(); Options();
//			break;
//			
//			case 5: DeleteAtEnd(); Options();
//			break;
//			
//			case 6: DeleteAtSpecificPosition(); Options();
//			break;
//			
//			case 7: PrintElements(); Options();
//			break;
//			
//			case 8: TraverseReverse(); Options();
//			break;
//			
//			case 9: 
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
