package controlador;

import java.util.ArrayList;
import modelo.Vehiculo;

public class VehiculoController {

    // Creamos un arrayList de tipo vehiculo
    ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

    // Poblamos el ArrayList con 3 vehiculos de prueba
    public VehiculoController() {
        listaVehiculos.add(new Vehiculo("Abarth","Punto Abarth","AB-CD*11"));
        listaVehiculos.add(new Vehiculo("Audi","A1 Sportback","EF-GH*22"));
        listaVehiculos.add(new Vehiculo("Fiat","500L","IJ-KL*33"));
    }

    // Metodo que recibe un objeto de tipo vehiculo y lo agrega a un arrayList
    public void agregarVehiculo(Vehiculo vehiculo) {
        // Agregamos el objeto vehiculo al arrayList
        listaVehiculos.add(vehiculo);
        // Imprimimos vehiculo con metodo toString
        System.out.println(vehiculo.toString());
    }

    // Creamos un metodo que retorna la lista de vehiculos
    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
}
