//create func int return not a void
class funtt{
public static void main(String [] ar){
funtt ob=new funtt();
int x =22;
int y=33;
int get=ob.add(x,y);
System.out.println(get);
}
// this funct return a integer value
// this isnot void func so here this is only acceble by the obj
public int add(int num,int numm){
int result = num+numm;
return result;
}
}
