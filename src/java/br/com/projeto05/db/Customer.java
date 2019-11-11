/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto05.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Lucca
 */
public class Customer {
     private Integer id_customer;
    private String nome;
    private String email;

    public Customer(Integer id, String nome, String email) {
        this.id_customer = id_customer;
        this.nome = nome;
        this.email = email;
    }
    public static ArrayList<Customer> getClientes() throws ClassNotFoundException, SQLException{
        ArrayList<Customer> clientes = new ArrayList<>();
        
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        String user = "app";
        String pass = "app";
        
      
        Connection con = DriverManager.getConnection(url, user, pass);
        
        
        Statement stmt = con.createStatement();
        
       
        String sql = "SELECT CUSTOMER_ID, NAME, EMAIL FROM CUSTOMER";
        ResultSet rs = stmt.executeQuery(sql);
        
    
        while(rs.next()){
          
            Integer id = rs.getInt("CUSTOMER_ID");
            String nome = rs.getString("NAME");
            String email = rs.getString("EMAIL");
            
       
            Customer c = new Customer(id, nome, email);
            
            clientes.add(c);
        }
        
        return clientes;
    }
    
    public Integer getId() {
        return id_customer;
    }

    public void setId(Integer id) {
        this.id_customer = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
