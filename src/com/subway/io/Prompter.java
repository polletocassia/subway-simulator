package src.com.subway.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prompter {

    public static String chooseOne(Scanner sc, String titulo, String[] options) {
        while (true) {
            System.out.println("\n" + titulo);
            listOptions(options);
            System.out.print("Enter the option number: ");

            try {
                int n = sc.nextInt();
                if (n >= 1 && n <= options.length) {
                    sc.nextLine();
                    return options[n - 1];
                } else {
                    System.out.println("Invalid option. Try again!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
            }
        }
    }

    public static List<String> chooseSeveral(Scanner sc, String title, String[] options) {
        System.out.println("\n" + title);
        listOptions(options);
        System.out.println("Enter numbers separated by commas (e.g. 1,3,6) or just Enter for none.");
        System.out.print("Your choice: ");

        String row = sc.nextLine().trim();
        List<String> chosen = new ArrayList<>();

        if (row.isBlank())
            return chosen;

        String[] parts = row.split(",");
        for (String p : parts) {
            String item = p.trim();
            if (item.isEmpty())
                continue;
            try {
                int idx = Integer.parseInt(item);
                if (idx >= 1 && idx <= options.length) {
                    String value = options[idx - 1];
                    if (!chosen.contains(value)) {
                        chosen.add(value);
                    }
                } else {
                    System.out.println("Warning: Out of range option ignored -> " + item);
                }
            } catch (NumberFormatException ex) {
                System.out.println("Warning: Invalid value ignored -> " + item);
            }
        }
        return chosen;
    }

    public static void listOptions(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.printf("%d - %s%n", i + 1, options[i]);
        }
    }

}
