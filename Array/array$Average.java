package Array;

import java.util.Scanner;

public class array$Average {
    public static void main(String[] args){
        System.out.print("No of Numbers: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        float[] arr=new float[n];
        System.out.print("Numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextFloat();
        }
        float sum=0;
        for(int j=0;j<n;j++){
            sum=sum+arr[j];
        }
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+(sum/n));
    }
}
