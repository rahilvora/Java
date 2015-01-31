
public class Text {

	public static void main(String[] args) {
		int start=0;
		StringBuffer original=new StringBuffer("This is rahil");
 		StringBuffer output=new StringBuffer();
		int length=original.length();
		original =original.reverse();
	for (int i=0; i<length; i++)
	{	
		if(original.charAt(i)==' ')
		{
			//StringBuffer sub1=new StringBuffer(reversestr.substring(start, i)).reverse();
		//sub1=sub1.reverse();
			output.append(new StringBuffer(original.substring(start, i)).reverse()+".");
			start=i+1;
		}
		
	}	
		System.out.print(output.toString());
		
		
		
         
	}    
        
}        
