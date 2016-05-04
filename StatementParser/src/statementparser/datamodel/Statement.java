/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser.datamodel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author YNZ
 */
public class Statement {

    private List<Transaction> list;
    private HashMap<Category, List<Transaction>> categoryTrans;
    private HashMap<Category, String> categorySum;

    {
        categoryTrans = new HashMap<>();
        categorySum = new HashMap<>();
    }

    public Statement() {
        list = new ArrayList<>();
    }

    public Statement(List<Transaction> list) {
        list.addAll(list);
    }

    public void addTransaction(Transaction transaction) {
        this.list.add(transaction);
    }

    public List<Transaction> geTransactions() {
        return list;
    }

    public void setTransactions(List<Transaction> list) {
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

    public void sortByCategory() {
        Collections.sort(list);
    }

    public void sortbyDate() {
        Collections.sort(list, Collections.reverseOrder(new SortByDate()));
    }

    public HashMap getTransByCategory() {
        if (this.list.isEmpty()) {
            return categoryTrans;
        };

        List<Transaction> ts = geTransactions();
        Collections.sort(ts);

        for (Category c : Category.values()) {
            ArrayList<Transaction> aL = new ArrayList<>();
            for (Transaction t : ts) {
                if (t.getCategory().equals(c.name())) {
                    aL.add(t);
                }
                categoryTrans.put(c, aL);
            }
        }
        return categoryTrans;
    }

    public HashMap<Category, String> sumCategoryPayment() {
        if (categoryTrans.isEmpty()) {
            categoryTrans = getTransByCategory();
        }

        for (Category c : categoryTrans.keySet()) {
            List<Transaction> cts = categoryTrans.get(c);
            double sum = 0;
            for (Transaction t : cts) {
                sum += Double.valueOf(t.getAmount());
            }

            categorySum.put(c, Double.toString(sum));
        }
        return categorySum;
    }

    public Double totalTansAmount() {
        double sum = 0;

        for (String s : categorySum.values()) {
            sum += Double.valueOf(s);
        }
        return sum;
    }

}
