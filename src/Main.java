/**
 * Importación de la clase Cliente y Cuenta que se encuentra dentro del paquete de clases.
 */

import cl.billeteraVirtualBootcamp.clases.Cliente;
import cl.billeteraVirtualBootcamp.clases.MonedaEnEuro;

/**
 * Clase main, la principal, sin esta clase no puede existir nuestro programa, esta ejecutara todo
 */

public class Main {
    /**
     * Nuestro metodo main, recomendable para cualquier proyecto java
     */
    public static void main(String[] args) {

        // crea el cliente desde la clase Cliente y muestra la informacion de la cuenta.
        Cliente cliente = Cliente.crearClienteDesdeConsola();
        cliente.getCuentaCliente().mostrarInformacionCuentaCorriente();

        //llamo al metodo ingresar dinero para sumar dinero al saldo y muestro nuevamente la informacion de la cuenta para ver si se agrego correctamente.
        cliente.getCuentaCliente().ingresarDinero();
        cliente.getCuentaCliente().mostrarInformacionCuentaCorriente();

        //llamo al metodo para restar dinero al saldo y muestro la informacion de la cuenta para ver si se resto correctamente.
        cliente.getCuentaCliente().restarDinero();
        cliente.getCuentaCliente().mostrarInformacionCuentaCorriente();


    }
}