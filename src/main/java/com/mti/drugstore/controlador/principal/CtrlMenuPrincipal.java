/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.drugstore.controlador.principal;

import com.mti.drugstore.controlador.producto.CtrlBuscarProducto;
import com.mti.drugstore.modelos.DaoFormula;
import com.mti.drugstore.modelos.DaoMedicamento;
import com.mti.drugstore.modelos.DaoPresentacion;
import com.mti.drugstore.modelos.DaoSustanciaAct;
import com.mti.drugstore.vista.principal.VistaMenuPrincipal;
import com.mti.drugstore.vista.producto.VistaBuscarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author rascencio
 */
public class CtrlMenuPrincipal implements ActionListener
{
        VistaMenuPrincipal mainMenu = new VistaMenuPrincipal();
    
    public CtrlMenuPrincipal(VistaMenuPrincipal mainMenu)
    {
        this.mainMenu = mainMenu;
        this.mainMenu.jmiAdmonUser.addActionListener(this);
        this.mainMenu.jmiDB.addActionListener(this);
        this.mainMenu.jmiConfig.addActionListener(this);
        this.mainMenu.jmiExit.addActionListener(this);
        this.mainMenu.jmiProduct.addActionListener(this);
        this.mainMenu.jmiCliente.addActionListener(this);
        this.mainMenu.jmiVendedor.addActionListener(this);
        this.mainMenu.jmiDaySales.addActionListener(this);
        this.mainMenu.jmiSalesXProduct.addActionListener(this);
        this.mainMenu.jmiBestProduct.addActionListener(this);
        this.mainMenu.jmiReportXMonthXProduct.addActionListener(this);
        this.mainMenu.jmiReportXMonthXCustomer.addActionListener(this);
        this.mainMenu.jmiReportXYearXCustomer.addActionListener(this);
        this.mainMenu.jmiReportXYearXProduct.addActionListener(this);
        this.mainMenu.jmiDoInventario.addActionListener(this);
        this.mainMenu.jmiProductFaltante.addActionListener(this);
        this.mainMenu.jmiProductSobrante.addActionListener(this);
        this.mainMenu.jmiPedidos.addActionListener(this);
        this.mainMenu.jmiFacturasEmitidas.addActionListener(this);
        this.mainMenu.jmiPagoNomina.addActionListener(this);
        this.mainMenu.jmiRetiro.addActionListener(this);
        this.mainMenu.jmiCierre.addActionListener(this);
        this.mainMenu.jmiMedico.addActionListener(this);
        this.mainMenu.jmiVendedor.addActionListener(this);
        this.mainMenu.jmiInfo.addActionListener(this);
        this.mainMenu.jmiFace.addActionListener(this);
        this.mainMenu.jb_1.addActionListener(this);
        this.mainMenu.jb_2.addActionListener(this);
        this.mainMenu.jb_3.addActionListener(this);
        this.mainMenu.jb_4.addActionListener(this);
        this.mainMenu.jb_5.addActionListener(this);
        this.mainMenu.jb_6.addActionListener(this);
        this.mainMenu.jb_7.addActionListener(this);
        this.mainMenu.jb_8.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(e.getSource() == mainMenu.jb_1)
        { 
                VistaBuscarProducto viewProducts = new VistaBuscarProducto();
                DaoMedicamento medDAO = new DaoMedicamento();
                DaoPresentacion presentacionDAO = new DaoPresentacion();
                CtrlBuscarProducto ctrlFindProduct = new CtrlBuscarProducto(viewProducts, medDAO, presentacionDAO);
                viewProducts.setVisible(true);
        }
        if(e.getSource() == mainMenu.jmiExit)
        {
            int rpta = JOptionPane.showConfirmDialog(mainMenu, "¿Esta seguro que desea salir del sistema?");
            
            switch(rpta)
            {
                case 0:
                    mainMenu.dispose();
                    break;
                case 1:
                    break;
                case 2:
                    break;
            }
        }
    }
}