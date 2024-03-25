package cl.billeteraVirtualBootcamp.clases;

import java.util.Scanner;

/**
 * Mi clase cliente con los atributos idCliente,nombreCliente,cuentaCliente
 */
public class Cliente {
    private long idCliente;
    private String nombreCliente;
    private Cuenta cuentaCliente;

    /**
     * Creo un constructor que reciba la cuenta para enviarle los 3 atributos ya que un cliente no puede ser
     * cliente si no tiene una cuenta corriente y de estar manera puedo normar esto
     *
     * @param idCliente el id del cliente para identificarlo
     * @param nombreCliente el nombre que desea el cliente para llamarse al crear la cuenta
     * @param cuentaCliente la cuenta principal a la que esta llamando en mi clase cuenta
     */
    public Cliente(long idCliente, String nombreCliente, Cuenta cuentaCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.cuentaCliente = cuentaCliente;
    }

    /**
     * Se pueden crear distintos tipos de constructores de acuerdo a mis necesidades o requisitos que me solicitan
     * en este caso puede ser un potencial cliente ya que no llama a la clase cuenta
     */

    public Cliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Incluso puede haber un constructor vacio y no habria problemas, se puede dejar ahi en caso que sea requerido
     * para X situaciones, se puede tener esa versatilidad para trabajar
     */

    public Cliente() {
    }

    //MENU

    public void crearMenu(){
        
    }

    /** Metodo para crear los datos del cliente, en este caso el id del cliente y el nombre, ademas me retorna
     * datos de la clase cuenta para crear de manera simultanea la misma cuenta pero dentro de este metodo
     *
     * @return me retorna los datos de la clase cuenta que tiene el numero de cuenta y saldo de cuenta, como forma
     * de encapsulamiento
     */
    public static Cliente crearClienteDesdeConsola() {
        Scanner scanner = new Scanner(System.in);
        long idCliente;
        String nombreCliente;

        System.out.println("Ingrese el id del cliente: ");
        idCliente = scanner.nextLong();
        scanner.nextLine(); // va a la siguiente linea

        System.out.println("Ingrese el nombre del cliente: ");
        nombreCliente = scanner.nextLine();

        Cuenta cuentaCliente = Cuenta.CrearCuentaClientePorConsola(nombreCliente);

        return new Cliente(idCliente,nombreCliente,cuentaCliente);
    }


    /** GETTER Y SETTER se usan cuando hay que modificar los datos, por ejemplo editar usuario, cambiar su
     * contraseña o buscar un dato, como un id, se pueden crear y ver si se utilizaran, cuando este completo el
     * proyecto se puede elimanar el codigo sobrante.
     */

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
    public Cuenta getCuentaCliente() {
        return cuentaCliente;
    }
    public void setcuentaCliente(Cuenta cuentaCliente) {
        this.cuentaCliente = cuentaCliente;
    }

}

