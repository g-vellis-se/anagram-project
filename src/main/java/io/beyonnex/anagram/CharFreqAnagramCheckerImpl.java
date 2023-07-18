package io.beyonnex.anagram;

/**
 * Anagram implementation leveraging character frequency count.
 * Algorithm's complexity is O(n); i.e. linear time complexity.
 */
public class CharFreqAnagramCheckerImpl implements AnagramChecker {

    @Override
    public boolean check(String str1, String str2) {
        // Step 1: Compare lengths
        if (str1.length() != str2.length()) return false;

        // Step 2: Create a map to hold the frequency count of characters
        int[] charCount = new int[128]; // Assuming Unicode characters

        // Step 3: Update the frequency count for characters in str1
        for (char c : str1.toLowerCase().toCharArray())
            charCount[c]++;

        // Step 4: Update the frequency count for characters in str2
        for (char c : str2.toLowerCase().toCharArray())
            charCount[c]--;

        // Step 5: Check if any character count is non-zero
        for (int count : charCount)
            if (count != 0) return false;

        // Step 6: All character counts are zero, strings are anagrams
        return true;
    }

}
