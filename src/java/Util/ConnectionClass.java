/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Syste
 */
public class ConnectionClass {
    
      public Connection connection;

    public ConnectionClass() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String a = "";
            this.connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfosystem?user=root");
        } catch (Exception err) {
            System.out.println(err.toString());
        }
    }
    
    
}

