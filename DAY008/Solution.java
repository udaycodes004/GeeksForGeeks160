
class Solution {
    public int maximumProfit(int prices[]) {
        int maxprofit=0;
        int minvalue=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minvalue){
                minvalue=prices[i];
            }else{
                int profit=prices[i]-minvalue;
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;
        
    }
}