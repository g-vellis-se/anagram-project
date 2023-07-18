package io.beyonnex.anagram;

public interface AnagramChecker {

    /**
     * Checks if the given strings are anagrams
     * @param s1 first string
     * @param s2 second string
     * @return if the given strings are anagrams
     */
    boolean check(String s1, String s2);

}
