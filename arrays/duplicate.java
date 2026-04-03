public class duplicate {
    public  static boolean duplicate(int[] nums){
        for (int i = 0; i <nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    System.out.println("Duplicate found:"+nums[j]);
                    return true;
                }
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,12,3,14,12,};
        System.out.println(duplicate(nums));
    }
}
