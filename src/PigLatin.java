import java.util.Scanner;

/**
 * Created by Gateway on 7/16/2017.
 */
public class PigLatin {
    public static void main(String[] args) {

        String userWord;
        char firstLett;
        String way = "way";
        String ay = "ay";
        String question = "";

        do {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word: ");

        userWord = scan.nextLine();
        userWord = userWord.toLowerCase();

        firstLett = userWord.charAt(0);




            if ((firstLett == 'a') || (firstLett == 'e') || (firstLett == 'i') || (firstLett == 'o')) {

                System.out.println(userWord + way);

            } else {
                userWord = userWord.substring(1);
                userWord = userWord + firstLett + ay;
                System.out.println(userWord);
            }
            System.out.println("Would you like to try another word? (Yes/No)");

            question = scan.nextLine();
            //scan.nextLine();

        }while (question.equalsIgnoreCase("Yes"));


    }
}
