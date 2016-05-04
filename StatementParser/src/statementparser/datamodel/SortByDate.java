/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser.datamodel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author YNZ
 */
public class SortByDate implements Comparator<Transaction> {

    @Override
    public int compare(Transaction o1, Transaction o2) {
        int result = 2;

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
            Date date1 = dateFormat.parse(o1.getDate());
            Date date2 = dateFormat.parse(o2.getDate());
            result = date1.compareTo(date2);
        } catch (ParseException ex) {
            System.err.println(Arrays.toString(ex.getStackTrace()));
        }

        return result;
    }
}
