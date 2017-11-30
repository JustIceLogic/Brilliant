/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccess;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;
import objetos.estudiante;


/**
 *
 * @author ROGLOGIC
 */
public class estudianteDAO {
    private PreparedStatement statement;
    private Connection connection;
    private static final Logger logger = Logger.getLogger(estudiante.class.getName());
    public estudianteDAO(){
    }
    public estudianteDAO(Connection connection){
        this.connection = connection;
    }
    public Connection getCOnnection(){
        return connection;
    }
    public void setConnection(Connection connection){
        this.connection = connection;
    }
    
    public void addUser (estudiante estudiante){
        try{
            statement = connection.prepareStatement("INSERT INTO estudiante VALUES(?,?,?,?)");
            synchronized(statement){
                statement.setString(1,estudiante.getNombre());
                statement.setString(2,estudiante.getApellidoP());
                statement.setString(3,estudiante.getApellidoM());
                statement.setString(4,estudiante.getId());
                statement.executeUpdate();
            }
            statement.close();
        } catch(SQLException sqle){
            logger.log(Level.SEVERE, sqle.toString(),sqle);
            throw new RuntimeException(sqle);
        }
    }
}