class Employee{
    int id;
    int salary;
    String name;
    public void printDetail(){
        System.out.println("my id is" + id);
         System.out.println("my name is" + name);

    }
    public int getSalary(){
        return salary;
    }
}
public class Day8{
    public static void main(String[] args) {
        System.out.println("This is our customer class");
        Employee harry = new Employee();
        //setting Attributes
        harry.id = 12;
        harry.salary = 3400;
        harry.name = "codewithharry";
        //printing the Attribute
        harry.printDetail();
        int salary = harry.getSalary();
        System.out.println(salary);
        //System.out.println(harry.id);
       // System.out.println(harry.name);
       // System.out.println(harry.salary);
    }
}