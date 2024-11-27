import java.util.Scanner;

class Escondite {
    public static void main(String[] args) {

        final int PLACES = 6;
        final int VISIBLE = 0;
        int boyOne = VISIBLE, boyTwo = VISIBLE, boyThree = VISIBLE;

        boyOne = definePlace(PLACES, boyTwo, boyThree);
        boyTwo = definePlace(PLACES, boyOne, boyThree);
        boyThree = definePlace(PLACES, boyTwo, boyTwo);
        boolean arePlaying = true;
        boolean allFound = false;
        int turn = 0;

        while (arePlaying) {
            turn++;
            nervous(boyOne, boyTwo, boyThree);
            System.out.print("Dónde mirar? [" + boyOne + ":" + boyTwo + ":" + boyThree + "] ");
            int guess = new Scanner(System.in).nextInt();

            boyOne = lookAt(boyOne, guess);
            boyTwo = lookAt(boyTwo, guess);
            boyThree = lookAt(boyThree, guess);

            allFound = boyOne == VISIBLE && boyTwo == VISIBLE && boyThree == VISIBLE;
            arePlaying = turn < 12 && !allFound;
            countHistory(turn, boyOne, boyTwo, boyThree);
        }
    }

    static void nervous(int boyOne, int boyTwo, int boyThree) {
        final int VISIBLE = 0;
        String sound = "Aguzando el oido...";
        sound = sound + (boyOne != VISIBLE && Math.random() < 0.05 ? boyOne + ", " : "");
        sound = sound + (boyTwo != VISIBLE && Math.random() < 0.05 ? boyTwo + ", " : "");
        sound = sound + (boyThree != VISIBLE && Math.random() < 0.05 ? boyThree : "");
        System.out.println(sound);
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
        final int VISIBLE = 0;
        System.out.println("Turno " + turn);
        System.out.println("Niño 1 " + (boyOne == VISIBLE ? "ENCONTRADO!" : "escondido"));
        System.out.println("Niño 2 " + (boyTwo == VISIBLE ? "ENCONTRADO!" : "escondido"));
        System.out.println("Niño 3 " + (boyThree == VISIBLE ? "ENCONTRADO!" : "escondido"));
    }
}