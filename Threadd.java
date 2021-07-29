//thread first programe bye using thead class 
public class Threadd extends Thread{
public void run(){
	System.out.println("threading is runing");
}
public static void main(String ar []){
Threadd clsob=new Threadd();

clsob.start();

}
}