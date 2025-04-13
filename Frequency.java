import java.util.*;
 class Frequency {
    int a[]=new int[10];
    int key;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("enter number");
            a[i]= sc.nextInt();
        }
        System.out.println("enter a number to find the frequency");
        key= sc.nextInt();
    }
    void count(){
        int count=0;
        for(int i=0; i<10;i++){
            if(a[i]==key)
                count++;

            }
        System.out.println("frequency= +count");
        }

    }

