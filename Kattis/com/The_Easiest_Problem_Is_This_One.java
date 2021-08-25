package Kattis.com;

import java.util.Scanner;

public class The_Easiest_Problem_Is_This_One {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        The_Easiest_Problem_Is_This_One ob=new The_Easiest_Problem_Is_This_One();
        boolean flag = true;
        int N= sc.nextInt();
        while(N!=0){
            int count=11;
            while (flag) {
                int NSum=ob.DigitN(N);
                int product=N*count;
                int PSum=ob.ProductDigitSum(product);
                if(NSum==PSum){
                    flag=false;
                    System.out.println(count);
                    //break;
                }
                else{
                    count++;
                }
            }
            N=sc.nextInt();
            flag=true;

        }
    }

    public int DigitN(int N) {
        int sum=0;
        while(N>0){
            int num=N%10;
            sum=sum+num;
            N=N/10;
        }
        return sum;
    }

    public int ProductDigitSum(int N){
        int sum=0;
        while(N>0){
            int num=N%10;
            sum=sum+num;
            N=N/10;
        }
        return sum;
    }
}
