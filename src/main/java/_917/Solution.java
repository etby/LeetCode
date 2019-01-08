package _917;

class Solution {
    public String reverseOnlyLetters(String S) {
        if (S == null || S.length() < 2) {
            return S;
        }

        char[] chars = S.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!isAlphabet(chars[left])) {
                left++;
                continue;
            }

            if (!isAlphabet(chars[right])) {
                right--;
                continue;
            }

            // 交换
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;

            // 移动
            left++;
            right--;
        }

        return new String(chars);
    }

    boolean isAlphabet(char c) {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }
}