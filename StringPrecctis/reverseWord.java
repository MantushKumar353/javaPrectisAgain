package StringPrecctis;

import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        System.out.println("Enter your number ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverseWordsInString(str));
        String ans=WordReverse(str);
        System.out.println(ans);
    }
    public static String WordReverse(String str) {
        String []str2=str.split("\\s+");
        StringBuilder st=new StringBuilder();
        for(int i=0; i<str2.length; i++){
        String word=str2[i];
        StringBuilder s=new StringBuilder();
        for(int j=word.length()-1; j>=0; j--){
            s.append(word.charAt(j));
        }
        st.append(s);
        if(i<word.length()-1){
            st.append(" ");
        }
        }
        // StringBuffer m=new StringBuffer(st);
        //m.reverse();
        return st.toString();
    }
    public static String reverseWordsInString(String str) {
        String[] words = str.split("\\s+"); // Split the string into words
        StringBuilder result = new StringBuilder();
    
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder();
    
            // Reverse the word using a simple for loop
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord.append(word.charAt(j));
            }
    
            result.append(reversedWord);
    
            // Append a space after each word except the last one
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
    
        return result.toString(); // No need to trim, as we handle spaces manually
    }
    
}
