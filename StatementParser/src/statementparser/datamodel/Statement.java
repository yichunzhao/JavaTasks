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
    
    private List<Transaction> list = new ArrayList<>();

    public Statement() {
    }
    
    public Statement(List<Transaction> list){
        list.addAll(list);
    }
    
    public void addTransaction(Transaction transaction){
        this.list.add(transaction);
    }

    public List<Transaction> getList() {
        return list;
    }

    public void setList(List<Transaction> list) {
        this.list = list;
    }
    
    
}
