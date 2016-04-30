/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser.datamodel;

import java.util.Date;

/**
 *
 * @author YNZ
 */
public class Transaction implements Classifiable {

    private Date date;
    private String text;
    private double amount;
    private double balance;
    private String status;
    private String reconciled;

    public Transaction(Date date, String text, double amount, double balance, String status, String reconciled) {
        this.date = date;
        this.text = text;
        this.amount = amount;
        this.balance = balance;
        this.status = status;
        this.reconciled = reconciled;
    }
    
    @Override
    public String toString() {
        return date.toString().concat(" " + text + " ").concat(String.valueOf(amount));
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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
    public Category classify() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
