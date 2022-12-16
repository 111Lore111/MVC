package modelo;

import java.util.ArrayList;

// numArriendo; Es un numero de arriendo consecutivo
// fecArr; Es la fecha de inicio del arriendo
// diasArriendo; Es la cantidad de dias que se arrienda el vehiculo
// canCuotas; Es la cantidad de cuotas que se pagaran

public class ArriendoCuota extends Arriendo {
    private int cantCuotas;
    private ArrayList<CuotaArriendo> cuotas;

    public ArriendoCuota(int numArriendo, String fecArr, int diasArriendo, Cliente cliente, Vehiculo vehiculo,
            int cantCuotas) {
        super(numArriendo, fecArr, diasArriendo, cliente, vehiculo);
        setCantCuotas(cantCuotas);
        // evaluarArriendo(cliente, vehiculo);

    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    // ----------------

    // // Este método evalúa los datos del arriendo instanciado (invocando la
    // función
    // // evaluarArriendo) retornando true si la operación fue exitosa y false si no
    // lo
    // // fue. En el caso de que la operación sea
    // // exitosa, este método automáticamente dejará el vehículo arrendado con
    // // condición A y para aplicar correctamente la
    // // relación compuesta entre los objetos arriendo y cuotas, asignará las
    // cuotas
    // // respectivas del arriendo invocando la
    // // función definida en c

    // public boolean ingresarArriendoConCuotas(int precioDia) {
    // if (evaluarArriendo(getCliente(), getVehiculo())) {
    // getVehiculo().setCondicion('A');
    // setCuotas(generarCuotas(precioDia));
    // return true;
    // } else {
    // return false;
    // }
    // }

    // // generarCuotas: Este método recibe como parámetro un entero que representa
    // el
    // // precio del día del vehículo arrendado y retorna
    // // un ArrayList de objetos de tipo CuotaArriendo. Este método se encarga de
    // // generar las cuotas del arriendo instanciado
    // // y asignarles el valor correspondiente a cada una de ellas.

    // public ArrayList<CuotaArriendo> generarCuotas(int precioDia) {
    // ArrayList<CuotaArriendo> cuotas = new ArrayList<>();
    // int valorCuota = precioDia * getDiasArriendo() / getCantCuotas();
    // for (int i = 0; i < getCantCuotas(); i++) {
    // cuotas.add(new CuotaArriendo(i + 1, valorCuota, false));
    // }
    // return cuotas;
    // }

    // ----------------

    // setCuotas: Este método recibe como parámetro un ArrayList de objetos de tipo
    // CuotaArriendo y los asigna al atributo cuotas del objeto arriendo
    // instanciado.

    public void setCuotas(ArrayList<CuotaArriendo> cuotas) {
        this.cuotas = cuotas;
    }

    // getCuotas: Este método retorna el ArrayList de objetos de tipo CuotaArriendo
    // que contiene el atributo cuotas del objeto arriendo
    // instanciado.

    public ArrayList<CuotaArriendo> getCuotas() {
        return cuotas;
    }

}
