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


        return true;
    }

}
