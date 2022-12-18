package controlador;

import java.util.ArrayList;
import modelo.*;
import vista.ArriendoConCuotas;

// Esta es una clase que actua como controlador para la clase ArriendoCuota
public class ControladorArriendoConCuotas {

    // Se crean 3 arriendos con cuotas de ejemplo y se guarda en arrayList de
    // arriendosConCuotasBase

    // Primero creamos 3 clientes
    Cliente cliente1 = new Cliente("12345678-1", "Usuario 1", true);
    Cliente cliente2 = new Cliente("12345678-2", "Usuario 2", true);
    Cliente cliente3 = new Cliente("12345678-3", "Usuario 3", true);

    // Luego creamos 3 vehiculos
    Vehiculo vehiculo1 = new Vehiculo("Abarth","Punto Abarth","AB-CD*11");
    Vehiculo vehiculo2 = new Vehiculo("Audi","A1 Sportback","EF-GH*22");
    Vehiculo vehiculo3 = new Vehiculo("Fiat","500L","IJ-KL*33");

    // Creamos 3 arriendos con cuotas
    ArriendoCuota arriendo1 = new ArriendoCuota(1, "2021-01-01", 10, cliente1, vehiculo1, 3);
    ArriendoCuota arriendo2 = new ArriendoCuota(2, "2021-01-01", 10, cliente2, vehiculo2, 3);
    ArriendoCuota arriendo3 = new ArriendoCuota(3, "2021-01-01", 10, cliente3, vehiculo3, 3);

    // Creamos un arrayList de clientes otra de vehiculos y otra de arriendos con
    // cuotas y las poblamos con los datos de ejemplo
    ArrayList<Cliente> clientesBase = new ArrayList<>();
    ArrayList<Vehiculo> vehiculosBase = new ArrayList<>();
    ArrayList<ArriendoCuota> arriendosConCuotasBase = new ArrayList<>();

    public ControladorArriendoConCuotas() {
        clientesBase.add(cliente1);
        clientesBase.add(cliente2);
        clientesBase.add(cliente3);
        vehiculosBase.add(vehiculo1);
        vehiculosBase.add(vehiculo2);
        vehiculosBase.add(vehiculo3);
        arriendosConCuotasBase.add(arriendo1);
        arriendosConCuotasBase.add(arriendo2);
        arriendosConCuotasBase.add(arriendo3);

        // Generamos las cuotas de los arriendos
        arriendo1.setCuotas(generarCuotas(arriendo1, 10000));
        arriendo2.setCuotas(generarCuotas(arriendo2, 20000));
        arriendo3.setCuotas(generarCuotas(arriendo3, 30000));

    }

    public boolean ingresarArriendoConCuotas(ArriendoCuota arriendo, int precioDia) {
        if (arriendo.evaluarArriendo(arriendo.getCliente(), arriendo.getVehiculo())) {
            arriendo.getVehiculo().setCondicion('A');
            arriendo.setCuotas(generarCuotas(arriendo, precioDia));
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<CuotaArriendo> generarCuotas(ArriendoCuota arriendo, int precioDia) {
        ArrayList<CuotaArriendo> cuotas = new ArrayList<>();
        int valorCuota = precioDia * arriendo.getDiasArriendo() /
                arriendo.getCantCuotas();
        for (int i = 0; i < arriendo.getCantCuotas(); i++) {
            cuotas.add(new CuotaArriendo(i + 1, valorCuota, false));
        }
        return cuotas;
    }

    // Recibe un cliente y busca en el arrayList de arriendos con cuotas si el
    // cliente tiene alguno y retorna un arrayList con los arriendos con cuotas del
    // cliente

    public ArrayList<ArriendoCuota> getArriendosConCuotas(Cliente cliente) {
        ArrayList<ArriendoCuota> arriendosConCuotas = new ArrayList<>();
        for (ArriendoCuota arriendo : arriendosConCuotasBase) {
            if (arriendo.getCliente().equals(cliente)) {
                arriendosConCuotas.add(arriendo);
            }
        }
        return arriendosConCuotas;
    }

    // Retorna un arrayList con todos los clientes de arriendos con cuotas
    public ArrayList<Cliente> getClientesConCuotas() {
        return clientesBase;
    }

    // Recibe el numArriendo y retorna el arriendo con cuotas con ese numArriendo
    public ArriendoCuota getArriendoConCuotasByNumArriendo(int numArriendo) {
        for (ArriendoCuota arriendo : arriendosConCuotasBase) {

            if (arriendo.getNumArriendo() == numArriendo) {
                System.out.println("Encontrado");
                return arriendo;
            }
        }
        return null;
    }

    // Pagar cuota: operación que recibe la cuota a pagar y busca la cuota en la
    // lista respectiva. Si la encuentra, el método
    // actualiza el atributo pagada con True y retorna un true, en caso contrario,
    // retorna un false.

    public boolean pagarCuota(ArriendoCuota arriendo, CuotaArriendo cuota) {
        for (CuotaArriendo cuotaArriendo : arriendo.getCuotas()) {
            if (cuotaArriendo.equals(cuota)) {
                cuotaArriendo.setPagada(true);
                return true;
            }
        }

        return false;
    }

    public void pagarCuota(ArriendoConCuotas arriendo, CuotaArriendo cuota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
