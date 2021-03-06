/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;



/**
 *
 * @author Porras
 */
public class JavaXML extends Factura{

    public JavaXML(int Codigo, double total, int cantidad, String formaDePago, Fecha fechaVencimiento, Fecha diaActual, String ClaveElectronica, 
            String NumeroFacturaElectronica, int Plazo, Cliente cliente1, Fecha fecha, Producto producto, Empresa empresa) 
    {
        super(Codigo, total, cantidad, formaDePago, fechaVencimiento, diaActual, ClaveElectronica, 
                NumeroFacturaElectronica, Plazo, cliente1, fecha, producto, empresa);
    }

        
    @Override
    public void crearFactura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void crearReceptorXML(Cliente cliente){
        Element receptor = new Element("Receptor");
        
        Element nombre = new Element("Nombre ");
        nombre.setText(cliente.getNombre());
        receptor.addContent(nombre);
        
        Element id = new Element("Identificacion");
        id.addContent(new Element("Tipo").setText(Integer.toString(cliente.getID().getTipo())));
        id.addContent(new Element("Numero").setText(cliente.getID().getNumero()));
        receptor.addContent(id);
        
        Element telefono = new Element("Telefono");
        telefono.addContent(new  Element("NumTelefono").setText(Integer.toString(cliente.getNumTel())));
        receptor.addContent(telefono);
        
        Element direccion = new Element("Direccion");
        direccion.addContent(new Element("Provincia").setText(cliente.getUbicacion().getProvincia()));
        direccion.addContent(new Element("Canton").setText(cliente.getUbicacion().getCanton())); 
        receptor.addContent(direccion);
    }
    
    public void crearEmisorXML(Empresa empresa){
        Element emisor = new Element("Emisor");
        
        Element nomEmpresa = new Element("Nombre");
        emisor.addContent(nomEmpresa);
        
        Element id = new Element("Identificacion");
        id.addContent(new Element("Tipo").setText("1"));
        id.addContent(new Element("Numero").setText(empresa.getIDJurid()));
        emisor.addContent(id);
        
        Element direccion = new Element("Direccion").setText(empresa.getDireccion());
        emisor.addContent(direccion);
        
        Element telefono = new Element("Telefono");
        telefono.addContent(new  Element("NumTelefono").setText(Integer.toString(empresa.getNumTelefono())));
        emisor.addContent(telefono);
        
        Element pagweb = new Element("PaginaWeb").setText(empresa.getPagWeb());    
        emisor.addContent(pagweb); 
        
    }
    
    
}
