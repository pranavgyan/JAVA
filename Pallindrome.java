import java.util.Scanner;

public class Pallindrome {
   public static void main(String[] args) {
       System.out.println("Number :");
       Scanner input =new Scanner(System.in);
       int c =input.nextInt();

       int n = c;
       int rev = 0;

       while(n > 0){
           int d = n % 10;
           rev = rev * 10 + d;
           n = n / 10;
       }


       if(c == rev) System.out.println("Pallindrome");
       else System.out.println("not Pallindrome");


    }


}
