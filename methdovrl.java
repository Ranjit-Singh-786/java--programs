// method overloading program
// same method creation 
class MthdOvrl{
public static void main(String [] ar){
int l=12;
int b=10;
float h=2.5f;
int area_float=area(l,b);
System.out.println(area_float);
float areare=area(h);
System.out.println(areare);
}
//this is userdefined func that return the int value and
//no need the calling the object because this is static functin
public static int area(int n1,int n2){
int result = n1*n2;
return result;
}
public static float area(float n){
float resulte =3.14f*n*n;
return resulte;
}
}
