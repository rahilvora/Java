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

    		  System.out.println("Enter the operation you want to perform\n1.Enter a node at the start\n2.Enter a node at the end"
    		  		+ "\n3.Delete a node from the start\n4.Delete a node from the end\n5.Display all the elements\n6.Exit");
        	  
    	  switch(in.nextInt())
    	  {
    	  case 1:
    		  object.addAtStart();
    		  break;
    	
    	  case 2:
    		  object.addAtEnd();
    		  break;
    	  case 3:
    		  object.deleteFromStart();
    		  break;
    	  case 4:
    		  object.deleteFromEnd();
    		  break;
    	  case 5:
    		  object.display();
    		  break;
    	  case 6:
    	  		flag=false;
    	  		break;
    		  
    	  }
    	  }
    	 
      }
      public void addAtStart()
      {
    	  Scanner in=new Scanner(System.in);
    	  System.out.println("Enter the data");
    	  head=new LinkList(in.nextInt(),head);
    	 
      }
      public void addAtEnd()
      {
    	  Scanner in=new Scanner(System.in);
    	  System.out.println("Enter the data");
    	  if(head==null)
    	  {
    		  head=new LinkList(in.nextInt(),head);
    	  }
    	  else
    	  {
    		  LinkList tmp = head;
              while(tmp.nextNode != null)
                 tmp = tmp.nextNode;
              LinkList node = new LinkList();
              node.setData(in.nextInt());
              tmp.nextNode = node;	//run it
    		 
    	  }
    	  
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
    		 head=head.nextNode;
    	  }
    	 
      }
      public void deleteFromEnd()
      {
    	  Scanner in=new Scanner(System.in);
    	  if(head==null)
    	  {
    		  System.out.println("Empty Linked List");
    	  }
    	  else
    	  {

    		  LinkList tmp = head;
              while(tmp.nextNode.nextNode!= null)
                 tmp = tmp.nextNode;
              System.out.println(tmp.nextNode.Data+" Deleted");
              tmp.nextNode=null;
    		  
    	  }
    	  
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
public LinkList(int item, LinkList link )
{
	setData(item);
	nextNode=link;
	
	
}
public void setData(int item)
{
	Data=item;
}
}
