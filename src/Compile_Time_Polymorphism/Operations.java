package Compile_Time_Polymorphism;

public class Operations {
	
	public int addition(int a,int b)
	{
		return a+b;
	}
	
	public int addition(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public double addition(double a,double b)
	{
		return a+b;
	}
	
	public String addition(String str1,String str2)
	{
		return str1 + " " + str2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations maths = new Operations();
		
		int two_sum = maths.addition(7, 21);
		System.out.println("sum of two integers:" + two_sum);
		
		int three_sum = maths.addition(1, 2, 3);
		System.out.println("sum of Three integers:" + three_sum);
		
		double sum = maths.addition(9.5, 10.25);
		System.out.println("sum of double numbers:" + sum);
		
		String res = maths.addition("Hi!", "This is simple program");
		System.out.println("Concatenation of two strings:" + res);
		

	}

}
