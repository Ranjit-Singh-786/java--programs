abstract class Xyz
{
	void disp()
	void display()
{
	System.out.println("THIS METHOD IS SUPER CLASS");
}
}
class Radhey extends Xyz
{
void disp()
{
System.out.println("THIS METHOD CHILD CLASS");
}
}
class Jps
{
public static void main(String ar[])
{
Radhey obj=new Radhey ();
obj.display();
obj.disp();
}
}