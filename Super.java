class Super
{
int x;
Super(int x)
{
x=x;
}
void dispval()
{
System.out.println("super x="+x);
}
}
class Sub extends Super
{
int y;
Sub(int x,int y)
{
super(x);
y=y;
}
void dispval()
{
System.out.println("super x="+x);
System.out.println("sub y="+y);
}
}
class Main
{
public static void main(String args[])
{
Sub obj=new Sub(10,20);
obj.dispval();
}
}





