import java.util.*;

public class odd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr:");
        n=sc.nextInt();

        int [] arr = new int[n];
        //Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter a number:");
            arr[i]=sc.nextInt();
            
        
            }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]+" is odd");
            }
            else{
                System.out.println(arr[i]+" is even");
            }
        

        }


    }
}
    
    

