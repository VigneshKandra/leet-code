package DSA;

public class SortInPlace {
    public static void main(String[] args) {
        int [] arr = {2,4,3,1,6,7};
        sort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void sort (int [] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            System.out.println("pivot is "+ pi);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    private static int partition (int [] arr, int low, int high) {
        int i = (low-1);
        int pivot  = arr[high];
         for (int j = low; j < high; j++) {
             if (arr[j] <= pivot) {
                 i++;
                 int temp = arr[j];
                 arr[j] = arr[i];
                 arr[i]= temp;
             }
         }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high]= temp;
        return i+1;
    }

}
