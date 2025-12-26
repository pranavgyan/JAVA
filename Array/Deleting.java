package Array;

import java.util.Scanner;

public class Deleting {
    public static void main(String[] args){
        System.out.print("Number to delete ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]={3,4,6,8,9};
        int size=arr.length;
        boolean check=true;
        int i;
        for(i=0;i<size;i++){
         if(arr[i]==n) {
             check=false;
             break;
         }
     }
        if(check) System.out.println("Value Not Found");
        else{
            for(int j=i;j<size-1;j++){
                arr[j]=arr[j+1];
            }
            size--;
        }
        for(int k=0;k<size;k++){
            System.out.print(arr[k]+" ");
        }
        input.close();
    }
}
