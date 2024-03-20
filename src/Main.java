/**
 * Importación de la clase Cliente y Cuenta que se encuentra dentro del paquete de clases.
 */

import cl.billeteraVirtualBootcamp.clases.Cliente;

//Esto lo borrare eventualmente porque el codigo se ha ido actualizando, al igual que lo que esta abajo al ultimo
//Para ir probando a ver que sucede realmente

import cl.billeteraVirtualBootcamp.clases.Cuenta;
import java.util.Scanner;

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
        cliente.getCuentaCorriente().mostrarInformacionCuentaCorriente();

        //llamo al metodo ingresar dinero para sumar dinero al saldo y muestro nuevamente la informacion de la cuenta para ver si se agrego correctamente.
        cliente.getCuentaCorriente().ingresarDinero();
        cliente.getCuentaCorriente().mostrarInformacionCuentaCorriente();


        //llamo al metodo para restar dinero al saldo y muestro la informacion de la cuenta para ver si se resto correctamente.

        cliente.getCuentaCorriente().restarDinero();
        cliente.getCuentaCorriente().mostrarInformacionCuentaCorriente();









    }
}


/**
 * Codigo antiguo, eventualmente se eliminara, solo esta para Mi por propositos academicos y torpedos
 * Estos datos se setearan mediante un constructor
 */
/*

        // Esto ya es un objeto
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        Cuenta cuenta2 = new Cuenta(654321, "Yo mismo", 5000);

        //Llenando la clase de datos

        cuenta.setNumeroCuenta(123456);
        cuenta.setTitularCuenta("Daniel Cerda");
        cuenta.setSaldoCuenta(10000000);

        System.out.println("Nombre del titular cuenta: " + cuenta.getTitularCuenta());

        cuenta.mostrarInformacionCuentaCorriente();
        cuenta2.mostrarInformacionCuentaCorriente();*/

