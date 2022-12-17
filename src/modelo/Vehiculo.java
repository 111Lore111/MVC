/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lorraine
 */
public class Vehiculo {
    
    private String modelo;
    private String marca;
    private String patente;
    private char condicion;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String marca, String patente) {
        setModelo(modelo);
        setMarca(marca);
        setPatente(patente);
        setCondicion('D');
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente.length() != 8) {
            throw new IllegalArgumentException("Debes ingresar una patente con un largo de 8.");
        }

        if (!estaEnMayusculas(patente)) {
            throw new IllegalArgumentException("La patente debe estar en MAYÚSCULAS.");
        }

        this.patente = patente;
    }

    public char getCondicion() {
        return condicion;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }

    public void setCodicion(char condicion) {
        if (condicion != 'D' && condicion != 'A' && condicion != 'M') {
            throw new IllegalArgumentException("Solo puedes ingresar las condiciones D, A ó M");
        }
        this.condicion = condicion;
    }

    private boolean estaEnMayusculas(String texto) {
        return texto.equals(texto.toUpperCase());
    }
}
