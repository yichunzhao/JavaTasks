/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;

import java.io.File;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import statementparser.datamodel.CategoryAssociated;
import statementparser.datamodel.Statement;
import statementparser.datamodel.Transaction;

/**
 *
 * @author YNZ
 */
public class StatementParser extends XmlParser {

    private Statement statement;
    private CategoryAssociated ca;

    public StatementParser(File inputFile, Statement statement) {
        super(inputFile);
        this.statement = statement;
        ca = new CategoryAssociated();
    }

    @Override
    public void parsing() {
        NodeList rows = getDoucment().getElementsByTagName("Row");

        for (int i = 0; i < rows.getLength(); i++) {

            Node row = rows.item(i);//each row. 
            if (row.getNodeType() == Element.ELEMENT_NODE) {
                Element rowElement = (Element) row;
                NodeList cells = rowElement.getElementsByTagName("Data");
                if (cells.item(0).getTextContent().trim().equals("Date")) {
                    continue;
                }

                Transaction transaction = new Transaction();
                transaction.setDate(cells.item(0).getTextContent().trim());
                transaction.setCreditor(cells.item(1).getTextContent().trim());
                transaction.setAmount(cells.item(2).getTextContent().trim());
                transaction.setBalance(cells.item(3).getTextContent().trim());
                transaction.setStatus(cells.item(4).getTextContent().trim());
                transaction.setReconciled(cells.item(5).getTextContent().trim());
                transaction.setCategory(ca.locate(transaction.getCreditor()).name());

                statement.addTransaction(transaction);
            }
        }
    }

    @Override
    public Statement getStatement() {
        return statement;
    }
}
