/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorydb;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.Repository;

/**
 *
 * @author ACER
 */
public interface DBRepository<T> extends Repository<T> {
    
    default public void connect(){
        DBConnectionFactory.getInstance().getConnection();
    }
    
    default public void commit(){
        try {
            DBConnectionFactory.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    default public void disconnect(){
        try { 
            DBConnectionFactory.getInstance().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DBRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    default public void rollback(){
        try {
            DBConnectionFactory.getInstance().getConnection().rollback();
        } catch (SQLException ex) {
            Logger.getLogger(DBRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
}
