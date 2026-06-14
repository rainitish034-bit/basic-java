/*class Base{
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println("i am in base  and setting x now");
        this.x =x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
     int y;
     public int gety(){
        return y;
     }
     public void sety(int y){
        this.y =y;
     }
}*/
// Quize 
/*class Animal{
    String name;
    public void eat(){
     System.out.println("This is animal eat humans");
    }
}
class Dog extends Animal{
   public void bark(){
    System.out.println("woof! woof!");
   }
}*/
/*class Base1{

    public Base1() {
        System.out.println("i am a constructor");
    }
    Base1(int a){
        System.out.println("I am an overloadded constructor with value of a as:" + a);
    }
    
 }
 class Derived1 extends Base1{

     Derived1() {
        super(0);
       System.out.println("I am a derived class constructor");
    }
    Derived1(int a,int b){
        super(a);
        System.out.println("I am a derived class constructor of derived with value of b as: "+b);
    }
 }
*/
//Overriding
/*class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}*/
class SmartPhone{
    public void greet(){
        System.out.println("good morning");
    }
    public void name(){
        System.out.println("my name is java");
    }
}
class Phone extends SmartPhone{
    public void swagat(){
        System.out.println("aapka swagat hzi");
    }
    public void name(){
        System.out.println("my name is java in class two");
    }
}
public class Day9{
    public static void main(String[] args) {
        
        // object of base class
       /* Base b = new Base();
        b.setx(4);
        System.out.println(b.getx());
             // object of derived class
         Derived d = new Derived();
        d.setx(4);
        System.out.println(d.getx());
       */
    /*  Dog myDog = new Dog();
      myDog.name = "kuta";
      System.out.println(myDog.name);
      myDog.eat();
      myDog.bark();
      */
       // Base1 b =new Base1();
        //Derived1 d = new Derived1();
          //Overriding
         /* A a =new A();
          a.meth2();

          B b =new B();
          b.meth3();
        */
       //Dyanmic method
       Phone obj = new Phone();
       //SmartPhone smobj = new SmartPhone();
       //obj.name();
       //Phone obj =new SmartPhone();
       obj.greet();
    }
}