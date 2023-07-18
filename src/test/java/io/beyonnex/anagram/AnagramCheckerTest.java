package io.beyonnex.anagram;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AnagramCheckerTest {

    protected AnagramChecker anagramChecker;

    public AnagramCheckerTest(AnagramChecker anagramChecker) {
        this.anagramChecker = anagramChecker;
    }

    @Test
    void testAnagramsWithDifferentCharacterCounts() {
        assertThat(anagramChecker.check("abc", "ab")).isFalse();
        assertThat(anagramChecker.check("hello", "helo")).isFalse();
    }

    @Test
    void testEmptyStrings() {
        assertThat(anagramChecker.check("", "")).isTrue();
    }

}
