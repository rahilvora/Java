import java.util.*;
public class Stacks {
	int[] wallet;
	int pointer=-1;
	Stacks(int size)
	{
		wallet= new int[size];
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of a stack");
		Stacks object=new Stacks(in.nextInt());
		
		boolean flag=true;
		while(flag)
		{
		System.out.println("Please select the Stack operation you want to perform:\n1.Push\n2.Pop\n3.Display Stack\n4.Min Value\n5. Exit Menu");
		int operation=in.nextInt();
		switch(operation)
		{
		case 1:
			object.push();
			break;
		case 2:object.pop();
			break;
		case 3:object.display();
			break;
		case 4:object.min();
			break;
		case 5:flag=false;
			break;
		default:
			System.out.println("Invalid Input folks");
		}
		}
	}
	
	public void push()
	{	
		if(pointer<wallet.length-1)
		{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number to be pushed");
		int value=in.nextInt();
		pointer++;
		wallet[pointer]=value;
		System.out.println(value+" pushed into the stack");
		}
		else
			System.out.println("Stack is full no more push operation can be performed");
	}
	public void pop()
	{
		if(pointer<0)
		{
			System.out.println("Pop operation cannot be performed as stack is empty!!");
		}
		else
		{
			
			System.out.println(wallet[pointer]+ "is poped out of the stack");
			pointer--;
		}
	}
	public void display()
	{	
		if(pointer<0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
		for(int i=0; i<pointer;i++)
		System.out.println(wallet[i]);
		}
	}
	public void min()
	{
		int a=0,b=0;
		for(int i=0;i<=pointer;i++)
		{
			if(i+1<=pointer)
			{
				if( wallet[i]>wallet[i+1])
				{	
					a=wallet[i];
					b=wallet[i+1];
					a=a^b;
					b=a^b;
					a=a^b;	
				}
			}
		}
		System.out.println("Minimum value is "+a);
	}
}
