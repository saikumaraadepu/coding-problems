public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println(getMaxProfit(arr));
    }

    public static int getMaxProfit(int[] arr) {
        int minPrice = arr[0];
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int currentPrice = arr[i];
            if (currentPrice - minPrice > maxProfit) {
                maxProfit = currentPrice - minPrice;
            }

            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }
        }

        return maxProfit;
    }
}
