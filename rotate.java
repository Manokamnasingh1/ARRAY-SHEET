import java.util.Arrays;

public class rotate{

    public static void reverse(int arr [],int start, int end){  
        while (start <=end){
            int temp = arr[end];
            arr[end]= arr[start];
            arr[start]= temp;
            start++;
            end--;
            
        }
    }

    static void rotated(int arr[] , int d, int n){  
        if(n == 0) return;
         d= d% n;
         reverse ( arr, 0, d-1);
         reverse ( arr, d,n-1);
 
         reverse ( arr, 0,n-1);
 
     }




    public static void main(String args[]){
        int arr[]= {1,2,3,4,5,6,7};
    
       int n =7;
       int d =3;
        rotated(arr,n,d);
        System.out.println(Arrays.toString(arr));
    }

}