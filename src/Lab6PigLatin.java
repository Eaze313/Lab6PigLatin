import java.util.Scanner;

/**
 * James Bryant II
 * 2/6/17.
 * PigLatin.java
 * This program takes a user word and converts it to Pig Latin.
 */
public class Lab6PigLatin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Pig Whisperer");
        System.out.println("");

        String answer;
        //Loop to keep translating if the user enters yes
        do {
            System.out.println("Enter a word to translate Below");
            String word = scan.next().toLowerCase();

            //Translate the word
            String translated = translate(word);
            //Output it
            System.out.println(translated);

            System.out.println("");
            System.out.println("Do You Want to Continue? Type 'no' to quit. ");
            //get the response, turn it lower case
            answer = scan.next().toLowerCase();
        } while (!answer.equals("no"));

        scan.close();
    }

    public static String translate(String word) {
        //find the first vowel
        int vowel = findVowel(word);

        //if it's an invalid word
        if (vowel == -1) {
            return "invalid:" + word;
        }
        //If it's at position 0
       else if (vowel == 0) {
            return word + "way";
        }
        //add -way to the end
        else {
            word = word.substring(vowel, word.length()) + word.substring(0,vowel)
                    + "ay";
            //else

            //take the substring from the vowel to the end
            //add the substring from 0 until vowel - 1
            //add -ay

        }
            return word;
    }



    public static int findVowel(String word) {
        //for loop i from pos 0 to 4 (or end of word)
        for (int i = 0; i <= word.length() ; i++) {

            //charAt() to get the letter
           char j = word.charAt(i);

            //if its 'a' or 'e' or 'i' or 'o' or 'u'
            if (word.charAt(i) == 'a' || word.charAt(i) =='e' ||
                    word.charAt(i) == 'i' ||
                        word.charAt(i) == 'o' || word.charAt(i) == 'u') {
              return i;
            }
        }
        //if no vowel is found, return -1
        return -1;

    }
}