
public class Day5{
    public static void main(String[] args) {
      
       /* System.out.println("using loops");
        int i =1;
        while(i<=10){
        System.out.println(i);
        i++;
        } */
        //ouery 
       /* int  i=100;
        while(i<=200){
            System.out.println(i);
            i++;
        }*/
      /* int b= 10;
       do { 
           System.out.println(b);
           b++;
       } while (b<8);
       */
      //Query2 
     /* int n = sc.nextInt();
      int  i=1;
      do { 
        System.out.println(i);
        i++;
      } while(i<=n);
      sc.close();*/
    /* for(int i =1; i<=20; i++){
        System.out.println(i);
      }*/
     //2n = Even Number = 0,2,4,6,8,
     //2n+1 = odd Number = 1,3,5,7,9,
     //Query3
   /*  int n =5;
     for(int i=0; i<=n; i++){
        System.out.println(2*i+1);

     }*/
    //Decriment
    
     /*for(int i=10; i>0; i--){
        System.out.println(i);
     }*/
    //Break and continue using loops!
       //for(int i=0; i<5;i++){
        //System.out.println(i);
       // System.out.println("java is great");
        //if(i==2){
          //  System.out.println("ending with the loop");
           // break;
        //}
      // }
      /*for(int i=0; i<5;i++){
        System.out.println(i);
        //System.out.println("java is great");
        if(i==2){
            System.out.println("ending with the loop");
            continue;
        }
                System.out.println("java is great");

       }
      */
     //Array
     //three way to create array
   //  int[] marks =new int[5];
     /*int [] marks;
     marks=new int[5];
     marks[0] = 25;
     marks[1] = 34;
     marks[2] = 21;
     marks[3] = 24;
     marks[4] = 23;
     System.out.println(marks[4]);
    */
    // int marks[] ={100,200,300,399,34};
      //System.out.println(marks[4]);
       int marks[] ={100,200,300,399,34};
      //Displaying the Array (for loop)
      System.out.println("printing using for loops");
      for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
      }
    }
}