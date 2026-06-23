public class P19_Stock_Buy_and_Sell {
        public static int maxProfit(int[] prices) {
         int n=prices.length;
         if(n<2) return 0;
        int maxProfit=0,purchagePrice=prices[0];
        for(int i=1;i<n;i++){
            if(purchagePrice>prices[i]){
                purchagePrice=prices[i];
            }
            else{
                  int currentProfit=prices[i]-purchagePrice;
                  maxProfit=Math.max(currentProfit,maxProfit);
            }
        }
        return maxProfit;    
    }
    public static void main(String[] args) {
        int []prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        // Approch --> sbse pehle ye assume kiya ki first day to sirf buy krega , ab mene sirf 2 condition smjhi 
        // 1. agr mere purchagePrice se  next value   kam h to me update kr dunga purchagePrice ko us kam value se 
        // 2. agr next value badi h to profit calculatte krke apne varibale maxProfir me store kr lunga 
        
    }
    
}
