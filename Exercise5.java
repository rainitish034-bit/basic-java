
import java.util.Scanner;

public class Exercise5{
    public static void main(String[] args) {
     
      //Q1
/*int n = 4;
      for(int i=n; i>0; i--){
          for( int j=0;j<i;j++){
              System.out.print("*");
            }
            System.out.print("\n");
        }
        */
       //Q2
       /*int sum =0;
       int n=3;
       for(int i=0;i<n;i++){
        sum =sum +(2*i);
       }
       System.out.println("sum of even number is: ");
       System.out.println(sum);
       */
      //Q3
     /* int n = 5;
      for(int i=1;i<=10;i++){
        System.out.printf("%d X %d = %d\n", n, i, n*i);
      }
        */
        //Q4
     /* int n = 10;
      for(int i=10;i>=1;i--){
        System.out.printf("%d X %d = %d\n", n, i, n*i);
      }*/
     //Q5
    /* int n = 5;
      long factorial=1;
      for (int i=1;i<=n; i++) {
        factorial=factorial*i;
      }
          System.out.println("factorial of " +n+ "is:"+factorial);
          */
         //Q6
       /*  int n=5;
         int i=1;
         long factorial=1;
         while(i<=n){
            factorial *=i;
            i++;
         }
         System.out.println(factorial);
        */
          //Q7
          /*int row =4;
          int i=row;
          while(i>=1){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
          }
        */
       //Q9
       
     /* int n = 8;
      int sum = 0;
      for(int i=1;i<=10;i++){
        sum += n*i;
        }
        System.out.println(sum);
        */
       Scanner sc= new Scanner(System.in);
        int sum =0;
       int n=sc.nextInt();
       int i=1;
       while(i<=n){
        sum =sum +(2*i);
        i++;
       }
       System.out.println("sum of even number is: ");
       System.out.println(sum);
    
    }
}