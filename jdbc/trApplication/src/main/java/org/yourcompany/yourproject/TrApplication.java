/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author OM PRAKASH
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TrApplication {

    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/TR","root","root");

            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.err.println("Connection established...");
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
