import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter a number:");
            arr[i]=sc.nextInt();
            
        
            }
        for(int i=0;i<5;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]+" is odd");
            }
            else{
                System.out.println(arr[i]+" is even");
            }
        

        }


    }
}
    
    

