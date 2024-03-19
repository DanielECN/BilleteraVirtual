package cl.billeteraVirtualBootcamp.clases;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Mi clase principal cuenta, de donde podre manipular los datos del titular(String),
 * numero de cuenta(int), saldo(double)
 */
public class Cuenta {
    /*
    1) Atributos de una clase
    */

    /**
     * Atributos principales de mi clase que contiene las variables numeroCuenta, saldoCuenta y titularCuenta con sus
     * respectivos MODIFICADORES DE ACCESO que en esta caso seran todos private
     */

    private int numeroCuenta;
    private double saldoCuenta;
    private String titularCuenta;

    /*
    2) Constructor
    */
    public Cuenta() {
    }

    public Cuenta(int numeroCuentaCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuentaCuenta;
        this.titularCuenta = titular;
        this.saldoCuenta = saldo;
    }

     /*
    3) Metodos de acceso
    */

    public static Cuenta CrearCuentaCorrientePorConsola(String nombreCliente) {
        Scanner scanner = new Scanner(System.in);
        int numeroCuenta;
        double saldoCuenta;

        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta = scanner.nextInt();
        scanner.nextLine(); // va a la siguiente linea

        System.out.println("Ingrese el saldo de la cuenta: ");
        saldoCuenta = scanner.nextDouble();

        return new Cuenta(numeroCuenta, nombreCliente, saldoCuenta);

    }
    /**
     * Getters y setters (que son los metodos de acceso) de mi numero de cuenta, saldo de cuenta y titular de cuenta
     * para poder obtener y modificar los datos
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldoCuenta() {
        return saldoCuenta;
    }
    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    public String getTitularCuenta() {
        return titularCuenta;
    }

    /*
    4) Metodos de comportamiento
    */

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }
    //CrearCuenta

    /**
     * Metodo de comportamiento para visualizar los datos de mi cuenta
     */

    public void mostrarInformacionCuentaCorriente() {
        String formatoSaldo = formatearSaldo(saldoCuenta);

        System.out.println("------------------------------------");
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Titular de cuenta: " + titularCuenta);
        System.out.println("Saldo de cuenta: $" + formatoSaldo);
        System.out.println("------------------------------------");
    }

    //AgregarSaldo
    //RestarSaldo
    //VerSaldo
    //MostrarInformacion
    //ConversorMoneda
    //Menu

    /*
    5) OPCIONAL "Metodos  utilitarios de logica"
    */

    /**
     * Metodo usado para mostrar el saldo en un numero o formato mas legible, seguira el patron #,### que
     * indica el numero y como quiero que lo muestre
     *
     * @return me retorna el saldo con su formato
     */
    private String formatearSaldo(double saldoCuenta) {
        DecimalFormat formatoSaldo = new DecimalFormat("#,###");

        return formatoSaldo.format(saldoCuenta);
    }
}
