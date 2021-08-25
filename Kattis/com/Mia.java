package Kattis.com;

import java.util.Scanner;

public class Mia {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }

        while(arr[1]!=0 &&arr[0]!=0 &&arr[2]!=0 &&arr[3]!=0){
            int count1=checkWin(arr[0],arr[1]);
            int count2=checkWin(arr[2],arr[3]);
            if(count1>count2){
                System.out.println("Player 2 wins.");
            }
            else if(count1==count2){
                System.out.println("Tie.");
            }
            else{
                System.out.println("Player 1 wins.");
            }
            for(int i=0;i<4;i++){
                arr[i]=sc.nextInt();
            }
        }
    }

    private static int checkWin(int i, int j) {
        int count=0;
        if(i==2 && j==1 || j==2 && i==1){
            count=1;
        }
        else if(i==j){
            if(i==6){
                count=2;
            }
            else if(i==5){
                count=3;
            }
            else if(i==4){
                count=4;
            }
            else if(i==3){
                count=5;
            }
            else if(i==2){
                count=6;
            }
            else if(i==1){
                count=7;
            }
        }
        else if(i!=j){
          String s1= Integer.toString(i);
          String s2= Integer.toString(j);

          if(i>j){
              String s = s1 + s2;
              int c = Integer.parseInt(s);
              count=(100-c);
          }
          else{
              String s = s2 + s1;
              int c = Integer.parseInt(s);
              count=(100-c);
          }
        }
        return count;
    }
}
