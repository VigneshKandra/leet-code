package DSA.Main;

import java.util.ArrayList;
import java.util.List;

class LongestPalSub {
    public String longestPalindrome(String s) {

        s = "a";
        List<String> palins = new ArrayList<>();

        String longestSubstring = "";

        char [] characters = s.toCharArray();
        int index = 1;
        for (int i = 0; i <= characters.length; i++) {
            if (longestSubstring.equals(s) && !isPalindrome(longestSubstring)) {
                longestSubstring = "";
                if (s.length()<=1) {
                    longestSubstring = longestSubstring + characters[i];
                } else {
                i = index ;
                    index = index + 1;
                    longestSubstring = longestSubstring + characters[i];}
            } else if (!isPalindrome(longestSubstring) && longestSubstring.length()!=0 && i<characters.length) {
                longestSubstring = longestSubstring + characters[i];
            } else if (isPalindrome(longestSubstring) && longestSubstring.length()!=0 && i<characters.length) {
                palins.add(longestSubstring);
                longestSubstring = longestSubstring + characters[i];
            } else if (i<characters.length){
                longestSubstring = longestSubstring + characters[i];
            } else {
                break;
            }
        }

        int longest = 0;
        String result = "";
        for (String si : palins) {

            if (si.length() > longest) {
                result = si;
                longest = si.length();
            }
        }


        return result;
    }

    boolean isPalindrome (String s) {
        char[] ch = s.toCharArray();
        String res = "";
        for (int j = ch.length-1; j>=0; j--) {
            res = res + ch[j];
        }
        return s.equals(res);
    }
}
