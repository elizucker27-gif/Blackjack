public class Player {

    String name;
    Card[] hand;
    int numCards;

    public Player ( String pName){

        name = pName;

        hand = new Card[10];

        numCards = 0;
    }
public void printHand (){
    System.out.println( name + " 's hand");

    for(int i = 0; i< numCards; i++){

        hand[i].printInfo();
    }
}
}
