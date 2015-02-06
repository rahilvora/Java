import java.util.*;
public class Queues {
	int[] Queue;
	int front=0;
	int rear=-1;
	Queues(int size)
	{
		Queue= new int[size];
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		Queues object=new Queues(in.nextInt());
		boolean flag=true;
		while(flag)
		{
		System.out.println("Please select the Stack operation you want to perform:\n1.Push\n2.Pop\n3.Display Stack\n4. Exit Menu");
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
		case 4:
			flag=false;
			break;
		default:
			System.out.println("Invalid Input folks");
		}
		}
	}
	public void push()
	{
		if(rear+1<Queue.length)
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the number to be pushed");
			rear++;
			Queue[rear]=in.nextInt();
			System.out.println(Queue[rear]+" is added to the queue");	
		}
		else
			System.out.println("Queue is full, so no more push operation can be performed");
	}
	public void pop()
	{
		if(rear<front)
			System.out.println("Stack is empty, nothing to pop");
		else
		{
			System.out.println(Queue[front]+" Poped out of the queue");
			front++;
		}	
	}
	public void display()
	{
		if(rear<front)
			System.out.println("Stack is empty, nothing to display");
		else
		{
		System.out.println("Queue consist of ");
		for(int i=front; i<=rear;i++)
		System.out.println(Queue[i]);
		}
	}
}
