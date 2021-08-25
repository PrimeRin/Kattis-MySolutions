package Kattis.com;

import java.util.Scanner;

public class Tri {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Num[] = new int[3];

        for (int i = 0; i < 3; i++) {
            Num[i] = sc.nextInt();
        }

        if (Num[0] + Num[1] == Num[2]) {
            System.out.println(Num[0] + "+" + Num[1] + "=" + Num[2]);
        } else if (Num[0] - Num[1] == Num[2]) {
            System.out.println(Num[0] + "-" + Num[1] + "=" + Num[2]);
        } else if (Num[0] * Num[1] == Num[2]) {
            System.out.println(Num[0] + "*" + Num[1] + "=" + Num[2]);
        } else if (Num[0] / Num[1] == Num[2]) {
            System.out.println(Num[0] + "/" + Num[1] + "=" + Num[2]);
        } else if (Num[0] == Num[1] + Num[2]) {
            System.out.println(Num[0] + "=" + Num[1] + "+" + Num[2]);
        } else if (Num[0] == Num[1] - Num[2]) {
            System.out.println(Num[0] + "=" + Num[1] + "-" + Num[2]);
        } else if (Num[0] == Num[1] * Num[2]) {
            System.out.println(Num[0] + "=" + Num[1] + "*" + Num[2]);
        } else if (Num[0] == Num[1] / Num[2]) {
            System.out.println(Num[0] + "=" + Num[1] + "/" + Num[2]);
        }
    }
}
