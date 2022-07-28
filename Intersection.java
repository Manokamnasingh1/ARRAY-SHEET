import java.util.ArrayList;
import java.util.List;

public class Intersection {
        public static void main(String[] args) {
            int a[] = {1, 1, 1, 2, 2, 3, 3, 3};
            int b[] = {3, 3, 3, 4};
            int left = 0, right = 0;

            //intersection
            List<Integer> list = new ArrayList<>();
            //condation cheak until
            while (left < a.length || right < b.length) {

                //skip duplicate
                while (left > 0 && left < a.length && a[left] == a[left - 1]) {
                    left++;
                }
                while (right > 0 && right < b.length && b[right] == b[right - 1]) {
                    right++;

                }
                //one arry exaust
                if (left >= a.length || right > b.length) {
                    break;
                }
                //comparison
                if (a[left] < b[right]) {
                    left++;
                } else if (a[left] > b[right]) {
                    right++;
                } else {
                    list.add(a[left]);
                    left++;
                    right++;
                }
            }
            System.out.println(list);
        }
    }




