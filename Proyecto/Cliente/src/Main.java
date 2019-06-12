
import Interfaces.Cliente;
import Interfaces.ClienteHelper;
import Interfaces.Servidor;
import Interfaces.ServidorHelper;
import Rest.Jersey;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author k_ike
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    String ruta;
    String nombre;
    String extension;
    ORB orb;
    org.omg.CORBA.Object objRef;
    NamingContextExt ncRef;
    Servidor servidor;
    POA rootpoa;
    ClienteOBJ clienteOBJ;
    org.omg.CORBA.Object ref2;
    Cliente href2;
    NamingContextExt ncRef2;
    NameComponent path2[];
    Cliente cliente;
    Jersey jersey;
    alumnos alumno;
    File file;
    String imagenCodificada;

    public Main(String args[]) {
        initComponents();
        ruta = "";
        nombre = "";
        jersey = new Jersey();
        btnBuscarImg.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSubir.setEnabled(false);
        btnSalir.setEnabled(false);

        Font font = lblNoCuenta.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lblNoCuenta.setFont(font.deriveFont(attributes));
        this.setLocationRelativeTo(null);
        this.setTitle("Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
        try {
            orb = ORB.init(args, null);
            objRef = orb.resolve_initial_references("NameService");
            ncRef = NamingContextExtHelper.narrow(objRef);
            servidor = ServidorHelper.narrow(ncRef.resolve_str("ABC"));

        } catch (Exception e) {
            System.out.println("Hello Client exception: " + e);
            e.printStackTrace();
        }

    }

    public void close() {
        cerrarSesion();
        jersey.close();
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }

    public void cerrarSesion() {
        servidor.borrarCliente(cliente);
        btnBuscarImg.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSubir.setEnabled(false);
        btnSalir.setEnabled(false);
        txtNumControlRegistro.setEnabled(true);
        txtNombreRegistro.setEnabled(true);
        txtPasswordRegistro.setEnabled(true);
        txtNumControlEntrar.setEnabled(true);
        txtPasswordEntrar.setEnabled(true);
        lblNoCuenta.setEnabled(true);
        btnEntrar.setEnabled(true);
        btnRegistrarse.setEnabled(true);
        Panel.setSelectedIndex(0);
        cliente = null;
    }

    public boolean esValida(String password) {
        if (password.length() == 8) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esValido(String numControl) {
        if (numControl.length() == 9) {
            return true;
        } else {
            return false;
        }
    }
    
     //CODIFICA LA IMAGEN A STRING
    private String codificaImagen(File file) throws Exception{
            FileInputStream fileInputStreamReader = new FileInputStream(file);
            byte[] bytes = new byte[(int)file.length()];
            fileInputStreamReader.read(bytes);
            return new String(Base64.getEncoder().encode(bytes), "UTF-8");
    }

    public void crearObjeto(String nombre) throws InvalidName, AdapterInactive, ServantNotActive, WrongPolicy, org.omg.CosNaming.NamingContextPackage.InvalidName, org.omg.CosNaming.NamingContextPackage.InvalidName, NotFound, CannotProceed {
        //Creacion del objeto local 
        rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
        rootpoa.the_POAManager().activate();

        clienteOBJ = new ClienteOBJ(nombre, txtNotificaciones);
        clienteOBJ.setORB(orb);

        // get object reference from the servant
        ref2 = rootpoa.servant_to_reference(clienteOBJ);
        href2 = ClienteHelper.narrow(ref2);

        //org.omg.CORBA.Object objRef2 =  orb.resolve_initial_references("NameService");
        ncRef2 = NamingContextExtHelper.narrow(objRef);

        path2 = ncRef2.to_name("ABCD");
        ncRef2.rebind(path2, href2);

        cliente = ClienteHelper.narrow(ncRef2.resolve_str("ABCD"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Panel = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtNumControlEntrar = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPasswordEntrar = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNoCuenta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNumControlRegistro = new javax.swing.JTextField();
        txtNombreRegistro = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPasswordRegistro = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarImg = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblRuta = new javax.swing.JLabel();
        btnSubir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotificaciones = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 0, 0));
        Panel.setForeground(new java.awt.Color(0, 51, 51));
        Panel.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        txtNumControlEntrar.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        txtNumControlEntrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnEntrar.setBackground(new java.awt.Color(0, 153, 0));
        btnEntrar.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(51, 51, 51));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar sesión");

        txtPasswordEntrar.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        txtPasswordEntrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Número de control");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Contraseña");

        lblNoCuenta.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        lblNoCuenta.setForeground(new java.awt.Color(255, 255, 204));
        lblNoCuenta.setText("Aún no tengo una cuenta");
        lblNoCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNoCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNoCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNoCuentaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumControlEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasswordEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel4)))
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNoCuenta)
                        .addGap(313, 313, 313))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addComponent(txtNumControlEntrar)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtPasswordEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNoCuenta)
                .addGap(31, 31, 31))
        );

        Panel.addTab("Iniciar sesión", jPanel3);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        txtNumControlRegistro.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        txtNumControlRegistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumControlRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumControlRegistroActionPerformed(evt);
            }
        });

        txtNombreRegistro.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        txtNombreRegistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnRegistrarse.setBackground(new java.awt.Color(51, 153, 0));
        btnRegistrarse.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(51, 51, 51));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Registrarse");

        txtPasswordRegistro.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        txtPasswordRegistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Contraseña");

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Número de control");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombreRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(txtNumControlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(txtPasswordRegistro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(332, 332, 332))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(341, 341, 341))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(324, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(288, 288, 288)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(58, 58, 58)
                .addComponent(txtNumControlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPasswordRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(jLabel7)
                    .addContainerGap(361, Short.MAX_VALUE)))
        );

        Panel.addTab("Registrarse", jPanel2);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btnBuscarImg.setBackground(new java.awt.Color(51, 153, 0));
        btnBuscarImg.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnBuscarImg.setForeground(new java.awt.Color(51, 51, 51));
        btnBuscarImg.setText("Buscar imagen");
        btnBuscarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarImgActionPerformed(evt);
            }
        });

        lblImagen.setBackground(new java.awt.Color(255, 255, 255));
        lblImagen.setForeground(new java.awt.Color(255, 255, 255));

        lblRuta.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        lblRuta.setForeground(new java.awt.Color(255, 255, 204));
        lblRuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRuta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSubir.setBackground(new java.awt.Color(51, 153, 0));
        btnSubir.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnSubir.setForeground(new java.awt.Color(51, 51, 51));
        btnSubir.setText("Subir imagen");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 153, 0));
        btnEliminar.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(51, 51, 51));
        btnEliminar.setText("Eliminar imagen");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtNotificaciones.setEditable(false);
        txtNotificaciones.setBackground(new java.awt.Color(255, 255, 204));
        txtNotificaciones.setColumns(20);
        txtNotificaciones.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        txtNotificaciones.setRows(5);
        jScrollPane1.setViewportView(txtNotificaciones);

        btnSalir.setBackground(new java.awt.Color(51, 153, 0));
        btnSalir.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 573, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBuscarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(98, 98, 98)
                                        .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        Panel.addTab("Manejo de imágenes", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarImgActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showDialog(null, "Seleccionar");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ImageIcon imageIcon = new ImageIcon(chooser.getSelectedFile().getAbsolutePath()); // load the image to a imageIcon
            Image image = imageIcon.getImage(); // transform it 
            Image newimg = image.getScaledInstance(250, 200, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg);  // transform it back
            lblImagen.setIcon(imageIcon);
            ruta = chooser.getSelectedFile().getAbsolutePath();
            nombre = chooser.getSelectedFile().getName();
            extension= nombre.substring(nombre.lastIndexOf("."));
            lblRuta.setText(nombre);
        }
    }//GEN-LAST:event_btnBuscarImgActionPerformed

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        // TODO add your handling code here:
        if (ruta.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(btnSubir, "Elige una imagen", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        } else {
            file=new File(ruta);
            try {
               imagenCodificada=codificaImagen(file);
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (servidor.subirImagen(imagenCodificada,nombre, extension, cliente)) {
                lblImagen.setIcon(null);
                ruta = "";
                nombre = "";
                extension="";
                imagenCodificada="";
                file=null;
                lblRuta.setText(nombre);
            }
        }
    }//GEN-LAST:event_btnSubirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(btnEliminar, "Elige una imagen", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (servidor.eliminarImagen("/SistemasDistribuidos/" + nombre, cliente)) {
                lblImagen.setIcon(null);
                ruta = "";
                nombre = "";
                lblRuta.setText(nombre);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        cerrarSesion();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        if (!txtNumControlEntrar.getText().isEmpty() && esValido(txtNumControlEntrar.getText())) {
            if (!txtPasswordEntrar.getText().isEmpty() && esValida(txtPasswordEntrar.getText())) {
                alumno = new alumnos();
                alumno = jersey.find_XML(alumnos.class, txtNumControlEntrar.getText());
                if (alumno == null) {
                    JOptionPane.showMessageDialog(null, "Alumno no registrado", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (alumno.password.equals(txtPasswordEntrar.getText())) {
                        JOptionPane.showMessageDialog(null, "Bienvenido", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                        try {
                            crearObjeto(alumno.getNombre());
                        } catch (InvalidName ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (AdapterInactive ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ServantNotActive ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (WrongPolicy ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (org.omg.CosNaming.NamingContextPackage.InvalidName ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (NotFound ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (CannotProceed ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        servidor.escribirCliente(cliente);
                        txtNumControlEntrar.setText("");
                        txtPasswordEntrar.setText("");
                        btnBuscarImg.setEnabled(true);
                        btnEliminar.setEnabled(true);
                        btnSubir.setEnabled(true);
                        btnSalir.setEnabled(true);
                        txtNumControlRegistro.setEnabled(false);
                        txtNombreRegistro.setEnabled(false);
                        txtPasswordRegistro.setEnabled(false);
                        txtNumControlEntrar.setEnabled(false);
                        txtPasswordEntrar.setEnabled(false);
                        lblNoCuenta.setEnabled(false);
                        btnEntrar.setEnabled(false);
                        btnRegistrarse.setEnabled(false);
                        Panel.setSelectedIndex(2);
                    } else {
                        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(txtPasswordRegistro, "La contraseña debe ser de 8 dígitos", "Notificación", JOptionPane.INFORMATION_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(txtNumControlRegistro, "Por favor verifica tu numero de control", "Notificación", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
        if (!txtNumControlRegistro.getText().isEmpty() && esValido(txtNumControlRegistro.getText())) {
            if (!txtNombreRegistro.getText().isEmpty()) {
                if (!txtPasswordRegistro.getText().isEmpty() && esValida(txtPasswordRegistro.getText())) {
                    alumno = new alumnos();
                    alumno = jersey.find_XML(alumnos.class, txtNumControlRegistro.getText());
                    if (alumno == null) {
                        alumno = new alumnos();
                        alumno.setNumcontrol(txtNumControlRegistro.getText());
                        alumno.setNombre(txtNombreRegistro.getText());
                        alumno.setPassword(txtPasswordRegistro.getText());
                        jersey.create_XML(alumno);
                        alumno = jersey.find_XML(alumnos.class, txtNumControlRegistro.getText());
                        if (alumno == null) {
                            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Bienvenido ya puedes iniciar sesion", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                            txtNumControlRegistro.setText("");
                            txtNombreRegistro.setText("");
                            txtPasswordRegistro.setText("");
                            Panel.setSelectedIndex(0);
                            alumno = null;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El alumno ya existe", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(txtPasswordRegistro, "La contraseña debe ser de 8 dígitos", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(txtNombreRegistro, "Por favor verifica tu nombre", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(txtNumControlRegistro, "Por favor verifica tu numero de control", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void txtNumControlRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumControlRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumControlRegistroActionPerformed

    private void lblNoCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoCuentaMouseClicked
        Panel.setSelectedIndex(1);
    }//GEN-LAST:event_lblNoCuentaMouseClicked

    private void lblNoCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoCuentaMouseEntered
        // TODO add your handling code here:
        lblNoCuenta.setText("Haz click para registrarte");
        lblNoCuenta.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_lblNoCuentaMouseEntered

    private void lblNoCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoCuentaMouseExited
        // TODO add your handling code here:
         lblNoCuenta.setText("Aún no tengo una cuenta");
        lblNoCuenta.setForeground(new Color(255,255,204));
    }//GEN-LAST:event_lblNoCuentaMouseExited

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(args).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Panel;
    private javax.swing.JButton btnBuscarImg;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSubir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNoCuenta;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JTextField txtNombreRegistro;
    private javax.swing.JTextArea txtNotificaciones;
    private javax.swing.JTextField txtNumControlEntrar;
    private javax.swing.JTextField txtNumControlRegistro;
    private javax.swing.JPasswordField txtPasswordEntrar;
    private javax.swing.JPasswordField txtPasswordRegistro;
    // End of variables declaration//GEN-END:variables
}
