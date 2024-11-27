import java.util.Scanner;

class Escondite {
    public static void main(String[] args) {

        int boyOne = (int) (Math.random() * 6 + 1);
        int boyTwo = (int) (Math.random() * 6 + 1);
        int boyThree = (int) (Math.random() * 6 + 1);
        boolean arePlaying = true;
        boolean allFound = false;
        int turn = 0;

        while (arePlaying) {
            turn++;
            System.out.print("Dónde mirar? ["+boyOne+":"+boyTwo+":"+boyThree+"] ");
            int guess = new Scanner(System.in).nextInt();
            boyOne = guess == boyOne ? 0 : boyOne;
            boyTwo = guess == boyTwo ? 0 : boyTwo;
            boyThree = guess == boyThree ? 0 : boyThree;
            allFound = boyOne + boyTwo + boyThree == 0;
            arePlaying = turn < 12 && !allFound;
            countHistory(turn, boyOne, boyTwo, boyThree);
        }
    }
    static void countHistory(int turn, int boyOne, int boyTwo, int boyThree){
        System.out.println("Turno "+turn);
        System.out.println("Niño 1 " + (boyOne==0?"encontrado":"escondido"));
        System.out.println("Niño 2 " + (boyTwo==0?"encontrado":"escondido"));
        System.out.println("Niño 3 " + (boyThree==0?"encontrado":"escondido"));
    }
}