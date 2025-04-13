import java.util.*;
public class Array {
    public static void main(String[] args) {
        System.out.println("enter size of arry");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        System.out.println("enter element of an array");
        //input
        for(int i=0;i<size;i++){

            a[i] = sc.nextInt();
        }

       // int max = a[0];
        int min = a[0];

       // for (int i = 0; i < a.length; i++) {
        //    if (a[i] > max)
        //        max = a[i];

       // }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Smallest element present in given array: " + min);
       // System.out.println("largest element present in given array: " + max);
    }
}

