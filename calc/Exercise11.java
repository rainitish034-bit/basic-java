package calc;
import java.util.Scanner;

  /*  class calculater{
    public void calculater(int a, int b){
        System.out.println("your result is" + a+b);
    }
    }
    class sccalculater{
    public void calculater(int a, int b){
        System.out.println("your result is" + Math.sin (a+b));
    }
    }
    class hycalculater{
    public void calculater(int a, int b){
        System.out.println("your result is" + a+b);
         System.out.println("your result is" +Math.sin(a+b));
    }
    }*/
    public class Exercise11{
    public static void main(String[] args) {
       // System.out.println("I am main method");
          Scanner sc = new Scanner(System.in);
        System.out.print("Koi bhi number enter karein (degrees/radians me): ");
        double inputNumber = sc.nextDouble();
        double result = Math.sin(inputNumber);
        System.out.println("Aapka input tha: " + inputNumber);
        System.out.println("Math.sin ka result hai: " + result);
        
        sc.close();
    }
}
    

