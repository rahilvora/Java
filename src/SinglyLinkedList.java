import java.util.Scanner;
public class SinglyLinkedList {
		LinkList head;
		SinglyLinkedList()
		{
			head=null;
		}
      public static void main(String[] args)
      {
    	  boolean flag=true;
    	  Scanner in=new Scanner(System.in);
    	  SinglyLinkedList object=new SinglyLinkedList();
    	  while(flag)
    	  {

    		  System.out.println("Enter the operation you want to perform\n1.Enter a node\n2.Delete a node\n3.Display all the elements");
        	  
    	  switch(in.nextInt())
    	  {
    	  case 1:
    		  object.addAtStart();
    		  break;
    		
    	  case 2:
    		  object.deleteFromStart();
    		  break;
    	  
    	  case 3:
    		  object.display();
    		  break;
    	  case 4:
    	  		flag=false;
    	  		break;
    		  
    	  }
    	  }
    	  in.close();
      }
      public void addAtStart()
      {
    	  Scanner in=new Scanner(System.in);
    	  System.out.println("Enter the data");
    	  head=new LinkList(in.nextInt(),head);
    	  in.close();
      }
      public void deleteFromStart()
      {
    	  if(head==null)
    	  {
    		  System.out.println("Empty Linked List");
    	  }
    	  
    	  else
    	  {
    		 System.out.println(head.Data+" Deleted");
    	  }
    	  head=head.nextNode;
      }
      public void display()
      {
    	  if(head==null)
    	  {
    		  System.out.println("Empty Linked List");
    	  }
    	  else
    	  {
    	  while(head!=null)
    	  {
    		 System.out.println(head.Data+" "+head.nextNode);
    		 head=head.nextNode;
    	  }
    	  }
      }
}
class LinkList{
	int Data;
	LinkList nextNode;
	LinkList()
	{
		Data=0;
		nextNode=null;
	}
public LinkList(int item, LinkList link)
{
	setData(item);
	nextNode=link;
}
public void setData(int item)
{
	Data=item;
}
}
