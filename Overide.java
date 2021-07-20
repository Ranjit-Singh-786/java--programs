class Overide
{
int x,y;
Overide(int x)
{
x=x;
}
void Calc ()
{
System.out.println(x*x);
}
void calc (int x,int y)
{
x=x;
y=y;
}
Calc() 
{
System.out.println("this is addition:"+(x+y));
}
}
class Top
{
public static void main(String args[])
{
Overide obj=new Overide();
obj.Calc(10);
obj.Calc(10,20);
System.out.println("this is square:"+b);
System.out.println("this is square:"+(c=a+b));
}
}





