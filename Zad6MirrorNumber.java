import java.util.Scanner;
public class Zad6MirrorNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int sizeWhole = 0;
        int bufferNumber = 0;
        int newNumber = 0;
        int thousandsNumber = 0;

        System.out.println("Please enter a whole number: ");
        inputNumber = scanner.nextInt();
        sizeWhole = (int) (Math.log10(inputNumber) + 1);

        for (int i = sizeWhole-1; i >= 0; --i){
            bufferNumber = inputNumber % 10;
            thousandsNumber = (int) Math.pow(10 , i);
            newNumber = newNumber + bufferNumber * thousandsNumber;
            inputNumber = inputNumber / 10;
        }

        System.out.println("bufferNumber" + newNumber);





    }
}
