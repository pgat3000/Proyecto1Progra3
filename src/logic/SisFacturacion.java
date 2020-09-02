/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import Presentation.WindowProductos.Controller;
import Presentation.WindowProductos.Model;
import Presentation.WindowProductos.View;

/**
 *
 * @author Porras
 */
public class SisFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p = new Producto("Producto",1000);
        System.out.println(p.getDescripcionProducto()  + p.getPrecio());
        System.out.println((int)p.getCodigo());
         Model model = new Model();
        View view = new View();
        Controller controller= new Controller(model,view) ;
        view.setVisible(true);
    }
    
}
