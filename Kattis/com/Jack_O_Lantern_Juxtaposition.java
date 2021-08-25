package Kattis.com;

import java.util.Scanner;

public class Jack_O_Lantern_Juxtaposition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int jack[]=new int[3];
        int product=1;

        for(int i=0;i<3;i++){
            jack[i]=sc.nextInt();
            product=product*jack[i];
        }
        System.out.println(""+product);
    }
}
