/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import com.sun.org.apache.xpath.internal.operations.Variable;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author luis
 */


public class NuevoXML {

    /**
     * @param args the command line arguments
     */

    public static String ruta;
     public NuevoXML(String f) {
        ruta = f;
    }
    public static void main() {
        try {
            int folioFactura = 930909303;
            String fechaFactura = Variables.FechaSistema;
            String selloFactura = "RFEKFEKFE3i9049039093093FJRKRFKedkdkmfE94049=";
            String formaDePago = "PAGO EN UNA SOLA EXHIBICION";
            String noCertificado = "00002239930111";
            String certificado = "MED044904934QWOASCODdofkofrk3343401032EOROC=";
            Double subTotal = Variables.subtotal;
            String tipoCambio = "1.00";
            String moneda = "Peso Mexicano";
            Double subtotal =  Variables.subtotal;
            Double total = Variables.total;
            String tipoComprobante = "ingreso";
            String metodoPago = "NA";
            String totalEnLetra = "TRES MIL SETESCIENTOS VEINTI TRES M.N";
            String totalEnLetraIngles = "TRES MIL SETESCIENTOS VEINTI TRES M.N";
            
            //Direcciones empresa
            String direccion = "AV. PUERTO JUAREZ, LTE. 29 MZA. 1, REG. 92"; 
            String cp = "CP : 77500";
            String localidad = "Cancun";
            String municipio = "Benito Juarez";
            String estado = "Quintana Roo";
            String pais = "Mexico";
            String lugarExpedicion = direccion + " ," + cp + " , " + localidad + " , " + municipio +" , " + estado + " , " + pais ;
            String calle = "60 X 53 y 55";
            String noExterior = "474";
            String noInterior="ALTOS";
            String colonia = "CENTRO";
            String email = "ancona@gmail.com";
            String tel = "9999238011";
            
            ///
            
            //Datos empresa
            String rfcEmpresa = "RAA020304893";
            String nombreEmpresa = "REFACCIONARIA ANCONA S.A de C.V";
            
            
            //Datos cliente
            String rfcCliente = Variables.RFC;
            String nombreCliente = Variables.NombreCliente;
            String calleCliente = Variables.Direccion;
            String noInteriorCliente = "";
            String noExteriorCliente = "";
            String coloniaCliente = "";
            String localidadCliente = Variables.delegacion;
            String municipioCliente = Variables.municipio;
            String estadoCliente = Variables.Estado;
            String paisCliente = "MEXICO";
            String clienteCP = Variables.codpostal+"";
            
            
            //Ventas
            ArrayList<Integer> claves = new ArrayList<Integer>();
            ArrayList<Integer> cantidades = new ArrayList<Integer>();
            ArrayList<String> ums = new ArrayList<String>();
            ArrayList<String> descripciones = new ArrayList<String>();
            ArrayList<Double> preciosunitarios = new ArrayList<Double>();
            ArrayList<Double> importes = new ArrayList<Double>();
            
            String[] nombresGenericos = {"balatas","retrovisores","rines"};
            for(int i= 0; i< 3;i++){
                claves.add(i);
                cantidades.add(2);
                ums.add("piezas");
                descripciones.add(nombresGenericos[i]);
                preciosunitarios.add(120.00);
                importes.add(240.00);
                
            }
            
            double ivadelTotal = Variables.iva;
            String impuesto="IVA";
            double tasaIVA = 16.00;
            String fechaTimbrado = Variables.FechaFactura;
            
            BufferedWriter out = new BufferedWriter(new FileWriter(ruta));
            out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            out.write("\n");
            
            
            out.write("<cfdi:Comprobante xmlns:compac=\"http://www.cfdi.com.mx/ContpaqiSchemas/addendas/1\" xmlns:cfdi=\"http://www.sat.gob.mx/cfd/3\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.cfdi.com.mx/ContpaqiSchemas/addendas/1 http://www.cfdi.com.mx/ContpaqiSchemas/addendas/1/Compac.xsd http://www.sat.gob.mx/cfd/3 http://www.sat.gob.mx/sitio_internet/cfd/3/cfdv32.xsd\" version=\"3.2\" serie=\"A\" ");
            //Folio factura y fecha
            out.write("folio=\""+folioFactura+"\" fecha=\""+fechaFactura+"\" ");
            //Sello y forma de pago
            out.write("sello=\""+selloFactura+"\" formaDePago=\""+formaDePago+"\" ");
            //No de certificado y certificado
            out.write("noCertificado=\""+noCertificado+"\" certificado=\""+certificado+"\" ");
            //Subtotal, tipo cambio
            out.write("subTotal=\""+subTotal+"\" TipoCambio=\""+tipoCambio+"\" ");
            //Moneda , total
            out.write("Moneda =\""+subTotal+"\" total=\""+total+"\" ");
            //tipodecomprobante , metododepago
            out.write("tipoDeComprobante=\""+tipoComprobante+"\" metodoDePago=\""+metodoPago+"\" ");            
            //lugar de expedicion , metododepago
            out.write("LugarExpedicion=\""+lugarExpedicion+"\" >");            

            //Datos empresa emisora
            out.write("\n");
            out.write("\t<cfdi:Emisor rfc=\""+rfcEmpresa+"\" nombre=\""+nombreEmpresa+"\">");
            out.write("\t<cfdi:DomicilioFiscal calle=\""+calle+"\" noExterior=\""+noExterior+"\" noInterior=\""+noInterior+"\" colonia=\""+colonia+"\" localidad=\""+localidad+"\" municipio=\""+municipio+"\" estado=\""+estado+"\" pais=\""+pais+"\" codigoPostal=\""+cp+"\"/>");
            out.write("\t<cfdi:RegimenFiscal Regimen=\"REGIMEN GENERAL PERSONAS MORALES\"/>");
            out.write("\n</cfdi:Emisor>");
            
            //Datos cliente
            out.write("\n\t<cfdi:Receptor rfc=\"OPE0401271D8\" nombre=\"OPERATEC, S.A. DE C.V.\">");
            out.write("\n");
            out.write("\t\t<cfdi:Domicilio calle=\""+calleCliente+"\" noExterior=\""+noExteriorCliente+"\" noInterior=\""+noInteriorCliente+"\" colonia=\""+coloniaCliente+"\" localidad=\""+localidadCliente+"\" municipio=\""+municipioCliente+"\" estado=\""+estadoCliente+"\" pais=\""+paisCliente+"\" codigoPostal=\""+clienteCP+"\"/>");
            out.write("\n");
            out.write("\t</cfdi:Receptor>");
            out.write("\n");

            //Conceptos
            out.write("<cfdi:Conceptos>");
            out.write("\n");
            for(int i = 0;i<claves.size();i++){
                out.write("\t<cfdi:Concepto cantidad=\"1.00\" unidad=\""+ums.get(i)+"\" noIdentificacion=\""+claves.get(i)+"\" descripcion=\""+descripciones.get(i)+"\" valorUnitario=\""+preciosunitarios.get(i)+"\" importe=\""+importes.get(i)+"\"/>");
                out.write("\n");
            }
            out.write("</cfdi:Conceptos>");
            out.write("\n");
            
            //Impuestos
            out.write("<cfdi:Impuestos totalImpuestosTrasladados=\""+ivadelTotal+"\">");
            out.write("\t<cfdi:Traslados>");
            out.write("\t\t<cfdi:Traslado impuesto=\""+impuesto+"\" tasa=\""+tasaIVA+"\" importe=\""+ivadelTotal+"\"/>");
            out.write("\t</cfdi:Traslados>");
            out.write("</cfdi:Impuestos>");
            out.write("\n");
            
            //Timbre
            out.write("<cfdi:Complemento>");
            out.write("\n");
            out.write("\t<tfd:TimbreFiscalDigital xmlns:tfd=\"http://www.sat.gob.mx/TimbreFiscalDigital\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.sat.gob.mx/TimbreFiscalDigital http://www.sat.gob.mx/TimbreFiscalDigital/TimbreFiscalDigital.xsd\" selloCFD=\"D2HCVlO/AKnulFYBDkXKN5ourEwfLvW4Wads4hYUPR6H+RniiT7W1fcP1bAfoYi0ZBkOwSkEh8tj6gpkk+12c+vT6eT6r84XPiy3z2CbUMSZqAQTVJuJHAUuQ7MMIVzqBBndnBsZxRqROA+h2QGuO6HnbnQks15qVX82X0z2VPk=\" FechaTimbrado=\""+fechaFactura+"\" UUID=\"34BB60AE-DB5A-46EC-98CB-9F165586302F\" noCertificadoSAT=\"00001000000202864883\" version=\"1.0\" selloSAT=\"k3o4bc67o+6iX5I/bWf9FPW5e2DJCY5jE1sb7PiDm46sVatwQHL9EAL+J2cjx95DYC0oKeWikd4yQKdxdb2P31NpMZHSqs1bXXTIR7onugV31DuUY9/s+Hvk7L2xHZklo5vBbQL0MmNwk0JVlMV9J15QJ9sdVZrXg4Okhw8hgTQ=\"/>");
            out.write("</cfdi:Complemento>");
            
            out.write("\n");
            out.write("<cfdi:Addenda><compac:Compac>");
            out.write("\n<compac:Encabezado>");
            out.write("\n\t<compac:MGW10008 cSerieDo01=\"A\" cFolio=\""+folioFactura+"\" cReferen01=\"\" cFechaVencimiento=\"Septiembre 2 2014\" cObserva01=\"\" cTextoEx01=\"\" cTextoEx02=\"\" cTextoEx03=\"\" cFechaEx01=\"Diciembre 30 1899\" cImporte01=\"0.00\" cImporte02=\"0.00\" cImporte03=\"0.00\" cImporte04=\"0.00\" cTotalUn01=\"1.00\" cTipoCam01=\"1.0000\" cPendiente=\""+total+"\" cDescuen01=\"0.00\" cDescuen04=\"0.00\" cFechaEn01=\"30/12/1899\" cDestina01=\"\" cNumerog01=\"\" cMensaje01=\"\" cNumeroc01=\"0.00\" cCuentam01=\"\" cPeso=\"0.00\" cImpuesto1=\""+ivadelTotal+"\" cImpuesto2=\"0.00\" cImpuesto3=\"0.00\" cRetenci01=\"0.00\" cRetenci02=\"0.00\" cMetodoPag=\"NA\" cCondiPago=\"\" cNumCtaPag=\"\" cLugarExpe=\""+lugarExpedicion+"\">");
            out.write("\n\t\t<compac:MGW10045 cEsTrad=\"3\"></compac:MGW10045>");
            out.write("\n\t\t<compac:MGW10007 cDescrip01=\"Factura\"></compac:MGW10007>");
            out.write("\n\t\t<compac:MGW10034 cNombreM01=\"Peso Mexicano\"></compac:MGW10034>");
            out.write("\n\t\t<compac:MGW10002 cCodigoC01=\"140017002\" cDiasCre01=\"0\" cCurp=\"\" cTextoExtra1=\"\" cTextoExtra2=\"\" cTextoExtra3=\"\" cTextoExtra4=\"\" cTextoExtra5=\"\" cFechaExtra=\"Diciembre 30 1899\" cImporteExtra1=\"0.00\" cImporteExtra2=\"0.00\" cImporteExtra3=\"0.00\" cImporteExtra4=\"0.00\" cImporteExtra5=\"0.00\" cLimiteC01=\"0.00\" cInteres01=\"0.00\" CDenCome01=\"\"></compac:MGW10002>");
            out.write("\n\t\t<compac:MGW10001 cCodigoA01=\"(Ninguno)\" cNombreA01=\"(Ninguno)\" cTextoEx01=\"\" cTextoEx02=\"\" cTextoEx03=\"\" cFechaEx01=\"30/12/1899\" cImporte01=\"0.00\" cImporte02=\"0.00\" cImporte03=\"0.00\" cImporte04=\"0.00\"></compac:MGW10001>");
            out.write("\n\t\t<compac:MGW10000 cCurpEmp01=\"\" cReprese01=\""+nombreCliente+"\" cNumDonat=\"\" cFecDonat=\"30 de Diciembre de 2000\">");
            out.write("\n\t\t<compac:DirCteEnv cNombreC01=\"\" cNumeroE01=\"\" cNumeroI01=\"\" cColonia=\"\" cCodigoP01=\"\" cTelefono1=\"\" cTelefono2=\"\" cTelefono3=\"\" cTelefono4=\"\" cEmail=\"\" cDireccI01=\"\" cPais=\"\" cEstado=\"\" cCiudad=\"\" cTextoEx01=\"\" cMunicipio=\"\"</compac:DirCteEnv>");
            out.write("\n\t\t<compac:DirCteFis cNombreC01=\""+calleCliente+"\" cNumeroE01=\"S/N\" cNumeroI01=\"A\" cTelefono1=\"\" cTelefono2=\"\" cTelefono3=\"\" cTelefono4=\"\" cEmail=\"\" cDireccI01=\"\" cTextoEx01=\"\"></compac:DirCteFis>");
            out.write("\n\t\t<compac:DirEmp cNombreC01=\""+calle+"\" cNumeroE01=\"474\" cNumeroI01=\"ALTOS\" cTelefono1=\""+tel+"\" cTelefono2=\"ext105\" cTelefono3=\"\" cTelefono4=\"\" cEmail=\""+email+"\" cDireccI01=\"\" cTextoEx01=\"\"></compac:DirEmp>");
            out.write("\n\t\t<compac:Funciones f_NomSucEmpresa=\"CANCUN\" f_CalleSucEmp=\""+calle+"\" f_NoExtSucEmp=\"37\" f_DoctoOrigen=\" \" f_NETOCONDESC=\""+total+"\" f_TOTALLETRA=\""+totalEnLetra+"\" f_TOTALIMPMILLARLETRA1=\""+totalEnLetra+"\" f_TOTALIMPMILLARLETRA2=\""+totalEnLetra+"\" f_TOTALIMPMILLARLETRA3=\""+totalEnLetra+"\" f_TOTALIMPMILLARLETRA4=\""+totalEnLetra+"\" f_TOTALIMPMILLARLETRA5=\""+totalEnLetra+"\" f_TOTALLETRAING=\""+totalEnLetraIngles+"\" f_TOTALDESC1MOVTOS=\"0.00\" f_TOTALDESC2MOVTOS=\"0.00\" f_TOTALDESC3MOVTOS=\"0.00\" f_TOTALDESC4MOVTOS=\"0.00\" f_REGIMENFISCAL=\"REGIMEN GENERAL PERSONAS MORALES\" f_EFECTOPAGO=\"0.00\" f_TOTALEFECTOPAGO=\""+total+"\" f_TOTALEFECTOPAGOLETRA=\""+totalEnLetra+"\" f_NETOSEIMPUESTOSDOC=\""+total+"\" f_NETOCONDESCPOS=\""+total+"\" f_NETODESCIVADOC0=\"0.00\" f_NETODESCIVADOCEX=\"0.00\" f_NETODESCIVADOC11=\"0.00\" f_NETODESCIVADOC16=\""+total+"\" f_NOMBRECONCEPTO=\"FACTURAS CANCUN\" f_CLASIFCLIENTE1=\" \" f_CLASIFCLIENTE2=\" \" f_CLASIFCLIENTE3=\" \" f_CLASIFCLIENTE4=\" \" f_CLASIFCLIENTE5=\" \" f_CLASIFCLIENTE6=\" \" f_SUBTOTALIEPS=\""+subtotal+"\" f_SUBTOTALSINRETCONDESC=\""+subtotal+"\" f_SUBTOTALSINRETSINDESC=\""+subtotal+"\" f_NETODOCTOIEPSSINDESC=\""+subtotal+"\" f_DESCTODOCTOPUNITARIOIEPS=\"0.00\"></compac:Funciones>");
            
            //Imagen empresa
            out.write("\n\t\t<compac:Imagenes e_ADMINPAQ=\".jpg\" i_ADMINPAQ=\"IMG_ADMINPAQ\" e_LOGOEMPRESA=\".jpg\" i_LOGOEMPRESA=\"IMG_LOGOEMPRESA\" e_CEDULAEMPRESA=\".jpg\" i_CEDULAEMPRESA=\"IMG_CEDULAEMPRESA\" e_CBB=\".bmp\" i_CBB=\"IMG_CBB\"></compac:Imagenes>");
            
            
            out.write("\n\t</compac:MGW10008>");
            out.write("\n</compac:Encabezado>");
            
            //Detalle
            out.write("\n<compac:Detalle>");
            out.write("\n\t<compac:MGW10010 cNumeroM01=\"1\" cSCMovto=\"\" cImpuesto1=\""+ivadelTotal+"\" cPorcent01=\""+tasaIVA+"\" cImpuesto2=\"0.00\" cPorcent02=\"0.00\" cImpuesto3=\"0.00\" cPorcent03=\"0.00\" cRetenci01=\"0.00\" cPorcent04=\"0.00\" cRetenci02=\"0.00\" cPorcent05=\"0.00\" cNeto=\""+subtotal+"\" cTotal=\""+total+"\" cImporte01=\"0.00\" cImporte02=\"0.00\" cImporte03=\"0.00\" cImporte04=\"0.00\" cFechaEx01=\"30/12/1899\" cUnidade02=\"1.00\" cDescuen01=\"0.00\" cPorcent06=\"0.00\" cDescuen02=\"0.00\" cPorcent07=\"0.00\" cDescuen03=\"0.00\" cPorcent08=\"0.00\" cDescuen04=\"0.00\" cPorcent09=\"0.00\" cDescuen05=\"0.00\" cPorcent10=\"0.00\" cReferen01=\"\" cObserva01=\"3/3 CONTRIBUCIONES 2014\" cTextoEx01=\"\" cTextoEx02=\"\" cTextoEx03=\"\">");
            out.write("\n\t\t<compac:MGW10005 cCodigoP01=\"001\" cDescrip01=\"\" cCodAltern=\"\" cCtaPred=\"\" cNomAltern=\"\" cDescCorta=\"\" cTextoEx01=\"\" cTextoEx02=\"\" cTextoEx03=\"\" cImporte01=\"0.00\" cImporte02=\"0.00\" cImporte03=\"0.00\" cImporte04=\"0.00\" cFechaEx01=\"30/12/1899\"></compac:MGW10005>");
            out.write("\n\t\t<compac:MGW10003 cCodigoA01=\"(Ninguno)\" cNombreA01=\"(Ninguno)\"></compac:MGW10003>");
            out.write("\n\t\t<compac:Funciones f_CLASIFPRODUCTOMOVTO1=\" \" f_CLASIFPRODUCTOMOVTO2=\" \" f_CLASIFPRODUCTOMOVTO3=\" \" f_CLASIFPRODUCTOMOVTO4=\" \" f_CLASIFPRODUCTOMOVTO5=\" \" f_CLASIFPRODUCTOMOVTO6=\" \" f_NETOCONDESC=\""+subtotal+"\" f_NETOMOVTO=\""+subtotal+"\" f_NETOMOVTOIEPS=\""+subtotal+"\" f_IVANETOMOVTO=\""+ivadelTotal+"\" f_PRECIOIVAMOVTO=\""+subtotal+"\" f_ABREVIATURAUNIDADNC=\" \" f_CANTIDADUNIDADNC=\" \" f_NETODESCIVA16=\""+subtotal+"\" f_NUMPARTIDA=\"1\" f_NETOCONDESCPOS=\"0.00\" f_PRECIOUNITCONDESC=\""+subtotal+"\" f_PRECIOUNITCONIMPUESTOS=\""+total+"\" f_TOTALPRECIOUNIT=\""+subtotal+"\" f_TOTALENTREUNIDSMOVTO=\""+total+"\" f_PRECIOUNITARIOCONIEPS=\""+subtotal+"\" f_PRECIOUNITCONDESCIEPS=\""+subtotal+"\" f_DESCTOPUNITARIOIEPS=\"0.00\" f_IVAMOVTODESCTOIEPS=\""+ivadelTotal+"\" f_NETOMOVTOIEPSSINDESC=\""+subtotal+"\" f_PRECIOUNITARIOCONIEPSSINDESC=\""+subtotal+"\"></compac:Funciones>");
            out.write("\n\t\t<compac:MGW10000 cPrecios01=\"0\"></compac:MGW10000>");
            out.write("\n\t</compac:MGW10010>");
            out.write("\n</compac:Detalle>");
            
            
            out.write("\n</compac:Compac>\n</cfdi:Addenda>");
            
            //Fin :D
            out.write("\n</cfdi:Comprobante>");
            
            out.close();
            
        } catch (IOException e) {}
    }
    
}
