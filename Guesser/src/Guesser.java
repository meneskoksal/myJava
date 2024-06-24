


import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;



public class Guesser {



    public static void main(String args[]){

        out.println("Enter an int from 1 to 10: ");

        int randomNumber = new Random().nextInt(10) + 1;
        out.println(randomNumber);
        int bullet =3;
        while (bullet>0){
            Scanner keyboard = new Scanner(System.in);
            int inputNumber = keyboard.nextInt();
            if(inputNumber == randomNumber){
                out.println("you win");
                break;
            }else{
                out.println("try again");
            }bullet--;
            if(bullet==0){
                out.println("You have failed");
            }

        }

    }



}


