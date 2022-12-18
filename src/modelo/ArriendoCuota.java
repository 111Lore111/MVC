package modelo;

import java.util.ArrayList;

public class ArriendoCuota extends Arriendo {
    private int cantCuotas;
    private ArrayList<CuotaArriendo> cuotas;

    public ArriendoCuota(int numArriendo, String fecArr, int diasArriendo, Cliente cliente, Vehiculo vehiculo,
            int cantCuotas) {
        super(numArriendo, fecArr, diasArriendo, cliente, vehiculo);
        setCantCuotas(cantCuotas);

    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public ArrayList<CuotaArriendo> generarCuotas(int precioDia) {
        ArrayList<CuotaArriendo> cuotas = new ArrayList<>();
        int valorCuota = precioDia * getDiasArriendo() / getCantCuotas();
        for (int i = 0; i < getCantCuotas(); i++) {
            cuotas.add(new CuotaArriendo(i + 1, valorCuota, false));
        }
        return cuotas;
    }

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
