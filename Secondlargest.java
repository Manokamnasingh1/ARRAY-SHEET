//Time Complexity: O(n), as we are traversing the array only once.
//Auxiliary space: O(1)

class Main {
    static int findsecondlargest(int arr[]){
        int n = arr.length;
        int largest =-1;
        int secondlargest = -1;
        for(int i=0;i<n; i++){
            if(arr[i]>largest){
                secondlargest = largest;
                 largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
    public static void main (String args[]){  
        int arr[]={12,35,1,10,34,1};
        System.out.println(findsecondlargest(arr));
    }
}
