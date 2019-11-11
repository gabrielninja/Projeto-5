/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto05.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Products {

    private int id;
    private String description;
  

    public static ArrayList<Products> getList(int id) throws Exception {
        ArrayList<Products> list = new ArrayList();
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        String user = "app";
        String pass = "app";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement stmt = con.createStatement();
        String sql = "SELECT PRODUCT_ID, DESCRIPTION FROM PRODUCT WHERE MANUFACTURER_ID ="+id;
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Products p = new Products(
                    rs.getInt("PRODUCT_ID"),
                    rs.getString("DESCRIPTION")
                    
            );
            list.add(p);
        }
        return list;
    }

    public Products(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
  public String getDescription() {
        return description;
    }

    public void setName(String description) {
        this.description = description;
    }

}
