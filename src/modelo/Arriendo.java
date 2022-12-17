/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Arriendo {
    private int numArriendo;
    private String fecArr;
    private int diasArriendo;
    private Cliente cliente;
    private Vehiculo vehiculo;
    
    public Arriendo(){}

    public Arriendo(int numArriendo, String fecArr, int diasArriendo, Cliente cliente, Vehiculo vehiculo) {
        setNumArriendo(numArriendo);
        setFecArr(fecArr);
        setDiasArriendo(diasArriendo);
        setCliente(cliente);
        setVehiculo(vehiculo);
        evaluarArriendo(cliente, vehiculo);

    }

    public int getNumArriendo() {
        return numArriendo;
    }

    public void setNumArriendo(int numArriendo) {
        this.numArriendo = numArriendo;
    }

    public String getFecArr() {
        return fecArr;
    }

    public void setFecArr(String fecArr) {
        this.fecArr = fecArr;
    }

    public int getDiasArriendo() {
        return diasArriendo;
    }

    public void setDiasArriendo(int diasArriendo) {
        this.diasArriendo = diasArriendo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public static void arriendo(int numArriendo, String fecArr, int diasArriendo) {
    }

    public int obtenerMontoApagar(int precioDia) {
        return 0;
    }

    public boolean evaluarArriendo(Cliente cliente, Vehiculo vehiculo) {
        if (!cliente.isVigente() || vehiculo.getCondicion() != 'D') {
            return false;
        }
        return true;
    }
}
