package src.com.subway.catalog;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class PriceTable {

    public static final Map<String, Double> PRICE_BREAD = Map.of(
            "Italian", 4.00,
            "Butter and Garlic", 5.50,
            "Parmesan with Oregano", 4.00);

    public static final Map<String, Double> PRICE_SIZE = Map.of(
            "15cm", 1.00,
            "30cm", 1.80);

    public static final Map<String, Double> PRICE_CHEESE = Map.of(
            "Mozzarella", 0.50,
            "Cheddar", 1.50,
            "Catupiry", 1.00);

    public static final Map<String, Double> PRICE_MEAT = Map.of(
            "Breaded Chicken", 3.80,
            "Ranch Chicken", 5.00,
            "Creamy Cheddar Steak", 4.20,
            "Barbecue Steak", 4.40);

    public static final Map<String, Double> PRICE_SALAD = Map.of(
            "Lettuce", 0.10,
            "Tomato", 0.10,
            "Pepper", 0.15,
            "Red Onion", 0.20,
            "Cucumber", 0.22,
            "Olive", 0.10);

    public static final Map<String, Double> PRICE_SAUCE = Map.of(
            "Spiced Mayonnaise", 0.20,
            "Honey Mustard", 0.10,
            "Parmesan", 0.25,
            "Barbecue", 0.10,
            "Sweet and Sour Onion", 0.25,
            "Supreme", 0.10);

    public static final NumberFormat USD = NumberFormat.getCurrencyInstance(Locale.US);

}
