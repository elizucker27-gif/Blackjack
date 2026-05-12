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



    //need a sum Cards

}
