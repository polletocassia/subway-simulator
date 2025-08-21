package src.com.subway.service;

import java.util.List;
import java.util.Map;

import src.com.subway.catalog.PriceTable;

public class PriceCalculator {

     public static final double sumPrices(List<String> items, Map<String, Double> priceTable) {
        double sum = 0.0;
        for (String it : items) {
            sum += priceTable.getOrDefault(it, 0.0);
        }
        return round2(sum);
    }

    public static double subtotal(Double baseBread, double cheeseSum, double meatSum, double saladSum, double sauceSum){
        return baseBread + cheeseSum + meatSum + saladSum + sauceSum;
    }

    public static double total(double subtotal, String size){
        double multiplier = PriceTable.PRICE_SIZE.get(size);
        return round2(subtotal * multiplier);
    }

    public static double round2(double v) {
        return Math.round(v * 100.0) / 100.0;
    }
    
}
