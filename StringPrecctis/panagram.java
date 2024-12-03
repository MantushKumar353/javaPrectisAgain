package StringPrecctis;

import java.util.Scanner;

class Panagram {
    public static void main(String[] args) {
        System.out.print("Enter your sentence in a program: ");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            if (isPangram(str)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } // Scanner will automatically close here (try-with-resources)
    }

    public static boolean isPangram(String str) {
        // Remove spaces and convert to lowercase
        String cleanedString = str.replaceAll("\\s+", "").toLowerCase();

        // Boolean array to track each alphabet
        boolean[] alphabetTracker = new boolean[26];
        int uniqueAlphabets = 0;

        // Iterate through the cleaned string
        for (int i = 0; i < cleanedString.length(); i++) {
            char ch = cleanedString.charAt(i);

            // Check if character is an alphabet
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a'; // Map alphabet to index (0-25)
                if (!alphabetTracker[index]) {
                    alphabetTracker[index] = true; // Mark alphabet as found
                    uniqueAlphabets++;

                    // If all 26 alphabets are found, return true
                    if (uniqueAlphabets == 26) {
                        return true;
                    }
                }
            }
        }

        // If less than 26 alphabets are found, return false
        return false;
    }
}
