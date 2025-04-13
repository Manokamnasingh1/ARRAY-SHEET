public class Missing {
    public static int MissNo(int arr[], int N){
        int Sum = N*(N+1)/2;
        int s2=0;
        for(int i=1;i<N;i++){
            s2=s2+arr[i];           
        }
        int MissNum= Sum-s2;
        return MissNum;

    }
    public static void main(String[] args){
        int  N =5;
        int arr[]={1,2,3,4,5};
        int ans = MissNo(arr,N);
        System.out.println("missingno" +" : " +ans);

    }
    
}
