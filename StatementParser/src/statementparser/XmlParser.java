/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import org.xml.sax.SAXException;

/**
 *
 * @author YNZ
 */
public class XmlParser {

    private DocumentBuilderFactory factory;
    private DocumentBuilder documentBuilder;
    private Document document;

    public XmlParser(File inputFile) {
        if (inputFile != null) {
            init(inputFile);
        } else {
            throw new NullPointerException();
        }
    }

    private void init(File inputFile) {
        try {
            factory = DocumentBuilderFactory.newInstance();
            documentBuilder = factory.newDocumentBuilder();
            document = documentBuilder.parse(inputFile);
            document.getDocumentElement().normalize();
        } catch (ParserConfigurationException ex) {
            System.err.println(ex.getMessage());
        } catch (SAXException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public Document getDoucment() {
        return this.document;
    }

    public Element getElement() {
        return this.document.getDocumentElement();
    }
}
