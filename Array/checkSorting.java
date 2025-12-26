package Array;

import java.util.Scanner;

public class checkSorting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("No of Numbers: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                System.out.println("Not Sorted");
                input.close();
                return;
            }
        }
        System.out.println("Sorted");
        input.close();
    }
}
