import java.util.Scanner;
public class Zad1DrawSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int squareSize;
        System.out.println("Please enter the size of the square in whole numbers: ");
        squareSize = scan.nextInt();

        for (int i = squareSize; i > 0; --i) {
            //       System.out.print("# ");
            for (int j = squareSize; j > 0; --j) {
                System.out.print("# ");
            }
            System.out.println();

        }
    }
}