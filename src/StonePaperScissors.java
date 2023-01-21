import java.lang.Math;
import java.util.Scanner;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
        System.out.println("this is rock paper scissor game ");
        int max,min,numUserChoice = 0;
        max = 3;
        min  =1;

        int rd = (int) (Math.random()*(max-min+1))+min;
//        System.out.println(rd);
        Scanner sc = new Scanner(System.in);
        String UserChoice = sc.next(); 
        // 1 = rock, 2 = paper , 3 = scissors 
        if (UserChoice=="rock"){
            numUserChoice = 1;} 
        else if (UserChoice=="paper") {
            numUserChoice=2;
        } else if (UserChoice=="scissor") {
            numUserChoice=3;
        }
        System.out.println(numUserChoice);
        if (numUserChoice==rd){
            System.out.println("tie");
        }
        if (numUserChoice==1 && rd ==2) {
            System.out.println("computer wins");
        }
        if (numUserChoice==2 && rd==1) {
            System.out.println("you wins");
        }
        if (numUserChoice==3 && rd==1) {
            System.out.println("computer wins");
        }
        if (numUserChoice==3 && rd==2) {
            System.out.println("you wins.");

        }
    }
}
