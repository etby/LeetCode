package _501;

import org.junit.Before;
import org.junit.Test;

import common.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

    private TreeNode mNode;

    private TreeNode node(int x) {
        return new TreeNode(x);
    }

    @Before
    public void setUp() throws Exception {
        mNode = node(1);
        mNode.right = node(2);
        mNode.right.left = node(2);
    }

    @Test
    public void findMode() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{2}, solution.findMode(mNode));
    }
}