/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;

import statementparser.datamodel.Statement;
import statementparser.datamodel.Transaction;

/**
 *
 * @author YNZ
 */
public class TestTransServ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //transalate xml data into classes
        Statement statement = new Statement();
        Parser parser = new StatementParser(new RawXml().file, statement);
        parser.parsing();
        
        //displaying the initial bal. of each transaction
        //displaying the current bal. of each transction after payment.
        for (Transaction t : statement.geTransactions()){
            System.out.print("init " + TransService.getInitalBal(t)+" ");
            System.out.print("curr " + TransService.getCurrentBal(t)+" ");
            System.out.print("cred " + TransService.isCredit(t)+"\n");
        }
        
        
        
        
        
        

    }

}
