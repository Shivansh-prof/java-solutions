/*Problem Statement : You are given an array prices
where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit
by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/

public class StockBuySell {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
//        naive approach
//        for(int i=0; i<prices.length; i++){
//
//            for (int j = i+1; j<prices.length; j++){
//                profit = Math.max(profit,prices[j] - prices[i]);
//            }
//        }

//        Better Approach complexity 2ms
//        for(int price:prices){
//            if(price < minPrice)
//                minPrice = price;
//            profit = Math.max(profit,price - minPrice);
//        }

//        Optimal solution Complexity 1ms
        for(int i=0;i<prices.length;i++){

            if((prices[i]-minPrice)>profit){
                profit=prices[i]-minPrice;
            }

            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println("Maximum profit achieved is : "+ maxProfit(nums));

    }
}
