/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementparser;

import statementparser.datamodel.Statement;

/**
 *
 * @author YNZ
 */
public interface Parser {

    void parsing();

    Statement getStatement();

}
