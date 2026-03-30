package challenge;

public class BottlesOfBeer {
    static void main() {

        int beers = 99;

        while(true) {
            System.out.println(beers +" bottles of beer on the wall, " +(beers--) +" bottles of beer.");
            if(beers == 1){
                System.out.println("Take one down and pass it around, " +beers
                                    +" bottle of beer on the wall.");
                break;
            }
            System.out.println("Take one down and pass it around, " +beers +" bottles of beer on the wall.\n");
        }

    }

}
