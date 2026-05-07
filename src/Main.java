public class Main {
    public Card [] deck;

    public Player player;

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

}
