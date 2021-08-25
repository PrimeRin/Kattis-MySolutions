package Kattis.InProcess;

import java.util.Scanner;

public class Sort_of_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        String[] arrCopy;
        if (count <= 200) {
            while (N != 0) {
                String[] arr = new String[N];
                arrCopy =new String[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = sc.next();
                }
                arrCopy= sortArray(arr);
                for (int i = 0; i < N; i++) {
                    System.out.println(arrCopy[i]);
                }
                System.out.println();
                N = sc.nextInt();
                count++;
            }
        }

        }
        

    private static String[] sortArray(String[] arr) {
        int min = 0;
        String minString = arr[min];
        String temp;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j].charAt(0) < arr[min].charAt(0)) {
                temp = arr[min];
                arr[min] = arr[j];
                arr[j] = temp;
            } else if (arr[j].charAt(0) > arr[min].charAt(0)) {
                min = j;
            } else if (arr[j].charAt(0) == arr[min].charAt(0)) {
                if (arr[j].charAt(1) < arr[min].charAt(1)) {
                    temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                } else if (arr[j].charAt(1) > arr[min].charAt(1)) {
                    min = j;
                }

            }
        }
        return arr;
    }
}
