public class Day2{
    public static void main(String[] args) {
        //Arithmetic operators
        //int a = 4;
        //int b = + a;
       // int b = 6 %a;//Modulo operater
       //Assignment operators
      // int b = 9;
       //b *= 3;
        //System.out.println(b);
        //comparison operators
        //System.out.println(98<6);
        //logical operator
        //System.out.println(98>5 && 98>99);
        //System.out.println(64>5 || 64>98);
        //Bitwise operators
       // System.out.println(2&3);
       //Precedence & associativity
      // int a= 6*5-34/2;
       /*
       highest precedence goes to * and / . they are then evaluate on the basis
       of left to right associativity
       =30-34/2
       30-17
       13
       */
      //int b = 60/5-34*2;
      /*
      12-34*2
      12-68
      -56
      */
     //System.out.println(a);
       // System.out.println(b);
        //precedence & associativity
        //Quick Quiz
       /* int x =8;
        int y = 1;
        //int k = x *y/2;
        int b = 1;
        int c = 4;
        int a= 5;
         int k = (b*b) - 4*a*c/(2*a);
        System.out.println(k);
    */
     /* byte x = 5;
      int y =6;
      short z =  8;
      int a = y + z;
      float b = 6.54f + x;
      System.out.println(b);
      */
     //Increment and decrement operator
     int i = 56;
     // int b = i++; // first b is assigned i (56) then i is incremented
     int j = 67;
     int c = ++j; // first j is incremented then c is assigned j (68) 
     System.out.println(i++);
     System.out.println(i);
     System.out.println(++i);
     System.out.println(i);
     int y =7;
     System.out.println(++y *8);

    }
}