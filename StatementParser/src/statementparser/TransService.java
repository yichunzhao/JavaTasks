/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;

//import org.omg.IOP.TransactionService;
import statementparser.datamodel.Transaction;

/**
 *
 * @author YNZ
 */
public class TransService {

    public static String getInitalBal(Transaction transaction) {
        return transaction.getBalance();
    }

    public static int isCredit(Transaction transaction) {
        String amount = transaction.getAmount();
        System.out.println("amount = " + amount);

        return Double.valueOf(transaction.getAmount()).compareTo(0.0d);
    }

}
