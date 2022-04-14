import java.util.Scanner;
public class Zad2SborCifri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chisloEdno;
        int chislDve;
        int choice;
        do {
            System.out.printf("Please enter two whole numbers. %n%n Enter the first number: ");
            chisloEdno = scan.nextInt();
            System.out.printf("%n Enter the second number: ");
            chislDve = scan.nextInt();
            System.out.printf("%nThe sum of the two numbers is: " + (chislDve + chisloEdno));
            System.out.printf("%nDo you want to repeat the operation? Enter 0 for no or any other WHOLE number for yes: ");
            choice = scan.nextInt();
        }
        while(choice !=0);
    }
}