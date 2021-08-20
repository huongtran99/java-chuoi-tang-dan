package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchStrMaxTestLength {

    @Test
     void testCase1() {
        String str = "Welcome";
        String expected = "Welo";
        String result = SearchStrMaxLength.searchStrMaxLength(str);
        assertEquals(expected, result);
    }

    @Test
    void testCase2() {
        String str = "Huong";
        String expected = "Hu";
        String result = SearchStrMaxLength.searchStrMaxLength(str);
        assertEquals(expected, result);
    }

    @Test
    void testCase3() {
        String str = "abcdefgh";
        String expected = "abcdefgh";
        String result = SearchStrMaxLength.searchStrMaxLength(str);
        assertEquals(expected, result);
    }

    @Test
    void testCase4() {
        String str = "hi";
        String expected = "hi";
        String result = SearchStrMaxLength.searchStrMaxLength(str);
        assertEquals(expected, result);
    }

    @Test
    void testCase5() {
        String str = "Hello";
        String expected = "Helo";
        String result = SearchStrMaxLength.searchStrMaxLength(str);
        assertEquals(expected, result);
    }

    @Test
    void testCase6() {
        String str = "abc";
        String expected = "abc";
        String result = SearchStrMaxLength.searchStrMaxLength(str);
        assertEquals(expected, result);
    }
}