package Kattis.com;

import java.util.Scanner;

public class Ptice {
    public static void main(String args[]) {
        Ptice ob=new Ptice();
        Scanner sc=new Scanner(System.in);
        int count1=0;
        int count2=0;
        int count3=0;

        int N=sc.nextInt();
        String str=sc.next();
        char UserInput[]=str.toCharArray();

         count1=ob.ScoreOfP1(UserInput);
         count2=ob.ScoreOfP2(UserInput);
         count3=ob.ScoreOfP3(UserInput);

         if(count1>count2 && count1>count3){
             System.out.println(""+count1);
             System.out.println("Adrian");
         }
         else if(count2>count1 && count2>count3){
             System.out.println(""+count2);
             System.out.println("Bruno");
        }
         else if(count3>count1 && count3>count2){
             System.out.println(""+count3);
             System.out.println("Goran");
         }
         else if(count1==count2 && count2==count3){
             System.out.println(""+count1);
             System.out.println("Adrian");
             System.out.println("Bruno");
             System.out.println("Goran");
         }
    }
    public int ScoreOfP1(char[] arr){
        int count1=0;
        for(int i=0;i<arr.length;i++){
            switch (i%3){
                case 0: if(arr[i]=='A'){
                    count1++;
                }
                break;
                case 1: if(arr[i]=='B'){
                    count1++;
                }
                break;
                case 2: if(arr[i]=='C'){
                    count1++;
                }
                break;
            }
        }
        return count1;
    }
    public int ScoreOfP2(char[] arr){
        int count2=0;
        for(int i=0;i<arr.length;i++){
            switch (i%4){
                case 0:
                case 2:
                    if(arr[i]=='B'){
                    count2++;
                }
                    break;
                case 1: if(arr[i]=='A'){
                    count2++;
                }
                    break;
                case 3: if(arr[i]=='C'){
                    count2++;
                }
                    break;
            }
        }
        return count2;
    }
    public int ScoreOfP3(char[] arr){
        int count3=0;
        for(int i=0;i<arr.length;i++){
            switch (i%6){
                case 0:
                case 1:
                    if(arr[i]=='C'){
                        count3++;
                    }
                    break;
                case 2:
                case 3:
                    if(arr[i]=='A'){
                    count3++;
                }
                    break;
                case 4:
                case 5:
                    if(arr[i]=='B'){
                    count3++;
                }
                    break;
            }
        }
        return count3;
    }
}
