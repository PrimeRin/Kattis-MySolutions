package Kattis.InProcess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Minimum_Scalar_Product {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> l1=new ArrayList<Integer>();
        List<Integer> l2=new ArrayList<Integer>();

        int TestCase=sc.nextInt();


        for(int j=0;j<TestCase;j++){
            int N=sc.nextInt();
            for(int i=0;i<(N*2);i++){
                if(i<N){
                    l1.add(sc.nextInt());
                }
                else {
                    l2.add(sc.nextInt());
                }
            }
            Collections.sort(l1);
            Collections.sort(l2,Collections.reverseOrder());
            int minSum=CalculateMinSum(l1,l2);
            System.out.println("Case#"+(j+1)+": "+minSum);
            l1.clear();
            l2.clear();
        }
    }

    private static int CalculateMinSum(List<Integer> l1, List<Integer> l2) {
        int sum=0;
        Integer arr1[]=new Integer[l1.size()];
        Integer arr2[]=new Integer[l2.size()];
        arr1=l1.toArray(arr1);
        arr2=l2.toArray(arr2);

        for(int i=0;i< arr1.length;i++){
            sum=sum+(arr1[i]*arr2[i]);
        }
        return sum;
    }
}
