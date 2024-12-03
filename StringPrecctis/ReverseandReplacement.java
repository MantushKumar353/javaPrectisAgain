package StringPrecctis;

import java.util.Scanner;

public class ReverseandReplacement {
    public static void main(String[] args) {
        System.out.println("Enter your String in a program :");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
      //String st= reverseWordsInString(str);
       
       String sw=replaceWithNextCharacter(str);
       System.out.println(sw);
        // String ans=repaceandRevrese(str);
        // System.out.println(ans);
    }
   public static String reverseWordsInString(String str) {
        StringBuilder result = new StringBuilder();

        // Split, reverse, and rebuild in one step
        for (String word : str.split("\\s+")) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim(); // Remove trailing space
    }
    public static String replaceWithNextCharacter(String str) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";  // Vowels to ignore

        // Iterate through the string
        for (char ch : str.toCharArray()) {
            // Check if the character is a vowel
            if (vowels.indexOf(ch) != -1) {
                result.append(ch); // If vowel, just append it
            } else if (ch >= 'a' && ch <= 'z') {
                // For lowercase consonants, replace with the next character
                //result.append((ch == 'z') ? 'a' : (char) (ch + 1));
                if(ch=='z'){
                    result.append('a');
                }
                else{
                    result.append((char)(ch+1));
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                // For uppercase consonants, replace with the next character
                //result.append((ch == 'Z') ? 'A' : (char) (ch + 1));
                if(ch=='Z'){
                    result.append('A');
                }
                else{
                    result.append((char)(ch+1));
                }
            } else {
                // For non-alphabet characters (like spaces or punctuation), append as is
                result.append(ch);
            }
        }

        return result.toString();
    }
}
