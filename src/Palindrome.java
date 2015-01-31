import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String:");
		String text = new String(input.nextLine().toLowerCase());
		Palindrome obj=new Palindrome();
		obj.loop(text);
		/*if(obj.check(text))
			{
			System.out.println("Cool");
			}
		else
		{
			System.out.println("Not Cool");
			
		}*/
	}
	/*public Boolean check(String text)
	{
		if(text.contentEquals(new StringBuffer(text).reverse()))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	*/
	public void loop(String text)
	{
		String temp="";
		for(int i=text.length()-1; i>=0;i--)
		{
			System.out.println("Hell");
			temp=temp+text.charAt(i);
			
		}
		System.out.println(temp);
		if(temp.equalsIgnoreCase(text))
		{
			System.out.println("Cool");
		}
		else
		{
			System.out.println("Not Cool");
		}
		}
		
	}

