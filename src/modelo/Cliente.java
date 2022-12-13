/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lorraine
 */
public class Cliente {
    
    private String cedula;
    private String nombre;
    private boolean vigente;

    public Cliente(String cedula, String nombre) {
        setCedula(cedula);
        setNombre(nombre);
        setVigente(true);
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula.length() != 10) {
            throw new IllegalArgumentException("Debes ingresar una cédula con un largo de 10.");
        }
        
        if (cedula.charAt(cedula.length() - 2) != '-') {
            throw new IllegalArgumentException("El rut debe contener un guión.");
        }
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
    
    
}
