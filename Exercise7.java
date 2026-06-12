public class Exercise7{
    static void multiplication(int n) {
        for(int i=1;i<=10;i++){
          System.out.format("%d x %d = %d\n", n, i, n*i);  
        }
    }

    static void pattern1(int n) {
        for(int i=0; i<n;i++){
           for(int j=0; j<i+1;j++) {
               System.out.print("*");
           }
           System.out.println(  );
        }
    }
    static int sumRec(int n) {
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    static void  printinvertpattern2(int n) {
        for(int i=n; i>=1;i--){
           for(int j=1; j<=i;j++) {
               System.out.print("*");
           }
           System.out.println(  );
        }
    }
    static int fib(int n) {
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1) +fib(n-2);
        }
    }
     public static double calculateAverage(double... number){
        if(number.length == 0){
            return 0.0;
        }
        double sum =0;
        for(double num : number){
            sum += num;
        }
         return sum/number.length;
    }
    static void pattern_rec(int n) {
        pattern_rec(n-1);
        if(n>0){
            for(int i=0; i<n;i++) {
               System.out.print("*");
           }
         }
        }
    
    public static void main(String[] args) {
        //Practice set on methods
        //Q1
          //multiplication(7);
          //Q2
         // pattern1(5);
         //Q3
        // int c = sumRec(4);
         //System.out.println(c);
         //Q4
         //printinvertpattern2(5);
         //Q5
           //int result =fib(5);
           //System.out.println(result);
           //Q6
         //  double avg1 = calculateAverage(10, 20, 30);
           //System.out.println(avg1);
          // double avg2 = calculateAverage(10, 20, 30,80,89,67);
    
      // System.out.println(avg2);
       //Q8
         pattern_rec(5);

    
    }

}