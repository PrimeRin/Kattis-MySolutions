package Kattis.com;

import java.util.Scanner;

public class Missing_Numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int lastDigit=arr[N-1];
        int search=1;
        for(int j=0;j<lastDigit;j++){
            for(int i=0;i<N;i++){
               if(arr[i]==search){
                   search++;
                   break;
               }
               else if(i==N-1){
                   if(arr[i]!=search) {
                       System.out.println(search);
                       search++;
                   }
               }
            }
        }
        int count=0;
        for(int i=0;i<N;i++){
            if(arr[i]==(i+1)){
                count++;
            }
        }

        if(count==N){
            System.out.println("good job");
        }

    }
}
