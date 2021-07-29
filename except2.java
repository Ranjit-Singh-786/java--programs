//exception program in this programe we will raise NullPointerExceptin
class Except2{
public static void main(String ar []){
//here you cannt acces only try without any other keywords like catch
	try{
		String str=null;
		System.out.println(str.length());
	}
	catch(NullPointerException n){
		System.out.println(n);
	}
//System.out.println("rest of the code");
//System.out.println();
	finally{
	   System.out.println("this is finally block that always runing");
	           }
}}