import java.util.Scanner;
class Table
{
public static void main(String[]args)
{
System.out.println("enter any number:");
Scanner obj=new Scanner(System.in);
int no=obj.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(no+"*"+i+"="+no*i);
}
}
}