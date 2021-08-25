package Kattis.com;

import java.util.Scanner;

public class Soylent {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();

        for(int i=0;i<cases;i++){
            int caloriesNeed=sc.nextInt();
            int cups=0;
            int calories=0;

            while(caloriesNeed>calories){
                calories=calories+400;
                cups++;
            }
            System.out.println(""+cups);
        }
        sc.close();

    }

}
