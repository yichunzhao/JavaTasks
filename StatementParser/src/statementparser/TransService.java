/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;


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
        return Double.valueOf(transaction.getAmount()).compareTo(0.0d);
    }

    public static String getCurrentBal(Transaction transaction) {
        double amount = Double.valueOf(transaction.getAmount());
        double initalBal = Double.valueOf(transaction.getBalance());
        double currentBal = initalBal + amount;
        return String.valueOf(currentBal);
    }

}
