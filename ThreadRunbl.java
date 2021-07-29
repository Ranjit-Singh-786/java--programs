// thread creating programe by using runnable interface
public class ThreadRunbl implements Runnable{
public void run(){
	System.out.println("thread runing by using runnable interface");
}
public static void main(String ar []){
// first we create the class object
ThreadRunbl obj=new ThreadRunbl();
//we need to pass this object in thread class object
Thread objj=new Thread(obj);
objj.start();
}}