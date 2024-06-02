package DSA;

public class LongestRepeatingSubstring {
    public static void main(String[] args) {
        LongestRepeatingSubstring longestRepeatingSubstring = new LongestRepeatingSubstring();
        longestRepeatingSubstring.longestNonRepeatingSubstring("madamiamadam");
    }

    public String longestNonRepeatingSubstring (String s) {

        String working = "";
        String[] sArray = s.split("");

        for (int i = 0; i< sArray.length; i++) {
            if (!working.contains(sArray[i])) {
                working = working + sArray[i];
            } else {
                working = subber(working, sArray[i]);
                working = working + sArray[i];
            }
        }
    }

    private String subber (String s, String i) {
        while (s.contains(i)) {
            s = s.substring(1,s.length());
        }
        return s;
    }

}
