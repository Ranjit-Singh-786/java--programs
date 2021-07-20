import java.util.Scanner;
class Oddeven
{
public static void main(String[]args)
{
System.out.println("enter any number");
Scanner obj = new Scanner(System.in);
int a = obj.nextInt();
if(a%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}