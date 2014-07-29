/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;


import java.util.*;
import Clases.Variables;
import Clases.NuevoPdf;
import Clases.NuevoXML;
import MySQL.Funcion;
import MySQL.FuncionTienda;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.icepdf.ri.common.*;
import org.icepdf.ri.util.PropertiesManager;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author Acer
 */
public class Principal extends javax.swing.JFrame {
// Variables

    static Statement st, stienda;
    static int idclientes = 0, idnota = 0, id=0,idFacClien=0;
    static ResultSet Comandos, Comando, Comandoventas;
    JPanel Panelpdf= new JPanel();
    JScrollPane scrollcuadro = new JScrollPane();
    boolean nueva=true, editarcliente2=false, presionado = false;
    int idUsuarioPerfil, presionadoactual;
    static String CorreoUs;
    /**
     * Creates new form Principal
     */
    public Principal() {
        File Imagenes = new File("Imagenes/Fotos Perfil");
        File xml = new File("xml");
        if(!Imagenes.exists()){
            Imagenes.mkdir();
        }
        if(!xml.exists()){
            xml.mkdir();
        }
        initComponents();
        setLocationRelativeTo(null);
        FuncionTienda.CrearConexion();
        stienda = FuncionTienda.conexion();
        Funcion.CrearConexion();
        st=Funcion.conexion();
        //****Nueva Factura
        presionadoactual = 5;
        Color azul = new Color(0, 182, 230);
        jButton5.setBackground(azul);
        jPanel7.setVisible(false);
        jButton2.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton3.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        EnviarSAT.setVisible(false);
        jButtonSave.setVisible(false);
        //////////////////////////
        //**** Clientes
        jButton22.setVisible(false);
        jButton20.setVisible(false);
        jButton19.setVisible(false);
        jButton18.setVisible(false);
        jButton15.setVisible(false);
        jButton4.setVisible(false);
        EnviarSAT1.setVisible(false);
        jPanel13.setVisible(false);
        //////////////////////////
        //**** Usuarios      
        jTextField23.setEditable(false);
        jTextField22.setEditable(false);
        jTextField24.setEditable(false);
        jPasswordField1.setEditable(false);
        jTextField26.setEditable(false);
        CorreoUs=Variables.CorreoUsuario+"@gmail.com";
        
        
        if(Variables.Tipo.equalsIgnoreCase("Administrador")){
            jPanel17.setVisible(true);
            jButton4.setVisible(true);
            jButton30.setLocation(470, 550);
            jButton31.setLocation(270, 550);
        }else{
            jButton4.setVisible(false);
            jButton23.setLocation(0, 540);
            jPanel17.setVisible(false); 
            jButton30.setLocation(470, 480);
            jButton31.setLocation(270, 480);
        }
        
        TextAutoCompleter Autocompletar = new TextAutoCompleter(jTextField2);
        Comandos = Funcion.Select(st, "SELECT * FROM cliente;");
        try {
            while(Comandos.next()){
                Autocompletar.addItem(Comandos.getString("RFC"));
            }
        } catch (SQLException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        NueFactura = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        EnviarSAT = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        ConFacturas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        ConClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        AdmUsuarios = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel12 = new javax.swing.JPanel();
        EditarClientes = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        EnviarSAT1 = new javax.swing.JButton();
        Perfil = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jButton4.setBackground(new java.awt.Color(44, 44, 44));
        jButton4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Administrar Usuarios");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setOpaque(true);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(0, 540, 200, 70);

        jButton5.setBackground(new java.awt.Color(44, 44, 44));
        jButton5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Nueva Factura");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setOpaque(true);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(0, 260, 200, 70);

        jButton6.setBackground(new java.awt.Color(44, 44, 44));
        jButton6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Consultar Facturas");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setOpaque(true);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(0, 330, 200, 70);

        jButton7.setBackground(new java.awt.Color(44, 44, 44));
        jButton7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Clientes Registrados");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.setOpaque(true);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton7MouseDragged(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(0, 400, 200, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/LOGO.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 130, 224);

        jButton23.setBackground(new java.awt.Color(44, 44, 44));
        jButton23.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Cerrar Sesión");
        jButton23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton23.setContentAreaFilled(false);
        jButton23.setFocusPainted(false);
        jButton23.setOpaque(true);
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton23MouseExited(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);
        jButton23.setBounds(0, 610, 200, 40);

        jButton24.setBackground(new java.awt.Color(44, 44, 44));
        jButton24.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Perfil de Usuario");
        jButton24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton24.setContentAreaFilled(false);
        jButton24.setFocusPainted(false);
        jButton24.setOpaque(true);
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton24MouseExited(evt);
            }
        });
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24);
        jButton24.setBounds(0, 470, 200, 70);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 650));

        jTabbedPane2.setBackground(java.awt.Color.white);
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        NueFactura.setBackground(new java.awt.Color(243, 243, 243));
        NueFactura.setLayout(null);

        jPanel6.setBackground(Color.white);
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Folio de Nota");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("RFC:");

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        NueFactura.add(jPanel6);
        jPanel6.setBounds(80, 45, 423, 138);

        jPanel7.setBackground(Color.white);
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setEnabled(false);
        jPanel7.setMaximumSize(new java.awt.Dimension(724, 278));
        jPanel7.setName(""); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("RFC del contribuyente:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Direccion del contribuyente:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jTextField3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel7.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 230, 253, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Localidad:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jTextField5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel7.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 485, 30));

        jTextField10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel7.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 485, 30));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("<html> Nombre o Razón social del<br> contribuyente:</html>");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jTextField6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField6.setMaximumSize(new java.awt.Dimension(6, 24));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 485, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Estado:");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jTextField7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 135, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Codigo Postal:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 103, -1));

        jTextField8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 181, 30));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setText("Correo electronico:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 236, -1, -1));

        jTextField9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel7.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 135, 30));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setText("Municipio:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jTextField11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel7.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 135, 30));

        NueFactura.add(jPanel7);
        jPanel7.setBounds(80, 260, 734, 290);

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton2.setText("Registrar Datos");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        NueFactura.add(jButton2);
        jButton2.setBounds(340, 560, 180, 43);

        jButton8.setBackground(new java.awt.Color(0, 153, 255));
        jButton8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton8.setText("Aceptar");
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        NueFactura.add(jButton8);
        jButton8.setBounds(660, 90, 180, 43);

        jButton9.setBackground(new java.awt.Color(0, 153, 255));
        jButton9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton9.setText("Enviar");
        jButton9.setFocusPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        NueFactura.add(jButton9);
        jButton9.setBounds(660, 140, 180, 43);

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setText("Validar Datos");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        NueFactura.add(jButton1);
        jButton1.setBounds(530, 90, 180, 43);

        jButton10.setBackground(new java.awt.Color(0, 153, 255));
        jButton10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton10.setText("Guardar como...");
        jButton10.setFocusPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        NueFactura.add(jButton10);
        jButton10.setBounds(660, 190, 180, 43);

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton3.setText("Editar datos");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        NueFactura.add(jButton3);
        jButton3.setBounds(660, 410, 180, 43);

        jButton11.setBackground(new java.awt.Color(0, 153, 255));
        jButton11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton11.setText("Cancelar factura");
        jButton11.setFocusPainted(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        NueFactura.add(jButton11);
        jButton11.setBounds(660, 460, 180, 43);

        jButton12.setBackground(new java.awt.Color(0, 153, 255));
        jButton12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton12.setText("Cancelar");
        jButton12.setFocusPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        NueFactura.add(jButton12);
        jButton12.setBounds(460, 560, 180, 43);

        jButton13.setBackground(new java.awt.Color(0, 153, 255));
        jButton13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton13.setText("Guardar Datos");
        jButton13.setActionCommand("Guardar cambios");
        jButton13.setFocusPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        NueFactura.add(jButton13);
        jButton13.setBounds(240, 560, 180, 43);

        EnviarSAT.setBackground(new java.awt.Color(0, 153, 255));
        EnviarSAT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EnviarSAT.setText("Enviar al SAT");
        EnviarSAT.setFocusPainted(false);
        EnviarSAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarSATActionPerformed(evt);
            }
        });
        NueFactura.add(EnviarSAT);
        EnviarSAT.setBounds(660, 90, 180, 43);

        jPanel13.setBackground(Color.white);
        jPanel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel25.setText("Comentario:");

        jTextField20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        NueFactura.add(jPanel13);
        jPanel13.setBounds(80, 148, 530, 100);

        jTabbedPane2.addTab("tab1", NueFactura);

        ConFacturas.setBackground(new java.awt.Color(243, 243, 243));
        ConFacturas.setLayout(null);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setToolTipText("");

        jPanel11.setBackground(new java.awt.Color(243, 243, 243));
        jPanel11.setPreferredSize(new java.awt.Dimension(870, 660));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel11);

        ConFacturas.add(jScrollPane3);
        jScrollPane3.setBounds(10, -5, 870, 660);

        jTabbedPane2.addTab("tab2", ConFacturas);

        ConClientes.setBackground(new java.awt.Color(243, 243, 243));
        ConClientes.setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel8.setBackground(new java.awt.Color(243, 243, 243));
        jPanel8.setPreferredSize(new java.awt.Dimension(870, 660));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel8);

        ConClientes.add(jScrollPane1);
        jScrollPane1.setBounds(10, -5, 870, 660);

        jTabbedPane2.addTab("tab3", ConClientes);

        AdmUsuarios.setBackground(new java.awt.Color(243, 243, 243));
        AdmUsuarios.setLayout(null);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel12.setBackground(new java.awt.Color(243, 243, 243));
        jPanel12.setPreferredSize(new java.awt.Dimension(870, 660));
        jPanel12.setLayout(null);
        jScrollPane4.setViewportView(jPanel12);

        AdmUsuarios.add(jScrollPane4);
        jScrollPane4.setBounds(10, -5, 870, 660);

        jTabbedPane2.addTab("tab4", AdmUsuarios);

        EditarClientes.setBackground(new java.awt.Color(243, 243, 243));
        EditarClientes.setLayout(null);

        jPanel9.setBackground(Color.white);
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setEnabled(false);
        jPanel9.setMaximumSize(new java.awt.Dimension(724, 278));
        jPanel9.setName(""); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setText("RFC del contribuyente:");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel17.setText("Direccion del contribuyente:");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel9.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 230, 253, 30));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel18.setText("Localidad:");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel9.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 485, 30));

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel9.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 485, 30));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setText("<html> Nombre o Razón social del<br> contribuyente:</html>");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField14.setMaximumSize(new java.awt.Dimension(6, 24));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 485, 30));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setText("Estado:");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel9.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 135, 30));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel21.setText("Codigo Postal:");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 103, -1));

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel9.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 181, 30));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel22.setText("Correo electronico:");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 236, -1, -1));

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel9.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 135, 30));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel23.setText("Municipio:");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel9.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 135, 30));

        EditarClientes.add(jPanel9);
        jPanel9.setBounds(80, 230, 734, 290);

        jPanel10.setBackground(Color.white);
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel24.setText("Folio de Nota");

        jTextField19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        EditarClientes.add(jPanel10);
        jPanel10.setBounds(80, 100, 423, 80);

        jButtonEditar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonEditar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButtonEditar.setText("Editar Datos");
        jButtonEditar.setActionCommand("Guardar cambios");
        jButtonEditar.setFocusPainted(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        EditarClientes.add(jButtonEditar);
        jButtonEditar.setBounds(240, 560, 180, 43);

        jButton16.setBackground(new java.awt.Color(0, 153, 255));
        jButton16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton16.setText("Cancelar");
        jButton16.setFocusPainted(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        EditarClientes.add(jButton16);
        jButton16.setBounds(460, 560, 180, 43);

        jButtonSave.setBackground(new java.awt.Color(0, 153, 255));
        jButtonSave.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButtonSave.setText("Guardar Datos");
        jButtonSave.setActionCommand("Guardar cambios");
        jButtonSave.setFocusPainted(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        EditarClientes.add(jButtonSave);
        jButtonSave.setBounds(240, 560, 180, 43);

        jButton17.setBackground(new java.awt.Color(0, 153, 255));
        jButton17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton17.setText("Facturar");
        jButton17.setFocusPainted(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        EditarClientes.add(jButton17);
        jButton17.setBounds(520, 120, 180, 43);

        jButton15.setBackground(new java.awt.Color(0, 153, 255));
        jButton15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton15.setText("Editar datos");
        jButton15.setFocusPainted(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        EditarClientes.add(jButton15);
        jButton15.setBounds(660, 410, 180, 43);

        jButton18.setBackground(new java.awt.Color(0, 153, 255));
        jButton18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton18.setText("Cancelar factura");
        jButton18.setFocusPainted(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        EditarClientes.add(jButton18);
        jButton18.setBounds(660, 460, 180, 43);

        jButton19.setBackground(new java.awt.Color(0, 153, 255));
        jButton19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton19.setText("Guardar como...");
        jButton19.setFocusPainted(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        EditarClientes.add(jButton19);
        jButton19.setBounds(660, 190, 180, 43);

        jButton20.setBackground(new java.awt.Color(0, 153, 255));
        jButton20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton20.setText("Enviar");
        jButton20.setFocusPainted(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        EditarClientes.add(jButton20);
        jButton20.setBounds(660, 140, 180, 43);

        jButton22.setBackground(new java.awt.Color(0, 153, 255));
        jButton22.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton22.setText("Aceptar");
        jButton22.setFocusPainted(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        EditarClientes.add(jButton22);
        jButton22.setBounds(660, 90, 180, 43);

        EnviarSAT1.setBackground(new java.awt.Color(0, 153, 255));
        EnviarSAT1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EnviarSAT1.setText("Enviar al SAT");
        EnviarSAT1.setFocusPainted(false);
        EnviarSAT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarSAT1ActionPerformed(evt);
            }
        });
        EditarClientes.add(EnviarSAT1);
        EnviarSAT1.setBounds(660, 90, 180, 43);

        jTabbedPane2.addTab("tab5", EditarClientes);

        Perfil.setBackground(new java.awt.Color(243, 243, 243));
        Perfil.setLayout(null);

        jPanel15.setBackground(Color.white);
        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.setEnabled(false);
        jPanel15.setMaximumSize(new java.awt.Dimension(724, 278));
        jPanel15.setName(""); // NOI18N
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel28.setText("Nombre de Usuario:");
        jPanel15.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel29.setText("Contraseña:");
        jPanel15.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jTextField24.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel15.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 220, 30));

        jTextField26.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField26.setMaximumSize(new java.awt.Dimension(6, 24));
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });
        jPanel15.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 220, 30));

        jTextField21.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel15.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 220, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Tipo de Usuario:");
        jPanel15.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        Perfil.add(jPanel15);
        jPanel15.setBounds(210, 250, 470, 170);

        jButton30.setBackground(new java.awt.Color(0, 153, 255));
        jButton30.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton30.setText("Cancelar");
        jButton30.setFocusPainted(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        Perfil.add(jButton30);
        jButton30.setBounds(470, 550, 180, 43);

        jButton31.setBackground(new java.awt.Color(0, 153, 255));
        jButton31.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton31.setText("Modificar Datos");
        jButton31.setActionCommand("Guardar cambios");
        jButton31.setFocusPainted(false);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        Perfil.add(jButton31);
        jButton31.setBounds(270, 550, 180, 43);

        jPanel16.setBackground(Color.white);
        jPanel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel16.setEnabled(false);
        jPanel16.setMaximumSize(new java.awt.Dimension(724, 278));
        jPanel16.setName(""); // NOI18N
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setToolTipText("Haz click para cambiar tu foto de perfil.");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 190));

        Perfil.add(jPanel16);
        jPanel16.setBounds(340, 20, 260, 210);

        jPanel17.setBackground(Color.white);
        jPanel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.setEnabled(false);
        jPanel17.setMaximumSize(new java.awt.Dimension(724, 278));
        jPanel17.setName(""); // NOI18N
        jPanel17.setLayout(null);

        jTextField23.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel17.add(jTextField23);
        jTextField23.setBounds(210, 10, 120, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Correo de la empresa:");
        jPanel17.add(jLabel5);
        jLabel5.setBounds(30, 20, 157, 18);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña del correo:");
        jPanel17.add(jLabel3);
        jLabel3.setBounds(20, 70, 162, 18);

        jTextField22.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField22.setText("@gmail.com");
        jPanel17.add(jTextField22);
        jTextField22.setBounds(330, 10, 100, 30);

        jPasswordField1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel17.add(jPasswordField1);
        jPasswordField1.setBounds(210, 60, 220, 30);

        Perfil.add(jPanel17);
        jPanel17.setBounds(210, 430, 470, 110);

        jTabbedPane2.addTab("tab1", Perfil);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 920, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        presionado = true;
        presionadoactual = 5;
        Color gris = new Color(44, 44, 44);
        jButton6.setBackground(gris);
        jButton7.setBackground(gris);
        jButton24.setBackground(gris);
        jButton4.setBackground(gris);
        jPanel8.removeAll();
        jTabbedPane2.setSelectedIndex(0);
        Color azul = new Color(0, 182, 230);
        jButton5.setBackground(azul);
        nueva=true;
        botonfalse();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        presionado = true;
        presionadoactual = 6;
        Color gris = new Color(44, 44, 44);
        jButton5.setBackground(gris);
        jButton7.setBackground(gris);
        jButton24.setBackground(gris);
        jButton4.setBackground(gris);
        jPanel8.removeAll();
        jPanel11.removeAll();
        jTabbedPane2.setSelectedIndex(1);
        Color azul = new Color(0, 182, 230);
        jButton6.setBackground(azul);
        PanelFacturas();
        botonfalse();
    }//GEN-LAST:event_jButton6ActionPerformed

    //Panel de Clientes Registrados
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            // TODO add your handling code here:
        presionado = true;
        presionadoactual = 7;
        Color gris = new Color(44, 44, 44);
        jButton5.setBackground(gris);
        jButton6.setBackground(gris);
        jButton24.setBackground(gris);
        jButton4.setBackground(gris);
        jPanel8.removeAll();
        jTabbedPane2.setSelectedIndex(2);
        Color azul = new Color(0, 182, 230);
        jButton7.setBackground(azul);
        nueva=false;
        PanelClientes();
        botonfalse();

    }//GEN-LAST:event_jButton7ActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        presionado = true;
        presionadoactual = 4;
        Color gris = new Color(44, 44, 44);
        jButton5.setBackground(gris);
        jButton6.setBackground(gris);
        jButton7.setBackground(gris);
        jButton24.setBackground(gris);
        jPanel8.removeAll();
        jTabbedPane2.setSelectedIndex(3);
        Color azul = new Color(0, 182, 230);
        jButton4.setBackground(azul);
        PanelUsuarios();
        botonfalse();
       
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
//***************Buton  nueva Factura**********************************//////////////
    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        if(presionadoactual != 5){
            presionado = false;
        }
        else{
            presionado = true;
        }
        Color azul = new Color(0, 182, 230);
        jButton5.setBackground(azul);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        if(presionado != true){
            Color gris = new Color(44, 44, 44);
            jButton5.setBackground(gris);
        }     
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    ///*****************button Azul    
    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
        if(presionadoactual != 6){
            presionado = false;
        }
        else{
            presionado = true;
        }
        Color azul = new Color(0, 182, 230);
        jButton6.setBackground(azul);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        if(presionadoactual != 7){
            presionado = false;
        }
        else{
            presionado = true;
        }
        Color azul = new Color(0, 182, 230);
        jButton7.setBackground(azul);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        if(presionadoactual != 4){
            presionado = false;
        }
        else{
            presionado = true;
        }
        Color azul = new Color(0, 182, 230);
        jButton4.setBackground(azul);
    }//GEN-LAST:event_jButton4MouseEntered

//******************** Button Gris 
    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
        if(presionado != true){
            Color gris = new Color(44, 44, 44);
            jButton6.setBackground(gris);
        }   
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
        if(presionado != true){
            Color gris = new Color(44, 44, 44);
            jButton7.setBackground(gris);
        }   
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        if(presionado != true){
            Color gris = new Color(44, 44, 44);
            jButton4.setBackground(gris);
        }   
    }//GEN-LAST:event_jButton4MouseExited
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //*******************Button Validar datos ***************************//   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Variables.Comentario=null;
        int tamaño = 0, y = 0;
        boolean correcto=true;
        String[] Cancelada;
        if (jTextField1.getText().equalsIgnoreCase("") || jTextField2.getText().equalsIgnoreCase("")) {
            Object[] options = {"Aceptar"};
            JOptionPane.showOptionDialog(null, "¡Datos incompletos", "Aviso",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);
        } else {
            String RFC = jTextField2.getText();
            if (!(RFC.length() == 12 && RFC.matches("[a-zA-z]{3}[0-9]{6}[a-zA-z0-9]{3}")) && !(RFC.length() == 13 && RFC.matches("[a-zA-z]{4}[0-9]{6}[a-zA-z0-9]{3}"))) {
                Object[] options = {"Aceptar"};
                JOptionPane.showOptionDialog(null, "RFC inválido.", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else {
                try {
                    Comandos = Funcion.Select(st, "Select *from cliente WHERE RFC='" + jTextField2.getText() + "';");// Consulta el RFC
                    while (Comandos.next()) {
                        idclientes = Integer.parseInt(Comandos.getObject("idCliente") + "");
                        Variables.setIdCliente(idclientes);
                    }
                    //Funcion.CerrarConsulta(Comandos);
                    if (idclientes > 0) {
                        Comando = FuncionTienda.Select(stienda, "Select *from nota WHERE folio_nota=" + jTextField1.getText() + ";"); // Consulta la nota
                        while (Comando.next()) {
                            idnota = Integer.parseInt(Comando.getObject("folio_nota") + "");
                        }
                        //FuncionTienda.CerrarConsulta(Comando);
                        if (idnota > 0) {

                            Comandos = Funcion.Select(st, "Select count(*) from factura_emitida;");// Tamaño de registros hechos
                            while (Comandos.next()) {
                                tamaño = Integer.parseInt(Comandos.getInt("count(*)") + "");
                            }

                            Cancelada = new String[tamaño];
                            Comandos = Funcion.Select(st, "Select *from factura_emitida WHERE Folio="
                                    + idnota + ";");// Tamaño de registros hechos

                            while (Comandos.next()) {
                                Cancelada[y] = (Comandos.getString("Observaciones"));
                                System.out.println(Cancelada[y]);
                                y++;
                            }

                            for (int ind = 0; ind < y; ind++) {
                                if (Cancelada[ind] == null || Cancelada[ind].equalsIgnoreCase("Factura Cancelada")) {
                                    correcto = true;
                                } else {
                                    correcto = false;
                                    break;
                                }
                            }
                            if (correcto == true) {
                                EnviarSAT.setVisible(true);
                                jButton3.setVisible(true);
                                jButton11.setVisible(true);
                                jButton1.setVisible(false);
                                jPanel6.setVisible(false);
                                jPanel7.setVisible(false);
                                jButton4.setEnabled(false);
                                jButton5.setEnabled(false);
                                jButton6.setEnabled(false);
                                jButton7.setEnabled(false);
                                jButton24.setEnabled(false);
                                jButton23.setEnabled(false);
                                //Metodo para generar factura
                                FechaSistema();
                                factura();
                                CrearPanelPDF();
                            } else {
                                JOptionPane.showMessageDialog(null, "¡La nota ya fue facturada!");
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "¡La nota no existe!");
                        }

                    } else {
                        jPanel7.setVisible(true);
                        jTextField5.setText(jTextField2.getText());
                        jTextField5.setEditable(false);
                        jButton2.setVisible(true);
                    }
                } catch (Exception ex) {
                    //JOptionPane.showMessageDialog(this, "Error en los datos");
                    System.out.println(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //********************Button Registrar Clientes
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String Comando = null;
            if (jTextField3.getText().equalsIgnoreCase("")|| jTextField5.getText().equalsIgnoreCase("")|| 
            jTextField6.getText().equalsIgnoreCase("") || jTextField7.getText().equalsIgnoreCase("") || 
            jTextField8.getText().equalsIgnoreCase("") || jTextField9.getText().equalsIgnoreCase("") || 
            jTextField10.getText().equalsIgnoreCase("")|| jTextField11.getText().equalsIgnoreCase("")){   
                Object[] options = {"Aceptar"};
                JOptionPane.showOptionDialog(null, "¡Datos incompletos", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else {
                Comando = "INSERT INTO cliente VALUES (default,'" + jTextField5.getText() + "','"
                        + jTextField6.getText() + "','" + jTextField10.getText() + "','"
                        + jTextField9.getText() + "','" + jTextField7.getText()
                        + "'," + jTextField8.getText() + ",'" + jTextField3.getText() + "','"
                        + jTextField11.getText() + "'); ";
                Funcion.Update(st, Comando);
                //*******Limpiar
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField10.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField7.setText("");
                jTextField3.setText("");
                jTextField11.setText("");
                jPanel7.setVisible(false);
                jButton2.setVisible(false);
                jPanel6.setVisible(false);
                jButton1.setVisible(false);

                Object[] options = {"Aceptar"};
                JOptionPane.showOptionDialog(null, "¡Exito!", "Nuevo cliente",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);

                jButton8.setVisible(true);
                jButton9.setVisible(true);
                jButton10.setVisible(true);
                jButton3.setVisible(true);
                jButton11.setVisible(true);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en los datos");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    //******************* EDITAR DATOS *******************
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            EnviarSAT.setVisible(false);
            scrollcuadro.setVisible(false);
            jButton2.setVisible(false);
            jButton8.setVisible(false);
            jButton9.setVisible(false);
            jButton10.setVisible(false);
            jButton3.setVisible(false);
            jButton11.setVisible(false);
            jButton12.setVisible(true);
            jButton13.setVisible(true);
            jPanel7.setVisible(true);
            jPanel13.setVisible(true);
            jTextField5.setEditable(false);
            jTextField5.setText(Variables.RFC);
            jTextField6.setText(Variables.NombreCliente);
            jTextField10.setText(Variables.Direccion);
            jTextField7.setText(Variables.Estado);
            jTextField9.setText(Variables.municipio);
            jTextField11.setText(Variables.delegacion);
            jTextField8.setText("" + Variables.codpostal);
            jTextField3.setText(Variables.Correo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

////////////////////////////////////////////////////////////////////////////////////
/////////////////********** Boton de agregar la factura    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            Inicio();
            String folio_fiscal = "1GR523GTEDQY";
            String serie_csd = "GHVN24501JKTU1";
            String lugar = "Cancun Quintana Roo, Mexico";
            String serie = "5E34";
            String Comando = null;
            Comando = "INSERT INTO factura_emitida  VALUES (" + Variables.idCliente
                    + ", default,'" + folio_fiscal
                    + "','" + serie_csd
                    + "',now()"
                    + ",'" + lugar
                    + "'," + idnota
                    + ",'" + serie
                    + "','" + Variables.Comentario + "'"
                    + ",'" + Variables.FechaSistema + "');";
            Funcion.Update(st, Comando);
            JOptionPane.showMessageDialog(null, "Factura creada");

            NuevoXML xml = new NuevoXML("xml/factura" + idnota + ".xml");
            xml.main();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButton8ActionPerformed

////////////////////////////////////////////////////////////////////////////////////
///////////////*************Boton de enviar por correo ******************
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String Para = Variables.Correo; //Correo al que mandaremos la factura
        String De = CorreoUs; //Correo del que enviaremos la factura, tiene que ser @gmail.com
        String Contrasena = Variables.ContraseñaCorreo; //Contraseña de ese correo
        Properties Propiedades = new Properties();
        Propiedades.setProperty("mail.smtp.host", "smtp.gmail.com");
        Propiedades.setProperty("mail.smtp.starttls.enable", "true");
        Propiedades.setProperty("mail.smtp.port", "587");
        Propiedades.setProperty("mail.smtp.user", De);
        Propiedades.setProperty("mail.smtp.auth", "true");
        Session Sesion = Session.getDefaultInstance(Propiedades);
        try{
            MimeMessage Mensaje  = new MimeMessage(Sesion);
            Mensaje.setFrom(new InternetAddress(De));
            Mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(Para));
            Mensaje.setSubject("Factura");
            BodyPart ContenidoMensaje = new MimeBodyPart();
            ContenidoMensaje.setText("Aqui esta su factura. Gracias por su preferencia.");
            Multipart Multi = new MimeMultipart();
            Multi.addBodyPart(ContenidoMensaje);
            ContenidoMensaje = new MimeBodyPart();
            String Ruta = "Factura.pdf";
            DataSource Adjunto = new FileDataSource(Ruta);
            ContenidoMensaje.setDataHandler(new DataHandler(Adjunto));
            ContenidoMensaje.setFileName(Ruta);
            Multi.addBodyPart(ContenidoMensaje);
            Mensaje.setContent(Multi);
            Transport Enviar = Sesion.getTransport("smtp");
            Enviar.connect(De, Contrasena);
            Enviar.sendMessage(Mensaje, Mensaje.getAllRecipients());
            System.out.println("Mensaje Enviado Correctamente...");
        }
        catch(MessagingException ex){
            System.out.println("Ha ocurrido un error al enviar el mensaje...       "+ ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

//**********************Guardar la facutura ***************************
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         Variables.guardar=true;
        NuevoPdf.main();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Inicio();
    }//GEN-LAST:event_jButton11ActionPerformed
    //************** Cancelar Cambios en los datos del Cliente 
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        scrollcuadro.setVisible(true);
        jButton2.setVisible(false);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton3.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jPanel7.setVisible(false);
        jPanel13.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

/////////////////////////////////////////////////////////////////////////////////////////////
    //************** Guardar Cambios en los datos del Cliente 
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            String Comando = null;
            if (jTextField3.getText().equalsIgnoreCase("") || jTextField5.getText().equalsIgnoreCase("")
                    || jTextField6.getText().equalsIgnoreCase("") || jTextField7.getText().equalsIgnoreCase("")
                    || jTextField8.getText().equalsIgnoreCase("") || jTextField9.getText().equalsIgnoreCase("")
                    || jTextField10.getText().equalsIgnoreCase("") || jTextField11.getText().equalsIgnoreCase("")) {
                Object[] options = {"Aceptar"};
                JOptionPane.showOptionDialog(null, "¡Datos incompletos", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else {
                Variables.NombreCliente = jTextField6.getText();
                Variables.Direccion = jTextField10.getText();
                Variables.Estado = jTextField7.getText();
                Variables.municipio = jTextField9.getText();
                Variables.delegacion = jTextField11.getText();
                Variables.Correo = jTextField3.getText();
                Variables.codpostal = Integer.parseInt(jTextField8.getText());

                Comando = "UPDATE cliente SET NombreCliente='" + jTextField6.getText() + "',Direccion='"
                        + jTextField10.getText() + "',Estado='" + jTextField7.getText() + "',Municipio='"
                        + jTextField9.getText() + "',Localidad='" + jTextField11.getText()
                        + "',codPostal=" + jTextField8.getText() + ",correo='" + jTextField3.getText()
                        + "' WHERE idCliente=" + Variables.idCliente + ";";
                Funcion.Update(st, Comando);
                
                Variables.Comentario=jTextField20.getText();
                //*******Limpiar
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField10.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField7.setText("");
                jTextField3.setText("");
                jTextField11.setText("");
                jTextField20.setText("");
                jPanel7.setVisible(false);
                jButton2.setVisible(false);
                jPanel6.setVisible(false);
                jButton1.setVisible(false);
                jButton12.setVisible(false);
                jButton13.setVisible(false);
                jPanel13.setVisible(false);
                
                jButton9.setVisible(true);
                jButton10.setVisible(true);
                jButton3.setVisible(true);
                jButton11.setVisible(true);
                EnviarSAT.setVisible(true);
                CrearPanelPDF();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            System.out.print(e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        jTextField12.setEditable(true);
        jTextField14.setEditable(true);
        jTextField13.setEditable(true);
        jTextField15.setEditable(true);
        jTextField17.setEditable(true);
        jTextField18.setEditable(true);
        jTextField16.setEditable(true);
        jTextField4.setEditable(true);
        jButtonEditar.setVisible(false);
        jButtonSave.setVisible(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed
//////////////////////////////////////////////////////////////////
    //******* BOTON DE VERIFICAR NOTA POR CLIENTE
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        presionadoactual = 5;
        Color azul = new Color(0, 182, 230);
        jButton5.setBackground(azul);
        Color gris = new Color(44, 44, 44);
        jButton7.setBackground(gris);
        try {
            Variables.Comentario = null;
            int tamaño = 0, y = 0;
            boolean correcto = true;
            String[] Cancelada;
            if (jTextField19.getText().equalsIgnoreCase("")) {
                Object[] options = {"Aceptar"};
                JOptionPane.showOptionDialog(null, "Ingrese la nota de venta", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else {

                Comandos = Funcion.Select(st, "Select *from cliente WHERE RFC='" + jTextField12.getText() + "';");// Consulta el RFC
                while (Comandos.next()) {
                    idclientes = Integer.parseInt(Comandos.getObject("idCliente") + "");
                    Variables.setIdCliente(idclientes);
                }
                Comando = FuncionTienda.Select(stienda, "Select *from nota WHERE folio_nota=" + jTextField19.getText() + ";"); // Consulta la nota
                while (Comando.next()) {
                    idnota = Integer.parseInt(Comando.getObject("folio_nota") + "");
                }
                //FuncionTienda.CerrarConsulta(Comando);
                if (idnota > 0) {

                    Comandos = Funcion.Select(st, "Select count(*) from factura_emitida;");// Tamaño de registros hechos
                    while (Comandos.next()) {
                        tamaño = Integer.parseInt(Comandos.getInt("count(*)") + "");
                    }

                    Cancelada = new String[tamaño];
                    Comandos = Funcion.Select(st, "Select *from factura_emitida WHERE Folio="
                            + idnota + ";");// Tamaño de registros hechos

                    while (Comandos.next()) {
                        Cancelada[y] = (Comandos.getString("Observaciones"));
                        System.out.println(Cancelada[y]);
                        y++;
                    }

                    for (int ind = 0; ind < y; ind++) {
                        if (Cancelada[ind] == null || Cancelada[ind].equalsIgnoreCase("Factura Cancelada")) {
                            correcto = true;
                        } else {
                            correcto = false;
                            break;
                        }
                    }
                    if (correcto == true) {
                        EnviarSAT1.setVisible(true);
                        jButton18.setVisible(true);
                        jButton15.setVisible(true);
                        jButton16.setVisible(false);
                        jButton17.setVisible(false);
                        jButtonEditar.setVisible(false);
                        jPanel9.setVisible(false);
                        jPanel10.setVisible(false);
                        // Botones principales;
                        jButton4.setEnabled(false);
                        jButton5.setEnabled(false);
                        jButton6.setEnabled(false);
                        jButton7.setEnabled(false);
                        jButton24.setEnabled(false);
                        jButton23.setEnabled(false);
                        //Metodo para generar factura
                        FechaSistema();
                        facturaClientes();
                        CrearPanelPDF();
                    } else {
                        JOptionPane.showMessageDialog(null, "¡La nota ya fue facturada!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "¡La nota no existe!");
                }
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(this, "Error en los datos");
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        try {
            String Comando = null;
            if (jTextField12.getText().equalsIgnoreCase("") || jTextField13.getText().equalsIgnoreCase("")
                    || jTextField14.getText().equalsIgnoreCase("") || jTextField15.getText().equalsIgnoreCase("")
                    || jTextField18.getText().equalsIgnoreCase("") || jTextField17.getText().equalsIgnoreCase("")
                    || jTextField16.getText().equalsIgnoreCase("") || jTextField4.getText().equalsIgnoreCase("")) {
                Object[] options = {"Aceptar"};
                JOptionPane.showOptionDialog(null, "¡Datos incompletos", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else {
                Variables.RFC=jTextField12.getText();
                Variables.NombreCliente = jTextField14.getText();
                Variables.Direccion = jTextField13.getText();
                Variables.Estado = jTextField15.getText();
                Variables.municipio = jTextField17.getText();
                Variables.delegacion = jTextField18.getText();
                Variables.Correo = jTextField4.getText();
                Variables.codpostal = Integer.parseInt(jTextField16.getText());
                

                Comando = "UPDATE cliente SET NombreCliente='" + jTextField14.getText()+ "',Direccion='"
                        + jTextField13.getText() + "',Estado='" + jTextField15.getText() + "',Municipio='"
                        + jTextField17.getText()+ "',Localidad='" + jTextField18.getText()
                        + "',codPostal=" + jTextField16.getText() + ",correo='" + jTextField4.getText()
                        +"',RFC='" +jTextField12.getText()+ "' WHERE idCliente=" + id + ";";
                Funcion.Update(st, Comando);

                if (editarcliente2 == false)
                    botonfalse();
                else {
                    jPanel9.setVisible(false);
                    EnviarSAT1.setVisible(true);                    
                    jButton18.setVisible(true);
                    jButton15.setVisible(true);
                    scrollcuadro.setVisible(true);
                    jButtonSave.setVisible(false);
                    jButton16.setVisible(false);
                }
                editarcliente2=false;
                    
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            System.out.print(e.getMessage());
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (editarcliente2 == false) {
            jPanel8.removeAll();
            jTabbedPane2.setSelectedIndex(2);
            PanelClientes();
            botonfalse();
        } else {
            jPanel9.setVisible(false);
            EnviarSAT1.setVisible(true);
            jButton18.setVisible(true);
            jButton15.setVisible(true);
            scrollcuadro.setVisible(true);
            jButtonSave.setVisible(false);
            jButton16.setVisible(false);
        }
        editarcliente2 = false;
    }//GEN-LAST:event_jButton16ActionPerformed

    //********* Editar datos en facturas por clientes
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        jTextField12.setEditable(false);
        jTextField14.setEditable(true);
        jTextField13.setEditable(true);
        jTextField15.setEditable(true);
        jTextField17.setEditable(true);
        jTextField18.setEditable(true);
        jTextField16.setEditable(true);
        jTextField4.setEditable(true);
        jButtonEditar.setVisible(false);
        jButtonSave.setVisible(true);
        scrollcuadro.setVisible(false);
        jPanel9.setVisible(true);
        editarcliente2 = true;
        jButton16.setVisible(true);
        EnviarSAT1.setVisible(false);
        jButton18.setVisible(false);
        jButton15.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Inicio();
        jPanel8.removeAll();
        jTabbedPane2.setSelectedIndex(2);
        presionadoactual = 7;
        Color azul = new Color(0, 182, 230);
        jButton7.setBackground(azul);
        nueva = false;
        PanelClientes();
        botonfalse();
        Color gris = new Color(44, 44, 44);
        jButton5.setBackground(gris);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        Variables.guardar=true;
        NuevoPdf.main();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        String Para = Variables.Correo; //Correo al que mandaremos la factura
        String De = CorreoUs; //Correo del que enviaremos la factura, tiene que ser @gmail.com
        String Contrasena = Variables.ContraseñaCorreo; //Contraseña de ese correo
        Properties Propiedades = new Properties();
        Propiedades.setProperty("mail.smtp.host", "smtp.gmail.com");
        Propiedades.setProperty("mail.smtp.starttls.enable", "true");
        Propiedades.setProperty("mail.smtp.port", "587");
        Propiedades.setProperty("mail.smtp.user", De);
        Propiedades.setProperty("mail.smtp.auth", "true");
        Session Sesion = Session.getDefaultInstance(Propiedades);
        try{
            MimeMessage Mensaje  = new MimeMessage(Sesion);
            Mensaje.setFrom(new InternetAddress(De));
            Mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(Para));
            Mensaje.setSubject("Factura");
            BodyPart ContenidoMensaje = new MimeBodyPart();
            ContenidoMensaje.setText("Aqui esta su factura. Gracias por su preferencia.");
            Multipart Multi = new MimeMultipart();
            Multi.addBodyPart(ContenidoMensaje);
            ContenidoMensaje = new MimeBodyPart();
            String Ruta = "Factura.pdf";
            DataSource Adjunto = new FileDataSource(Ruta);
            ContenidoMensaje.setDataHandler(new DataHandler(Adjunto));
            ContenidoMensaje.setFileName(Ruta);
            Multi.addBodyPart(ContenidoMensaje);
            Mensaje.setContent(Multi);
            Transport Enviar = Sesion.getTransport("smtp");
            Enviar.connect(De, Contrasena);
            Enviar.sendMessage(Mensaje, Mensaje.getAllRecipients());
            System.out.println("Mensaje Enviado Correctamente...");
        }
        catch(MessagingException ex){
            System.out.println("Ha ocurrido un error al enviar el mensaje...       "+ ex);
        }
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        try {
            jPanel8.removeAll();
            jTabbedPane2.setSelectedIndex(2);
            PanelClientes();
            botonfalse();
            Inicio();
            String folio_fiscal = "1GR523GTEDQY";
            String serie_csd = "GHVN24501JKTU1";
            String lugar = "Cancun Quintana Roo, Mexico";
            String serie = "5E34";
            String Comando = null;
            Comando = "INSERT INTO factura_emitida  VALUES (" + Variables.idCliente
                    + ",default,'" + folio_fiscal
                    + "','" + serie_csd
                    + "',now()"
                    + ",'" + lugar
                    + "'," + idnota
                    + ",'" + serie
                    + "','" + Variables.Comentario + "'"
                    + ",'" + Variables.FechaSistema + "');";
            Funcion.Update(st, Comando);
            JOptionPane.showMessageDialog(null, "Factura creada");

            NuevoXML xml = new NuevoXML("factura" + idnota + ".xml");
            xml.main();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void EnviarSATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarSATActionPerformed
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);

        EnviarSAT.setVisible(false);
        jButton3.setVisible(false);
        jButton11.setVisible(false);

    }//GEN-LAST:event_EnviarSATActionPerformed

    private void EnviarSAT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarSAT1ActionPerformed
        jButton22.setVisible(true);
        jButton20.setVisible(true);
        jButton19.setVisible(true);
        EnviarSAT1.setVisible(false);
        jButton15.setVisible(false);
        jButton18.setVisible(false);
        
    }//GEN-LAST:event_EnviarSAT1ActionPerformed

    private void jButton23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseEntered
         Color azul = new Color(0, 182, 230);
        jButton23.setBackground(azul);
    }//GEN-LAST:event_jButton23MouseEntered

    private void jButton23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseExited
      Color gris = new Color(44, 44, 44);
      jButton23.setBackground(gris);
    }//GEN-LAST:event_jButton23MouseExited

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        this.hide();
        Variables.ver=false;
        Login abrir= new Login();
        abrir.setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseEntered
       if(presionadoactual != 24){
            presionado = false;
        }
        else{
            presionado = true;
        }
        Color azul = new Color(0, 182, 230);
        jButton24.setBackground(azul);
    }//GEN-LAST:event_jButton24MouseEntered

    private void jButton24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseExited
        if(presionado != true){
            Color gris = new Color(44, 44, 44);
            jButton24.setBackground(gris);
        }   
    }//GEN-LAST:event_jButton24MouseExited

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        presionado = true;
        presionadoactual = 24;
        Color gris = new Color(44, 44, 44);
        jButton5.setBackground(gris);
        jButton6.setBackground(gris);
        jButton7.setBackground(gris);
        jButton4.setBackground(gris);
        jTabbedPane2.setSelectedIndex(5);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton24.setEnabled(false);
        jButton23.setEnabled(false);
        PerfilUsuario(Variables.idUsuario);
        botonfalse();
        Color azul = new Color(0, 182, 230);
        jButton24.setBackground(azul);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        presionado = true;
        presionadoactual = 5;
        Color azul = new Color(0, 182, 230);
        jButton5.setBackground(azul);
        jPanel8.removeAll();
        jTabbedPane2.setSelectedIndex(0);
        nueva = true;
        botonfalse();
        modificar = false;
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton24.setEnabled(true);
        Color gris = new Color(44, 44, 44);
        jButton24.setBackground(gris);
        jButton23.setEnabled(true);
    }//GEN-LAST:event_jButton30ActionPerformed

    static boolean modificar = false;
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        try {
            if (modificar == false) {
                jButton31.setText("Guardar Datos");
                jTextField23.setEditable(true);
                jPasswordField1.setEditable(true);
                jTextField24.setEditable(true);
                jTextField26.setEditable(true);

                modificar = true;
            } else {
                if (jTextField24.getText().equalsIgnoreCase("") || jTextField26.getText().equalsIgnoreCase("")) {
                    Object[] options = {"Aceptar"};
                    JOptionPane.showOptionDialog(null, "¡Datos incompletos", "Aviso",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                            null, options, options[0]);
                } else {
                    String Comando = "UPDATE Usuarios SET Nombre='" + jTextField24.getText() + "', contrasena='" + jTextField26.getText()
                            + "' WHERE id=" + idUsuarioPerfil + ";";
                    Funcion.Update(st, Comando);
                    Comando = "UPDATE Usuarios SET correo='" + jTextField23.getText() + "', contcorreo='" + jPasswordField1.getText() + "';";
                    Funcion.Update(st, Comando);
                    jButton31.setText("Editar Datos");
                    modificar = false;
                    Comandos = Funcion.Select(st, "Select *from usuarios WHERE id=" + Variables.idUsuario + ";");
                    while (Comandos.next()) {
                        Variables.NombreUsuario = (String) Comandos.getObject("Nombre");
                        Variables.ContraseñaUsuario = (String) Comandos.getObject("Contrasena");
                        Variables.CorreoUsuario = (String) Comandos.getObject("Correo");
                        Variables.ContraseñaCorreo = (String) Comandos.getObject("Contcorreo");
                    }
                    CorreoUs =  Variables.CorreoUsuario + jTextField22.getText();
                    jTextField23.setEditable(false);
                    jPasswordField1.setEditable(false);
                    jTextField24.setEditable(false);
                    jTextField26.setEditable(false);
                    jButton4.setEnabled(true);
                    jButton5.setEnabled(true);
                    jButton6.setEnabled(true);
                    jButton7.setEnabled(true);
                    jButton24.setEnabled(true);
                    jButton23.setEnabled(true);
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        File Ruta = new File("Imagenes/Fotos Perfil/");
        JFileChooser Examinar = new JFileChooser();
        FileNameExtensionFilter Filtro = new FileNameExtensionFilter("Image", "png", "jpg");
        Examinar.addChoosableFileFilter(Filtro);
        Examinar.setAcceptAllFileFilterUsed(false);
        Examinar.setFileFilter(Filtro);
        int Estatus = Examinar.showOpenDialog(this);
        if(Estatus == JFileChooser.APPROVE_OPTION){
            File Origen = Examinar.getSelectedFile();
            String Extension = FilenameUtils.getExtension(Origen.getPath());
            File Copia = new File(Variables.getIdUsuario() + "." + Extension);
            try{
                FileUtils.copyFile(Origen, Copia);
                FileUtils.copyFileToDirectory(Copia, Ruta);
                if(Extension.equals("png")){
                    File jpg = new File("Imagenes/Fotos Perfil/" + Variables.idUsuario + ".jpg");
                    if(jpg.exists()){
                        jpg.delete();
                    }
                }
                if(Extension.equals("jpg")){
                    File png = new File("Imagenes/Fotos Perfil/" + Variables.idUsuario + ".png");
                    if(png.exists()){
                        png.delete();
                    }
                }
                Copia.delete();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        } else if(Estatus == JFileChooser.CANCEL_OPTION){
            System.out.println("Cancelar");
        }
        PerfilUsuario(Variables.idUsuario);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseDragged
////////////////////////////////////////////////////////////////////
// **************** METODOS *************    
    
 //** Perfil de Usuario
    public void PerfilUsuario(int idUsuario){
        idUsuarioPerfil = idUsuario;
       try {
           File FotoPerfil = new File("Imagenes/Fotos Perfil/" + idUsuario + ".png");
           File FotoPerfil2 = new File("Imagenes/Fotos Perfil/" + idUsuario + ".jpg");
           Comando = Funcion.Select(st, "SELECT * FROM usuarios WHERE id = " + idUsuario + ";");
           if(FotoPerfil.exists())
           {
               ImageIcon Imagen = new ImageIcon("Imagenes/Fotos Perfil/" + idUsuario + ".png");
               Image ImagenEscalada = Imagen.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
               Icon IconoEscalado = new ImageIcon(ImagenEscalada);
               jLabel2.setIcon(IconoEscalado);
           } else if(FotoPerfil2.exists()){
               ImageIcon Imagen = new ImageIcon("Imagenes/Fotos Perfil/" + idUsuario + ".jpg");
               Image ImagenEscalada = Imagen.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
               Icon IconoEscalado = new ImageIcon(ImagenEscalada);
               jLabel2.setIcon(IconoEscalado);
           } else{
               ImageIcon Imagen = new ImageIcon(getClass().getResource("/Imagen/Default.png"));
               Image ImagenEscalada = Imagen.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
               Icon IconoEscalado = new ImageIcon(ImagenEscalada);
               jLabel2.setIcon(IconoEscalado);
           }
            while (Comando.next()) {
                jTextField24.setText(Comando.getString("Nombre"));
                jTextField26.setText(Comando.getString("contrasena"));    
                jTextField21.setText(Comando.getString("tipo"));
                jTextField23.setText(Comando.getString("correo"));
                jPasswordField1.setText(Comando.getString("Contcorreo"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
   } 
//////////////////////////////////////////////////////////////////////////////////////
//*** Crear facturaPDF
    public void factura() {
        try {
            Variables.claves.clear();
            Variables.cantidades.clear();
            Variables.preciosunitarios.clear();
            Variables.importes.clear();
            Variables.descripciones.clear();
            Variables.ums.clear(); 
            Comandos = Funcion.Select(st, "Select *from cliente WHERE RFC='" + jTextField2.getText() + "';");// Consulta el RFC

            while (Comandos.next()) {
                Variables.RFC = ((String) Comandos.getObject("RFC"));
                Variables.NombreCliente = ((String) Comandos.getObject("NombreCliente"));
                Variables.Direccion = ((String) Comandos.getObject("Direccion"));
                Variables.delegacion = ((String) Comandos.getObject("Localidad"));
                Variables.municipio = ((String) Comandos.getObject("municipio"));
                Variables.Estado = ((String) Comandos.getObject("Estado"));
                Variables.codpostal = (Integer.parseInt(Comandos.getObject("codpostal") + ""));
                Variables.Correo = ((String) Comandos.getObject("correo"));
            }
            //Funcion.CerrarConsulta(Comandos);

            Comando = FuncionTienda.Select(stienda, "Select *from nota WHERE folio_nota=" + jTextField1.getText() + ";"); // Consulta la nota

            while (Comando.next()) {
                Variables.suma = ((Double) Double.parseDouble(Comando.getObject("suma") + ""));
                Variables.descuento = ((Double) Double.parseDouble(Comando.getObject("descuento") + ""));
                Variables.subtotal = ((Double) Double.parseDouble(Comando.getObject("subtotal") + ""));
                Variables.iva = ((Double) Double.parseDouble(Comando.getObject("iva") + ""));
                Variables.total = ((Double) Double.parseDouble(Comando.getObject("total") + ""));
                System.out.println("Total : " + Variables.getTotal());
            }
            //FuncionTienda.CerrarConsulta(Comando);

            Comandoventas = FuncionTienda.Select(stienda, "Select *from venta WHERE clave_nota="
                    + idnota + ";");
            while (Comandoventas.next()) {
                Variables.claves.add(Integer.parseInt(Comandoventas.getObject("clave") + ""));
                Variables.cantidades.add(Integer.parseInt(Comandoventas.getObject("cantidad") + ""));
                Variables.preciosunitarios.add(Double.parseDouble(Comandoventas.getObject("precio_unitario") + ""));
                Variables.importes.add(Double.parseDouble(Comandoventas.getObject("importe") + ""));
                Variables.descripciones.add((String) Comandoventas.getObject("Descripcion"));
                Variables.ums.add((String) Comandoventas.getObject("unidad_de_medida"));
            }

            //FuncionTienda.CerrarConsulta(Comandoventas);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void facturaClientes() {
        try {
            Variables.claves.clear();
            Variables.cantidades.clear();
            Variables.preciosunitarios.clear();
            Variables.importes.clear();
            Variables.descripciones.clear();
            Variables.ums.clear(); 
            
            Comandos = Funcion.Select(st, "Select *from cliente WHERE RFC='" + jTextField12.getText() + "';");// Consulta el RFC

            while (Comandos.next()) {
                Variables.RFC = ((String) Comandos.getObject("RFC"));
                Variables.NombreCliente = ((String) Comandos.getObject("NombreCliente"));
                Variables.Direccion = ((String) Comandos.getObject("Direccion"));
                Variables.delegacion = ((String) Comandos.getObject("Localidad"));
                Variables.municipio = ((String) Comandos.getObject("municipio"));
                Variables.Estado = ((String) Comandos.getObject("Estado"));
                Variables.codpostal = (Integer.parseInt(Comandos.getObject("codpostal") + ""));
                Variables.Correo = ((String) Comandos.getObject("correo"));
            }
            //Funcion.CerrarConsulta(Comandos);

            Comando = FuncionTienda.Select(stienda, "Select *from nota WHERE folio_nota=" + jTextField19.getText() + ";"); // Consulta la nota

            while (Comando.next()) {
                Variables.suma = ((Double) Double.parseDouble(Comando.getObject("suma") + ""));
                Variables.descuento = ((Double) Double.parseDouble(Comando.getObject("descuento") + ""));
                Variables.subtotal = ((Double) Double.parseDouble(Comando.getObject("subtotal") + ""));
                Variables.iva = ((Double) Double.parseDouble(Comando.getObject("iva") + ""));
                Variables.total = ((Double) Double.parseDouble(Comando.getObject("total") + ""));
                //System.out.println("Total : " + Variables.getTotal());
            }
            //FuncionTienda.CerrarConsulta(Comando);

            Comandoventas = FuncionTienda.Select(stienda, "Select *from venta WHERE clave_nota="
                    + idnota + ";");
            while (Comandoventas.next()) {
                Variables.claves.add(Integer.parseInt(Comandoventas.getObject("clave") + ""));
                Variables.cantidades.add(Integer.parseInt(Comandoventas.getObject("cantidad") + ""));
                Variables.preciosunitarios.add(Double.parseDouble(Comandoventas.getObject("precio_unitario") + ""));
                Variables.importes.add(Double.parseDouble(Comandoventas.getObject("importe") + ""));
                Variables.descripciones.add((String) Comandoventas.getObject("Descripcion"));
                Variables.ums.add((String) Comandoventas.getObject("unidad_de_medida"));
            }

            //FuncionTienda.CerrarConsulta(Comandoventas);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void CrearPanelPDF() {
        Panelpdf = null;
        scrollcuadro = null;
        Panelpdf = new JPanel();
        scrollcuadro = new JScrollPane();
        NuevoPdf pdf = new NuevoPdf("Factura.pdf");
        pdf.main();
        scrollcuadro.setSize(630, 600);
        scrollcuadro.setLocation(20, 30);
        //Tamaño del panel
        Panelpdf.setSize(1000, 700);
        // La posicion y del panel ira incrementando para que no se encimen
        Panelpdf.setBackground(Color.white);
        Panelpdf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        String filePath = "Factura.pdf";

// build a controller
        SwingController controller = new SwingController();
        PropertiesManager properties = new PropertiesManager(System.getProperties(), ResourceBundle.getBundle(PropertiesManager.DEFAULT_MESSAGE_BUNDLE));
//properties.setBoolean(PropertiesManager.PROPERTY_VIEWPREF_HIDETOOLBAR, Boolean.TRUE);
        properties.setBoolean(PropertiesManager.PROPERTY_SHOW_UTILITY_PRINT, Boolean.TRUE);
        properties.setBoolean(PropertiesManager.PROPERTY_SHOW_UTILITY_SEARCH, Boolean.FALSE);
        properties.setBoolean(PropertiesManager.PROPERTY_SHOW_UTILITY_OPEN, Boolean.FALSE);
        properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_FIT, Boolean.FALSE);
        properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_ROTATE, Boolean.FALSE);
        properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_PAGENAV, Boolean.FALSE);
        properties.setBoolean(PropertiesManager.PROPERTY_SHOW_UTILITY_SAVE, Boolean.FALSE);
        properties.setBoolean(PropertiesManager.PROPERTY_SHOW_UTILITY_UPANE, Boolean.FALSE);

//properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_TOOL, Boolean.TRUE);
//properties.setDouble(PropertiesManager.PROPERTY_DEFAULT_ZOOM_LEVEL, 1.05);
//properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_ANNOTATION, Boolean.FALSE); 
//properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_FIT, Boolean.FALSE);
// Build a SwingViewFactory configured with the controller
        SwingViewBuilder factory = new SwingViewBuilder(controller, properties);

// Use the factory to build a JPanel that is pre-configured
//with a complete, active Viewer UI.
        JPanel viewerComponentPanel = factory.buildViewerPanel();

// add copy keyboard command
        ComponentKeyBinding.install(controller, viewerComponentPanel);

// add interactive mouse link annotation support via callback
        controller.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(
                        controller.getDocumentViewController()));
// Create a JFrame to display the panel in

        Panelpdf.add(viewerComponentPanel);
        /*this.getContentPane().add(Panel);
         this.pack();
         this.setVisible(true);
         */
// Open a PDF document to view
        scrollcuadro.add(Panelpdf);
        scrollcuadro.setViewportView(Panelpdf);
        controller.openDocument(filePath);
        if (nueva == true) {
            NueFactura.add(scrollcuadro);
        } else {
            EditarClientes.add(scrollcuadro);
        }
    }
///////////////////////////////////////////////////////////////////////
//*** Paneles de Clientes
    public void PanelClientes() {
        int i = 0;
        int Altura = 0;
        Color gris = new Color(44, 44, 44);

        Color azul = new Color(0, 153, 255);
        JLabel VERMAS = null;
        try {

            //Consultamos todos los clientes
            ResultSet Comandos = Funcion.Select(st, "SELECT * FROM cliente;");
            //Ciclo para crear un panel para cada uno
            while (Comandos.next()) {
                //Creamos un panel con alineacion a la izquierda
                JPanel Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                jPanel8.add(Panel);
                //Tamaño del panel
                Panel.setSize(700, 140);
                // La posicion y del panel ira incrementando para que no se encimen
                Altura = 30 + (i * 150);
                Panel.setLocation(50, Altura);
                Panel.setBackground(Color.white);
                Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                //Creamos label para mostrar los datos del cliente, el codigo html es para que al llegar al final del panel
                //se pase a la siguiente linea y para el margen izquierdo
                final JLabel RFC = new JLabel(String.format("<html><div WIDTH=%d style='margin-left:50px;'>%s</div><html>", Panel.getWidth(), "RFC: " + Comandos.getString("RFC")));
                JLabel Nombre = new JLabel(String.format("<html><div WIDTH=%d style='margin-left:50px;'>%s</div><html>", Panel.getWidth(), "Nombre: " + Comandos.getString("NombreCliente")));
                JLabel Direccion = new JLabel(String.format("<html><div WIDTH=%d style='margin-left:50px;'>%s</div><html>", Panel.getWidth(), "Direccion: " + Comandos.getString("Direccion")));
                JLabel Correo = new JLabel(String.format("<html><div WIDTH=%d style='margin-left:50px;'>%s</div><html>", Panel.getWidth(), "Correo: " + Comandos.getString("correo")));
                VERMAS = new JLabel(String.format("<html><div WIDTH=%d style='margin-left:450px;'>%s</div><html>", Panel.getWidth(), "<html><u>Ver mas</u></html>)"));
               System.out.println(Panel.getHeight());
                VERMAS.setName(String.valueOf(Comandos.getInt("idCliente")));
                VERMAS.setCursor(null);
                MouseListener ml = new MouseListener() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        //System.out.println("Released!");
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        //System.out.println("Pressed!");
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        //System.out.println("Exited!");
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        //System.out.println("Entered!");
                        e.getComponent().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    }

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        JLabel source = (JLabel) e.getSource();
                        id = Integer.parseInt(source.getName());
                        jTabbedPane2.setSelectedIndex(4);
                        jButton16.setVisible(true);
                        jButton17.setVisible(true);
                        jButtonEditar.setVisible(true);
                        jPanel9.setVisible(true);
                        jPanel10.setVisible(true);
                        LlenarPanel();

                    }
                };
                VERMAS.addMouseListener(ml);
//Fuente del texto
                RFC.setFont(new Font("Verdana", Font.PLAIN, 13));
                RFC.setForeground(gris);
                Nombre.setFont(new Font("Verdana", Font.PLAIN, 13));
                Nombre.setForeground(gris);
                Direccion.setFont(new Font("Verdana", Font.PLAIN, 13));
                Direccion.setForeground(gris);
                Correo.setFont(new Font("Verdana", Font.PLAIN, 13));
                Correo.setForeground(gris);
                VERMAS.setFont(new Font("Verdana", Font.PLAIN, 13));
                VERMAS.setForeground(azul);
                //Añadimos los label al panel correspondiente del cliente
                Panel.add(RFC);
                Panel.add(Nombre);
                Panel.add(Direccion);
                Panel.add(Correo);
                Panel.add(VERMAS);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Dependiendo de cuantos clientes se agregaron, se ajusta el tamaño del panel principal para que el scroll llegue hasta ahi
        jPanel8.setPreferredSize(new Dimension(jPanel8.getWidth(), Altura + 150));
    }
    public void PanelUsuarios(){ 
        int i = 0;
        int Altura = 0;
        Color gris = new Color(44, 44, 44);
        Color azul = new Color(0, 153, 255);
        Color rojo = new Color(221, 76, 76);
        try {
            //Consultamos todos los clientes
            ResultSet Comandos = Funcion.Select(st, "SELECT * FROM usuarios where Tipo!='Administrador';");
            //Ciclo para crear un panel para cada uno
            while (Comandos.next()) {
                //Creamos un panel con alineacion a la izquierda
                JPanel Panel = new JPanel();
                Panel.setLayout(null);
                jPanel12.add(Panel);
                //Tamaño del panel
                Panel.setSize(500, 200);
                // La posicion y del panel ira incrementando para que no se encimen
                Altura = 40 + (i * 220);
                Panel.setLocation(175, Altura);
                Panel.setBackground(Color.white);
                Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                //Creamos label para mostrar los datos del cliente, el codigo html es para que al llegar al final del panel
                //se pase a la siguiente linea y para el margen izquierdo
                JLabel Foto = new JLabel();
                Foto.setSize(150, 150);
                File FotoPerfil = new File("Imagenes/Fotos Perfil/" + Comandos.getInt("id") + ".png");
                File FotoPerfil2 = new File("Imagenes/Fotos Perfil/" + Comandos.getInt("id") + ".jpg");
                if (FotoPerfil.exists()) {
                    ImageIcon Imagen = new ImageIcon("Imagenes/Fotos Perfil/" + Comandos.getInt("id") + ".png");
                    Image ImagenEscalada = Imagen.getImage().getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_SMOOTH);
                    Icon IconoEscalado = new ImageIcon(ImagenEscalada);
                    Foto.setIcon(IconoEscalado);
                } else if (FotoPerfil2.exists()) {
                    ImageIcon Imagen = new ImageIcon("Imagenes/Fotos Perfil/" + Comandos.getInt("id") + ".jpg");
                    Image ImagenEscalada = Imagen.getImage().getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_SMOOTH);
                    Icon IconoEscalado = new ImageIcon(ImagenEscalada);
                    Foto.setIcon(IconoEscalado);
                } else {
                    ImageIcon Imagen = new ImageIcon(getClass().getResource("/Imagen/Default.png"));
                    Image ImagenEscalada = Imagen.getImage().getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_SMOOTH);
                    Icon IconoEscalado = new ImageIcon(ImagenEscalada);
                    Foto.setIcon(IconoEscalado);
                }
                JLabel Nombre = new JLabel();
                Nombre.setText("Nombre de Usuario: " + Comandos.getString("Nombre"));
                JLabel Contrasena = new JLabel();
                Contrasena.setText(("Contraseña: " + Comandos.getString("contrasena")));
                JButton Editar = new JButton();
                Editar.setText("Editar");
                Editar.setName(Comandos.getString("id"));
                Editar.setBackground(azul);
                JButton Eliminar = new JButton();
                Eliminar.setText("Eliminar");
                Eliminar.setName(Comandos.getString("id"));
                Eliminar.setBackground(rojo);
                MouseListener mlEditar = new MouseListener() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        //System.out.println("Released!");
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        //System.out.println("Pressed!");
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        //System.out.println("Exited!");
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        //System.out.println("Entered!");
                    }

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        presionadoactual = 24;
                        Color azul = new Color(0, 182, 230);
                        jButton24.setBackground(azul);
                        JButton source = (JButton) e.getSource();
                        System.out.println(source.getName());
                        jPanel17.setVisible(false);
                        jButton30.setLocation(470, 480);
                        jButton31.setLocation(270, 480);
                        jTabbedPane2.setSelectedIndex(5);
                        PerfilUsuario(Integer.parseInt(source.getName()));
                        Color gris = new Color(44, 44, 44);
                        jButton4.setBackground(gris);
                    }
                };
                MouseListener mlEliminar = new MouseListener() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        //System.out.println("Released!");
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        //System.out.println("Pressed!");
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        //System.out.println("Exited!");
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        //System.out.println("Entered!");
                    }

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        JButton source = (JButton) e.getSource();
                        System.out.println(source.getName());
                        Funcion.Update(st, "DELETE FROM usuarios WHERE id = " + source.getName() + ";");
                        jPanel12.removeAll();
                        PanelUsuarios();
                        jPanel12.repaint();
                    }
                };
                Editar.addMouseListener(mlEditar);
                Eliminar.addMouseListener(mlEliminar);
                //Fuente del texto;
                Nombre.setFont(new Font("Verdana", Font.PLAIN, 15));
                Nombre.setForeground(gris);
                Contrasena.setFont(new Font("Verdana", Font.PLAIN, 15));
                Contrasena.setForeground(gris);
                Editar.setFont(new Font("Verdana", Font.PLAIN, 15));
                Editar.setForeground(Color.white);
                Eliminar.setFont(new Font("Verdana", Font.PLAIN, 15));
                Eliminar.setForeground(Color.white);
                //Añadimos los label al panel correspondiente del cliente
                Panel.add(Foto);
                Panel.add(Nombre);
                Panel.add(Contrasena);
                Panel.add(Editar);
                Panel.add(Eliminar);
                Foto.setLocation(10, 20);
                Nombre.setLocation(170, 30);
                Nombre.setSize(300, 45);
                Contrasena.setLocation(170, 60);
                Contrasena.setSize(300, 45);
                Editar.setLocation(170, 100);
                Editar.setSize(120, 40);
                Eliminar.setLocation(315, 100);
                Eliminar.setSize(120, 40);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Dependiendo de cuantos clientes se agregaron, se ajusta el tamaño del panel principal para que el scroll llegue hasta ahi
        jPanel12.setPreferredSize(new Dimension(jPanel12.getWidth(), Altura + 150));
              
    }
    public void LlenarPanel() {
        
        try{
            Comandos = Funcion.Select(st, "Select *from cliente WHERE idCliente=" + id + ";");// Consulta el id del cliente
                while (Comandos.next()) {
                Variables.RFC = ((String) Comandos.getObject("RFC"));
                Variables.NombreCliente = ((String) Comandos.getObject("NombreCliente"));
                Variables.Direccion = ((String) Comandos.getObject("Direccion"));
                Variables.delegacion = ((String) Comandos.getObject("Localidad"));
                Variables.municipio = ((String) Comandos.getObject("municipio"));
                Variables.Estado = ((String) Comandos.getObject("Estado"));
                Variables.codpostal = (Integer.parseInt(Comandos.getObject("codpostal") + ""));
                Variables.Correo = ((String) Comandos.getObject("correo"));
                }
         jTextField12.setText(Variables.RFC);
         jTextField14.setText(Variables.NombreCliente);
         jTextField13.setText(Variables.Direccion);
         jTextField15.setText(Variables.Estado);
         jTextField17.setText(Variables.municipio);
         jTextField18.setText(Variables.delegacion);
         jTextField16.setText("" + Variables.codpostal);
         jTextField4.setText(Variables.Correo);
                
        }catch(Exception e){
            
        }
    }
    public void botonfalse() {
        jTextField12.setEditable(false);
        jTextField14.setEditable(false);
        jTextField13.setEditable(false);
        jTextField15.setEditable(false);
        jTextField17.setEditable(false);
        jTextField18.setEditable(false);
        jTextField16.setEditable(false);
        jTextField4.setEditable(false);
        jButtonEditar.setVisible(true);
        jButtonSave.setVisible(false);
        scrollcuadro.setVisible(false);
        jButton22.setVisible(false);       
        jButton20.setVisible(false);
        jButton19.setVisible(false);
        jButton18.setVisible(false);
        jButton15.setVisible(false);
        editarcliente2=false;
        jTextField24.setEditable(false);
        jTextField26.setEditable(false);
    }
    public void PanelFacturas() {
        int i = 0;
        int Altura = 0;
        Color gris = new Color(44, 44, 44);
        Color azul = new Color(0, 153, 255);
        Color rojo = new Color(221, 76, 76);
        try {
            //Consultamos todos los clientes
            ResultSet Comandos = Funcion.Select(st, "SELECT factura_emitida.*, cliente.*  FROM cliente,factura_emitida  WHERE factura_emitida.idCliente = cliente.idCliente;");
             //Ciclo para crear un panel para cada uno
            while (Comandos.next()) {
                Variables.Comentario= Comandos.getString("Observaciones");
                //Creamos un panel con alineacion a la izquierda
                JPanel Panel = new JPanel();
                Panel.setLayout(null);
                jPanel11.add(Panel);
                //Tamaño del panel
                Panel.setSize(680, 200);
                // La posicion y del panel ira incrementando para que no se encimen
                Altura = 30 + (i * 250);
                Panel.setLocation(50, Altura);
                Panel.setBackground(Color.white);
                Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                //Creamos label para mostrar los datos del cliente, el codigo html es para que al llegar al final del panel
                //se pase a la siguiente linea y para el margen izquierdo
       
                JLabel FolioFactura = new JLabel();
                FolioFactura.setText("Folio de factura: " + Comandos.getString("idFacturaEmitida"));
                JLabel RFC = new JLabel();
                RFC.setText("RFC: " + Comandos.getString("RFC"));
                JLabel Nombre = new JLabel();
                Nombre.setText("Nombre: " + Comandos.getString("NombreCliente"));
                JLabel Direccion = new JLabel();
                Direccion.setText("Direccion: " + Comandos.getString("Direccion"));
                JLabel Correo = new JLabel();
                Correo.setText("Correo: " + Comandos.getString("correo"));
                JLabel Fecha= new JLabel();
                Fecha.setText("Fecha y Hora de emisión: " + Comandos.getString("FechaEmision"));
              
                JButton Abre = new JButton();
                Abre.setText("Abrir");
                Abre.setName(Comandos.getString("idFacturaEmitida"));
                Abre.setBackground(azul);
                JButton Cancelar = new JButton();
                Cancelar.setText("Cancelar");
                Cancelar.setName(Comandos.getString("idFacturaEmitida"));
                Cancelar.setBackground(rojo);
                MouseListener mlAbre = new MouseListener() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        //System.out.println("Released!");
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        //System.out.println("Pressed!");
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        //System.out.println("Exited!");
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        //System.out.println("Entered!");
                    }

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            JButton source = (JButton) e.getSource();
                            idFacClien = Integer.parseInt(source.getName());
                            ResultSet Comandos = Funcion.Select(st, "SELECT *FROM factura_emitida  WHERE idfacturaEmitida=" + idFacClien + ";");
                            while (Comandos.next()) {
                                Variables.FechaFactura = Comandos.getString("FechaEmision");
                                Variables.FechaSistema= Comandos.getString("fechasistema");
                            }
                            Consulta();
                            Variables.guardar = false;
                            NuevoPdf pdf = new NuevoPdf("Factura.pdf");
                            pdf.main();
                            File myfile = new File("Factura.pdf");

                            Desktop.getDesktop().open(myfile);

                        } catch (Exception ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                };
                MouseListener mlCancelar = new MouseListener() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        //System.out.println("Released!");
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        //System.out.println("Pressed!");
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        //System.out.println("Exited!");
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        //System.out.println("Entered!");
                    }

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        JButton source = (JButton) e.getSource();
                        Variables.Cancelar = Integer.parseInt(source.getName());
                        String Comando = "UPDATE factura_emitida SET Observaciones='Factura Cancelada' WHERE idFacturaEmitida=" + Variables.Cancelar
                                + ";";
                        Funcion.Update(st, Comando);
                        jPanel11.removeAll();
                        PanelFacturas();
                        jPanel11.repaint();
                    }
                };
                Abre.addMouseListener(mlAbre);
                Cancelar.addMouseListener(mlCancelar);
                //Fuente del texto;
                FolioFactura.setFont(new Font("Verdana", Font.PLAIN, 13));
                FolioFactura.setForeground(gris);
                RFC.setFont(new Font("Verdana", Font.PLAIN, 13));
                RFC.setForeground(gris);
                Nombre.setFont(new Font("Verdana", Font.PLAIN, 13));
                Nombre.setForeground(gris);
                Direccion.setFont(new Font("Verdana", Font.PLAIN, 13));
                Direccion.setForeground(gris);
                Correo.setFont(new Font("Verdana", Font.PLAIN, 13));
                Correo.setForeground(gris);
                Fecha.setFont(new Font("Verdana", Font.PLAIN, 13));
                Fecha.setForeground(gris);
                /// Botones
                Abre.setFont(new Font("Verdana", Font.PLAIN, 15));
                Abre.setForeground(Color.white);
                Cancelar.setFont(new Font("Verdana", Font.PLAIN, 15));
                Cancelar.setForeground(Color.white);
                //Añadimos los label al panel correspondiente del cliente
                Panel.add(FolioFactura);
                Panel.add(RFC);
                Panel.add(Nombre);
                Panel.add(Direccion);
                Panel.add(Correo);
                Panel.add(Fecha);
                Panel.add(Abre);
                
                FolioFactura.setLocation(15, 5);
                FolioFactura.setSize(400, 45);
                
                RFC.setLocation(15, 25);
                RFC.setSize(400, 45);
                
                Nombre.setLocation(15, 45);
                Nombre.setSize(500, 45);
                
                Direccion.setLocation(15, 65);
                Direccion.setSize(650, 45);
                
                Correo.setLocation(15, 85);
                Correo.setSize(500, 45);               
                
                Fecha.setLocation(15, 105);
                Fecha.setSize(500, 45);
                /// Botones Tamaño y localizacion
                if (Variables.Tipo.equalsIgnoreCase("Administrador")) { // Verificamos que sea un Administrador
                    Panel.add(Cancelar);
                    Abre.setLocation(185, 160);
                    Abre.setSize(120, 30);
                    Cancelar.setLocation(350, 160);
                    Cancelar.setSize(120, 30);

                    if (Variables.Comentario.equalsIgnoreCase("Factura Cancelada")) {
                        Cancelar.setVisible(false);
                        Abre.setLocation(290, 160);
                        Abre.setSize(120, 30);
                    }

                } else {
                    Abre.setLocation(290, 160);
                    Abre.setSize(120, 30);
                }
                
                
                
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Dependiendo de cuantos clientes se agregaron, se ajusta el tamaño del panel principal para que el scroll llegue hasta ahi
        jPanel11.setPreferredSize(new Dimension(jPanel11.getWidth(), Altura + 300));
        
       
    }
//////////////////////////////////////////////////////////////////////
    //***
    public void Inicio(){
        scrollcuadro.setVisible(false);
        jPanel7.setVisible(false);
        jButton2.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton3.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jPanel6.setVisible(true);
        jButton1.setVisible(true);
        jButtonSave.setVisible(false);
        EnviarSAT.setVisible(false);
        //////////////////////////
        //**** Clientes
        jButton22.setVisible(false);
        jButton20.setVisible(false);
        jButton19.setVisible(false);
        jButton18.setVisible(false);
        jButton15.setVisible(false);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField19.setText("");
        EnviarSAT1.setVisible(false);

        /////////////////////////
        //**** Activar botones principales                       
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton24.setEnabled(true);
        jButton23.setEnabled(true);

    }
    public void Consulta(){
        try {
            Variables.claves.clear();
            Variables.cantidades.clear();
            Variables.preciosunitarios.clear();
            Variables.importes.clear();
            Variables.descripciones.clear();
            Variables.ums.clear();
            
            Comandos = Funcion.Select(st, "Select *from factura_emitida WHERE idFacturaEmitida=" + idFacClien + ";");// Consulta el RFC
            int folio_nota = 0;
            while (Comandos.next()) {
                folio_nota = Comandos.getInt("Folio");
                Variables.idCliente = (Integer.parseInt(Comandos.getObject("idCliente") + ""));
                Variables.Comentario = ((String) Comandos.getObject("Observaciones"));
            }
            
            
            Comandos = Funcion.Select(st, "Select *from cliente WHERE idCliente=" + Variables.idCliente + ";");// Consulta el RFC

            while (Comandos.next()) {
                Variables.RFC = ((String) Comandos.getObject("RFC"));
                Variables.NombreCliente = ((String) Comandos.getObject("NombreCliente"));
                Variables.Direccion = ((String) Comandos.getObject("Direccion"));
                Variables.delegacion = ((String) Comandos.getObject("Localidad"));
                Variables.municipio = ((String) Comandos.getObject("municipio"));
                Variables.Estado = ((String) Comandos.getObject("Estado"));
                Variables.codpostal = (Integer.parseInt(Comandos.getObject("codpostal") + ""));
                Variables.Correo = ((String) Comandos.getObject("correo"));
            }
            //Funcion.CerrarConsulta(Comandos);

            Comando = FuncionTienda.Select(stienda, "Select *from nota WHERE folio_nota=" + folio_nota + ";"); // Consulta la nota

            while (Comando.next()) {
                Variables.suma = ((Double) Double.parseDouble(Comando.getObject("suma") + ""));
                Variables.descuento = ((Double) Double.parseDouble(Comando.getObject("descuento") + ""));
                Variables.subtotal = ((Double) Double.parseDouble(Comando.getObject("subtotal") + ""));
                Variables.iva = ((Double) Double.parseDouble(Comando.getObject("iva") + ""));
                Variables.total = ((Double) Double.parseDouble(Comando.getObject("total") + ""));
                //System.out.println("Total : " + Variables.getTotal());
            }
            //FuncionTienda.CerrarConsulta(Comando);

            Comandoventas = FuncionTienda.Select(stienda, "Select *from venta WHERE clave_nota="
                    + folio_nota + ";");
            while (Comandoventas.next()) {
                Variables.claves.add(Integer.parseInt(Comandoventas.getObject("clave") + ""));
                Variables.cantidades.add(Integer.parseInt(Comandoventas.getObject("cantidad") + ""));
                Variables.preciosunitarios.add(Double.parseDouble(Comandoventas.getObject("precio_unitario") + ""));
                Variables.importes.add(Double.parseDouble(Comandoventas.getObject("importe") + ""));
                Variables.descripciones.add((String) Comandoventas.getObject("Descripcion"));
                Variables.ums.add((String) Comandoventas.getObject("unidad_de_medida"));
            }

            //FuncionTienda.CerrarConsulta(Comandoventas);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void FechaSistema(){
        String Fecha , Hora;
         //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        
        Fecha=(dia + "-" + (mes+1) + "-" + año);
        Hora= hora+":"+minuto+":"+segundo;
        
        Variables.FechaSistema= Fecha+" "+Hora;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdmUsuarios;
    private javax.swing.JPanel ConClientes;
    private javax.swing.JPanel ConFacturas;
    private javax.swing.JPanel EditarClientes;
    private javax.swing.JButton EnviarSAT;
    private javax.swing.JButton EnviarSAT1;
    private javax.swing.JPanel NueFactura;
    private javax.swing.JPanel Perfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    public static javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
