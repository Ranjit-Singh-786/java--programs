public class Except{
public static void main(String ar []){
	try{
		int data =200/0;
		}
//must specify that what exception occurs
	catch(ArithmeticException e){
		System.out.println("error raise:-"+e);
//output
//error raise:-java.lang.ArithmeticException: / by zero
}
}}