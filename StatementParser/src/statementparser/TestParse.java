/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;

import java.util.List;
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
        Statement statement = new Statement();
        Parser parser = new StatementParser(new RawXml().file, statement);
        parser.parsing();
        List<Transaction> list = parser.getStatement().getList();
        list.stream().forEach((transaction) -> {
            System.out.println(transaction.toString());
        });
    }

}
