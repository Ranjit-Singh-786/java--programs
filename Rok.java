class Rectengle
{
int lenght,width;
Rectengle(int x,int y)
{
lenght=x;
width=y;
}
int  rectArea()
{
return(lenght*width);
}
}
class Rok 
{
public static void main(String args[])
{
Rectengle obj=new Rectengle(10,20);
int areya=obj.rectArea();
System.out.println("this is constructor using area formula"+areya);
}
}