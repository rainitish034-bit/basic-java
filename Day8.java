

/*class Employee{
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
}*/
/* class  myEmployee{
    private int id;
    private String name;
    public String getname(){
       return  name;
    }

    public void setName(String n){
        name = n;
    }
    public void  setId(int i){
       id = i;
    }
    public int getId(){
        return id;
    }
}*/
class  MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id = 45;
        name = "your-name-here";
    }
    public String getname(){
       return  name;
    }

    public void setName(String n){
        name = n;
    }
    public void  setId(int i){
       id = i;
    }
    public int getId(){
        return id;
    }
}
public class Day8{
    public static void main(String[] args) {
       /* System.out.println("This is our customer class");
        Employee harry = new Employee();
        //setting Attributes
        harry.id = 12;
        harry.salary = 3400;
        harry.name = "codewithharry";
        */
        //printing the Attribute
       /* harry.printDetail();
        int salary = harry.getSalary();
        System.out.println(salary);
        System.out.println(harry.id);
        System.out.println(harry.name);
        System.out.println(harry.salary);
        */   
          /* myEmployee nitish = new myEmployee();
           nitish.id =34;
           nitish.Name = "nitish rai"; due to private access modifer
            nitish.setName("nitishrai");
            System.out.println(nitish.getname());
         */

          MyMainEmployee nitish = new MyMainEmployee();
          nitish.setName("nitish rai");
          nitish.setId(34);
          System.out.println(nitish.getId());
          System.out.println(nitish.getname());

    }
}