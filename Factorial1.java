import java.util.Scanner;
class Factorial1
{
public static void main(String[]args)
{
Scanner obj=new Scanner(System.in);
System.out.println("enter any number");
int no=obj.nextInt();
int fact=1;

for(int i=1;i<=no;i++)
{
fact=fact*i;
}
System.out.println("this is fact value:-"+fact);
}
}