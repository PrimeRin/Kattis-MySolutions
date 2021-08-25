package Kattis.com;

import java.util.Scanner;

public class Tarifa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int x = sc.nextInt();
        int n = sc.nextInt();
        int data[] = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
            sum = sum + data[i];
        }
        n++;
        int result=((x*n)-sum);
        System.out.println(" "+result);
    }
}
