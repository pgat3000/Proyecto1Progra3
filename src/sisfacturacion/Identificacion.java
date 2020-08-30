/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfacturacion;

/**
 * Esta clase será usada en la clase cliente y en la clase empresa
 * Guardará toda la información requerida de una identificación física o jurídica según 
 * lo requiere el Ministrerio de Hacienda.
 * @author Joaquin
 */
public class Identificacion {
    private int tipo;
    private String numero;

    public Identificacion(int tipo, String numero) {
        //constructor de la clase identificacion
        if(tipo == 1 || tipo == 2){
           // 1 -> cedula fisica
           // 2 -> cedula juridica
           this.tipo = tipo;
        }
        this.numero = numero;
    }
     
}
