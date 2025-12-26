import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
                System.out.println("Number :");
                Scanner input =new Scanner(System.in);
                int c =input.nextInt();
                int d;
                int g=c;
                int e=count(c);
                int sum=0;
                while(c>0){
                    d=c%10;
                    int f=power(d,e);
                    sum+=f;
                    c=c/10;
                }
            if(sum==g) System.out.println("Armstrong");
            else System.out.println("Not Armstrong");

         input.close();
    }

    public static int count(int a){
        int count =0;
          while(a>0){
            a=a/10;
            count++;
        }
          return count;
    }


    public static int power(int x,int y){
        int pow=1;
        for(int i=0;i<y;i++){
            pow=pow*x;
        }
       return pow;
    }

}
