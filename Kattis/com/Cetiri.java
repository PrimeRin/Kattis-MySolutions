package Kattis.com;

import java.util.Scanner;

public class Cetiri {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Cetiri ob=new Cetiri();
        int arr[]=new int[3];

        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        arr=ob.sort(arr);

        //case 1
        if(arr[1]-arr[0]==arr[2]-arr[1]){
            System.out.println(arr[2]+(arr[2]-arr[1]));
        }
        else if(arr[1]-arr[0]< arr[2]-arr[1]){
            int n=arr[1]+(arr[1]-arr[0]);
            System.out.println(n);
        }
        else if(arr[1]-arr[0]> arr[2]-arr[1]){
            int n=arr[0]+(arr[2]-arr[1]);
            System.out.println(n);
        }



    }
    public int[] sort(int arr[]){
        for(int i=0;i<3;i++){
            if(arr[0]>arr[1]){
                int temp=arr[0];
                arr[0]=arr[1];
                arr[1]=temp;
            }
            if(arr[1]>arr[2]){
                    int temp=arr[1];
                    arr[1]=arr[2];
                    arr[2]=temp;
            }
        }
        return arr;
    }
}
