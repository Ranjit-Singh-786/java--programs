import java.util.Scanner;
class Mycalculator{
    public static void main(String[]args){
        String target;
        do {
            Scanner sx = new Scanner(System.in);
        System.out.println("enter your first number :- ");
        int no1 = sx.nextInt();
        System.out.println("enter your operation :- ");
        String op = sx.next();
        System.out.println("enter your second number :- ");
        int no2 = sx.nextInt();
        int res;    
        switch(op){
            case "+":
            res = no1+no2;
            System.out.println("this is your addition :- " +res);
            break;
            case "-":
            res = no1-no2;
            System.out.println("this is your subtraction :- " +res);
            break;
            case "*":
            res = no1*no2;
            System.out.println("this is your multiplication :- " +res);
            break;
            case "/" :
            res = no1/no2;
            System.out.println("this is your division :- " +res);
            break;
            default:
            System.out.println("this is invalid number !!");
            break;
        }
          System.out.println("if you want to contuniue your programe than press y for yes or press N FOR NO ");
         target = sx.next();
        
        }while(target.equals("y") || target.equals("Y"));
    

        
        
        

    }
}