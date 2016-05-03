/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser.datamodel;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author YNZ
 */
public class CategoryAssociated {

    private Map<String, Category> map;

    public CategoryAssociated() {
        map = new HashMap<>();
        init();
    }

    private void init() {
        map.put("Fitness World", Category.ENTERTAINMENT);
        map.put("A-Kasse", Category.INSURANCE);
        map.put("Netto", Category.FOOD_DRINK);
        map.put("E/F Matr.Nr.1265 af Emdr", Category.HOUSE);
        map.put("LIDL", Category.FOOD_DRINK);
        map.put("Netto", Category.FOOD_DRINK);
        map.put("Føtex", Category.FOOD_DRINK);
        map.put("Dividend", Category.INCOME);
        map.put("LIDL", Category.FOOD_DRINK);
        map.put("Bog & Idé", Category.EDUCATION);
        map.put("Købmand", Category.FOOD_DRINK);
        map.put("Service Kiosken", Category.FOOD_DRINK);
        map.put("Transf.", Category.UNKNOWN);
        map.put("Tips & Lotto", Category.FOOD_DRINK);
        map.put("Istanbul Bazar", Category.FOOD_DRINK);
        map.put("Elgiganten", Category.UTIL);
        map.put("SILVAN", Category.UTIL);
        map.put("Irma", Category.FOOD_DRINK);
        map.put("Kiosk", Category.FOOD_DRINK);
        map.put("VDK EUR", Category.MONEYEXCH);
        map.put("Elias Slagteri", Category.FOOD_DRINK);
        map.put("Jinghua Shop", Category.FOOD_DRINK);
        map.put("Magasin", Category.CLOTH);
        map.put("Transfer of salary", Category.INCOME);
        map.put("Dong", Category.UTIL);
    }

    public Category locate(String creditor) {
        Category category = Category.UNKNOWN;
        Set<String> keySet = map.keySet();

        for (String s : keySet) {
            if (creditor.toLowerCase().contains(s.toLowerCase())) {
                category = map.get(s);
                break;
            }
        }

        return category;
    }

}
