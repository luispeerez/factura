/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;


import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author luis
 */
public class NuevoPdf {

    //private static String FILE = "C:\\Users\\Acer\\Documents\\NetBeansProjects\\Factura.pdf";
    private static String FILE = "";

    private static Font smallBold = new Font(Font.FontFamily.HELVETICA, 8,
            Font.BOLD);
    private static Font small = new Font(Font.FontFamily.HELVETICA, 8);
    private static Font normalWhite = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.WHITE);
    private static Font normal = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);
    private static Font medium = new Font(Font.FontFamily.HELVETICA, 9, Font.NORMAL, BaseColor.BLACK);

    public NuevoPdf(String f) {
        this.FILE = f;
    }

    public static void main() {
        try {
            /*Espaciador*/
            Paragraph espaciador = new Paragraph();
            addEmptyLine(espaciador, 2);
            /**
             *
             */
            Document document = new Document();
            if (Variables.guardar == false) {
                PdfWriter.getInstance(document, new FileOutputStream(FILE));
            } else {

                JFileChooser dig = new JFileChooser();
                int opcion = dig.showSaveDialog(null);

                if (opcion == JFileChooser.APPROVE_OPTION) {
                    File f = dig.getSelectedFile();
                    String Direccion = f.toString();
                    FileOutputStream archivo = new FileOutputStream(Direccion + ".pdf");
                    PdfWriter.getInstance(document, archivo);
                    Variables.guardar=false;
                }
            }
        //Document document = new Document();
            // PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            addMetaData(document);
            addTitlePage(document);
            document.add(espaciador);
            addTableClienteYFactura(document);
            document.add(espaciador);
            addTableProducts(document);
            document.add(espaciador);
            addTableTotales(document);
            addFooter(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
      }
    }

    private static void addMetaData(Document document) {
      document.addTitle("Refaccionaria automotriz ancona");
    }

    private static void addTitlePage(Document document)
        throws DocumentException, IOException {
      Paragraph encabezado = new Paragraph();
      Paragraph empresa = new Paragraph("REFACCIONARIA AUTOMOTRIZ ANCONA S.A de C.V", smallBold);
      Paragraph direccion = new Paragraph("AV. PUERTO JUAREZ, LTE. 29 MZA. 1, REG. 92, CANCUN MPIO BENITO JUAREZ Q.ROO C.P 77516", small);
      Paragraph telefono = new Paragraph("TELS: (998) 888-60-69", small);
      Paragraph rfc = new Paragraph("RAA020304893" , small);
      Paragraph reg = new Paragraph("REGIMEN GENERAL DE LEY PERSONAS MORALES" , small);

      encabezado.setAlignment(Element.ALIGN_CENTER); 
      empresa.setAlignment(Element.ALIGN_CENTER);
      direccion.setAlignment(Element.ALIGN_CENTER);
      telefono.setAlignment(Element.ALIGN_CENTER);
      rfc.setAlignment(Element.ALIGN_CENTER);
      reg.setAlignment(Element.ALIGN_CENTER);

      Paragraph [] arregloParrafos = {empresa ,direccion ,telefono , rfc , reg};

      tableDatosEncabezado(arregloParrafos,document);

    }

    private static void addFooter(Document document)throws DocumentException {
        Paragraph preface = new Paragraph();
        preface.add(new Paragraph("© 2014 REFACCIONARIA AUTOMOTRIZ ANCONA S.A de C.V. Todos los derechos reservados. Aviso legal",
                small));
        document.add(preface);
    }


    private static void tableDatosEncabezado(Paragraph[] arregloParrafos, Document document) throws BadElementException, IOException{
          PdfPTable table = new PdfPTable(2);
          table.setWidthPercentage(99);

          PdfPCell c1 = new PdfPCell(new Phrase());
          c1.setHorizontalAlignment(Element.ALIGN_CENTER);
          c1.setBorder(0);
          addLogo(c1,"LOGO.png");
          table.addCell(c1);        

          PdfPCell c2 = new PdfPCell();
          for(int i = 0;i<arregloParrafos.length;i++){
              c2.addElement(arregloParrafos[i]);
          }
          c2.setHorizontalAlignment(Element.ALIGN_CENTER);
          c2.setBorder(0);
          table.addCell(c2);
          float[] columnWidths = new float[] {25f,75f};
          try {
              table.setWidths(columnWidths);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }

          Paragraph p = new Paragraph();
          p.add(table);
          try {
            document.add(p);
          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }
    }


    private static void addEmptyLine(Paragraph paragraph, int number) {
      for (int i = 0; i < number; i++) {
        paragraph.add(new Paragraph(" "));
      }
    }
    private static void addLogo(PdfPCell cell , String imgName) throws IOException{
        Image img;
        try {
            img = Image.getInstance(NuevoPdf.class.getResource("/Imagen/"+imgName));
            if (img.getScaledWidth() >200 || img.getScaledHeight() > 200) {
                img.scaleToFit(100, 100);
            }
            try {
                cell.addElement(img);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private static void addTableClienteYFactura(Document doc) throws DocumentException{
        PdfPTable encabezados = new PdfPTable(2);
        encabezados.setWidthPercentage(99);

        PdfPCell c1 = new PdfPCell(new Phrase("CLIENTE" , normalWhite));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setBackgroundColor(BaseColor.RED);        
        c1.setBorder(0);
        encabezados.addCell(c1);
        
        
        PdfPCell c2 = new PdfPCell(new Phrase("FOLIO FISCAL" , normalWhite));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setBackgroundColor(BaseColor.RED);
        c2.setBorder(0);
        encabezados.addCell(c2);

        
        PdfPTable datos = new PdfPTable(2);
        datos.setWidthPercentage(99);    
        
        Paragraph rfc = new Paragraph(""+Variables.idCliente,medium);
        Paragraph rfc2 = new Paragraph(Variables.RFC,medium);
        Paragraph nombre = new Paragraph(Variables.NombreCliente,medium);
        Paragraph direccion = new Paragraph(Variables.delegacion,medium);
        Paragraph ciudad = new Paragraph(Variables.municipio+" "+ Variables.Estado +" MEXICO",medium);
        Paragraph cp = new Paragraph("CP: "+Variables.codpostal,medium);
        
        Paragraph[] datosCliente = {rfc, rfc2 , nombre , direccion, ciudad, cp};
        
        PdfPCell c3 = new PdfPCell();
        for(int i = 0;i<datosCliente.length;i++){
            c3.addElement(datosCliente[i]);
        }
        datos.addCell(c3);

        float[] columnWidths = new float[] {60f,40f};
        try {
            encabezados.setWidths(columnWidths);
            datos.setWidths(columnWidths);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        

        Paragraph folioFactura = new Paragraph("CS434-BYOR3343-GVLR03-034",smallBold);
        Paragraph csd = new Paragraph("No de serie del certificado CSD",smallBold);
        Paragraph codigo = new Paragraph("03490941023923",smallBold);
        Paragraph fecha = new Paragraph("Fecha y hora de emisión",smallBold);
        Paragraph datosfecha = new Paragraph("2014-02-05 11:37:17",smallBold);
        folioFactura.setAlignment(Element.ALIGN_CENTER);
        csd.setAlignment(Element.ALIGN_CENTER);
        codigo.setAlignment(Element.ALIGN_CENTER);
        fecha.setAlignment(Element.ALIGN_CENTER);
        datosfecha.setAlignment(Element.ALIGN_CENTER);
        
        Paragraph[] datosFactura = {folioFactura, csd , codigo , fecha, datosfecha};    
        PdfPCell c4 = new PdfPCell();
        for(int i = 0;i<datosFactura.length;i++){
            c4.addElement(datosFactura[i]);
        }
        datos.addCell(c4);
        
        Paragraph p = new Paragraph();
        p.add(encabezados);
        p.add(datos);
        doc.add(p);
        
    }
      

    private static void addTableProducts(Document doc) throws DocumentException{
        PdfPTable table = new PdfPTable(6);
        table.setWidthPercentage(99);

        PdfPCell c1 = new PdfPCell(new Phrase("CLAVE" , normalWhite));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setBackgroundColor(BaseColor.RED);
        c1.setBorder(0);
        table.addCell(c1);
        
        PdfPCell c2 = new PdfPCell(new Phrase("CANTIDAD" , normalWhite));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setBackgroundColor(BaseColor.RED);
        c2.setBorder(0);
        table.addCell(c2);
        
        PdfPCell c3 = new PdfPCell(new Phrase("UM", normalWhite));
        c3.setHorizontalAlignment(Element.ALIGN_CENTER);
        c3.setBackgroundColor(BaseColor.RED);
        c3.setBorder(0);
        table.addCell(c3); 
        
        PdfPCell c4 = new PdfPCell(new Phrase("DESCRIPCION", normalWhite));
        c4.setHorizontalAlignment(Element.ALIGN_CENTER);
        c4.setBackgroundColor(BaseColor.RED);
        c4.setBorder(0);        
        table.addCell(c4); 
        
        PdfPCell c5 = new PdfPCell(new Phrase("PRECIO UNITARIO", normalWhite));
        c5.setHorizontalAlignment(Element.ALIGN_CENTER);
        c5.setBackgroundColor(BaseColor.RED);
        c5.setBorder(0);                
        table.addCell(c5); 
        
        PdfPCell c6 = new PdfPCell(new Phrase("IMPORTE" , normalWhite));
        c6.setHorizontalAlignment(Element.ALIGN_CENTER);
        c6.setBackgroundColor(BaseColor.RED);
        c6.setBorder(0);        
        table.addCell(c6); 
        
        float[] columnWidths = new float[] {15f,15f,10f,30f,15f,15f};
        try {
            table.setWidths(columnWidths);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        for(int i=0; i<Variables.claves.size();i++)
        {
            table.addCell(new Phrase(String.valueOf(Variables.claves.get(i)),normal));
            table.addCell(new Phrase(String.valueOf(Variables.cantidades.get(i)),normal));
            table.addCell(new Phrase(String.valueOf(Variables.ums.get(i)),normal));
            table.addCell(new Phrase(String.valueOf(Variables.descripciones.get(i)),normal));
            table.addCell(new Phrase(String.valueOf(Variables.preciosunitarios.get(i)),normal));
            table.addCell(new Phrase(String.valueOf(Variables.importes.get(i)),normal));

        }
        
        /*table.addCell(new Phrase("R0-510055-TIM",normal));
        table.addCell(new Phrase("2.0",normal));
        table.addCell(new Phrase("PIEZAS",normal));
        table.addCell(new Phrase("BALERO DOBLE",normal));
        table.addCell(new Phrase("$336.47",normal));
        table.addCell(new Phrase("$672.94",normal));*/
        
        Paragraph p = new Paragraph();
        p.add(table);
        doc.add(p);
        
    }
 
    private static void addTableTotales(Document doc) throws DocumentException, IOException{
        Paragraph totalEnLetras = new Paragraph("SON : SEISCIENTOS SETENTA Y TRES PESOS 52/100 M.N");
        PdfPTable table = new PdfPTable(3);
        table.setWidthPercentage(99);

        PdfPCell c1 = new PdfPCell();
        Paragraph comentariotitulo = new Paragraph("Comentario",smallBold);
        Paragraph comentario = new Paragraph(Variables.Comentario,small);
        Paragraph cv = new Paragraph("Condicion de venta: CONTADO",smallBold);
        Paragraph fp = new Paragraph("Forma de pago: UNA SOLA EXHIBICION",smallBold);
        Paragraph mp = new Paragraph("Metodo de pago: EFECTIVO",smallBold);
        Paragraph[] formasPago = {comentariotitulo,comentario,cv, fp , mp};    
        for(int i = 0;i<formasPago.length;i++){
            c1.addElement(formasPago[i]);
        }
        c1.setBorder(0);
        table.addCell(c1);

        PdfPCell c2 = new PdfPCell();
        Paragraph s = new Paragraph("Suma:",small);
        Paragraph d = new Paragraph("Descuento:",small);
        Paragraph st = new Paragraph("Subtotal:",small);
        Paragraph iv = new Paragraph("IVA: 16%:",small);
        Paragraph t = new Paragraph("Total:",smallBold);

        Paragraph[] tags = {s,d,st,iv,t};    
        for(int i = 0;i<tags.length;i++){
            c2.addElement(tags[i]);
        }
        c2.setBorder(0);
        table.addCell(c2); 
        
        PdfPCell c3 = new PdfPCell();
        Paragraph ns = new Paragraph("$"+String.valueOf(Variables.getSuma()),small);
        Paragraph nd = new Paragraph("$"+String.valueOf(Variables.getDescuento()),small);
        Paragraph nst = new Paragraph("$"+String.valueOf(Variables.getSubtotal()),small);
        Paragraph niv = new Paragraph("$"+String.valueOf(Variables.getIva()),small);
        Paragraph nt = new Paragraph("$"+String.valueOf(Variables.getTotal()),smallBold);

        Paragraph[] totales = {ns,nd,nst,niv,nt};    
        for(int i = 0;i<totales.length;i++){
            c3.addElement(totales[i]);
        }
        c3.setBorder(0);
        table.addCell(c3);         
        
        float[] columnWidths = new float[] {66f, 17f , 17f};
        try {
            table.setWidths(columnWidths);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        
        Paragraph p = new Paragraph();
        Paragraph espaciador = new Paragraph("");
        Paragraph sellodigital1 = new Paragraph("Sello digital del CFDI",smallBold);
        Paragraph sellodigital2 = new Paragraph("fk0fok0f94kf09fk049fk340fk42f034kf04fk340fi43kf034fk340fk34f034kf034fk340fk340fk34f0o34kf034ofk340fo3k4f03kg35ihjlofkajfñlakjfl4kfj3l2kfj2f03jgoerkgjsfvns,vmernv034fv349fi2jf034ijf20gfijdqdkqejfoej",small);

        Paragraph sellodigital3 = new Paragraph("Sello del SAT",smallBold);
        Paragraph sellodigital4 = new Paragraph("cmdvkdovewwdqwCWEFRWRVIW3903r930frvDGHERGWRBRVEGRWGWRddkfjdkfrjgkwvnsdlkcmasx,sqpsqlkcwproigkrofik24203940e2932d,swlsk qms12dikd39kdw0oc,wrjbnwepobvkjqevo24f0rwkvwri0bj35ob iwemvlw,amsc,meovkjw0bn0234or0fj",small);
        
        Paragraph sellodigital5 = new Paragraph("No de serie del complemento de  certificacion del SAT:",smallBold);
        Paragraph sellodigital6 = new Paragraph("00000100000002133560001",smallBold);
        
        Paragraph sellodigital7 = new Paragraph("Fecha y hora de certificacion:",smallBold);
        Paragraph sellodigital8 = new Paragraph("2014-02-05 11:37:17",small);

        Paragraph sellodigital9 = new Paragraph("Expedido en:",smallBold);
        Paragraph sellodigital10 = new Paragraph("CANCUN, QUINTANA ROO",small);
        Paragraph sellodigital11 = new Paragraph("ESTE DOCUMENTO ES UNA REPRESENTACION IMPRESA DE UN CFDI ",smallBold);
        
        Paragraph[] parrafosSellos = {
            sellodigital1, sellodigital2 , sellodigital3 ,sellodigital4
        };
        
                
        PdfPTable datosSAT = new PdfPTable(2);
        datosSAT.setWidthPercentage(99);

        PdfPCell cS1 = new PdfPCell(new Phrase());
        cS1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cS1.setBorder(0);
        addLogo(cS1,"qr.jpg");
        datosSAT.addCell(cS1);        

        PdfPCell cS2 = new PdfPCell();
        for(int i = 0;i<parrafosSellos.length;i++){
            cS2.addElement(parrafosSellos[i]);
        }
        cS2.setBorder(0);
        datosSAT.addCell(cS2);        
        float[] columnWidths2 = new float[] {20f,80f};
        try {
            datosSAT.setWidths(columnWidths2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        p.add(table);
        p.add(espaciador);
        p.add(espaciador);
        p.add(datosSAT);
        p.add(sellodigital5);
        p.add(sellodigital6);
        p.add(sellodigital7);
        p.add(sellodigital8);
        p.add(sellodigital9);
        p.add(sellodigital10);
        p.add(sellodigital11);

        doc.add(p);
        
    }    
    
}