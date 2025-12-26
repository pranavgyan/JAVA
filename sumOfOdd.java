import java.util.Scanner;

public class sumOfOdd {
    public static void main(String[] args){
        System.out.print("Enter Number: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0) sum+=i;
        }
        System.out.print(sum);
    }
}
