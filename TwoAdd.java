// two array adding programe
class TwoAdd{
public static void main(String ar []){
int num = 5;
int a []=new int[5];
int b []=new int[5];
int c []= new int [5];
for (int i =0;i<5;i++){
a[i]=i;
}
for(int i=0;i<5;i++){
b[i]=num;
num++;
}
//print the array
for (int i =0;i<5;i++){
System.out.println(a[i]);
}
System.out.println();
for (int i =0;i<5;i++){
System.out.println(b[i]);
}

//element add loop
for(int i=0;i<5;i++){
// assign the value inside the empty array
c[i]=a[i]+b[i];
}
System.out.println();
System.out.println("added array");
for(int i=0;i<5;i++){
System.out.print(c[i]+" ");
}


}
}