class Super
{
int x;
Super(int x)
{
this.x=x;
}
void dispval()
{
System.out.println("super"+x);
}
}
class Sub extends Super
{
int y;
Sub(int x,int y)
{
Super(x);
this.y=y;
}
void dispval()
{
System.out.println("super"+x);
System.out.println("sub"+y);
}
}
class Override
{
public static void main(String ar[])
{
Sub obj=new Sub(10,20);
obj.dispval();
}
}






