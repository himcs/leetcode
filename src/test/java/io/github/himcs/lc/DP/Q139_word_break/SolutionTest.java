package io.github.himcs.lc.DP.Q139_word_break;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    void test_wordBreak() {
        Solution solution = new Solution();
        Assertions.assertEquals(true, solution.wordBreak("leetcode", Arrays.asList("leet", "code")));
        Assertions.assertEquals(true, solution.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        Assertions.assertEquals(false, solution.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }
}