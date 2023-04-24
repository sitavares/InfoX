/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;

import java.sql.*;


/**
 *
 * @author sctavares1
 */
public class ModuloConexao {
    //metodo responsável por estabelecer a conexão com o banco de dados
    public static Connection conector(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "root";
        // estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}
