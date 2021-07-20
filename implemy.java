class Implemy
{
int lenght;
int width;
Implemy (int x,int y)
{
lenght=x;
width=y;
}
int area()
{
return(lenght*width);
}
}
class Sub extends Implemy
{
int height;
Sub(int x,int y,int z)
{
	Implemy(x,y);
	height=z;
}
int volume()
{
return(lenght*width*height);
}	
}
class Main
{
public static void main(String args [])
{
Sub obj=new Sub(10,10,10);
int area;
int volume;
area=obj.area();
volume=obj.vol();
System.out.println("this is area by using interface:"+area);
System.out.println("this is volume by using interface:"+volume);
}
}





