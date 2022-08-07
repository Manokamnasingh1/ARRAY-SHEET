import java.util.*;
class TUF {
    static int findDuplicate(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        int arr[] = {1,3,4,2,2};
        System.out.println("The duplicate element is " + findDuplicate(arr));
    }
}

//Time Complexity:O(Nlogn + N) : NlogN for sorting the array and O(N) for traversing through the array and checking if adjacent element are equal or not. But this will distort the array.
// Space Complexity:O(1)
