package Kattis.com;

import java.util.Scanner;

public class Mjehuric {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Mjehuric ob=new Mjehuric();
        int arr[]=new int[5];
         for(int i=0;i<5;i++){
             arr[i]=sc.nextInt();
         }
         arr=ob.sort(arr);
    }
    public int[] sort(int arr[]){
        int count=5;
        while(count>0){
            count--;
        for(int i=1;i<5;i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                printArray(arr);
            }
        }
        }
        return arr;
    }

    public void printArray(int arr[]){
        for(int i:arr){
            System.out.print(" "+i);
        }
        System.out.println();
    }
}
