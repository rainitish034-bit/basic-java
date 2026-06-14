
/*class Circle{
    public int radius;
    public Circle(int r) {
        System.out.println("I am circle parameterized constructor");
        this.radius=r;
    }
    public double  area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylender extends Circle{
        public int hight;
       Cylender(int r ,int h) {
       super(r);
       System.out.println("I am cylender parameterize constructor");
       this.hight=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.hight;
    }
}
*/
/*class Rectangle { 
    private double length;
    private double width;
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double area() {
        return this.length * this.width;
    }
}
class Cuboid extends Rectangle {
    private double height;
    public Cuboid() {
        super(); 
        this.height = 0;
    }
    public Cuboid(double length, double width, double height) {
        super(length, width); 
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double volume() {
        return area() * this.height; 
    }
}
*/

public class Exercise9{
    public static void main(String[] args) {
        //Q1
         // Circle objc =new Circle(12);
       // Cylender obj =new Cylender(12,4);

        //Q2
          Cuboid myCuboid = new Cuboid(5, 3, 10);
        System.out.println("Cuboid (Length): " + myCuboid.getLength());
        System.out.println("Cuboid (Width): " + myCuboid.getWidth());
        System.out.println("Cuboid (Height): " + myCuboid.getHeight());
        
        System.out.println("--- Calculations ---");
        System.out.println("Cuboid (Base Area): " + myCuboid.area());
        System.out.println("Cuboid (Volume): " + myCuboid.volume());
   
    }
}