/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorAgregarClientes {
    // Creamos un arrayList de tipo cliente
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public ControladorAgregarClientes() {
        File archivo = new File("archivoClientes.csv");
        if (!archivo.exists()) {
            throw new IllegalArgumentException("El archivo no existe.");
        }
        try (Scanner leer = new Scanner(archivo)) {
            leer.nextLine();
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String siguiente[] = linea.split(";");
                String cedula = siguiente[0];
                String nombre = siguiente[1];
                boolean vigente = Boolean.parseBoolean(siguiente[2]);
                if (vigente != false) {
                   listaClientes.add(new Cliente(cedula,nombre,vigente)); 
                }
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    // Creamos un metodo que recibe como parametro nombre y cedula y vigente del
    // modelo cliente
    public void agregarCliente(String cedula, String nombre, boolean vigente) {
        // Creamos un objeto de tipo cliente
        Cliente cliente = new Cliente();
        
        File archivo = new File("archivoClientes.csv");
        
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(archivo,true));
            bf.append(cedula);
            bf.append(";");
            bf.append(nombre);
            bf.append(";");
            bf.append(String.valueOf(vigente));
            bf.newLine();
            bf.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        
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
