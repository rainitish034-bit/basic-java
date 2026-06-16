/*abstract class Pen{
 abstract void write();
 abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("write");
    }
        void refill(){
           System.out.println("refill");
        }
    void changeNib(){
        System.out.println("changing the nib");
    }
}*/
/*class Monkey{
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
       System.out.println("hello sir"); 
    }
    public void eat(){
     System.out.println("eat");
    }
    public void sleep(){
     System.out.println("sleep");
    }
}*/
/*abstract class TelePhone{
    abstract void ring ();
    abstract void lift();
    abstract void disconect();
}
class SmartPhone extends TelePhone{
    public void ring(){
        System.out.println("ti ti ti");
    }
     public void lift(){
        System.out.println("tu tu tu");
    }
     public void  disconect(){
        System.out.println("end ....");
    }
    // smart phone ka apna ek naya method (polymorphism ke liye )
    public void playMusic(){
        System.out.println("playing musics");
    }
}
*/
interface TVRemote{
    void powerOn();
    void powerOff();
    void changeChannel(int Channel);
}
interface SmartTVRemote extends TVRemote{
    void openyoutub();
    void voiceControl(String cammnd);
}
//7Q
class TV implements TVRemote{
   public void powerOn(){
        System.out.println("TV is on");
    }
    public void powerOff(){
        System.out.println("TV is off");
    }
    public void changeChannel(int channel){
        System.out.println("TV is change channel");
    }
}
class MySmartTV implements SmartTVRemote{
    public void powerOn(){
        System.out.println("TV is on");
    }
    public void powerOff(){
        System.out.println("TV is off");
    }
    public void changeChannel(int channel){
        System.out.println("TV is change channel");
    }
    public void voiceControl(String command){
        System.out.println("voice channel");
    }
    public void openyoutub(){
        System.out.println("voice channel");
    }
}

public class Exercise10{
    public static void main(String[] args) {
       //1 an 2
      // FountainPen pen = new FountainPen(); 
      // pen.changeNib();

      //3 and5
     /*  Human nitish = new Human();
       nitish.bite();

       Monkey m1 = new  Human();
       m1.bite();
       m1.jump();
       //m1.speak(); connot use speak because the reference is Monkey whic does not have speak methos
      */
     //4
      //POLYMORPHISM: Reference parent ka (TelePhone) aur Object child ka (SmartPhone)
       //TelePhone phone = new  SmartPhone();
       //Yeh saare calls run-time polymorphism ke through handle honge
      // phone.disconect();
      // phone.lift();
      // phone.ring();
      
      //Q7 And//6

      MySmartTV tv = new MySmartTV();
      tv.changeChannel(101);
      tv.powerOff();
      tv.powerOn();
      tv.openyoutub();
      System.out.println();
      System.out.println("testing normal TV");
      TV normalTv = new TV();
      normalTv.powerOn();
      normalTv.changeChannel(50);
      normalTv.powerOff();
      System.out.println();
      

    }
}