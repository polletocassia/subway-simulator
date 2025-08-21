package src.com.subway.service;

import java.util.List;
import java.util.Scanner;

import src.com.subway.catalog.Catalog;
import src.com.subway.io.Prompter;

public class ChoiceService {

    public String chooseBread(Scanner sc) {
        return Prompter.chooseOne(sc, "Choose your bread:", Catalog.BREADS);
    }

    public String chooseSize(Scanner sc){
        return Prompter.chooseOne(sc, "Choose size:", Catalog.SIZES);
    }

    public List<String> chooseCheeses(Scanner sc){
        return Prompter.chooseSeveral(sc, "Choose your cheeses (optional):", Catalog.CHEESES);
    }

    public List<String> chooseMeats(Scanner sc){
        return Prompter.chooseSeveral(sc, "Choose your meats (optional):", Catalog.MEATS);
    }

    public List<String> chooseSalads(Scanner sc){
        return Prompter.chooseSeveral(sc, "Choose your salads (optional):", Catalog.SALADS);
    }

    public List<String> chooseSauces(Scanner sc){
        return Prompter.chooseSeveral(sc, "Choose your sauces (optional):", Catalog.SAUCES);

    }

}
