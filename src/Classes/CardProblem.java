/*
Q.Write a class whose instances represent a single playing card from a deck of cards(52 cards).
Playing cards have two distinguishing  properties: rank and suit
(spade, club, heart, Diamond).
 */

package Classes;
public class CardProblem {
    //instance variables
    String suit;
    int rank;

    //getter and setter methods.
    public  int getRank(){
        return rank;
    }

    public String getSuit(){
        return suit;
    }

    public void setRank(int r){
        rank=r;
    }

    public void setSuit(String su) {
        suit=su ;
    }


    /*
    or we can also declare a parametrized constructor insted of setter methods
    public CardProblem(int rank, String suit) {
        this.rank = rank; // this keyword will refer to the current object.
        this.suit = suit;
    }

    */

    }


