package Kattis.com;

import java.util.Scanner;

public class Prsteni {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rings=sc.nextInt();
        int size[]=new int[rings];

        for(int i=0;i<rings;i++){
            size[i]=sc.nextInt();
        }

        for(int i=1;i<rings;i++){
            int num=size[0];
            int deno=size[i];

            int common=CommonNumber(num,deno);

            num=num/common;
            deno=deno/common;

            System.out.println(num+"/"+deno);
        }
    }
    public static int CommonNumber(int a,int b){
      for(int i=Math.min(a,b);i>=1;i--){
          if(a%i==0 && b%i==0){
              return i;
          }

      }
        return 0;
    }
}
