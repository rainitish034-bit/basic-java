class Practice extends Thread{
 public void run(){
    int i=0;
    while (i<10){
        System.out.println("good morning");
        i++;
    }
 }
}
class Practice12  extends Thread{
 public void run(){
    while(true){
        try{
             Thread.sleep(200);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Wellcome");
        
    }
 }
}
public class Exercise12{
    public static void main(String[] args) {
        //Q1
      Practice t1 = new Practice();
      Practice12 t2 = new Practice12(); 
      t1.setPriority(6);
      t2.setPriority(9);
      System.out.println(t1.getPriority());
      System.out.println(t2.getPriority());
      System.out.println(t1.getState());
     // t1.start();
      t2.start();
      System.out.println(t2.getState());
      System.out.println(Thread.currentThread().getState());
    }
}