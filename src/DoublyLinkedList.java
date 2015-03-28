import java.util.Scanner;

public class DoublyLinkedList<Type> {
	DLinkedList<Integer> headI;
	DLinkedList<Float> headF;
	DLinkedList<String> headS;

	DoublyLinkedList() {
		headI = null;
		headF = null;
		headS = null;

	}

	public static void main(String[] args) {

		System.out
				.println("Please the enter the data type.\n1.Interger\n2.Float\n3.String");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		DoublyLinkedList object = new DoublyLinkedList();
		boolean flag = true;

		// SinglyLinkedList object=new SinglyLinkedList();
		while (flag) {

			System.out
					.println("Enter the operation you want to perform\n1.Enter a node at the start\n2.Enter a node at the end"
							+ "\n3.Delete a node from the start\n4.Delete a node from the end\n5.Display all the elements\n6.Exit");

			switch (in.nextInt()) {
			case 1:
				object.addAtStart(choice);
				break;

			case 2:
				object.addAtEnd(choice);
				break;
			case 3:
				object.deleteFromStart(choice);
				break;
			case 4:
				object.deleteFromEnd(choice);
				break;
			case 5:
				object.display();
				break;
			case 6:
				flag = false;
				break;

			}
		}

	}

	public void addAtStart(int choice) {
		Scanner in=new Scanner(System.in);
		switch(choice){
		case 1:{
			System.out.println("Please enter the integer value to added");
			DLinkedList temp=headI;
			headI=new DLinkedList(in.nextInt(),headI,null);
			if(temp!=null)
			temp.nodePrevious = headI;
			
			
		}
		break;
		case 2:{
			System.out.println("Please enter the Float value to added");
			headF=new DLinkedList(in.nextInt(),headF,null);
		}
		break;
		
		case 3:{
			System.out.println("Please enter the String value to added");
			headS=new DLinkedList(in.nextInt(),headS,null);
		}
		break;
		}
	}

	public void addAtEnd(int choice) {
		switch (choice) {
		case 1: {
			System.out.println("Please enter the integer value to added");
		}
			break;
		case 2: {
			System.out.println("Please enter the Float value to added");
		}
			break;

		case 3: {
			System.out.println("Please enter the String value to added");
		}
			break;
		}

	}

	public void deleteFromStart(int choice) {
		switch (choice) {
		case 1: {
			System.out.println("Please enter the integer value to be deleted");
		}
			break;
		case 2: {
			System.out.println("Please enter the Float value to be deleted");
		}
			break;

		case 3: {
			System.out.println("Please enter the String value to be deleted");
		}
			break;
		}

	}

	public void deleteFromEnd(int choice) {
		switch (choice) {
		case 1: {
			System.out.println("Please enter the integer value to be deleted");
		}
			break;
		case 2: {
			System.out.println("Please enter the Float value to be deleted");
		}
			break;

		case 3: {
			System.out.println("Please enter the String value to be deleted2");
		}
			break;
		}

	}

	public void display() {
		if(headI==null)
  	  {
  		  System.out.println("Empty Linked List");
  	  }
  	  else
  	  {
  		DLinkedList tmp=headI;
  	  while(tmp!=null)
  	  {
  		 System.out.println(tmp.Data+" "+tmp.nodeNext+" " +tmp.nodePrevious);
  		 tmp=tmp.nodeNext;
  	  }
  	  }

	}

}

class DLinkedList<Type> {
	public Type Data;
	public DLinkedList nodeNext, nodePrevious;

	DLinkedList() {
		nodeNext = null;
		nodePrevious = null;
	}

	DLinkedList(Type Data, DLinkedList next, DLinkedList prev) {
		this.Data = Data;
		nodeNext = next;
		nodePrevious = prev;
	}

}