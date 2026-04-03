public class stock1 {
    public static int maxProfit(int[] prices){
        int buy=prices[0];
        int profit=0;

        for(int i=1; i<prices.length;i++){
            if(buy<prices[i]) {
                profit=Math.max(prices[i]-buy,profit);

            }
            else{
                buy=prices[i];
            }
        
            
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[]={4,5,9,13,16,24};
        System.out.println(maxProfit(prices));

        
    }
}
