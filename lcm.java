import java.util.Scanner;

public class lcm {
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
        int c=a;
        for(int i=1;;i++){
            a=c;
            a=a*i;
            if(a%b==0){
                System.out.println(a);
                break;
            }

        }
    }

}
