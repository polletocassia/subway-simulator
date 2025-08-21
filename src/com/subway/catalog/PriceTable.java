package src.com.subway.catalog;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class PriceTable {

    public static final Map<String, Double> PRICE_BREAD = Map.of(
            "Italian", 7.00,
            "Butter and Garlic", 7.50,
            "Parmesan with Oregano", 8.00);

    public static final Map<String, Double> PRICE_SIZE = Map.of(
            "15cm", 1.00,
            "30cm", 1.80);

    public static final Map<String, Double> PRICE_CHEESE = Map.of(
            "Mozzarella", 1.50,
            "Cheddar", 2.50,
            "Catupiry", 2.00);

    public static final Map<String, Double> PRICE_MEAT = Map.of(
            "Breaded Chicken", 6.80,
            "Ranch Chicken", 7.00,
            "Creamy Cheddar Steak", 8.20,
            "Barbecue Steak", 7.40);

    public static final Map<String, Double> PRICE_SALAD = Map.of(
            "Lettuce", 0.20,
            "Tomato", 0.20,
            "Pepper", 0.25,
            "Red Onion", 0.50,
            "Cucumber", 0.42,
            "Olive", 0.30);

    public static final Map<String, Double> PRICE_SAUCE = Map.of(
            "Spiced Mayonnaise", 0.40,
            "Honey Mustard", 0.20,
            "Parmesan", 0.55,
            "Barbecue", 0.50,
            "Sweet and Sour Onion", 0.55,
            "Supreme", 0.30);

    public static final NumberFormat BRL = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

}
