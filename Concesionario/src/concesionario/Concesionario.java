
package concesionario;
import concesionario.vehiculo.MenuVehiculos;
import concesionario.venta.MenuVenta;

   import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Concesionario {

    public static void main(String[] args) {
     
      MenuVehiculos mv = new MenuVehiculos();
      MenuVenta v =new MenuVenta();
      String menu="";
      int opcion;
 
      do{   
            // Le indicamos al usuario cuales son sus opciones:
           menu="";
           menu+="********* Menú *********\n";
           menu+=" INGRESE LA OPCION \n";
           menu+=" 1 - Vehiculos \n";
           menu+=" 2 - Ventas \n";
           menu+=" 3 - Salir \n";
           
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                
                 switch(opcion) {
                case 1: 
                    mv.vehiculo();
                    break;
                 
             
                  case 2: 
                   v.venta();
                    break;
                 }
       
                 }while(opcion!=3);  
           }
    
}
