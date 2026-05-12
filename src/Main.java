import java.util.Scanner;

public class Main {
    public Card [] deck;

    public Player player;
    public Player dealer;
    int deckSpot;
    String hidden;

    public static void main(String[] args) {
        Main blackjack = new Main();

    }
    public Main() {
        deck = new Card[52];
        for (int i = 0; i < deck.length; i++) {
            if ( i<13){

                deck[i] = new Card(i % 13, "Spades", false);
            } else if (i < 26) {
                deck[i] = new Card(i % 13, "Diamonds", false);
            } else if (i < 39) {
                deck[i] = new Card(i % 13, "Hearts", false);
            } else if (i < 52) {
                deck[i] = new Card(i % 13, "Clubs", false);
            }
        }
        shuffle();
        deckSpot = 0;
        player = new Player(1, "Player");
        dealer = new Player(2, "Dealer");

        int numCards = 0;

        dealer.addCard(deck[numCards]);
        numCards++;

       // deck[numCards].hidden = true;
        dealer.addCard(deck[numCards]);
        numCards++;

        player.addCard(deck[numCards]);
        numCards++;

        player.addCard(deck[numCards]);
        numCards++;

        System.out.println("Dealer's hand:");
        dealer.printHand();
        //System.out.println("Dealer total: " + dealer.sumCards());

        System.out.println();

        System.out.println("Player's hand:");
        player.printHand();
       // System.out.println("Player total: " + player.sumCards());




        System.out.println();
        System.out.println("Dealer's hidden card:");

        dealer.printHand();



        printDeck();

    }
        public void printDeck(){
            System.out.println("This deck : ");
            for (int i = 0; i < deck.length; i++) {
                deck[i].printInfo();
            }
        }
        public void shuffle(){
        for (int i = 0; i < deck.length; i ++){
            int randNum = (int) (Math.random()*52);
            Card holdCard = deck[randNum];
            deck[randNum] = deck[i];
            deck[i] = holdCard;
//shuffling, remember this
        }
        }


        //create a player and a dealer
    // Dealer gets a card then player gets 2 cards
    //Player's turn stands or hits
    // Dealers turn

    //input.equals(string);

}
//Scanner sc = new Scanner (System.in);
//String input = sc.nextLine();