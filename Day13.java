
import java.util.Scanner;
/*class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString() +"I am toString()";
    }
    @Override
    public String getMessage(){
        return super.getMessage() +"I am getMessage()";
    }
}
*/
public class Day13{
    public static int divide(int a, int b)throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
       /* int a = 6000;
        int b = 0;
        try{
        int c =a/b;
                System.out.println(c);

        }
        catch(Exception e){
            System.out.println("We will failed to divide. Reason:");
            System.out.println(e);
        }
        */
       /*int [] marks = new int[4];
       marks[0] = 56;
       marks[1] = 45;
       marks[2] = 4;
       marks[3] = 6;
       Scanner sc = new  Scanner(System.in);
       System.out.println("Enter the array index");
       int ind = sc.nextInt();
       System.out.println("Enter the number you want to divide the value with");
       int number = sc.nextInt();
       try {
           System.out.println("The value at array index entere is:" + marks[ind]);
           System.out.println("The value of array-value/number is:" + marks[ind]/number);
       }
       catch (ArithmeticException e) {
        System.out.println("ArithmeticException occured"); 
           System.out.println(e);
       }
          catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException occured"); 
           System.out.println(e);
       }
          catch (Exception e) {
        System.out.println("Some exception occured"); 
           System.out.println(e);
       }
       */
      /* int [] marks = new int[4];
       marks[0] = 56;
       marks[1] = 45;
       marks[2] = 4;
       marks[3] = 6;
       Scanner sc = new Scanner(System.in);
       int ind = sc.nextInt();
      try {
         System.out.println("Welcome to video no 82"); 
         try {
             System.out.println(marks[ind]);
         }
       
         catch (ArithmeticException e) {
          System.out.println("sorry this index does not exist");
          System.out.println("Exception in level 2");

          }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }
        */
     /*  int a;
       Scanner sc =new Scanner(System.in);
       if(a<99){
        try {
          throw  new MyException();
          throw new ArithmeticException("this is a exception");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       }
       */
        try{
         int c = divide(6,0);
         System.out.println(c);

        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}