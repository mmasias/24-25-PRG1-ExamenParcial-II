import java.util.Scanner;

class Escondite {
    public static void main(String[] args) {

        final int PLACES = 6;
        int boyOne = 0, boyTwo = 0, boyThree = 0;

        boyOne = definePlace(PLACES, boyTwo, boyThree);
        boyTwo = definePlace(PLACES, boyOne, boyThree);
        boyThree = definePlace(PLACES, boyTwo, boyTwo);
        boolean arePlaying = true;
        boolean allFound = false;
        int turn = 0;

        while (arePlaying) {
            turn++;
            System.out.print("Dónde mirar? [" + boyOne + ":" + boyTwo + ":" + boyThree + "] ");
            int guess = new Scanner(System.in).nextInt();

            boyOne = lookAt(boyOne, guess);
            boyTwo = lookAt(boyTwo, guess);
            boyThree = lookAt(boyThree, guess);

            allFound = boyOne + boyTwo + boyThree == 0;
            arePlaying = turn < 12 && !allFound;
            countHistory(turn, boyOne, boyTwo, boyThree);
        }
    }

    static int definePlace(int numberOfPlaces, int forbiddenPlaceOne, int forbiddenPlacetwo) {
        int place;
        do {
            place = (int) (Math.random() * numberOfPlaces + 1);
        } while (place == forbiddenPlaceOne || place == forbiddenPlacetwo);
        return place;
    }

    static int lookAt(int boy, int guess) {
        return boy == guess && Math.random() > 0.1 ? 0 : boy;
    }

    static void countHistory(int turn, int boyOne, int boyTwo, int boyThree) {
        System.out.println("Turno " + turn);
        System.out.println("Niño 1 " + (boyOne == 0 ? "encontrado" : "escondido"));
        System.out.println("Niño 2 " + (boyTwo == 0 ? "encontrado" : "escondido"));
        System.out.println("Niño 3 " + (boyThree == 0 ? "encontrado" : "escondido"));
    }
}