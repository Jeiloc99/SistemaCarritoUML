
import java.util.ArrayList;

public class Tienda
{
    private ArrayList<Producto> productos;

    public Tienda()
    {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto p)
    {
        productos.add(p);
    }
}