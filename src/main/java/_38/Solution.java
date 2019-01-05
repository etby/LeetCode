package _38;

class Solution {

    public String countAndSay(int n) {

        StringBuilder builder = new StringBuilder("1");
        while (0 < --n) {
            char[] chars = builder.toString().toCharArray();
            builder.delete(0, chars.length);

            char cur = 0;
            int cnt = 0;

            for (char c : chars) {
                if (cur == c) {
                    cnt++;
                } else {
                    if (cnt > 0) {
                        builder.append(cnt).append(cur);
                    }

                    cur = c;
                    cnt = 1;
                }
            }

            if (cnt > 0) {
                builder.append(cnt).append(cur);
            }
        }

        return builder.toString();
    }

}