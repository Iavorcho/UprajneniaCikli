import java.util.Scanner;
public class Zad4MaxMinValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String chisloEdno;
        int chisloEdnoInt;
        int smallestNumber = 0;
        int largestNumber = 0;

        //   String choice;

        do {
            System.out.print("Enter your numbers, type STOP in order to receive the result: ");
            chisloEdno = scan.nextLine();
            if (chisloEdno.matches("-?(0|[1-9]\\d*)")){
                chisloEdnoInt = Integer.parseInt(chisloEdno);
                if(chisloEdnoInt > largestNumber)
                {
                    largestNumber =  chisloEdnoInt;
                } else if (chisloEdnoInt < smallestNumber){
                    smallestNumber =  chisloEdnoInt;
                }
            } else {
                System.out.println("Invalid input, the symbols entered will be omitted! " +
                        "Please enter another number or type STOP in order to stop the programme execution");
            }
        }
        while(!chisloEdno.equalsIgnoreCase("STOP"));

        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Highest number: " + largestNumber);


    }

}