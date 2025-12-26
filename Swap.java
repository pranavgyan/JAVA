import java.util.Scanner;
public class Swap {
    //METHOD 1;
    public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            int a=input.nextInt();
            int b=input.nextInt();
            int c;
            c=a;
            a=b;
            b=c;
            System.out.println(a);
            System.out.println(b);





//METHOD 2;

            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println(a);
            System.out.println(b);


        }
    }

