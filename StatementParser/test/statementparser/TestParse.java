/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;

import java.util.List;
import statementparser.datamodel.CategoryAssociated;
import statementparser.datamodel.Statement;
import statementparser.datamodel.Transaction;

/**
 *
 * @author YNZ
 */
public class TestParse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //transalate xml data into classes
        Statement statement = new Statement();
        Parser parser = new StatementParser(new RawXml().file, statement);
        parser.parsing();

        List<Transaction> list = parser.getStatement().geTransactions();
        list.remove(0);
        list.stream().forEach((transaction) -> {
            System.out.println(transaction.toString());
        });

        //Each transaction finding inital bal. and is Credit or debit. 
        for (Transaction t : list) {
            System.out.println("init. Bal. =" + TransService.getInitalBal(t));
        }

        for (Transaction t : list) {
            System.out.println(TransService.isCredit(t));
        }

    }
}
