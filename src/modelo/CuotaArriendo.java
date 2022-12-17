/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lorraine
 */
public class CuotaArriendo {
    
    private int numCuota;
    private int valorCuota;
    private boolean pagada;

    public CuotaArriendo(){}
    
    public CuotaArriendo(int numCuota, int valorCuota, boolean pagada) {
        setNumCuota(numCuota);
        setValorCuota(valorCuota);
        setPagada(pagada);
    }
    
    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public int getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
    
    public boolean pagarCuota(){
        return false;
    }
    
}
