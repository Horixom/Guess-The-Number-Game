import java.util.*;
class Game {
    public int number;
    public int takeUserInput;
    public int noOfGuess = 0;
    //private int n;

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    int takeUserInput() {
        System.out.println("Guess The number");
        Scanner sc = new Scanner(System.in);
        takeUserInput = sc.nextInt();
        return takeUserInput;
    }
    public int getNoOfGuess() {
        return noOfGuess;
    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    boolean isCorrect(){
noOfGuess++;
        if (takeUserInput== number){
    System.out.printf("Yes you guessed it right , it was %d\nYou guessed it in %d attempts ", number, noOfGuess);
    //return true;
}
else if(takeUserInput<number){
    System.out.println("Too low...");

}
else if ( takeUserInput>number ){
    System.out.println("Too high");

    }
return false;
}

}


public class Guess_the_number {
    public static void main(String[] args) {
Game g = new Game();
boolean  b = false;
while(!b){
g.takeUserInput();
//boolean b = g.isCorrect();
        System.out.println(g.isCorrect());
    }}
}
