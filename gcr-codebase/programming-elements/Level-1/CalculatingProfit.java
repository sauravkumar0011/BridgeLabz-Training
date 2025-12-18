class CalculatingProfit{

    public static void main(String[] args) {

//calculating profit and profit
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        System.out.println(
            "The Cost Price is " + costPrice + " and Selling Price is " + sellingPrice + "\n" +
            "The Profit is " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}