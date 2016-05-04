/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;

import java.util.HashMap;
import java.util.Iterator;
import statementparser.datamodel.Statement;

/**
 *
 * @author YNZ
 */
public class TestCategorySumPayment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //transalate xml data into classes
        Statement statement = new Statement();
        Parser parser = new StatementParser(new RawXml().file, statement);
        //after parsing and then init. statment instance
        parser.parsing();

        HashMap map = statement.sumCategoryPayment();
        System.out.println(map.keySet());
        
        //println out each category credit or debit. 
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        //total transaction amount
        Double total = statement.totalTansAmount();
        System.out.println("total trans amount = "+total);

    }

}
