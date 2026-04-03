import java.util.*;

public class twosum {
    public static void main(String[] args) {
    int[] arr = {1, 2, 5, 6};
    int target = 7;

     HashSet<Integer> set = new HashSet<>();

    for(int i = 0; i < arr.length; i++) {
       int complement = target - arr[i];

    if(set.contains(complement)) {
        System.out.println(arr[i] + " + " + complement);
    }

    set.add(arr[i]);
}
    }
}