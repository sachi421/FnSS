/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fnss.test;

import fnss.functions.DB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nisal
 */
public class TestDB {
    public static void main(String[] args) {
        try {
            String SQL = "UPDATE stock SET `qty` = 50 WHERE `itemCode` = 'I001'";
            DB.getDbCon().insert(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}