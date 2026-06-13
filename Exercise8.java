/*class Employee{
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
}*/
/*class Cellphone{
    public void ringing(){
        System.out.println("ringing");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
}*/
/*class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}*/
/*class Rectangle{
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
}*/
/*class Tommy{
  public  void hit(){
    System.out.println("hitting the enemey");
  }
  public  void run(){
    System.out.println(" runingthe enemey");
  }
  public  void fire(){
    System.out.println("fireing the enemey");
  }
}*/
/*
class cylender{
    private int radius;
        private  int height;

    public int getRadius(){
        return radius;
    }
    public  void setRedius(int radius){
        this.radius = radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
      this .height = height;
    }
    public double  surfaceArea(){
        return 2* 3.14* radius * radius + 2*3.14*radius*height;
    }
    public double volume(){
        return  3.14* radius * radius *height;

    }
}*/
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getlength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
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
     /* Square sq =new Square();
      sq.side = 4;
      System.out.println(sq.area());
      System.out.println(sq.perimeter());*/
    //Q4
     /* Rectangle myRectangle = new Rectangle();
      myRectangle.initializeDimension(6, 4);
      System.out.println(myRectangle.calculateArea());
      System.out.println(myRectangle.calculateperimiter());*/
    //Q5
   /* Tommy player1 = new Tommy();
    player1.fire();
    player1.hit();
    player1.run();*/
   /*creat a class game which allow a user to play "guess the number "
   game once
   */
   //Q6
   /*
  cylender mycylinder = new cylender();
   mycylinder.setHeight(12);
   int h= mycylinder.getHeight();
   System.out.println(h);
   mycylinder.setRedius(9);
   int r= mycylinder.getRadius();
   System.out.println(r);
   //Q2
   System.out.println(mycylinder.surfaceArea());
   System.out.println(mycylinder.volume());
   */
      Rectangle r = new Rectangle();
      System.out.println(r.getlength());
      System.out.println(r.getBreadth());

    }
}