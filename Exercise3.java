import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1
       // String name ="Nitish";
       // String lString= name.toLowerCase();
      // System.out.println(lString);
      //Q2
      //String text = "To Lower Case";
      //text =text.replace(" " , " -" );
      //System.out.println(text);
      //Q3
      String letter = "Dear name  , thanks a lot!";
     letter= letter.replace("name" , "rahul");
      System.out.println(letter);
      //Q4
      String myString = "this string contains     double and    triple spaces";
      System.out.println(myString.indexOf(" "));
      System.out.println(myString.indexOf(" "));
      //Q5
     String myletter2 = "Dear rahul ,\n this java course is good.\n Thanks";
     System.out.println(myletter2);

    }
}
