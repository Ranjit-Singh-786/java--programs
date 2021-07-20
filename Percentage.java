import java.util.Scanner;
class Percentage
{
public static void main(String[]args)
{
int pri,rate,time;
double si;
Scanner obj=new Scanner(System.in);
System.out.println("enter a pricipal");
pri=obj.nextInt();
System.out.println("enter a rate of rupees");
rate=obj.nextInt();
System.out.println("enter a time");
time=obj.nextInt();
si= (pri*rate*time)/100;
System.out.println("this value is percentage:"+si);
}
}