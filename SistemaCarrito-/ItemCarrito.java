
public class ItemCarrito
{
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad)
    {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal()
    {
        return producto.getPrecio() * cantidad;
    }
}