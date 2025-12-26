import java.util.Scanner;

 class SumofDigits {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Number :");
        int a=input.nextInt();
        if(a<0){
            int m=calculation(-a);
            System.out.println(-m);
        }
       else{
            System.out.println(calculation(a));
        }

        input.close();
    }


    public static int calculation(int b) {
        int sum=0;
        int c;
        while(b>0){
            c=b%10;
            sum=sum+c;
            b=b/10;
           }
        return sum;
    }
}

