import java.util.Scanner;

public class allsort {
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;

                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    } 



    
    public static void  bubble(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]<arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }

            }

        }
    }
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;

            }
            arr[prev+1]=curr;
        }
    }
    public static void counting(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);

        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }

        }

    }

    

    public static void  printArr(int arr[]){
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");


        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={3,6,2,1,8,7,4,5,3,1};


         System.out.println("Choose Sorting Method:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Counting Sort");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();


         int[] bubbleArr = arr.clone();
         int[] selectionArr = arr.clone();
         int[] insertionArr = arr.clone();
         int[] countingArr = arr.clone();

         switch (choice) {
            case 1:
                System.out.println("Using Bubble Sort:");
                bubble(bubbleArr);
                break;
            case 2:
                System.out.println("Using Selection Sort:");
                selection(selectionArr);
                break;
            case 3:
                System.out.println("Using Insertion Sort:");
                insertion(insertionArr);
                break;
            case 4:
                System.out.println("Using Counting Sort:");
                counting(countingArr);
                break;
            default:
                System.out.println("Invalid choice! No sorting applied.");
                return;
        }

       /* 

        // Apply Bubble Sort

        System.out.print("Bubble Sort:    ");
        bubble(bubbleArr);
        printArr(bubbleArr);

        // Apply Selection Sort
        System.out.print("Selection Sort: ");
        selection(selectionArr);
        printArr(selectionArr);

        //insertion sort
        System.out.print("insertion sort: ");
        selection(insertionArr);
        printArr(insertionArr);

        //countion sort
        System.out.print("counting sort: ");
        selection(countingArr);
        printArr(countingArr);
        */

         System.out.print("Sorted Array: ");
         if (choice == 1) printArr(bubbleArr);
         else if (choice == 2) printArr(selectionArr);
         else if (choice == 3) printArr(insertionArr);
         else if (choice == 4) printArr(countingArr);
    }

}
