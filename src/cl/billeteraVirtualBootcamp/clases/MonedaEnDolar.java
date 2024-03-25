package cl.billeteraVirtualBootcamp.clases;
public class MonedaEnDolar extends Moneda{
    public static double VALOR_DOLAR = 976;
    double dineroEnDolares;
    @Override
    protected double verificarDatos(double dinero) {
        if (dinero > 0){

            this.dineroEnDolares = dinero/VALOR_DOLAR;
            return dineroEnDolares;
        }
        return 0;
    }
}
