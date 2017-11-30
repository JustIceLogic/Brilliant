/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccess;

import objetos.maestro;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;


/**
 *
 * @author ROGLOGIC
 */
public class maestroDAO {
    private PreparedStatement statement;
    private Connection connection;
    private static final Logger logger = Logger.getLogger(maestro.class.getName());
    public maestroDAO(){
    }
    public maestroDAO(Connection connection){
        this.connection = connection;
    }
    public Connection getCOnnection(){
        return connection;
    }
    public void setConnection(Connection connection){
        this.connection = connection;
    }
    
    public void addUser (maestro maestro){
        try{
            statement = connection.prepareStatement("INSERT INTO maestro VALUES(?,?,?,?)");
            synchronized(statement){
                statement.setString(1,maestro.getNombre());
                statement.setString(2,maestro.getApellidoP());
                statement.setString(3,maestro.getApellidoM());
                statement.setString(4,maestro.getId());
                statement.executeUpdate();
            }
            statement.close();
        } catch(SQLException sqle){
            logger.log(Level.SEVERE, sqle.toString(),sqle);
            throw new RuntimeException(sqle);
        }
    }
}
