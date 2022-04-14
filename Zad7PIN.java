import java.util.Scanner;
public class Zad7PIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String pinCode = "4321";
        byte attemptsCounter = 0;
        String pinEntered = "";
        boolean pinOK;


        for (int i = 3; attemptsCounter < 3; ++i) {
            System.out.println("Please enter your pin code: ");
            pinEntered = scanner.next();

            if (pinEntered.equals(pinCode)) {
                System.out.println("Welcome");
                break;
            } else {
                ++attemptsCounter;
                System.out.println("Wrong pin number entered. This is your attempt" + attemptsCounter + "/3!");
            }
            if (attemptsCounter >= 3) {
                System.out.println("Your account has been locked");
            }

        }
    }
}