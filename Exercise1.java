import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
       int a = sc.nextInt();
       System.out.println("Enter Number 2");
       int b = sc.nextInt();
       System.out.println("Enter Number 3");
       int c = sc.nextInt();
       System.out.println("Enter Number 4");
       int d = sc.nextInt();
       System.out.println("Enter Number 5");
       int e = sc.nextInt();
       int sum = a+b+c+d+e;
        System.out.println("sum =" + sum);
        double percentage = (sum * 100)/500;
         System.out.println("percentage =" + percentage + "%");

    }
}