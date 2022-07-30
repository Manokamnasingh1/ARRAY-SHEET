
//Move Negatives to one Side of Array

import java.util.ArrayList;
import java.util.Arrays;

public class  moveoneend {

        public static void main(String args[]) {
            int a[] = {7, 8, -3, 1, 2};
            int left = 0, right = a.length - 1;

            while (left < right) { // run untill

                while (a[left] < 0) left++; //+ve
                while (a[right] > 0) right--;//-ve

                //when left pointer cross right pointer
                if (left >= right)
                    break;


                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;

            }
            System.out.println(Arrays.toString(a));
        }
    }

    // TC- O(N),  SC-O(1)

