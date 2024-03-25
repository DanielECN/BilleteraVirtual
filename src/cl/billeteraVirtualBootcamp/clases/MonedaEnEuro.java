package cl.billeteraVirtualBootcamp.clases;

public class MonedaEnEuro extends Moneda{
    public static final double VALOR_EURO = 1.061;
    double dineroEnEuros;
    @Override
    public double verificarDatos(double dinero) {
        if (dinero > 0){
            this.dineroEnEuros = dinero/VALOR_EURO;
            return dineroEnEuros;
        }
        return 0;
    }
}
