import java.util.Scanner;

public class Fibbonachi {
    public static void main(String[] args){
        int a=0,b=1;
        System.out.println("Number :");
        Scanner input =new Scanner(System.in);
        int c =input.nextInt();
        int d;
        System.out.println(a);

        for(int i=0;i<c;i++){

           d=b;
           b=a+b;
           a=d;
            System.out.println(a);

        }

    }
}
