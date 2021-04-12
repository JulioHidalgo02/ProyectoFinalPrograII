
import java.io.Serializable;

public class Orden implements Serializable{
String nombre;
String cedula;
String correo;
String sabor;
String tamaño;
int cantidad;
int monto;

    public Orden(String nombre, String cedula, String correo, String sabor, String tamaño, int cantidad, int monto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.sabor = sabor;
        this.tamaño = tamaño;
        this.cantidad = cantidad;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Orden: \n" + "Nombre: " + nombre + "\nCedula: " + cedula + "\nCorreo: " + correo + "\nSabor: " + sabor + "\nTamaño: " + tamaño + "\nCantidad: " + cantidad + "\nVenta de : ₡" + monto;
    }
    
 


}
