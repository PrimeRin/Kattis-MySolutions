package Kattis.com;

import java.util.Scanner;

public class Tower_Construction {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];

        for(int i=0;i<N;i++){
           arr[i]=sc.nextInt();
        }
        int count=1;

        for(int i=1;i<N;i++){
            if(arr[i]>arr[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
