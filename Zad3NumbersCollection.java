import java.util.Scanner;
public class Zad3NumbersCollection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String chisloEdno;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int chisloEdnoInt;
    //   String choice;

        do {
            System.out.print("Enter your numbers, type STOP in order to receive the result: ");
            chisloEdno = scan.nextLine();
            if (chisloEdno.matches("-?(0|[1-9]\\d*)")){
            chisloEdnoInt = Integer.parseInt(chisloEdno);
                 if(chisloEdnoInt > 0)
                 {
                ++positive;
            } else if (chisloEdnoInt == 0){
                ++ zero;
                 } else {
                    ++ negative;
                }
        } else {
                System.out.println("Invalid input, the symbols entered will be omitted!" +
                        "Please enter another number or type STOP in order to stop the programme execution");
            }
        }
        while(!chisloEdno.equalsIgnoreCase("STOP"));

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeroed numbers: " + zero);

    }

}