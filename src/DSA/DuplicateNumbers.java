package DSA;

public class DuplicateNumbers {
    public int [] mostRepeated (int [] arr) {

        int [] response = new int[arr.length];
        int count, resIndex=0;
        for (int i : arr) {
            count = 0;
            for (int j = 0; j< arr.length ; j++) {
                if (arr[j] == i) {
                    count ++;
                }
            }
            if (count > 1) {
                response[resIndex] = i;
                resIndex++;
            }
        }
        return response;
    }
}
/* DSA.PrintProgram pp = new DSA.PrintProgram();pp.print();

        //-------------------------------------------------------------------------------------------
        DSA.CodingClass cc = new DSA.CodingClass();
        int [] arr = {1,3,5,7,9,13,17,-2,-4,-6,-12,0};
        System.out.println(cc.method(arr));
        //-------------------------------------------------------------------------------------------

        DSA.RemoveNegatives rn  = new DSA.RemoveNegatives();
       // rn.removeNegs(new int[]  {1,2,-2,-4,-6,-12,3,4,5}).stream().forEach(n -> System.out.println(n));
        //-------------------------------------------------------------------------------------------
        DSA.DuplicateNumbers dn = new DSA.DuplicateNumbers();
        int [] array ={1,2,3,22,3,3,56,7,66,66,87,1};
        for (int n : dn.mostRepeated(array)) {
            System.out.println(n);
        };*/