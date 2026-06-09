import java.util.Scanner;
public class  Exercise4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1
       /* byte m1,m2,m3;
        System.out.println("Enter our marks physics");
        m1 = sc.nextByte();
        System.out.println("Enter our marks chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter our marks mathematics");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation, you are pass");
        }
        else{
            System.out.println("sorry you are not pass");
        }*/
       //Q2
       /*System.out.println("Enter our income");
       float tax = 0;
       float income = sc.nextFloat();
       if(income<2.5){
        tax =tax + 0;
       }
       else if(income>2.5f && income<=5f){
        tax =tax + 0.05f * (income - 2.5f);
       }
       else if(income>5f && income <= 10.0f){
         tax =tax + 0.05f * (5.0f- 2.5f);
        tax =tax + 0.2f * (income - 5.0f);
       }
       else if(income>10.0f){
        tax =tax + 0.05f * (5.0f- 2.5f);
         tax =tax + 0.2f * (10.0f- 5.0f);
        tax =tax + 0.3f * (income - 10.0f);
       }
       System.out.println("the total tax paid by the employee is:" + tax);
       */
      //Q3
      int day = sc.nextInt() ;
      switch (day) {
          case 1 -> System.out.println("monday");
          case 2 -> System.out.println("tuesday");
          case 3 -> System.out.println("wednesday");
          case 4 -> System.out.println("thrusday");
          case 5 -> System.out.println("friday");
          case 6 -> System.out.println("saturday");
          case 7 -> System.out.println("sunday");
        }
       //Q5
       String website = sc.next();
       if(website.endsWith(".org")){
             System.out.println("organigation website");
       }
         else if(website.endsWith(".com")){
             System.out.println("comercial  website");
       }
        else if(website.endsWith(".in")){
             System.out.println("indian  website");
       }
    }
}