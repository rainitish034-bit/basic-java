 public class Day7{
    //Method of java
 /*static int logic(int x, int y){
             int z;
             if(x>y){
               z= x+y;
             }
             else{
               z=(x+y)*5;
             }
             x =566;
             return z;
         }
    
    public static void main(String[] arg){
      int a=5;
      int b=7;
      int c;
      //Method invocation usin object creation  
      c=logic(a,b);
      System.out.println(a + " "+b);
      int a1=3;
      int b1=1;
      int c1;
      System.out.println(c);
       System.out.println(c1);

    }*/
   static void foo() {
       System.out.println("sood morning bro!");
   }

   static void foo(int a) {
       System.out.println("good morning" +a +" bro!");
   }

   static void change(int a) {
     a =98;  
   }
   static void change2(int [] arr) {
     arr[0] =98;  
   }
   static void telljoke() {
       System.out.println("i invented a new word!\n" +"plagiarism");
   }
   public static void main(String[] args) {
      // telljoke();
      //int[] marks={23,24,22,55,66,77};
      //Case 1: changing the integer
      //int x= 45;
      //change(x);
      //System.out.println("x after running change is:"+ x);
      
       //Case 1: changing the Array
      //int[] marks={23,24,22,55,66,77};
      //change2(marks);
     // System.out.println("x after running change is:"+ marks[0]);


    // Method overloading
       foo();
       foo(50000);
   }
 }