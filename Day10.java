 /*abstract class Base{
    public Base(){
        System.out.println("mai base ka xonstructor hoon");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
}*/
interface Bicycle{
    void applyBrake(int decriment);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("pee pee pee");
    }
    int speed=7;
    public void applyBrake(int decriment){
        System.out.println("brake");
        speed = speed-decriment;
    }
    public void speedUp(int increment){
        System.out.println("speedup");
        speed = speed+increment;
    }
}
public class Day10{
    public static void main(String[] args) {
        AvonCycle cyclenitish = new AvonCycle();
        cyclenitish.applyBrake(7);
        System.out.println(cyclenitish.speed);
    }
}