/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Lorraine
 */
public class ArriendoCuota extends Arriendo{
    
    private CuotaArriendo cantCuotas;

    public ArriendoCuota(CuotaArriendo cantCuotas, int numArriendo, String fecArr, int diasArriendo) {
        super(numArriendo, fecArr, diasArriendo);
        setCantCuotas(cantCuotas);
    }

    public CuotaArriendo getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(CuotaArriendo cantCuotas) {
        this.cantCuotas = cantCuotas;
    }
    
    public static void arriendoCuota(int numArriendo, String fecArr,int diasArriendo, int cantCuo){
        
    }
    
    public boolean ingresarArriendo(int precioDia){
        return false;
    }
    
    public ArrayList<CuotaArriendo> generarCuotas(int precioDia){
        return null;
    }
}
