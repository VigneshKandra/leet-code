package DSA;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ListNode {

    public int myAtoi(String s) {
        s = "-91283472332";
        String [] sarr = new String[s.length()];

        for (int i=0; i < s.length(); i++) {
            sarr[i] = String.valueOf(s.charAt(i));
        }

        String integer = "";
        for (int j=0; j < s.length(); j++) {

            int index = j;
            try {
                Integer parsed = Integer.parseInt(sarr[index + 1]);

            if (!sarr[j].equals(" ") && (sarr[j].equals("-") || parsed instanceof Integer)) {
                integer = integer + sarr[index];
                try {
                    while ((Integer) Integer.parseInt(sarr[index + 1]) instanceof Integer) {
                        integer = integer + sarr[index + 1];
                        index = index + 1;
                    }
                }
                catch (Exception e) {
                    if (Integer.parseInt(integer) < Integer.MAX_VALUE){
                        return Integer.parseInt(integer);
                    }
                    System.out.println("Done");
                    break;
                }
                finally {
                    System.out.println(Integer.parseInt(integer));
                    j = index;
                }
            }
            } catch (NumberFormatException n) {
                if (Character.isLetter(sarr[j].charAt(0))){
                    return 0;
                } else continue;
            }

        }
        return Integer.parseInt(integer);
    }

}

