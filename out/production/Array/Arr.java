
import java.util.Scanner;
public class Arr {
    public Arr() {
    }
    public static void main(String[] args) {
       //
        int size=
        int[] a = new int[size];
        System.out.println("enter element of an array");
        int min;
        int max;
        for(min = 0; min < size; ++min) {
            a[min] = sc.nextInt();
        }
        min = a[0];
        for(int i = 0; i < a.length; ++i) {
            if (a[i] < min) {
                min = a[i];
            }
        }
       for( max = 0; max < size; ++max) {
           a[max] = sc.nextInt();
        }
       max=a[0];
       for(int i = 0; i < a.length; ++i) {
           if (a[i]> max) {
             max = a[i];
       }
       }

        System.out.println("Smallest element present in given array: " + min);
        System.out.println("Smallest element present in given array: " + max);
    }
}
