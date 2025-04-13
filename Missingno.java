public class Missingno{
    public static int Missno(int arr[], int N){
        int flag=0;
       
        for( int i =1;i<=N-1;i++){
            for(int j=0;j<N;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                    return i;
                }
            }
          
        }
        return -1;
    }
        public static void main(String[] args){
                    int arr[]={1,3};
                    int N=3;
                    int ans=Missno(arr,N);
                    System.out.println("missing no is"  +":" +ans);
                   
        }
    }
