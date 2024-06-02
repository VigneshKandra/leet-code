package DSA;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        height = height;

        int verticalLines = height.length;

        List<Integer> listint = Arrays.stream(height).boxed().collect(Collectors.toList());
        Collections.sort(listint);
        System.out.println(listint);

        List<Integer> listin = new LinkedList<>();
        listin = Arrays.stream(height).boxed().collect(Collectors.toList());

       // System.out.println(listin);
        //System.out.println("************"+listin.indexOf(listint.get(0)));

        //----------------------------------------------
        int p1= Integer.MIN_VALUE;
        int p2= Integer.MIN_VALUE;

        for  (int i = 0 , j = verticalLines-1; i< verticalLines && j< verticalLines ; i++, j--) {

            p1 = height[i] * verticalLines-i;

            p2 = height[j] * verticalLines-j;

            int p3 = height[i] * height[j];

            System.out.println("p1 " + p1 + "  p2 "+ p2 + " -------------------- p3 "+ p3);
        }

        return 0;
    }
}
