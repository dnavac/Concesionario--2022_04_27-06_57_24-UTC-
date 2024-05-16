/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario.venta;

import concesionario.vehiculo.Vehiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class MenuVenta {
    ArrayList<Venta> listaVenta = new ArrayList<>();
    String menu="";
    int opcion;
    String nombrecompleto, cedula;
     int cantidad, precio;
    public void venta(){
     do{   
            // Le indicamos al usuario cuales son sus opciones:
           menu="";
           menu+="********* Menú *********\n";
           menu+=" INGRESE LA OPCION \n";
           menu+=" 1 - Registrar Venta \n";
           menu+=" 2 - Listar ventas\n";
           menu+=" 3 - Eliminar venta \n";
           menu+=" 4 - Modificar venta \n";
           menu+=" 5 - Salir \n";
 
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
           
            // Según el número que el usuario ingreso en la consola se ejecutará el "case" correspondiente.
            switch(opcion) {
            case 1: 
                    Venta b = new Venta();
                    nombrecompleto = JOptionPane.showInputDialog("Digite nombre completo");
                    b.setNombrecompleto(nombrecompleto);
                    cedula= JOptionPane.showInputDialog("Ingrese cedula: ");
                    b.setCedula(cedula);
                    cantidad= Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad"));
                    b.setCantidad(cantidad);
                    precio= Integer.parseInt(JOptionPane.showInputDialog("ingrese precio"));
                    // Este paso es fundamental, tomamos el vehiculo (En este caso definido con la variable a),
                    // Y lo guardamos en la lista de vehiculos utilizando el método de la lista .add(a);
                    listaVenta.add(b);
                    
                    // imprimimos los resultados por consola para verificar que se registraron
                    
                    System.out.println("VENTA CREADA: ");
                    System.out.println("Nombre " + b.getNombrecompleto());
                    System.out.println("Cedula " + b.getCedula());
                    System.out.println("Valor a Pagar " + cantidad *precio);
                    
                    break;
            }
           
  }while(opcion!=5);
    }
}
