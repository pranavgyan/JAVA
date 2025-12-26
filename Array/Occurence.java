package Array;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("No of Numbers: ");
        int n = input.nextInt();

        System.out.print("Number to find: ");
        int m = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int count = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == m) {
                count++;
            }
        }

        if (count > 0)
            System.out.println("Occurrence = " + count);
        else
            System.out.println("Not Found");

        input.close();
    }
}
