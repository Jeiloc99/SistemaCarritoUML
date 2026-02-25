
public class Pago
{
    private MetodoPago metodo;

    public Pago(MetodoPago metodo)
    {
        this.metodo = metodo;
    }

    public void procesarPago(double monto)
    {
        metodo.pagar(monto);
    }
}