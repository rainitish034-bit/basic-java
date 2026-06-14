//game of guess number
import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputNumber;
    public int noofGuesses;
    public int getnoofGuesses(){
        return noofGuesses;
    }
    public void setnoofGuesses(){
        this.noofGuesses= noofGuesses;
    }
     Game(){
        Random rand = new Random();
    this.number = rand.nextInt(100);
    }
    void takeuserInput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
       inputNumber = sc.nextInt();
    }
    boolean iscorrectNumber(){
        if(inputNumber==number){
           return true; 
        }
        else if(inputNumber<number){
            System.out.println("Too less");
        }
        else if(inputNumber>number){
            System.out.println("Too high");
        }
        return false;
    }
}

public class game2{
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
        g.takeuserInput();
        b = g.iscorrectNumber();
       System.out.println(b);
        }
    }
}