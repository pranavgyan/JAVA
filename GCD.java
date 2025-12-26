import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Number First :");
        int n=input.nextInt();
        System.out.println("Number Second :");
        int m=input.nextInt();
        if(n>=m) num(n,m);
        else num(m,n);

    }
    public static void num(int a,int b){

        for(int i=b;i>=1;i--){
            if(a%i==0 && b%i==0){

                System.out.println(i);
                break;
            }

        }


    }

}
