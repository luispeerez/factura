package Clases;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Variables {

    //**********  Login  ****************************
    public static int idUsuario;
    public static String NombreUsuario;
    public static String ContraseñaUsuario;
    public static String CorreoUsuario;
    public static String ContraseñaCorreo;
    public static String FechaSistema;
    public static int Cancelar;
    public static int idFactura;

    /**
     * @return the idUsuario
     */
    public static int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param aIdUsuario the idUsuario to set
     */
    public static void setIdUsuario(int aIdUsuario) {
        idUsuario = aIdUsuario;
    }

//**************** Cliente  ********************************
    
    public static int idCliente;
    public static String RFC;
    public static String NombreCliente;
    public static String Direccion;
    public static String delegacion;
    public static String municipio;
    public static String Estado;
    public static String Correo;
    public static String  codpostal;
    
//*************  Nota ****************************
    public static Double suma;
    public static Double descuento;
    public static Double subtotal;
    public static Double iva;
    public static Double total;

//*******  Venta *************
    public static  ArrayList<Integer> claves = new ArrayList<Integer>();
    public static  ArrayList<Integer> cantidades = new ArrayList<Integer>();
    public static  ArrayList<String> ums = new ArrayList<String>();
    public static  ArrayList<String> descripciones = new ArrayList<String>();
    public static  ArrayList<Double> preciosunitarios = new ArrayList<Double>();
    public static  ArrayList<Double> importes = new ArrayList<Double>();
///******** guardar ******************+
    public static boolean guardar=false;
    public static String FechaFactura;
    public static String Comentario;
    public static String Tipo;
    public static boolean ver=false;
    
    /**
     * @return the idCliente
     */
    public static int getIdCliente() {
        return idCliente;
    }

    /**
     * @param aIdCliente the idCliente to set
     */
    public static void setIdCliente(int aIdCliente) {
        idCliente = aIdCliente;
    }

    /**
     * @return the RFC
     */
    public static String getRFC() {
        return RFC;
    }

    /**
     * @param aRFC the RFC to set
     */
    public static void setRFC(String aRFC) {
        RFC = aRFC;
    }

    /**
     * @return the NombreCliente
     */
    public static String getNombreCliente() {
        return NombreCliente;
    }

    /**
     * @param aNombreCliente the NombreCliente to set
     */
    public static void setNombreCliente(String aNombreCliente) {
        NombreCliente = aNombreCliente;
    }

    /**
     * @return the Direccion
     */
    public static String getDireccion() {
        return Direccion;
    }

    /**
     * @param aDireccion the Direccion to set
     */
    public static void setDireccion(String aDireccion) {
        Direccion = aDireccion;
    }

    /**
     * @return the delegacion
     */
    public static String getDelegacion() {
        return delegacion;
    }

    /**
     * @param aDelegacion the delegacion to set
     */
    public static void setDelegacion(String aDelegacion) {
        delegacion = aDelegacion;
    }

    /**
     * @return the municipio
     */
    public static String getMunicipio() {
        return municipio;
    }

    /**
     * @param aMunicipio the municipio to set
     */
    public static void setMunicipio(String aMunicipio) {
        municipio = aMunicipio;
    }

    /**
     * @return the Estado
     */
    public static String getEstado() {
        return Estado;
    }

    /**
     * @param aEstado the Estado to set
     */
    public static void setEstado(String aEstado) {
        Estado = aEstado;
    }

    /**
     * @return the codpostal
     */
    public static String getCodpostal() {
        return codpostal;
    }

    /**
     * @param aCodpostal the codpostal to set
     */
    public static void setCodpostal(String aCodpostal) {
        codpostal = aCodpostal;
    }

    /**
     * @return the suma
     */
    public static Double getSuma() {
        return suma;
    }

    /**
     * @param aSuma the suma to set
     */
    public static void setSuma(Double aSuma) {
        suma = aSuma;
    }

    /**
     * @return the descuento
     */
    public static Double getDescuento() {
        return descuento;
    }

    /**
     * @param aDescuento the descuento to set
     */
    public static void setDescuento(Double aDescuento) {
        descuento = aDescuento;
    }

    /**
     * @return the subtotal
     */
    public static Double getSubtotal() {
        return subtotal;
    }

    /**
     * @param aSubtotal the subtotal to set
     */
    public static void setSubtotal(Double aSubtotal) {
        subtotal = aSubtotal;
    }

    /**
     * @return the iva
     */
    public static Double getIva() {
        return iva;
    }

    /**
     * @param aIva the iva to set
     */
    public static void setIva(Double aIva) {
        iva = aIva;
    }

    /**
     * @return the total
     */
    public static Double getTotal() {
        return total;
    }

    /**
     * @param aTotal the total to set
     */
    public static void setTotal(Double aTotal) {
        total = aTotal;
    }

    /**
     * @return the claves
     */
    public static ArrayList<Integer> getClaves() {
        return claves;
    }

    /**
     * @param aClaves the claves to set
     */
    public static void setClaves(ArrayList<Integer> aClaves) {
        claves = aClaves;
    }

    /**
     * @return the cantidades
     */
    public static ArrayList<Integer> getCantidades() {
        return cantidades;
    }

    /**
     * @param aCantidades the cantidades to set
     */
    public static void setCantidades(ArrayList<Integer> aCantidades) {
        cantidades = aCantidades;
    }

    /**
     * @return the ums
     */
    public static ArrayList<String> getUms() {
        return ums;
    }

    /**
     * @param aUms the ums to set
     */
    public static void setUms(ArrayList<String> aUms) {
        ums = aUms;
    }

    /**
     * @return the descripciones
     */
    public static ArrayList<String> getDescripciones() {
        return descripciones;
    }

    /**
     * @param aDescripciones the descripciones to set
     */
    public static void setDescripciones(ArrayList<String> aDescripciones) {
        descripciones = aDescripciones;
    }

    /**
     * @return the preciosunitarios
     */
    public static ArrayList<Double> getPreciosunitarios() {
        return preciosunitarios;
    }

    /**
     * @param aPreciosunitarios the preciosunitarios to set
     */
    public static void setPreciosunitarios(ArrayList<Double> aPreciosunitarios) {
        preciosunitarios = aPreciosunitarios;
    }

    /**
     * @return the importes
     */
    public static ArrayList<Double> getImportes() {
        return importes;
    }

    /**
     * @param aImportes the importes to set
     */
    public static void setImportes(ArrayList<Double> aImportes) {
        importes = aImportes;
    }

    /**
     * @return the Correo
     */
    public static String getCorreo() {
        return Correo;
    }

    /**
     * @param aCorreo the Correo to set
     */
    public static void setCorreo(String aCorreo) {
        Correo = aCorreo;
    }

    /**
     * @return the guardar
     */
    public static boolean isGuardar() {
        return guardar;
    }

    /**
     * @param aGuardar the guardar to set
     */
    public static void setGuardar(boolean aGuardar) {
        guardar = aGuardar;
    }

    /**
     * @return the FechaFactura
     */
    public static String getFechaFactura() {
        return FechaFactura;
    }

    /**
     * @param aFechaFactura the FechaFactura to set
     */
    public static void setFechaFactura(String aFechaFactura) {
        FechaFactura = aFechaFactura;
    }

    /**
     * @return the Comentario
     */
    public static String getComentario() {
        return Comentario;
    }

    /**
     * @param aComentario the Comentario to set
     */
    public static void setComentario(String aComentario) {
        Comentario = aComentario;
    }

    /**
     * @return the ver
     */
    public static boolean isVer() {
        return ver;
    }

    /**
     * @param aVer the ver to set
     */
    public static void setVer(boolean aVer) {
        ver = aVer;
    }

    /**
     * @return the NombreUsuario
     */
    public static String getNombreUsuario() {
        return NombreUsuario;
    }

    /**
     * @param aNombreUsuario the NombreUsuario to set
     */
    public static void setNombreUsuario(String aNombreUsuario) {
        NombreUsuario = aNombreUsuario;
    }

    /**
     * @return the ContraseñaUsuario
     */
    public static String getContraseñaUsuario() {
        return ContraseñaUsuario;
    }

    /**
     * @param aContraseñaUsuario the ContraseñaUsuario to set
     */
    public static void setContraseñaUsuario(String aContraseñaUsuario) {
        ContraseñaUsuario = aContraseñaUsuario;
    }

    /**
     * @return the CorreoUsuario
     */
    public static String getCorreoUsuario() {
        return CorreoUsuario;
    }

    /**
     * @param aCorreoUsuario the CorreoUsuario to set
     */
    public static void setCorreoUsuario(String aCorreoUsuario) {
        CorreoUsuario = aCorreoUsuario;
    }

    /**
     * @return the ContraseñaCorreo
     */
    public static String getContraseñaCorreo() {
        return ContraseñaCorreo;
    }

    /**
     * @param aContraseñaCorreo the ContraseñaCorreo to set
     */
    public static void setContraseñaCorreo(String aContraseñaCorreo) {
        ContraseñaCorreo = aContraseñaCorreo;
    }

    /**
     * @return the Cancelar
     */
    public static int getCancelar() {
        return Cancelar;
    }

    /**
     * @param aCancelar the Cancelar to set
     */
    public static void setCancelar(int aCancelar) {
        Cancelar = aCancelar;
    }


}
