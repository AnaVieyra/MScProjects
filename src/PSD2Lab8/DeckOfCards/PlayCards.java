package PSD2Lab8.DeckOfCards;

import java.util.Scanner;

/**
 * Created by anamv on 08/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class PlayCards
{
   static Scanner keyboard = new Scanner(System.in);


   private static void printDeck(Card[] pDeck){
      for (int index = 0; index <=pDeck.length; index++){
         pDeck[index].printCard();
      }//for
   }//printDeck

   //checks if two cards are identical
   private static boolean sameCard (Card card1, Card card2){
      return ((card1.getRank() == card2.getRank()) && (card1.getSuit() == card2.getSuit()));
   }//sameCard

   //find index position of a card
   private static int findCard (Card[] pDeck, Card pCard){
      int location =-1;
      for (int index = 0; index < pDeck.length; index++){
         if (sameCard(pDeck[index], pCard)){
            location = index;
         }//if
      }//for
      return location;
   }//findCard

   //method to read and return suit of the card
   protected static int enterSuit(){
      System.out.println("Enter the suit of the card: ");
      System.out.println("1 - Clubs, 2 - Diamonds, 3 - Hearts, 4 - Spades: ");
      return keyboard.nextInt();
   }//getSuit

   protected static int enterRank(){
      System.out.println("Enter the rank of the card: ");
      System.out.println("Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King");
      return keyboard.nextInt();
   }//getSuit

   public static void main(String[] args)
   {
      //declare constants and variables
      int index = 0;
      final int TOTALCARDS = 52;
      final int TOTALRANK = 13;
      final int TOTALSUIT = 4;
      int mySuit, myRank;
      //create a deck of card
      Card [] deck = new Card [TOTALCARDS];

      //populate the deck with card objects
      for (int suit = 0; suit <TOTALSUIT; suit++) {
         for (int rank = 1; rank <=TOTALRANK; rank++) {
            deck[index] = new Card(suit, rank);
            index++;
         }//for rank
      }//for suit

      //enter details from keyboard to create myCard1
      mySuit = enterSuit() - 1;
      myRank = enterRank();
      System.out.println();
      Card myCard1 = new Card(mySuit, myRank);

      //print out the details of myCard1
      System.out.print("The card is: ");
      myCard1.printCard();

      //find and print out the position in the deck of myCard1
      System.out.println("The card is located at position " + findCard(deck, myCard1) + "\n");

      //enter details from keyboard to create myCard2
      mySuit = enterSuit() - 1;
      myRank = enterRank();
      Card myCard2 = new Card(mySuit, myRank);

      //print out the details of myCard2
      System.out.print("The card is: ");
      myCard2.printCard();

      //find and print out the position in the deck of myCard2
      System.out.println("The card is located at position " + findCard(deck, myCard2) + "\n");

      //compare the 2 cards and output if they are the same
      if (sameCard(myCard1, myCard2)) {
         System.out.println("The 2 cards are the same\n");
      }//if
      else {
         System.out.println("The 2 cards are different\n");
      }//else

      //print all cards in the deck
      System.out.println("The deck of cards is:");
      printDeck(deck);

   }//main
}//class
