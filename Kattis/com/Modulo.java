package Kattis.com;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int arr1[]=new int[10];

        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            arr1[i]=arr[i]%42;
        }
        int count=CheckDuplicates(arr1);
        System.out.println(count);
    }

    private static int CheckDuplicates(int[] arr) {
        int count=0;
        for(int i=0;i<10;i++){
            int n=arr[i];
            int repeat=0;
            for(int j=i+1;j<10;j++){
                if(arr[j]==n){
                    repeat++;
                }
            }
            if(repeat==0){
                count++;
            }
        }
        return count;
    }
}
