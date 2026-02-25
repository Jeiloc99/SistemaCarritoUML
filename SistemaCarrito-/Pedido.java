
public class Pedido
{
    private Carrito carrito;
    private Pago pago;

    public Pedido(Carrito carrito, Pago pago)
    {
        this.carrito = carrito;
        this.pago = pago;
    }

    public void confirmar()
    {
        double total = carrito.calcularTotal();
        pago.procesarPago(total);
        System.out.println("Pedido confirmado. Total: " + total);
    }
}