package _917;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseOnlyLetters() {
        Solution solution = new Solution();
        assertEquals("dc-ba", solution.reverseOnlyLetters("ab-cd"));
        assertEquals("j-Ih-gfE-dCba", solution.reverseOnlyLetters("a-bC-dEf-ghIj"));
        assertEquals("Qedo1ct-eeLg=ntse-T!", solution.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    @Test
    public void isAlphabet() {
        Solution solution = new Solution();
        assertTrue(solution.isAlphabet('a'));
        assertTrue(solution.isAlphabet('z'));
        assertTrue(solution.isAlphabet('A'));
        assertTrue(solution.isAlphabet('Z'));
        assertFalse(solution.isAlphabet('-'));
    }
}