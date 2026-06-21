
import java.util.Scanner;

public class Exercise13{
    public static void main(String[] args) {
        //problem 1
       // int a =7  - syntax error
       int age =78;
       int year_born = 2000-78; //logical error
       //System.err.println(6/0);

       //problem 2
       /*try{
        int a = 666/9;
       }
       catch(IllegalArgumentException e){
        System.out.println("hehe");
       }
       catch(ArithmeticException e){
        System.out.println("haha");
       }
       */
      //problem3
      boolean flag = true;
      int [] marks = new int [3];
      marks[0]=7;
      marks[1]=56;
      marks[2]=6;
      Scanner sc = new  Scanner(System.in);
      int index;
      int i = 0;
      while(flag && i<5){
           try{
            index = sc.nextInt();
            System.out.println("the value of marks[index] is " + marks[index]);
             break;
           }
           catch(Exception e){
            System.out.println("invalid index");
            i++;

           }
      }
    }
}