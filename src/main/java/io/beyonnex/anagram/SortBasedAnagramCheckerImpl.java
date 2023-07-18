package io.beyonnex.anagram;

import java.util.Arrays;

/**
 * Anagram implementation leveraging string sorting.
 * Algorithm's complexity is O(n log n) --where n is the
 * length of the character arrays-- which complexity is
 * determined on the basis Arrays.sort O(n log n) complexity.
 */
public class SortBasedAnagramCheckerImpl implements AnagramChecker {

    @Override
    public boolean check(String str1, String str2) {
        // Step 1: Compare lengths
        if (str1.length() != str2.length()) return false;

        // Step 2: Convert to character arrays
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        // Step 3: Sort character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Step 4: Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

}
