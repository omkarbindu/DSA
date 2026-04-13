import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of series:");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.println("fibonnic series:"+a+""+b+"");
        
        for(int i=3; i<=n;i++){
            int c=a+b;
            System.out.println(c+"");
            a=b;
            b=c;

        }

    }
    
}
