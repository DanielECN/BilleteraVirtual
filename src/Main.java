/**
 * Importación de la clase Cliente y Cuenta que se encuentra dentro del paquete de clases
 */

import cl.billeteraVirtualBootcamp.clases.Cliente;
import cl.billeteraVirtualBootcamp.clases.Cuenta;

import java.util.Scanner;

/**
 * Clase main, la principal, sin esta clase no puede existir nuestro programa, esta ejecutara todo
 */
public class Main {
    public static void main(String[] args) {

        Cliente cliente = Cliente.crearClienteDesdeConsola();
        cliente.getCuentaCorriente().mostrarInformacionCuentaCorriente();


    }
}



















/////////////////////////////////////////////////////////////////////////////////////////////
/*        // Esto ya es un objeto
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
 //       Cuenta cuenta2 = new Cuenta(654321, "Yo mismo", 5000);

        //Llenando la clase de datos

        cuenta.setNumeroCuenta(123456);
        cuenta.setTitularCuenta("Daniel Cerda");
        cuenta.setSaldoCuenta(10000000);

        System.out.println("Nombre del titular cuenta: " + cuenta.getTitularCuenta());



        cuenta.mostrarInformacionCuentaCorriente();
//        cuenta2.mostrarInformacionCuentaCorriente();*/

