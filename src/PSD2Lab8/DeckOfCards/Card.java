package PSD2Lab8.DeckOfCards;

/**
 * Created by anamv on 08/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Card
{
   private int suit, rank;

   public Card(){
   }//default constructor

   public Card (int pSuit, int pRank){
      suit = pSuit;
      rank = pRank;
   }//alternative constructor 2p

   public int getSuit(){
      return suit;
   }//getSuit

   public int getRank(){
      return rank;
   }//getRank

   public void printCard(){
      String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
      String [] ranks = {"null", "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};
      System.out.println(ranks[rank] + " of " + suits[suit]);
   }//printCard
}//class
