import java.util.Scanner;


public class Complex {
private double real;
private double imaginary;
Complex(double real, double imaginary){
	
	 this.real=real;
	 this.imaginary=imaginary;
}
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the real and imaginary part of first complex number");
		double real1=input.nextDouble();
		double imaginary1=input.nextDouble();
		Complex firstNumber= new Complex(real1, imaginary1);
		
		System.out.println("Enter the real and imaginary part of second complex number");
		double real2=input.nextDouble();
		double imaginary2=input.nextDouble();
		Complex secondNumber= new Complex(real2, imaginary2);
		
		Complex result = new Complex(0.0,0.0);
		result.add(firstNumber, secondNumber);
		result.subtract(firstNumber, secondNumber);
		result.multiplication(firstNumber, secondNumber);
		result.division(firstNumber, secondNumber);
		

	}
	
	public void add(Complex firstNumber, Complex secondNumber){
		this.real=firstNumber.real+secondNumber.real;
		this.imaginary=firstNumber.imaginary+secondNumber.imaginary;
		System.out.println("The result of addition is : Real part is "+this.real+" Imaginary part is"+this.imaginary);
		
	}
	public void subtract(Complex firstNumber, Complex secondNumber){
		this.real=firstNumber.real-secondNumber.real;
		this.imaginary=firstNumber.imaginary-secondNumber.imaginary;
		System.out.println("The result of subtraction is : Real part is "+this.real+" Imaginary part is"+this.imaginary);
		
	}
	public void multiplication(Complex firstNumber, Complex secondNumber){
		this.real=firstNumber.real*secondNumber.real;
		this.imaginary=firstNumber.imaginary*secondNumber.imaginary;
		System.out.println("The result of multiplication is : Real part is "+this.real+" Imaginary part is"+this.imaginary);
		
	}
	public void division(Complex firstNumber, Complex secondNumber){
		this.real=firstNumber.real/secondNumber.real;
		this.imaginary=firstNumber.imaginary/secondNumber.imaginary;
		System.out.println("The result of division is : Real part is "+this.real+" Imaginary part is"+this.imaginary);
		
	}
	
}
