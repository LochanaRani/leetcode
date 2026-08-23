class Solution {
    public int maxProfit(int[] prices) {
       int min=prices[0];
       int currentPrice=0,profit=0;
       int max=0;
       for(int i=0;i<prices.length;i++){
            currentPrice=prices[i];
            if(currentPrice<min){
                min=currentPrice;
            }
            if(currentPrice>min){
                profit=prices[i]-min;
            }
            if(profit>max){
                max=profit;
            }
       }
       return max;
        
    }
}