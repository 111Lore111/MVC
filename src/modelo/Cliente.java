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

    public Cliente() {}

    public Cliente(String cedula, String nombre, boolean vigente) {
        setCedula(cedula);
        setNombre(nombre);
        setVigente(vigente);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
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

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", vigente=" + vigente + '}';
    }

}
