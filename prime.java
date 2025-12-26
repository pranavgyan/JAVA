import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Number");
        int a=input.nextInt();
        if(a<=1) {System.out.println("Not Exist");
        return;}
        boolean b=true;
        for(int i=2;i*i<=a;i++) {
            if(a%i==0) {System.out.println("Not Prime");
                b=false;
                break;
        }}
        if(b) System.out.println("Prime");
        input.close();
    }
}
