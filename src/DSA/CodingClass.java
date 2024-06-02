package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodingClass {
    public int method(int [] arr) {
        List<Integer> intList = new ArrayList<>();
        for (int i : arr){
            if(i%2 ==0 && i!=0 ){
                intList.add(i);
            }
        }
        Collections.sort(intList);
        int response = 0;
        try {
             response = intList.get(intList.size()-1);
        } catch (IndexOutOfBoundsException i) {
            System.out.println("Array is empty");
        }

        return response;
    }
}
