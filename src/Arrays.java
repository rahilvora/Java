import java.util.Scanner;

public class Arrays {
	public static void main(String args[])
	{
//		int[] intarray;
//		intarray=new int[10];
//		int a=0;
//		for(int i=0;i<intarray.length;i++)
//		{
//			intarray[i]=a;// 
//			a++;
//		}
//		
//		for(int B:intarray)
//		System.out.println(B);
//		char a=97;
//		char words[]=new char[5];
//		for(int i=0;i<words.length;i++)
//		{
//			words[i]=a;
//			a++;// char con be increamented in java bcz char is numeric type in JAVA
//		}
//		for(char B:words)
//			System.out.println(B);
		
	/*	float[] decimal=new float[5];
		int a=0;
		for(int i=0;i<decimal.length;i++)
		{
			decimal[i]=a;//int var can be used in float array but for visa versa type cast is required like (int) a;
			a++;
		}
		for(float B:decimal)
		System.out.println(B);*/
		
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter matrix1 number of rows and columns");
		int[][] matrix1=new int[input.nextInt()][input.nextInt()];
		System.out.println("Enter matrix2 number of rows and columns");
		int[][] matrix2=new int[input.nextInt()][input.nextInt()];
		
		
		
		System.out.println("Enter data for matrix1");
		for(int rows=0;rows<matrix1.length;rows++)
		{
			for(int columns=0;columns<matrix1[rows].length;columns++)
			{
				matrix1[rows][columns]=input.nextInt();
			}
		}
		System.out.println("Enter data for matrix2");
		for(int rows=0;rows<matrix2.length;rows++)
		{
			for(int columns=0;columns<matrix2[rows].length;columns++)
			{
				matrix2[rows][columns]=input.nextInt();
			}
			
		}
		System.out.println("Please select which operation you want to perform\n, 1. Addition and 2.Multiplicatioln");
		int option=input.nextInt();
		Arrays object= new Arrays();
		
		switch(option)
		{
		case 1:
		object.Addition(matrix1, matrix2);
		break;
		case 2:
		object.Multiplication(matrix1, matrix2);
		break;
		default:
			System.out.println("");
		}
		
		
		
	}
	public  void Addition(int[][] matrix1, int[][] matrix2)
	{
		System.out.println("This will contain addition");
		
		if(matrix1.length==matrix2.length)
		{
			if(matrix1[0].length==matrix2[0].length)
			{
				//call a uniformed matrix function
			}
			else if(matrix1[0].length>matrix2[0].length)
			{
				for(int i=0: matrix2[])
				
			}
			else
			{
				
			}
		}
		
		
	}
	public void Multiplication(int[][] matrix1, int[][] matrix2)
	{
		System.out.println("This will contain mutiplication");
		
	}
}










