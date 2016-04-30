/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;
import java.util.*;

/**
 *
 * @author YNZ
 */
public interface Parser {
   Map<String,Float> findInitalBalance();
   Boolean isCredit();
   void catogryTransactions();
   Float sumCatoryExpense();
   Float findColsingBalance();
   Float totalCategoryExpense();
    
}
