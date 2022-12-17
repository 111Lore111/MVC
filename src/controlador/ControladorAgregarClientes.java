/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionListener;
import modelo.*;
import vista.*;
import java.util.ArrayList;

public class ControladorAgregarClientes {
    // Creamos un arrayList de tipo cliente
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    // Poblamos el ArrayList con 3 clientes de prueba
    public ControladorAgregarClientes() {
        listaClientes.add(new Cliente("12345678-0", "Luz Roja", true));
        listaClientes.add(new Cliente("12345678-1", "Giovani", true));
        listaClientes.add(new Cliente("12345678-2", "Astrid", true));
    }

    // Creamos un metodo que recibe como parametro nombre y cedula y vigente del
    // modelo cliente
    public void agregarCliente(String cedula, String nombre, boolean vigente) {
        // Creamos un objeto de tipo cliente
        Cliente cliente = new Cliente();
        // Asignamos los valores a los atributos del objeto cliente
        cliente.setNombre(nombre);
        cliente.setCedula(cedula);
        cliente.setVigente(vigente);
        // Agregamos el objeto cliente al arrayList
        listaClientes.add(cliente);
        // Imprimimos cliente con metodo toString
        System.out.println(cliente.toString());
    }

    // Creamos un metodo que retorna la lista de clientes
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

}
