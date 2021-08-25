package Kattis.com;

import java.util.Scanner;

public class Death_Knight_Hero {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Death_Knight_Hero ob=new Death_Knight_Hero();
        int N=sc.nextInt();
        String arr[]=new String[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.next();
        }
        int count=0;

        for(int i=0;i<N;i++){
            char ch[]=arr[i].toCharArray();

            if (ob.checkWin(ch)==1) {
                count++;
            }
        }

        System.out.println(count);

    }
    public int checkWin(char arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]=='D'){
                if(arr[i-1]=='C'){
                   return 0;
                }
            }
        }
        return 1;
    }

}
