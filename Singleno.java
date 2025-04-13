public class Singleno {
    public static int getsingleelment(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=1;j<n;j++){
                if(arr[j]== arr[i]){
                    count++;
                }
               
            }
            if(count==1){
                return count;
            }
         
        }
        
        return n-1;
    }
        public static void main(String[] args){
            int arr[]={1,1,2,4,4,5,5};
            int ans= getsingleelment(arr);
            System.out.println("single element is " + " "+ans );
        }
}
    

