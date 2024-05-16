
package concesionario.vehiculo;


public class Vehiculo {
    
 private String marca;
    private String placa;
    private String color;
    private int cilindraje;
    
    // Este constructor nos permite crear un vehiculo sin ningún atributo.
    public Vehiculo(){}
        
    // Este constructor nos permite crear un vehiculo el cual va a contener inmediatamente
    // todas sus variables asignadas.
    public Vehiculo(String marca, String placa, String color, int cilindraje){
        this.marca = marca;
        this.placa = placa;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    // Cabe mencionar que aunque creemos un vehiculo sin atributos, siempre podemos
    // Asignarselos más adelante en el código utilizando los getters y setters.
    // (En la clase main hay un ejemplo de esto).
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
   
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
   
}
