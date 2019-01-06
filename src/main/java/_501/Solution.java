package _501;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import common.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    private LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }

        counter(root);

        int maxCnt = 0;
        LinkedList<Integer> values = new LinkedList<>();

        for (Integer i : map.keySet()) {
            Integer cnt = map.get(i);
            if (cnt > maxCnt) {
                values.clear();
                maxCnt = cnt;
            }
            if (cnt == maxCnt) {
                values.add(i);
            }
        }
        int[] ints = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            ints[i] = values.get(i);
        }

        return ints;
    }

    void counter(TreeNode node) {
        if (node == null) {
            return;
        }

        int val = node.val;
        int cnt = map.getOrDefault(val, 0);
        map.put(val, cnt + 1);

        counter(node.left);
        counter(node.right);
    }

}