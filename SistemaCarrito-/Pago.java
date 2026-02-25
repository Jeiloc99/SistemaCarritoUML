
public class Pago
{
    private IMetodoPago metodo;

    public Pago(IMetodoPago metodo)
    {
        this.metodo = metodo;
    }

    public void procesarPago(double monto)
    {
        metodo.pagar(monto);
    }
}