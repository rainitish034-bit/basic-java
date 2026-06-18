/*class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while (i<10) { 
            System.out.println("My thread is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i= 0;
        while (i<10) { 
            System.out.println("My thread2 is running");
            System.out.println("I am sad!");
            i++;
        }
    }
}
*/
/*class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a thread3 not a threat");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread4 not a threat");
    }
}
*/
  /*class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("I am a thread");
        }
    }
}
*/
 /*class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
       int i = 34;
       System.out.println("thank you" + this.getName());     
          // while(true){
         // System.out.println("I am a thread");
        }
    }
*/
 class MyThr2 extends Thread{
    
    public void run(){
           while(true){
         // System.out.println("I am a thread");
                System.out.println("thank you");     

          }
    }
}
class MyThr3 extends Thread{
    
    public void run(){
           while(true){
         // System.out.println("I am a thread");
                System.out.println(" my thank you");     

          }
    }
}
public class Day12{
 public static void main(String[] args) {
    /*  MyThread1 t1 = new MyThread1();
      MyThread2 t2 = new MyThread2();  
      t1.start();
      t2.start();
      */
      /* MyThreadRunnable1 t1= new MyThreadRunnable1();
       MyThreadRunnable2 t2= new MyThreadRunnable2();
       t1.run();
       t2.run();
    */
     // MyThr t= new MyThr("nitish");
      //t.start();
    /*  MyThr1 t1= new MyThr1("nitish");
      MyThr1 t2= new MyThr1("nitish2");
      MyThr1 t3= new MyThr1("nitish3");
      MyThr1 t4= new MyThr1("nitish4");
      MyThr1 t5= new MyThr1("nitish5");
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      */
     MyThr2 t2 = new MyThr2();
     MyThr3 t3 = new MyThr3();
     t2.start();
     try{
        t2.join();
     }
     catch(Exception e){
      System.out.println(e);
     }
     t3.start();
 }
}