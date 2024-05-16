/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario.vehiculo;

import concesionario.vehiculo.Vehiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Manlio
 */
public class MenuVehiculos {
      // Creamos la lista en dónde serán almacenados los vehiculos:
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        String marca, placa, color;
        int cilindraje, opcion;
        String menu="";
        
        // El while será ejecutado hasta que salir sea TRUE.
       
       public void vehiculo(){ 
           
       do{   
            // Le indicamos al usuario cuales son sus opciones:
           menu="";
           menu+="********* Menú *********\n";
           menu+=" INGRESE LA OPCION \n";
           menu+=" 1 - crear vehiculo \n";
           menu+=" 2 - Listar vehiculos ingresados\n";
           menu+=" 3 - Eliminar vehiculo \n";
           menu+=" 4 - Modificar vehiculo \n";
           menu+=" 5 - Salir \n";
            
            // Obtenemos el numero ingresado por el usuario en la consola:
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
           
            // Según el número que el usuario ingreso en la consola se ejecutará el "case" correspondiente.
            switch(opcion) {
                case 1: // "case" Ingresar nuevo vehiculo
                    // Instanciamos un vehiculo vacio (Sin atributos)
                    Vehiculo a = new Vehiculo();
                    placa= JOptionPane.showInputDialog("Digite placa");
                    // Obtenemos la placa que el usuario escribió y la guardamos en el vehiculo.
                    a.setPlaca(placa);
                    marca= JOptionPane.showInputDialog("Ingrese marca del vehiculo: ");
                    // De la misma forma, guardamos la marca
                    a.setMarca(marca);
                    color= JOptionPane.showInputDialog("Ingrese color: ");
                    // guardamos el color que el usuario ingresó
                    a.setColor(color);
                    cilindraje= Integer.parseInt(JOptionPane.showInputDialog("ingrese cilindraje"));
                    // Y guardamos cilindraje
                    a.setCilindraje(cilindraje);

                    // Este paso es fundamental, tomamos el vehiculo (En este caso definido con la variable a),
                    // Y lo guardamos en la lista de vehiculos utilizando el método de la lista .add(a);
                    listaVehiculos.add(a);
                    
                    // imprimimos los resultados por consola para verificar que se registraron
                    
                    System.out.println("VEHICULO CREADO: ");
                    System.out.println("Placa " + a.getPlaca());
                    System.out.println("Marca " + a.getMarca());
                    System.out.println("Color " + a.getColor());
                    
                    break;
                case 2: // Listar todos los vehiculos ingresados en la lista:
                    // el for va a recorrer todos los elementos que estén almacenados en la lista.
                   for(int i = 0; i < listaVehiculos.size(); i++){ 
                   // listavehiculos.size() Permite ver cuantos elementos hay guardados.
                        JOptionPane.showMessageDialog(null,"Auto: " + (i + 1));
                       // Para obtener un elemento de la lista, utilizamos .get():
                       Vehiculo auto =  listaVehiculos.get(i); 
                       
                       JOptionPane.showMessageDialog(null,"placa: " + auto.getPlaca());
                       JOptionPane.showMessageDialog(null,"Marca: " + auto.getMarca());
                       JOptionPane.showMessageDialog(null,"Color: " + auto.getColor());
                       
                   }
                    
                    break;
                case 3: // ELiminar vehiculo de la lista
                     placa= JOptionPane.showInputDialog("Ingrese la placa del vehiculo a eliminar: ");
                   
                    
                    for (int i = 0; i < listaVehiculos.size(); i++) {
                        Vehiculo auto = listaVehiculos.get(i);
                        // buscamos cual de las placas en la lista coincide con lo que el usuario escribió:
                        if (placa.equals(auto.getPlaca())) {
                            // Eliminamos un elemento de la lista utilizando .remove()
                            listaVehiculos.remove(i);
                             JOptionPane.showMessageDialog(null,"Vehiculo eliminado");
                        }
                    }
                    
                    break;
                case 4: // Modificar vehiculo:
                  placa= JOptionPane.showInputDialog(" Ingrese la placa del vehiculo a mdificar");
   
                    // de nuevo, en síntesis lo que sucede acá es que vamos a buscar cual de
                    // todas las placas de los vehiculos coincide con la que el usuario ingresó,
                    // Luego de esto procederemos a cambiar el color y la marca del vehiculo
                    // según lo que el usuario escriba.
                    for (int i = 0; i < listaVehiculos.size(); i++) {
                        Vehiculo auto = listaVehiculos.get(i);
                        if (placa.equals(auto.getPlaca())) {
                                                  
                           marca= JOptionPane.showInputDialog("Ingrese marca del vehiculo: ");
                            color= JOptionPane.showInputDialog("Ingrese color: ");
             
                            auto.setColor(color);
                            auto.setMarca(marca);
                            
                             System.out.println("placa: " + auto.getPlaca());
                            System.out.println("marca: " + auto.getMarca());
                            System.out.println("Color: " + auto.getColor());
                            
                        }
                    }                                             
            }
        
        
    }while(opcion!=5);
    
}
}
