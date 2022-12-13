/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lorraine
 */
public class Arriendo{
     private int numArriendo;
     private String fecArr;
     private int diasArriendo;

    public Arriendo(int numArriendo, String fecArr, int diasArriendo) {
        setNumArriendo(numArriendo);
        setFecArr(fecArr);
        setDiasArriendo(diasArriendo);
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
     
    public static void arriendo(int numArriendo, String fecArr, int diasArriendo){
    }
    
    public int obtenerMontoApagar(int precioDia){
        return 0;
    }
    
    public boolean evaluarArriendo(Cliente cliente, Vehiculo vehiculo){
        if (!cliente.isVigente() || vehiculo.getCondicion() != 'D') {
            return false;
        }
        return true;
    }
}
