/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.vista.principal;

import com.mti.drugstore.fecha.FechaYHora;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author rascencio
 */
public class VistaMenuPrincipal extends JFrame implements Runnable
{	
    private JMenuBar jmBar;
    private JMenu  jmSystem;
    
    public JMenuItem jmiAdmonUser;
    public JMenuItem jmiDB;
    public JMenuItem jmiConfig;
    public JMenuItem jmiExit;
    
    private JMenu jmRegister;
    public JMenuItem jmiProduct;
    public JMenuItem jmiVendor;    
    public JMenuItem jmiCliente;
    
    private JMenu jmInformes;
    public JMenuItem jmiDaySales;
    public JMenuItem jmiSalesXProduct;
    public JMenuItem jmiBestProduct;
    private JMenu jmReportXMonth;
    public JMenuItem jmiReportXMonthXProduct;
    public JMenuItem jmiReportXMonthXCustomer;
    private JMenu jmReportXYear;
    public JMenuItem jmiReportXYearXProduct;
    public JMenuItem jmiReportXYearXCustomer;
    private JMenu jmListado;
    public JMenuItem jmiListOfCustomers;
    public JMenuItem jmiListOfVendors;
    public JMenuItem jmiListOfProducts;
    private JMenu jmGraphics;
    public JMenuItem jmiGraphLines;
    public JMenuItem jmiGraphBar;
    public JMenuItem jmiGraphCake;
    
    private JMenu jmOperaciones;
    private JMenu jmInventarios;
    public JMenuItem jmiDoInventario;
    public JMenuItem jmiProductFaltante;
    public JMenuItem jmiProductSobrante;
    public JMenuItem jmiPedidos;
    
    private JMenu jmFacturacion;
    public JMenuItem jmiFacturasEmitidas;
    
    private JMenu jmPagos;
    public JMenuItem jmiPagoNomina;
    public JMenuItem jmiRetiro;
    public JMenuItem jmiCierre;
    
    private JMenu jmRH;
    public JMenuItem jmiVendedor;
    public JMenuItem jmiMedico;
    
    private JMenu jmAbout;
    public JMenuItem jmiInfo;  
    public JMenuItem jmiFace;
    
    private JSeparator jSep_1;
    private JSeparator jSep_2;
    private JSeparator jSep_3;
    private JSeparator jSep_4;
    private JSeparator jSep_5;
    private JSeparator jSep_6;
    private JSeparator jSep_7;
    private JSeparator jSep_8;
    private JSeparator jSep_9;
    private JSeparator jSep_10;
    private JSeparator jSep_11;
    private JSeparator jSep_12;
    private JSeparator jSep_13;
    private JSeparator jSep_14;
	
    private JPanel jpIzq;
    private JPanel jpUsuario;
    private JPanel jpBienvenido;
    private JPanel jpOptions;
    private Border lowerBorder;
    private Border raisedBorder;
    private TitledBorder titleUsuario;
    private TitledBorder titleBienvenido;   
    private JLabel jlSalutem;
	
    private JLabel jlName;
    public JLabel jlNameUser;
    private JLabel jlId;
    public JLabel jlIdUser;
    public JLabel jlImageUser;
    private JLabel jlCalendar;
    private JLabel jlFecha;
    private JLabel jlClock;
    private JLabel jlHora;
	
    private Thread h1;
    private FechaYHora clock;

    public JButton jb_1;
    public JButton jb_2;
    public JButton jb_3;
    public JButton jb_4;
    public JButton jb_5;
    public JButton jb_6;
    public JButton jb_7;
    public JButton jb_8;
    public JButton jb_9;
    public JButton jb_10;

    private String pathImageIcons = "src/main/resources/img/icons/";
    private String pathImageIconsMin = "src/main/resources/img/iconsMin/";
    private String pathImageSalutem = "src/main/resources/img/imageSalutem/";
    
    public VistaMenuPrincipal()
    {
    	initComponents();
	h1 = new Thread(this);
	h1.start();
    }
	
    public void initComponents()
    {
	setLayout(null);
	
	clock = new FechaYHora();
	
	jmBar = new JMenuBar();
	setJMenuBar(jmBar);         
        
        jmSystem = new JMenu();
	jmSystem.setText("Sistema");
	jmSystem.setIcon(new ImageIcon(pathImageIconsMin+"Pc.png"));
        jmBar.add(jmSystem);        
	
        jmiAdmonUser = new JMenuItem();
	jmiAdmonUser.setText("Administrador Usuarios");
	jmiAdmonUser.setIcon(new ImageIcon(pathImageIconsMin+"CopyUserSettings.png"));
        jmSystem.add(jmiAdmonUser);        
        
        jSep_1 = new JSeparator();
        jmSystem.add(jSep_1);
        
        jmiDB = new JMenuItem();
        jmiDB.setText("Base de Datos");
	jmiDB.setIcon(new ImageIcon(pathImageIconsMin+"Inicializar.png"));
        jmSystem.add(jmiDB);
        
        jSep_2 = new JSeparator();
        jmSystem.add(jSep_2);
	
        jmiConfig = new JMenuItem();
        jmiConfig.setText("Configuraciones");
	jmiConfig.setIcon(new ImageIcon(pathImageIconsMin+"config.png"));
        jmSystem.add(jmiConfig);
        
        jSep_3 = new JSeparator();
        jmSystem.add(jSep_3);
        
        jmiExit = new JMenuItem();        
        jmiExit.setText("Salir");
	jmiExit.setIcon(new ImageIcon(pathImageIconsMin+"del.png"));
        jmSystem.add(jmiExit);
        
        jmRegister = new JMenu();        
        jmRegister.setText("Registros");
	jmRegister.setIcon(new ImageIcon(pathImageIconsMin+"Registros.png"));
        jmBar.add(jmRegister);
        
        jmiProduct = new JMenuItem();
	jmiProduct.setText("Registro Productos");
	jmiProduct.setIcon(new ImageIcon(pathImageIconsMin+"Productos.png"));
        jmRegister.add(jmiProduct);
	
	jSep_4 = new JSeparator();
	jmRegister.add(jSep_4);
	
	jmiVendor = new JMenuItem();
	jmiVendor.setText("Registro Proveedores");
	jmiVendor.setIcon(new ImageIcon(pathImageIconsMin+"proveedores_icono.png"));
	jmRegister.add(jmiVendor);
		
	jSep_5 = new JSeparator();
	jmRegister.add(jSep_5);
	
	jmiCliente = new JMenuItem();
	jmiCliente.setText("Registro Clientes");
	jmiCliente.setIcon(new ImageIcon(pathImageIconsMin+"Clientes.png"));
	jmRegister.add(jmiCliente);
	
	jSep_7 = new JSeparator();
	jmRegister.add(jSep_7);
        
        jmInformes = new JMenu();
        jmInformes.setText("Reportes");
        jmInformes.setIcon(new ImageIcon(pathImageIconsMin+"Consultar.png"));
        jmBar.add(jmInformes);
        
        jmiDaySales = new JMenuItem();
        jmiDaySales.setText("Venta del día");
        jmiDaySales.setIcon(new ImageIcon(pathImageIconsMin+"VentaDelDia.png"));
        jmInformes.add(jmiDaySales);
                
        jmiSalesXProduct = new JMenuItem();
        jmiSalesXProduct.setText("Ventas X producto");
        jmiSalesXProduct.setIcon(new ImageIcon(pathImageIconsMin+"VentaInfoProducto.png"));
        jmInformes.add(jmiSalesXProduct);       
        
        jmiBestProduct = new JMenuItem();
        jmiBestProduct.setText("Mejor Producto");
        jmiBestProduct.setIcon(new ImageIcon(pathImageIconsMin+"MejorProducto.png"));
        jmInformes.add(jmiBestProduct);
        
        jSep_6 = new JSeparator();
        jmInformes.add(jSep_6);
        
        jmReportXMonth = new JMenu();
        jmReportXMonth.setText("Reporte X Mes");
        jmInformes.add(jmReportXMonth);
        
        jmiReportXMonthXProduct = new JMenuItem();
        jmiReportXMonthXProduct.setText("Producto");
        jmReportXMonth.add(jmiReportXMonthXProduct);
        
        jmiReportXMonthXCustomer = new JMenuItem();
        jmiReportXMonthXCustomer.setText("Cliente");
        jmReportXMonth.add(jmiReportXMonthXCustomer);
        
        jmReportXYear = new JMenu();
        jmReportXYear.setText("Reporte X Año");
        jmInformes.add(jmReportXYear);
        
        jSep_8 = new JSeparator();
        jmInformes.add(jSep_8);
        
        jmiReportXYearXProduct = new JMenuItem();
        jmiReportXYearXProduct.setText("Producto");
        jmReportXYear.add(jmiReportXYearXProduct);
        
        jmiReportXYearXCustomer = new JMenuItem();
        jmiReportXYearXCustomer.setText("Cliente");
        jmReportXYear.add(jmiReportXYearXCustomer);
        
        jmListado = new JMenu();
        jmListado.setText("Listados");
        jmListado.setIcon(new ImageIcon(pathImageIconsMin+"BoxList.png"));
        jmInformes.add(jmListado);
                
        jmiListOfCustomers = new JMenuItem();
        jmiListOfCustomers.setText("Lista de clientes");
        jmiListOfCustomers.setIcon(new ImageIcon(pathImageIconsMin+"IconList.png"));
        jmListado.add(jmiListOfCustomers);        
        
        jmiListOfVendors = new JMenuItem();
        jmiListOfVendors.setText("Lista de proveedores");
        jmiListOfVendors.setIcon(new ImageIcon(pathImageIconsMin+"IconList.png"));
        jmListado.add(jmiListOfVendors);
        
        jmiListOfProducts = new JMenuItem();
        jmiListOfProducts.setText("Lista de productos");
        jmiListOfProducts.setIcon(new ImageIcon(pathImageIconsMin+"IconList.png"));
        jmListado.add(jmiListOfProducts);
        
        jSep_9 = new JSeparator();
        jmInformes.add(jSep_9);
        
        jmGraphics = new JMenu();
        jmGraphics.setText("Gráficas");
        jmGraphics.setIcon(new ImageIcon(pathImageIconsMin+"48px-Crystal_Clear_mimetype_log.png"));
        jmInformes.add(jmGraphics);
        
        jmiGraphLines = new JMenuItem();
        jmiGraphLines.setText("Gráfica de líneas");
        jmiGraphLines.setIcon(new ImageIcon(pathImageIconsMin+"GraficoLineal.png"));
        jmGraphics.add(jmiGraphLines);
        
        jmiGraphBar = new JMenuItem();
        jmiGraphBar.setText("Gráfica de barras");
        jmiGraphBar.setIcon(new ImageIcon(pathImageIconsMin+"graficoBarras.png"));
        jmGraphics.add(jmiGraphBar);
        
        jmiGraphCake = new JMenuItem();
        jmiGraphCake.setText("Gráfica de pastel");
        jmiGraphCake.setIcon(new ImageIcon(pathImageIconsMin+"pie-chart-149727_640.png"));
        jmGraphics.add(jmiGraphCake);
	
	jmOperaciones = new JMenu();
	jmOperaciones.setText("Operaciones");
	jmOperaciones.setIcon(new ImageIcon(pathImageIconsMin+"Procesos.png"));
	jmBar.add(jmOperaciones);
	
        jmInventarios = new JMenu();
        jmInventarios.setText("Inventarios");
        jmInventarios.setIcon(new ImageIcon(pathImageIconsMin+"Notepad.png"));
        jmOperaciones.add(jmInventarios);
        
        jmiDoInventario = new JMenuItem();
        jmiDoInventario.setText("Hacer Inventario");
        jmiDoInventario.setIcon(new ImageIcon(pathImageIconsMin+"servicios_auditoria_icono - copia.png"));
        jmInventarios.add(jmiDoInventario);
        
        jmiProductFaltante = new JMenuItem();
        jmiProductFaltante.setText("Productos Faltantes");
        jmiProductFaltante.setIcon(new ImageIcon(pathImageIconsMin+"48px-Crystal_Clear_action_edit_remove.png"));
        jmInventarios.add(jmiProductFaltante);
        
        jmiProductSobrante = new JMenuItem();
        jmiProductSobrante.setText("Productos Sobrantes");
        jmiProductSobrante.setIcon(new ImageIcon(pathImageIconsMin+"48px-Crystal_Clear_action_edit_add.png"));
        jmInventarios.add(jmiProductSobrante);
        
        jSep_10 = new JSeparator();
        jmOperaciones.add(jSep_10);
        
	jmiPedidos = new JMenuItem();
	jmiPedidos.setText("Pedidos");
	jmiPedidos.setIcon(new ImageIcon(pathImageIconsMin+"pedidosMin.png"));
	jmOperaciones.add(jmiPedidos);
        
        jmFacturacion = new JMenu();
        jmFacturacion.setText("Facturación");
        jmFacturacion.setIcon(new ImageIcon(pathImageIconsMin+"CarritoCompra.png"));
        jmBar.add(jmFacturacion);
        
        jmiFacturasEmitidas = new JMenuItem();
        jmiFacturasEmitidas.setText("Facturas emitidas");
        jmiFacturasEmitidas.setIcon(new ImageIcon(pathImageIconsMin+"Facturas.png"));
        jmFacturacion.add(jmiFacturasEmitidas);
        
        jmPagos = new JMenu();
        jmPagos.setText("Pagos");
        jmPagos.setIcon(new ImageIcon(pathImageIconsMin+"48px-Crystal_Clear_app_mylinspire.png"));
        jmBar.add(jmPagos);
        
        jmiPagoNomina = new JMenuItem();
        jmiPagoNomina.setText("Pago Nomina");
        jmiPagoNomina.setIcon(new ImageIcon(pathImageIconsMin+"money.png"));
        jmPagos.add(jmiPagoNomina);
        
        jSep_11 = new JSeparator();
        jmPagos.add(jSep_11);
        
        jmiRetiro = new JMenuItem();
        jmiRetiro.setText("Retiro de efectivo");
        jmiRetiro.setIcon(new ImageIcon(pathImageIconsMin+"Retiro.png"));
        jmPagos.add(jmiRetiro);
        
        jSep_12 = new JSeparator();
        jmPagos.add(jSep_12);
        
        jmiCierre = new JMenuItem();
        jmiCierre.setText("Cierre de caja");
        jmiCierre.setIcon(new ImageIcon(pathImageIconsMin+"CierreCaja.png"));
        jmPagos.add(jmiCierre);
        
        jmRH = new JMenu();
        jmRH.setText("RRHH");
        jmRH.setIcon(new ImageIcon(pathImageIconsMin+"RecursosHumanos.png"));
        jmBar.add(jmRH);
        
        jmiVendedor = new JMenuItem();
        jmiVendedor.setText("Registro Vendedor");
        jmiVendedor.setIcon(new ImageIcon(pathImageIconsMin+"Vendedor.png"));
        jmRH.add(jmiVendedor);
        
        jSep_13 = new JSeparator();
        jmRH.add(jSep_13);
        
        jmiMedico = new JMenuItem();
        jmiMedico.setText("Registro Medico");
        jmiMedico.setIcon(new ImageIcon(pathImageIconsMin+"medico.png"));
        jmRH.add(jmiMedico);
	
	jmAbout = new JMenu();
	jmAbout.setText("Acerca");
	jmAbout.setIcon(new ImageIcon(pathImageIconsMin+"Informacion.png"));
	jmBar.add(jmAbout);
	
	jmiInfo = new JMenuItem();
	jmiInfo.setText("Más Información");
	jmiInfo.setIcon(new ImageIcon(pathImageIconsMin+"Informacion.png"));
	jmAbout.add(jmiInfo);
	
        jSep_14 = new JSeparator();
        jmAbout.add(jSep_14);
        
        jmiFace= new JMenuItem();
	jmiFace.setText("Facebook");
	jmiFace.setIcon(new ImageIcon(pathImageIconsMin+"Facebook.png"));
	jmAbout.add(jmiFace);
        
	jlSalutem = new JLabel();
        jlSalutem.setIcon(new ImageIcon(pathImageSalutem+"logo.png"));
        
	jlSalutem.setBounds(425, 20, 645, 652);
	add(jlSalutem);
	
	raisedBorder = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
	lowerBorder = BorderFactory.createLoweredBevelBorder();
	titleUsuario = BorderFactory.createTitledBorder(lowerBorder,"Usuario");
	titleUsuario.setTitleJustification(TitledBorder.CENTER);
	titleBienvenido = BorderFactory.createTitledBorder(lowerBorder,"Bienvenido");
	titleBienvenido.setTitleJustification(TitledBorder.CENTER);
	
	jpIzq = new JPanel();
	jpIzq.setLayout(null);
	jpIzq.setBorder(raisedBorder);
	jpIzq.setBounds(10, 10, 300, 700);
	add(jpIzq);
	
	jpUsuario = new JPanel();
	jpUsuario.setLayout(null);
	jpUsuario.setBorder(titleUsuario);
	jpUsuario.setBounds(10, 10, 280, 230);
	jpIzq.add(jpUsuario);
	
	jlName = new JLabel();
	jlName.setText("Nombre:");
	jlName.setBounds(10, 20, 80, 20);
	jpUsuario.add(jlName);
	
	jlNameUser = new JLabel();
	jlNameUser.setText("Nombre Usuario");
	jlNameUser.setBounds(100, 20, 120, 20);
	jpUsuario.add(jlNameUser);
		
	jlId = new JLabel();
	jlId.setText("ID Usuario:");
	jlId.setBounds(10, 50, 80, 20);
	jpUsuario.add(jlId);	
	
	jlIdUser = new JLabel();
	jlIdUser.setText("ID Usuario");
	jlIdUser.setBounds(100, 50, 80, 20);
	jpUsuario.add(jlIdUser);
	
	jlImageUser = new JLabel();
	jlImageUser.setIcon(new ImageIcon(pathImageIcons+"femaleUser.png"));
	jlImageUser.setBounds(90, 100, 100, 100);
	jpUsuario.add(jlImageUser);
	
	jpBienvenido = new JPanel();
	jpBienvenido.setLayout(null);
	jpBienvenido.setBorder(titleBienvenido);
	jpBienvenido.setBounds(10, 240, 280, 70);
	jpIzq.add(jpBienvenido);
		
	jlCalendar = new JLabel();
	jlCalendar.setIcon(new ImageIcon(pathImageIconsMin+"calendar.png"));
	jlCalendar.setBounds(10, 20, 16, 20);
	jpBienvenido.add(jlCalendar);
	
	jlFecha = new JLabel();
	jlFecha.setText(clock.getFechaActual());
	jlFecha.setBounds(35, 20, 100, 20);
	jpBienvenido.add(jlFecha);
	
	jlHora = new JLabel();
	jlHora.setBounds(185, 20, 100, 20);
	jpBienvenido.add(jlHora);
		
	jlClock = new JLabel();
	jlClock.setIcon(new ImageIcon(pathImageIconsMin+"clock.png"));
	jlClock.setBounds(155, 20, 16, 20);
	jpBienvenido.add(jlClock);
	
	jpOptions = new JPanel();
	jpOptions.setLayout(null);
	jpOptions.setBorder(lowerBorder);
	jpOptions.setBounds(10, 320, 280, 370);
	jpIzq.add(jpOptions);
		
	jb_1 = new JButton();
	jb_1.setText("Productos");
	jb_1.setIcon(new ImageIcon(pathImageIcons+"Productos.png"));
	jb_1.setBounds(1175, 10, 175, 55);
        add(jb_1);
	
	jb_2 = new JButton();
	jb_2.setText("Proveedores");
	jb_2.setIcon(new ImageIcon(pathImageIcons+"proveedores_icono.png"));
	jb_2.setBounds(1175, 85, 175, 55);
	add(jb_2);
	
	jb_3 = new JButton();
	jb_3.setText("Medicos");
	jb_3.setIcon(new ImageIcon(pathImageIcons+"medico.png"));
	jb_3.setBounds(1175, 155, 175, 55);
	add(jb_3);		
	
	jb_4 = new JButton();
	jb_4.setText("Agenda");
	jb_4.setIcon(new ImageIcon(pathImageIcons+"agenda.png"));
	jb_4.setBounds(1175, 225, 175, 55);
	add(jb_4);
	
	jb_5 = new JButton();
	jb_5.setText("Clientes");
	jb_5.setIcon(new ImageIcon(pathImageIcons+"Clientes.png"));
	jb_5.setBounds(1175, 295, 175, 55);
	add(jb_5);
	
	jb_6 = new JButton();
	jb_6.setText("Facturación");
	jb_6.setIcon(new ImageIcon(pathImageIcons+"Facturacion.png"));
	jb_6.setBounds(1175, 365, 175, 55);
        add(jb_6);
	
	jb_7 = new JButton();
	jb_7.setText("Vendedores");
	jb_7.setIcon(new ImageIcon(pathImageIcons+"Vendedor.png"));
	jb_7.setBounds(1175, 435, 175, 55);
	add(jb_7);
	
	jb_8 = new JButton();
	jb_8.setText("Información");
	jb_8.setIcon(new ImageIcon(pathImageIcons+"InformacionIcono.png"));
	jb_8.setBounds(1175, 505, 175, 55);
	add(jb_8);
	
	setTitle("SALUTEM");        
	setMinimumSize(new Dimension(1366,768));
        setMaximumSize(getMaximumSize());
	setDefaultCloseOperation(EXIT_ON_CLOSE);			
        setLocationRelativeTo(null);
    }

   @Override
    public void run() 
    {
	// TODO Auto-generated method stub
	
	Thread ct = Thread.currentThread();
	
	while(ct==h1)
	{
            String horaComplete = clock.getHoraActual();
            jlHora.setText(horaComplete);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
		jlHora.setText("falla hora");
            }
	}
    } 
}
