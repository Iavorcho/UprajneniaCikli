import java.util.Scanner;

public class Zad5SentenceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSentence;
        char letter;
        int numberOfVowels = 0;


        System.out.println("Please enter a sentence: ");
        inputSentence = scanner.nextLine();


        for (int i = inputSentence.length()-1; i >= 0; --i ){
            letter = inputSentence.charAt(i);
            if ((letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||
                    letter=='I'||letter=='O'||letter=='U')){
                ++numberOfVowels;
            }
        }
        System.out.println(numberOfVowels);
    }
}


