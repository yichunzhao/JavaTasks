/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser.datamodel;

import java.util.Map;
import java.util.HashMap;




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
        map.put("Fitness World A/S (108)", Category.ENTERTAINMENT);
        map.put("Akademikernes A-Kasse", Category.INSURANCE);
        map.put("Netto Emdrupvej    93474", Category.FOOD_DRINK);
        map.put("E/F Matr.Nr.1265 af Emdr", Category.INSURANCE);
        map.put("LIDL               59774", Category.FOOD_DRINK);
        map.put("Netto Emdrupvej    39113", Category.FOOD_DRINK);
        map.put("Elite Købmand      07700", Category.FOOD_DRINK);
        map.put("Føtex Nørrebro     30403", Category.FOOD_DRINK);
        map.put("LIDL               60653", Category.FOOD_DRINK);
        map.put("Netto Emdrupvej    97317", Category.FOOD_DRINK);
        map.put("Netto Emdrupvej    97319", Category.FOOD_DRINK);
        map.put("Netto Emdrupvej    98253", Category.FOOD_DRINK);
        map.put("Dividend shs 3020830069", Category.INCOME);
        map.put("LIDL               41384", Category.FOOD_DRINK);
        map.put("Bog & Idé Nørrebro 86460", Category.EDUCATION);
        map.put("Tagensvej Købmand  39484", Category.FOOD_DRINK);
        map.put("Service Kiosken    98142", Category.FOOD_DRINK);
        map.put("Netto Emdrupvej    02253", Category.FOOD_DRINK);
        map.put("Transf. f 4560231318", Category.UNKNOWN);
        map.put("Tips & Lotto       88292", Category.FOOD_DRINK);
        map.put("Istanbul Bazar     45230", Category.FOOD_DRINK);
        map.put("Netto Emdrupvej    04593", Category.FOOD_DRINK);
        map.put("LIDL               44647", Category.FOOD_DRINK);
        map.put("Netto Lygten       78969", Category.FOOD_DRINK);
        map.put("Service Kiosken    98683", Category.FOOD_DRINK);
        map.put("Tips & Lotto       89230", Category.FOOD_DRINK);
        map.put("LIDL               47942", Category.FOOD_DRINK);
        map.put("Elgiganten 3080    01514", Category.UTIL);
        map.put("Service Kiosken    99156", Category.FOOD_DRINK);
        map.put("Netto Emdrupvej    11857", Category.FOOD_DRINK);
        map.put("LIDL               68957", Category.FOOD_DRINK);
        map.put("Service Kiosken    99442", Category.FOOD_DRINK);
        map.put("SILVAN             29438", Category.UTIL);
        map.put("LIDL               51477", Category.FOOD_DRINK);
        map.put("Netto Lyngbyvej 74 40442", Category.FOOD_DRINK);
        map.put("Irma               94776", Category.FOOD_DRINK);
        map.put("Emdrup Kiosk v/Res 54206", Category.FOOD_DRINK);
        map.put("Irma Emdrupvej     22725", Category.FOOD_DRINK);
        map.put("Service Kiosken    99973", Category.FOOD_DRINK);
        map.put("Service Kiosken    00172", Category.FOOD_DRINK);
        map.put("Netto Emdrupvej    46365", Category.FOOD_DRINK);
        map.put("VDK EUR     9.50", Category.MONEYEXCH);
        map.put("VDK EUR     8.50", Category.MONEYEXCH);
        map.put("Istanbul Bazar     57729", Category.FOOD_DRINK);
        map.put("Elias Slagteri     21885", Category.FOOD_DRINK);
        map.put("LIDL               72683", Category.FOOD_DRINK);
        map.put("Jinghua Shop v/Chu 36804", Category.FOOD_DRINK);
        map.put("LIDL               57691", Category.FOOD_DRINK);
        map.put("Netto Emdrupvej    49901", Category.FOOD_DRINK);
        map.put("LIDL               58255", Category.FOOD_DRINK);
        map.put("Netto Emdrupvej    51369", Category.FOOD_DRINK);
        map.put("Netto Emdrupvej    52658", Category.FOOD_DRINK);
        map.put("Magasin, Kgs Nytor 68047", Category.CLOTH);
        map.put("Magasin, Kgs Nytor 96433", Category.CLOTH);
        map.put("Transfer of salary", Category.INCOME);
    }
    
    public Category locate(String key){
        
        Category category = Category.UNKNOWN;
        if(map.containsKey(key)){
            category = map.get(key);
        }
        return category;
    }

}
