import java.util.*;
public class Fizz {
    public List<String> fizzbuzz (int n){
        List<String> res = new ArrayList<>();
        for (int i=1;i<=n;i++){
            if (i%15==0){
                res.add("FizzBuzz");
            } else if(i%3==0){
                res.add("Fizz");
            } else if (i%5==0){
                res.add("Buzz");
            }
            else {
                res.add(String.valueOf(i));
            }
        }
        return res;
  

    

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value of n: ");
    int n = sc.nextInt();

    Fizz obj = new Fizz();   // create object

    List<String> result = obj.fizzbuzz(n);   // call method

    System.out.println(result);   // print result
}

    }

    

