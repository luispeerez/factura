/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class FuncionTienda {
   
   private static Connection conexion = null; 
    private static String bd = "tienda"; // Nombre de BD. 
    private static String user = "root"; // Usuario de BD. 
    //private static String password = "12345"; // Password de BD. 
    private static String password = "12345"; // Password de BD. 
    // Driver para MySQL en este caso. 
    private static String driver = "com.mysql.jdbc.Driver"; 
    // Ruta del servidor. 
    private static String server = "jdbc:mysql://localhost:3306/" + bd; 
    
    
    /** 
     * Método neecesario para conectarse al Driver y poder usar MySQL. 
     */
    public static void CrearConexion() { 
        try { 
            Class.forName(driver); 
            conexion = DriverManager.getConnection(server, user, password); 
        } catch (Exception e) { 
        	JOptionPane.showMessageDialog(null,"Error: Imposible realizar la conexion a la Base de Datos."); 
            e.printStackTrace(); 
        } 
    } 
    
    
    /** 
     * Método para establecer la conexión con la base de datos. 
     * 
     * @return 
     */
    public static Statement conexion() { 
        Statement st = null; 
        try { 
            st = conexion.createStatement(); 
        } catch (SQLException e) { 
        	JOptionPane.showMessageDialog(null,"Error: Conexión incorrecta."); 
            e.printStackTrace(); 
        } 
        return st; 
    }
    
    /** 
    * Método para realizar consultas del tipo: SELECT * FROM tabla WHERE..." 
    * @param st 
    * @param cadena La consulta en concreto 
    * @return 
    */
    public static ResultSet Select(Statement st, String comando) { 
       ResultSet rs = null; 
       try { 
           rs = st.executeQuery(comando); 
       } catch (SQLException e) { 
    	   JOptionPane.showMessageDialog(null,"Error con el: " + comando); 
    	   JOptionPane.showMessageDialog(null,"SQLException: " + e.getMessage()); 
           e.printStackTrace(); 
       } 
       return rs; 
   } 
 
   
   /** 
    * Método para realizar consultas de actualización, creación o eliminación. 
    * @param st 
    * @param cadena La consulta en concreto 
    * @return 
    */
     public static int Update(Statement st, String comando) { 
       int rs = -1; 
       try { 
           rs = st.executeUpdate(comando); 
       } catch (SQLException e) { 
    	   JOptionPane.showMessageDialog(null,"Error con: " + comando); 
    	   JOptionPane.showMessageDialog(null,"SQLException: " + e.getMessage()); 
           e.printStackTrace(); 
       } 
       return rs; 
   } 
   
     
     /*** Método para cerrar la consulta 
     */
     public static void CerrarConsulta(ResultSet rs) { 
         if (rs != null) { 
             try { 
                 rs.close(); 
             } catch (Exception e) { 
            	   JOptionPane.showMessageDialog(null,"Error: No es posible cerrar la consulta."); 
             } 
         } 
     } 
     /*** Método para cerrar la conexión. 
      */
     public static void CerrarConexion(java.sql.Statement st) { 
         if (st != null) { 
             try { 
                 st.close(); 
             } catch (Exception e) { 
            	   JOptionPane.showMessageDialog(null,"Error: No es posible cerrar la conexión."); 
             } 
         } 
     } 
 }
    
    
