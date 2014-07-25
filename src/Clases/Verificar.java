package Clases;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MySQL.Funcion;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class Verificar {

    static Statement st;

    public static boolean validarUsuario(String elUsr, String elPw) {
        try {
            Funcion.CrearConexion();
            st = Funcion.conexion();
            ResultSet resultadosConsulta = Funcion.Select(st, "SELECT *FROM usuarios WHERE nombre='" + elUsr + "' AND contrasena='" + elPw + "'");

            if (resultadosConsulta.first()) {        // si es valido el primer reg. hay una fila, entonces el usuario y su pw existen
                Variables.setIdUsuario(resultadosConsulta.getInt("id"));
                return true;        //usuario validado correctamente

            } else {
                return false;        //usuario validado incorrectamente
            }
        } catch (Exception e) {
            return false;
        }

    }
}
