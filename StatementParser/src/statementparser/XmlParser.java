/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class XmlParser {

    DocumentBuilderFactory factory;
    DocumentBuilder builder;
    File inputFile;

    public XmlParser(File inputFile) {
        if (inputFile != null) {
            init(inputFile);
        }
    }

    private void init(File inputFile) {
        try {
            this.factory = DocumentBuilderFactory.newInstance();
            this.builder = factory.newDocumentBuilder();
            this.inputFile = inputFile;
        } catch (ParserConfigurationException ex) {
            System.err.println(ex.toString());
        }

    }

}
