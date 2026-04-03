import java.util.HashSet;
public class duplicate{
    public static void main(String[] args) {
    int[] arr = {2, 5, 1, 5};

    HashSet<Integer> set = new HashSet<>();

    for(int i = 0; i < arr.length; i++) {
        if(set.contains(arr[i])) {
            System.out.println("Duplicate = " + arr[i]);
            break;
        }
        set.add(arr[i]);
    }
 }
}