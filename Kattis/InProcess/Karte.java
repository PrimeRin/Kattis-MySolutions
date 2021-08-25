package Kattis.InProcess;
////3
import java.util.Scanner;

public class Karte {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = new char[str.length()];
        String[] arr1 = new String[4];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(arr[i]);
            i++;
            sb.append(arr[i]);
            i++;
            sb.append(arr[i]);
            arr1[j] = sb.toString();
            j++;
        }
        boolean x=CheckDuplicate(arr1);
        if(x){
            CheckCards(arr1);
        }


    }

    private static void CheckCards(String[] arr1) {
        int countP=0;
        int countK=0;
        int countH=0;
        int countT=0;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i].startsWith("P")){
                countP++;
            }
            else if(arr1[i].startsWith("K")){
                countK++;
            }
            else if(arr1[i].startsWith("H")){
                countH++;
            }
            else if(arr1[i].startsWith("T")){
                countT++;
            }
        }
        System.out.printf("%d %d %d %d",(13-countP),(13-countK),(13-countH),(13-countT));
    }

    private static boolean CheckDuplicate(String[] arr1) {
        boolean check=false;
        for(int i=0;i<(arr1.length-1);i++){
            String str=arr1[i];
            for(int j=i+1;j<arr1.length;j++){
                if(str.equals(arr1[j])){
                    check=true;
                }
            }
        }

        if(check){
            System.out.println("GRESKA");
            return false;
        }
        return true;
    }
}
