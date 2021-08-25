package Kattis.com;

import java.util.*;
//4
public class PlantingTress {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[n-(i+1)];
        }
        int j=2;
        int sum=arr1[0]+j;

        for(int i=1;i<n;i++){
            j=j+1;
            if(sum<(arr1[i]+j)){
                sum=arr1[i]+j;
            }
        }
        System.out.println(""+sum);
    }
}
