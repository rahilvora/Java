
public class Test {
	private  int _variable=5;
	static int num=10;
	public static void main(String args[]){
		Test obj1= new Test();
		obj1.Function1(6);
		
		
	}
public  void Function1(int var)
{
	System.out.println(var);
	newStub obj2=new newStub();
	int result=newStub.function2(num);
	System.out.println(result);
	obj2.fn3(variable);
}
}
class newStub{
	
	public static int function2(int a){
		int b = a*10;
		return b;
	
	}
	 public void fn3(){
		 System.out.println("This function is called with an object");
		 System.out.println(_variable);
		 
	 }
	
}