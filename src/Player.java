public class Player {

    String name;
    Card[] hand;
    int numCards;
    int numPlayer;


    public Player ( int pnumPlayer, String pName){
        numPlayer = pnumPlayer;
        name = pName;
        hand = new Card[11];
        numCards = 0;


    }
    public void printHand(){
        for (int i = 0; i < numCards; i++) {
            hand[i].printInfo();

        }

    }


    public void addCard(Card newCard){
        hand[numCards]= newCard;
        numCards++;
    }

    public int sumCards() {
        int sum = 0;
        for (int i = 0; i < numCards; i++) {
            sum = sum + hand[i].value;
        }
        return sum;
    }





}
