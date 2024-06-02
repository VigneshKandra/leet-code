package DSA.Main;

import DSA.CodingClass;
import DSA.ContainerWithMostWater;
import DSA.ListNode;
import DSA.LongestSubstring;

public class MainDSA {
    public static void main(String[] args) {
        /*CodingClass codingClass = new CodingClass();
        int arr[] = {2,5,4,7,8,9,6,3} ;
        System.out.println(codingClass.method(arr));*/

        //-------------------------------------------------------------

       /* LongestSubstring longestSubstring = new LongestSubstring();
        longestSubstring.lengthOfLongestSubstring(null);*/


      /*  ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int [] intarr = {1,8,6,2,5,4,8,3,7};
        containerWithMostWater.maxArea(intarr);*/

        ListNode ln = new ListNode();
       // ln.myAtoi("");
        LongestPalSub longestPalSub = new LongestPalSub();
        System.out.println(longestPalSub.longestPalindrome("a"));

    }
}
