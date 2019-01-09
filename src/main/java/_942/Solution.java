package _942;

class Solution {
    public int[] diStringMatch(String S) {
        int[] ret = new int[S.length() + 1];

        int ci = 0;
        int cd = S.length();

        for (int i = 0; i < S.length(); i++) {
            ret[i] = S.charAt(i) == 'I' ? ci++ : cd--;
        }

        // 最后一个
        ret[S.length()] = S.charAt(S.length() - 1) == 'I' ? ci : cd;
        return ret;
    }

}