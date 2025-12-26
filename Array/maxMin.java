package Array;

import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("No of Numbers: ");
        int n = input.nextInt();
        int[] arr=new int[n];
        System.out.print("Numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for (int j = 0; j < n; j++) {
            if(arr[j]>min) min=arr[j];
            else if(arr[j]<max) max=arr[j];
        }
        System.out.println("Max = "+min);
        System.out.println("Min = "+max);
      input.close();
    }
}
