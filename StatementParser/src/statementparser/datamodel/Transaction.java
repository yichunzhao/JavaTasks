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

    public String getText() {
        return creditor;
    }

    public void setText(String text) {
        this.creditor = text;
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

    @Override
    public String toString() {
        return date + " " + creditor + " " + amount + " " + balance + " " + status + " " + reconciled;
    }

}
