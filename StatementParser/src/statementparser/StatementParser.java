/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import statementparser.datamodel.Statement;
import statementparser.datamodel.Transaction;

/**
 *
 * @author YNZ
 */
public class StatementParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Statement statement = new Statement();
        XmlParser xmlParser = new XmlParser(new RawXml().file);
        Document doc = xmlParser.getDoucment();

        NodeList rows = doc.getElementsByTagName("Row");

        for (int i = 0; i < rows.getLength(); i++) {

            Node row = rows.item(i);//each row. 
            if (row.getNodeType() == Element.ELEMENT_NODE) {
                Element rowElement = (Element) row;
                NodeList cells = rowElement.getElementsByTagName("Data");

                Transaction transaction = new Transaction();

                transaction.setDate(cells.item(0).getTextContent());
                transaction.setText(cells.item(1).getTextContent());
                transaction.setAmount(cells.item(2).getTextContent());
                transaction.setBalance(cells.item(3).getTextContent());
                transaction.setStatus(cells.item(4).getTextContent());
                transaction.setReconciled(cells.item(5).getTextContent());
                
                System.out.println(transaction.toString());
                
                statement.addTransaction(transaction);
            }
        }
    }
}
