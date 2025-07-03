class Solution {
    public int buyChoco(int[] prices, int money) {
        if(money == 0){
            return 0;
        }
        Arrays.sort(prices);
        for(int i = 1; i < prices.length; i++){
            int chocolates = prices[i-1] + prices[i];
            if( chocolates <= money){
                return money - chocolates;
            }
        }
        return money;
    }
}