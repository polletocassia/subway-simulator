package src.com.subway.app;

import java.util.List;
import java.util.Scanner;
import src.com.subway.catalog.PriceTable;
import src.com.subway.service.ChoiceService;
import src.com.subway.service.PriceCalculator;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Subway Simulator ---");

        ChoiceService choice = new ChoiceService();

        String bread = choice.chooseBread(sc);
        String size = choice.chooseSize(sc);
        List<String> cheeses = choice.chooseCheeses(sc);
        List<String> meats = choice.chooseMeats(sc);
        List<String> salads = choice.chooseSalads(sc);
        List<String> sauces = choice.chooseSauces(sc);

        double baseBread = PriceTable.PRICE_BREAD.get(bread);
        double cheeseSum = PriceCalculator.sumPrices(cheeses, PriceTable.PRICE_CHEESE);
        double meatSum = PriceCalculator.sumPrices(meats, PriceTable.PRICE_MEAT);
        double saladSum = PriceCalculator.sumPrices(salads, PriceTable.PRICE_SALAD);
        double sauceSum = PriceCalculator.sumPrices(sauces, PriceTable.PRICE_SAUCE);

        double subtotal = PriceCalculator.subtotal(baseBread, cheeseSum, meatSum, saladSum, sauceSum);
        double total = PriceCalculator.total(subtotal, size);

        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.println("  Bread: " + bread + " - " + PriceTable.USD.format(baseBread));
        System.out.println("  Cheeses: " + String.join(", ", cheeses) + " - " + PriceTable.USD.format(cheeseSum));
        System.out.println("  Meats: " + String.join(", ", meats) + " - " + PriceTable.USD.format(meatSum));
        System.out.println("  Salads: " + String.join(", ", salads) + " - " + PriceTable.USD.format(saladSum));
        System.out.println("  Sauces: " + String.join(", ", sauces) + " - " + PriceTable.USD.format(sauceSum));        
        System.out.println("  Subtotal: " + PriceTable.USD.format(subtotal));
        System.out.println("x Size multiplier (" + size + "): " + PriceTable.PRICE_SIZE.get(size));
        System.out.println("--------------------------------");
        System.out.println("TOTAL: " + PriceTable.USD.format(total) + "\n");

        sc.close();
    } 
}
