import java.util.Scanner;

public class EvenOddByBit{
             public static void main(String[] args){
                 System.out.print("Enter Number: ");
                 Scanner input=new Scanner(System.in);
                 int a=input.nextInt();
                 if((a&1)==1) System.out.println("Odd");
                 else System.out.println("Even");

}
}
