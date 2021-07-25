//swap programe
class SwapFunc{
public static void main(String [] ar){
int x=2;
int y=5;
swapfunc(x,y);

}
public static void swapfunc(int a,int b){
System.out.println("value of a:-"+a+"value of b:-"+b);
int c=a;
a=b;
b=c;
System.out.println("value of a:-"+a+"value of b:-"+b);
}
}