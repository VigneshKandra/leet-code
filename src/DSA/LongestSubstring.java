package DSA;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        s="abcabcbb";
        String longest = "";

        char [] chs = s.toCharArray();

        String str = "";

        for (int i = 0; i < chs.length; i++) {
            if (!str.contains(String.valueOf(chs[i]))) {
                str = str + (chs[i]);
            } else {
               str = nextLongest(str, chs[i]);
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        System.out.println(longest + longest.length());
        return longest.length();
    }

    public String nextLongest(String str, char c) {
        while (str.contains(String.valueOf(c))) {
            str = str.substring(1);
        }
        str = str + c;
        return str;
    }
}
