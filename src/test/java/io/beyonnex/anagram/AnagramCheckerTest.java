package io.beyonnex.anagram;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AnagramCheckerTest {

    protected AnagramChecker anagramChecker;

    public AnagramCheckerTest(AnagramChecker anagramChecker) {
        this.anagramChecker = anagramChecker;
    }

    @Test
    void testEmptyStrings() {
        assertThat(anagramChecker.check("", "")).isTrue();
    }

    @Test
    void testSingleCharacterAnagrams() {
        assertThat(anagramChecker.check("a", "a")).isTrue();
        assertThat(anagramChecker.check("a", "b")).isFalse();
    }

    @Test
    void testAnagramsWithSameCharacters() {
        assertThat(anagramChecker.check("listen", "silent")).isTrue();
        assertThat(anagramChecker.check("elbow", "below")).isTrue();
    }

    @Test
    void testAnagramsWithDifferentCharacterCounts() {
        assertThat(anagramChecker.check("abc", "ab")).isFalse();
        assertThat(anagramChecker.check("hello", "helo")).isFalse();
    }

    @Test
    void testAnagramsWithDifferentCharacters() {
        assertThat(anagramChecker.check("abcd", "efgh")).isFalse();
        assertThat(anagramChecker.check("hello", "world")).isFalse();
    }

    @Test
    void testAnagramsIgnoreCase() {
        assertThat(anagramChecker.check("listen", "SILENT")).isTrue();
        assertThat(anagramChecker.check("elbow", "BELOW")).isTrue();
    }

}
