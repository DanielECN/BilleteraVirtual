package cl.billeteraVirtualBootcamp.clases;

import java.util.Scanner;

public class Cliente {
    private long idCliente;
    private String nombreCliente;
    private Cuenta cuentaCorriente;

    //constructor
    public Cliente(long idCliente, String nombreCliente, Cuenta cuentaCorriente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.cuentaCorriente = cuentaCorriente;
    }

    public Cliente(long idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.cuentaCorriente = cuentaCorriente;

    }

    public Cliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente() {
    }

    //Metodo que pide datos
    public static Cliente crearClienteDesdeConsola() {
        Scanner scanner = new Scanner(System.in);
        long idCliente;
        String nombreCliente;

        System.out.println("Ingrese el id del cliente: ");
        idCliente = scanner.nextLong();
        scanner.nextLine(); // va a la siguiente linea

        System.out.println("Ingrese el nombre del cliente: ");
        nombreCliente = scanner.nextLine();

        Cuenta cuentaCorriente = Cuenta.CrearCuentaCorrientePorConsola(nombreCliente);

        return new Cliente(idCliente,nombreCliente,cuentaCorriente);
    }

    public long getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public Cuenta getCuentaCorriente() {
        return cuentaCorriente;
    }
    public void setCuentaCorriente(Cuenta cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

}
/*GETTER Y SETTER SE usan cuando hay que modificar los datos, por ejemplo editar usuario, cambiar su contraseña
o buscar un dato, como un id*/
