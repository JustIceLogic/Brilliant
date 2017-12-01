/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccess;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;
import objetos.clase;


/**
 *
 * @author ROGLOGIC
 */
public class claseDAO {
    private PreparedStatement statement;
    private Connection connection;
    private static final Logger logger = Logger.getLogger(clase.class.getName());
    public claseDAO(){
    }
    public claseDAO(Connection connection){
        this.connection = connection;
    }
    public Connection getCOnnection(){
        return connection;
    }
    public void setConnection(Connection connection){
        this.connection = connection;
    }
    
    public void addUser (clase clase){
        try{
            statement = connection.prepareStatement("INSERT INTO clase VALUES(?,?,?,?)");
            synchronized(statement){
                statement.setString(1,clase.getNombre());
                statement.setString(2,clase.getEdificio());
                statement.setString(3,clase.getSalon());
                statement.setString(3,clase.getTopico());
                statement.executeUpdate();
            }
            statement.close();
        } catch(SQLException sqle){
            logger.log(Level.SEVERE, sqle.toString(),sqle);
            throw new RuntimeException(sqle);
        }
    }
}
