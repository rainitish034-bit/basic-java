class Employee{
    int salary;
    String name;
       
    public  int getSalary(){
        return salary;
    }
      public String getName(){
          return name;
      }
      public void  setName(String n){
           name = n;
      }
}
class Cellphone{
    public void ringing(){
        System.out.println("ringing");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int length;
    int breadth;
    public void initializeDimension(int l, int b){
        length = l;
        breadth =b;
    }

  public int calculateArea(){
    return length*breadth;
   }
   public int calculateperimiter(){
    return 2* (length+breadth);
   }
}
class Tommy{
  public  void hit(){
    System.out.println("hitting the enemey");
  }
  public  void run(){
    System.out.println(" runingthe enemey");
  }
  public  void fire(){
    System.out.println("fireing the enemey");
  }
}
public class Exercise8{
    public static void main(String[] args) {
        /*
        //Q1
        Employee nitish = new Employee();
        nitish.setName("nitish rai");
        nitish.salary =234567890;
        System.out.println(nitish.getSalary());
        System.out.println(nitish.getName());
    //Q2
    Cellphone vivo =new Cellphone();
    vivo.ringing();
    vivo.vibrating();
    */
      //Q3
      Square sq =new Square();
      sq.side = 4;
      System.out.println(sq.area());
      System.out.println(sq.perimeter());
    //Q4
      Rectangle myRectangle = new Rectangle();
      myRectangle.initializeDimension(6, 4);
      System.out.println(myRectangle.calculateArea());
      System.out.println(myRectangle.calculateperimiter());
    //Q5
    Tommy player1 = new Tommy();
    player1.fire();
    player1.hit();
    player1.run();
    }
}