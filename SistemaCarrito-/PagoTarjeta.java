public class PagoTarjeta implements IMetodoPago
{
    public void pagar(double monto)
    {
        System.out.println("Pagando con tarjeta: " + monto);
    }
}