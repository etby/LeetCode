package _01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void twoSum() {
        int[] ints = {2, 7, 11, 15};
        int target = 26;
        int[] expected = {2, 3};
        Assert.assertArrayEquals(expected, new Solution().twoSum(ints, target));
    }
}