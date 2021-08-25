package Kattis.com;

import java.util.Scanner;

public class Left_Beehind {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int x;
      int y;
      boolean loop=true;

      while(loop){
          x=sc.nextInt();
          y=sc.nextInt();

          if(x==0 && y==0){
              loop=false;
              break;
          }
          else if(x==y){
              System.out.println("Undecided.");
          }
          else if(x+y==13){
              System.out.println("Never speak again.");
          }
          else if(x>y){
              System.out.println("To the convention.");
          }
          else if(x<y){
              System.out.println("Left beehind.");
          }
      }
    }
}
