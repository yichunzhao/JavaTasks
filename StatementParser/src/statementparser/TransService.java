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

    private Transaction transaction;

    public TransService(Transaction transaction) {
        this.transaction = transaction;
    }

    public double getInitalBal() {
        double initBal = 0;
        if (transaction.getBalance() != null) {
            initBal = Double.valueOf(transaction.getBalance());
        }
        return initBal;
    }

    public int isCredit() {
        return Double.valueOf(transaction.getAmount()).compareTo(0.0);
    }

}
