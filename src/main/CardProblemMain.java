
//It has the main function of CardProblem class.
package main;

//Importing CardProblem class from package Classes
import Classes.CardProblem;

import java.util.Scanner;
public class CardProblemMain {
    public static void main(String args[]) {

       // Creating a object of it CardProblem class from package Classes.
        CardProblem object = new CardProblem();

        Scanner obj = new Scanner(System.in);

        /*
        we can directly take input with the help of scanner object  and setter method or use
        a variable take user input using scanner object and pass it to setter method
         */


        System.out.println("Enter Rank");
        object.setRank(obj.nextInt());
        System.out.println("Enter suit");
        obj.nextLine();
        String s=obj.nextLine();
        object.setSuit(s);
        System.out.println("Rank: "+object.getRank());
        System.out.println("suit: "+object.getSuit());
    }
}