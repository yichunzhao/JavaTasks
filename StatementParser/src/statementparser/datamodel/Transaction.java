/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser.datamodel;

/**
 *
 * @author YNZ
 */
public class Transaction {

    private String date;
    private String creditor;
    private String amount;
    private String balance;
    private String status;
    private String reconciled;
    private String category;

    public Transaction() {
    }

    public Transaction(String date, String text, String amount, String balance, String status, String reconciled) {
        this.date = date;
        this.creditor = text;
        this.amount = amount;
        this.balance = balance;
        this.status = status;
        this.reconciled = reconciled;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReconciled() {
        return reconciled;
    }

    public void setReconciled(String reconciled) {
        this.reconciled = reconciled;
    }

    public String getCreditor() {
        return creditor;
    }

    public void setCreditor(String creditor) {
        this.creditor = creditor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return date + " " + creditor + " " + amount + " " + balance + " " + status + " " + reconciled + " " + category;
    }

}
