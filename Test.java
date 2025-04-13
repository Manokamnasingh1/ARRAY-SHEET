
public class Test  {
  public static int[] movezero(int n, int [] a){
    int j =-1;
  for(int i =0;i<n;i++){
       if(a[i] ==0){
             j= i;
             break;
       }
   }
   if(j == -1) return a;

  for(int i = j+1; i< n; i++){
             if(a[i] !=0){ 
             int   temp = a[i];
             a[i]= a[j];
             a[j]= temp;
             j++;
             }
         }
         return a;
  }
              
   public static void main(String[] args){
   int[] arr ={1,0,3,4,0,1,3};
   int n= 6;
   int ans[]= movezero(n,arr);
   for(int i=0;i<n; i++){
   System.out.print( ans[i]+ " ");
}

System.out.println(" ");
}
}




                 
           
