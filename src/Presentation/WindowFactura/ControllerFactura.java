/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowFactura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Joaquin
 */
public class ControllerFactura implements ActionListener, MouseListener{
    ModelFactura model;
    ViewFactura view;
    

    public ControllerFactura(ModelFactura facturas_model, ViewFactura facturas_view) {
        this.model = facturas_model;
        this.view = facturas_view;
    }
   public void show(){
        view.setVisible(true);
    } 
    @Override
    public void actionPerformed(ActionEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
}
