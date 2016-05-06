/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;

import java.util.HashMap;
import java.util.List;
import statementparser.datamodel.Category;
import statementparser.datamodel.Statement;
import statementparser.datamodel.Transaction;

/**
 *
 * @author YNZ
 */
public class StatementServiceTest {

    public static void main(String[] args) {
        //transalate xml data into classes
        Statement statement = new Statement();
        Parser parser = new StatementParser(new RawXml().file, statement);
        parser.parsing();

        //find each payment category transactions in a arraylist; 
        //aligned in a hashmap. 
        HashMap hM = new HashMap();
        hM = statement.getTransByCategory();

        //Get all transactions associatd with a Category. 
        List<Transaction> listFood = (List<Transaction>) hM.get(Category.FOOD_DRINK);
        for (Transaction t : listFood) {
            System.out.println(t.toString());
        }
        
        System.out.println("--------------------------");
        List<Transaction> listCloth = (List<Transaction>) hM.get(Category.CLOTH);
        for (Transaction t : listCloth) {
            System.out.println(t.toString());
        }
        
        

    }

}
