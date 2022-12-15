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

}
