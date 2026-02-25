
public class Factura
{
    private Pedido pedido;

    public Factura(Pedido pedido)
    {
        this.pedido = pedido;
    }

    public void mostrar()
    {
        System.out.println("Factura generada (simple).");
    }
}