/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class Statement {

    private List<Transaction> list;

    public Statement() {
        list = new ArrayList<>();
    }

    public Statement(List<Transaction> list) {
        list.addAll(list);
    }

    public void addTransaction(Transaction transaction) {
        this.list.add(transaction);
    }

    public List<Transaction> getList() {
        return list;
    }

    public void setList(List<Transaction> list) {
        this.list = list;
    }

    public Transaction getFirstTrans() {
        Transaction transaction = null;
        if (list != null) {
            transaction = list.get(0);
        }
        return transaction;
    }

    public Transaction getLastTrans() {
        Transaction transaction = null;
        if (list != null) {
            transaction = list.get(list.size() - 1);
        }
        return transaction;
    }

}
