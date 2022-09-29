package simple_algo;

import java.util.Arrays;
import java.util.Scanner;

public class StockPrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //no of days
        int[] reduce_in_price = new int[n]; //change in stock price per day eg: [-5,-2,5] -> best day to buy is day2
        for (int i = 0; i < n; i++) {
            reduce_in_price[i] = in.nextInt();
        }
        System.out.println("Price reduce per day: "+Arrays.toString(reduce_in_price));
        int price = 0, low = reduce_in_price[0],day=0;
        for (int i = 0; i < n; i++) {
            price = price + reduce_in_price[i];
            if (price < low) {
                low = price;
                day=i+1;
            }
        }
        System.out.println("Best day to buy is: Day "+day+"\nTotal reduce in price: "+low);

//        5
//        -39957 -17136 35466 21820 -26711
//        [-39957, -17136, 35466, 21820, -26711]
//        -57093

//        //calculating price each day
//        int[] price_per_day = new int[n];
//        price_per_day[0] = reduce_in_price[0];
//        for (int i = 1; i < n; i++) {
//            price_per_day[i] = reduce_in_price[i] + reduce_in_price[i - 1];
//        }
//        //sorting
//        int min = price_per_day[0], day = 0;
//        for (int i = 0; i < n; i++) {
//            if (min > price_per_day[i]) {
//                min = price_per_day[i];
//                day = i + 1;
//            }
//        }
//        System.out.println("The best time to buy the stock will be on Day " + day + ". The Price Will be " + min + ".");
    }
}
