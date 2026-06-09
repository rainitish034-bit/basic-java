  import java.util.Random ;
  import java.util.Scanner ;
    public class game {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	System.out.println("0==stone");
	System.out.println("1==paper");
	System.out.println("2=scissor");
	System.out.println("enter your choise");
	int user = sc.nextInt();
	int com = ran.nextInt(3);
	System.out.println("computer choise " + com);
	if (user==com){ System.out.println("draw");
	 }
	 else if (user==0 && com==2 || user==1 && com==0 || user== 2 && com ==1){
	 	System.out.println("user win");}
	 	else { System.out.println("computer win");
	 		}
	 
	}
}

