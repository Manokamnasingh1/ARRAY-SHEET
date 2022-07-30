
// KTH MAX AND MIN

import java.util.*;
public class kthmax {
    public static void main(String[] args) {
        int k=4;
        int a[] = {5, 8, 12, 7, 6, 2, 4};
        Arrays.sort(a);
        System.out.println(a[k-1]);

    }
}

// time complexity 0(N)+0(K-1*LOGN)
