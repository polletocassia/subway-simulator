package src.com.subway.app;

import java.util.List;
import java.util.Scanner;
import java.util.Map;

import src.com.subway.catalog.PriceTable;
import src.com.subway.service.ChoiceService;

public class Main { 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Subway Simulator ---\n");

        ChoiceService choice = new ChoiceService();

        String bread = choice.chooseBread(sc);
        String size = choice.chooseSize(sc);

        List<String> cheeses = choice.chooseCheeses(sc);
        List<String> meats = choice.chooseMeats(sc);
        List<String> salads = choice.chooseSalads(sc);
        List<String> sauces = choice.chooseSouces(sc);



        

        double baseBread = PriceTable.PRICE_BREAD.get(bread);
        double cheeseSum = sumPrices(cheeses, PriceTable.PRICE_CHEESE);
        double meatSum = sumPrices(meats, PriceTable.PRICE_MEAT);
        double saladSum = sumPrices(salads, PriceTable.PRICE_SALAD);
        double sauceSum = sumPrices(sauces, PriceTable.PRICE_SOUCE);

        double subtotal = baseBread + cheeseSum + meatSum + saladSum + sauceSum;
        double total = round2(subtotal * PriceTable.PRICE_SIZE.get(size));

        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.println("Bread: " + bread + " - " + size);
        printList("Cheeses", cheeses, PriceTable.PRICE_CHEESE);
        printList("Meats", meats, PriceTable.PRICE_MEAT);
        printList("Salads", salads, PriceTable.PRICE_SALAD);
        printList("Sauces", sauces, PriceTable.PRICE_SOUCE);

        System.out.println("\nPrice breakdown:");
        System.out.println("  Bread:  " + PriceTable.BRL.format(baseBread));
        System.out.println("  Cheese: " + PriceTable.BRL.format(cheeseSum));
        System.out.println("  Meats:  " + PriceTable.BRL.format(meatSum));
        System.out.println("  Salads: " + PriceTable.BRL.format(saladSum));
        System.out.println("  Sauces: " + PriceTable.BRL.format(sauceSum));
        System.out.println("  Subtotal: " + PriceTable.BRL.format(subtotal));
        System.out.println("x Size multiplier (" + size + "): " + PriceTable.PRICE_SIZE.get(size));
        System.out.println("--------------------------------");
        System.out.println("TOTAL: " + PriceTable.BRL.format(total));

        sc.close();
    }

    private static void printList(String title, List<String> itens, Map<String, Double> priceTable) {
        if (itens == null || itens.isEmpty()) {
            System.out.println(title + ": (none)");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < itens.size(); i++){
                String name = itens.get(i);
                Double price = priceTable.getOrDefault(name, 0.0);
                sb.append(name).append(" (").append(PriceTable.BRL.format(price)).append(")");
                if (i < itens.size() - 1) sb.append(", ");
            }
            System.out.println(title + ": " + sb);
        }
    }

    private static double sumPrices(List<String> items, Map<String, Double> priceTable) {
        double sum = 0.0;
        for (String it : items) {
            sum += priceTable .getOrDefault(it, 0.0);
        }
        return round2(sum);
    }

    private static double round2(double v){
        return Math.round(v * 100.0) / 100.0;
    }

}
