import java.util.Scanner;
public class Matrix {

	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter matrix1 number of rows and columns");
		int r1=input.nextInt();
		int c1=input.nextInt();
		System.out.println("Enter matrix2 number of rows and columns");
		int r2=input.nextInt();
		int c2=input.nextInt();
		
		System.out.println("please enter the operation to be performed");
		System.out.println("1. Addition\n2. Multiplication");
		
		int option=input.nextInt();
		Matrix object = new Matrix();
		switch(option)
		{
		case  1:
		{
			object.addition(r1, r2, c1, c2);
			break;
		}
		case 2:
		{
			object.multiplication(r1, r2, c1, c2);
			break;
		}
		default:
			System.out.println("Invalid Option :( :(");
			
		}
	}
	
	public void addition(int r1,int r2,int c1, int c2)
	{
		if(r1==r2&&c1==c2)
		{
			Scanner input=new Scanner(System.in);
			int[][] matrixResult=new int[r1][c1];
			int[][] matrix1=new int[r1][c1];
			int[][] matrix2=new int[r2][c2];
			
			System.out.println("Enter data for matrix1");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					matrix1[i][j]=input.nextInt();
				}
			}
			
			System.out.println("Enter data for matrix2");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					matrix2[i][j]=input.nextInt();
				}
			}
			
			
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					matrixResult[i][j]=matrix1[i][j]+matrix2[i][j];
				}
			}
			System.out.println("Resultant matrix");
			
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print(matrixResult[i][j]+"\t");
				}
				System.out.println();
			}
			
		}
		else
		{
			System.out.println("Both the Matrix should have equal number of row and columns for addtition- Matrix Math Rule!! ");
		}
		
	}
	public void multiplication(int r1,int r2,int c1, int c2)
	{
		
	}
	
}
