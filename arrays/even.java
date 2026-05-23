import java.util.*;

public class even {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arr:");
        n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number:");
            arr[i] = sc.nextInt();
        }

        // Print odd numbers
        System.out.println("Odd numbers are:");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();

        // Print even numbers
        System.out.println("Even numbers are:");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
