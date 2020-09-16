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

public class Question_4 {
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
		PrintElements();
		palindrome(n);
	}
	
	static void palindrome(int size) {
        Node temp1 = head;
        int pos =0;
        boolean flag = true;
        while(temp1!=null)
        {
            Node temp2 = head;
            for(int i =0;i<size-pos-1;i++) {
                temp2 = temp2.next;
            }
            if(temp1.data != temp2.data)
            {
                flag = false;
                break;
            }
            temp1 = temp1.next;
            pos++;
        }
        if (flag){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
	
	
	
	
	
	public static void main(String[] args) {
		
		EnterTheList();
	
		

	}

}

