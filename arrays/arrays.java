import java.util.*;
public class arrays{
    public static int  linearSearch(String menu[],String key){

        for(int i=0; i<menu.length; i++ ){
            if(menu[i].equalsIgnoreCase(key)){
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String menu[]={"chole bhatur","chai","samosa","sandwich","vada pav"};
        //String key = "dosa";
         System.out.print("Enter the item to search: ");
        String key = sc.nextLine();  
        int index = linearSearch(menu,key);
        if(index == -1){
            System.out.println("not found");


        }else
        System.out.println("key is at index:"+index);

    }
}