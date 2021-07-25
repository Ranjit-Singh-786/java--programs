//inthis programe array creation value assign
import java.util.Scanner;
class arryy{
public static void main(String[] ar){
Scanner obj = new Scanner(System.in);
System.out.println("enter your size");
int n=obj.nextInt();
//creation array
int marks [ ]=new int[n];
System.out.println("this is your size"+marks.length);
//value assign dynamically
System.out.println("enter your"+n+"elements");
for (int i=0; i<marks.length; i++){
marks[i]=obj.nextInt();
}
System.out.println("this is your array");
// traverse of the array
for (int i =0; i<marks.length;i++){
System.out.print(marks[i]);
}
System.out.println();
int total =0;
for (int i =0 ; i<n;i++){
total=total+marks[i];
}
System.out.println("total"+total);
}}