import java.util.Scanner;
class Sumuser
	{
	public static void main(String args[])
		{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a first number");
		int a=obj.nextInt();
		System.out.println("enter the second number");
		int b=obj.nextInt();
		int Sum=a+b;
		System.out.println("this addition is user input value:"+Sum);
		}
	}	
		