import java.util.Scanner;

public class CircularLinkedList {
	LinkList head;

	CircularLinkedList() {
		head = null;
	}

	public static void main(String[] args) {
		boolean flag = true;
		Scanner in = new Scanner(System.in);
		CircularLinkedList object = new CircularLinkedList();
		while (flag) {

			System.out
					.println("Enter the operation you want to perform\n1.Add\n2.Delete\n3.Display\n4.Exit");

			switch (in.nextInt()) {
			case 1:
				System.out.println("Enter the element to be added");

				object.add(in.nextInt());
				break;
			case 2:
				System.out.println("Enter the element to be deleted: ");
				object.delete(in.nextInt());
				break;
			case 3:
				object.display();
				break;
			case 4:
				flag = false;
				break;

			}
		}

	}

	public void add(int element) {
		if (head == null) {
			head = new LinkList(element, head);
			head.nextNode = head;
		} else {
			LinkList tmp = head;
			while (tmp.nextNode != head) {
				tmp = tmp.nextNode;
			}
			tmp.nextNode = new LinkList(element, head);
			head = tmp.nextNode;
		}
	}

	public void delete(int element) {
		if(head==null){
			System.out.println("Empty Linked List");
		}
		else if(head.Data==head.nextNode.Data&&head.Data==element){
			System.out.println(head.Data+" Deleted");
			head=null;
		}
		else{
			
			if(head.Data==element){
				//head=head.nextNode;
				LinkList temp=head;
				while(temp.nextNode!=head){
					temp=temp.nextNode;
				}
				System.out.println(head.Data+" Deleted");
				temp.nextNode=head.nextNode;
				head=head.nextNode;
			}
			else{
				LinkList temp=head;
				while(temp.nextNode!=head)
				{
					if(temp.nextNode.Data==element){
						temp.nextNode=temp.nextNode.nextNode;
						break;
					}
					temp=temp.nextNode;
				}
			}
		}
	}
	public void display() {
		if (head == null) {
			System.out.println("Empty Linked List");
		} else {
			LinkList tmp = head;
			while (head!= tmp.nextNode) {
				System.out.println(tmp.Data + " " + tmp.nextNode);
				tmp = tmp.nextNode;
			}
			System.out.println(tmp.Data + " " + tmp.nextNode);
			
		}
	}
}
