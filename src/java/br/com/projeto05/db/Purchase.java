/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto05.db;

/**
 *
 * @author Jefferson
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jefferson
 */
public class Purchase {

    private int id;
    private String description;

    public static ArrayList<Purchase> getList(int id) throws Exception {
        ArrayList<Purchase> list = new ArrayList();
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        String user = "app";
        String pass = "app";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement stmt = con.createStatement();
        String sql ="SELECT PRO.PRODUCT_ID, PRO.DESCRIPTION \n" +
                    "FROM PURCHASE_ORDER AS P\n" +
                    "INNER JOIN CUSTOMER AS C ON P.CUSTOMER_ID = C.CUSTOMER_ID\n" +
                    "INNER JOIN PRODUCT AS PRO ON P.PRODUCT_ID = PRO.PRODUCT_ID\n" +
                    "WHERE P.CUSTOMER_ID = "+id+"";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Purchase pc  = new Purchase (
                    rs.getInt("PRODUCT_ID"),
                    rs.getString("DESCRIPTION")
                    
            );
            list.add(pc);
        }
        return list;
    }

    public Purchase (int id, String description) {
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

    public void setDescription(String description) {
        this.description = description;
    }

}

