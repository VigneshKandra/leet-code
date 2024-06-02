package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegatives {
    public List<Integer> removeNegs(int [] arr) {
        List<Integer> response =  new ArrayList<>();
        for (int i : arr) {
            response.add(i);
        }
        return response.stream().filter(in -> in > 0).collect(Collectors.toList());
    }
}
