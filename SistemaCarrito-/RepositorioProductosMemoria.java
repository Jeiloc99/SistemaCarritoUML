
import java.util.ArrayList;

public class RepositorioProductosMemoria implements IRepositorioProductos
{
    private ArrayList<Producto> productos;

    public RepositorioProductosMemoria()
    {
        productos = new ArrayList<Producto>();
    }

    public ArrayList<Producto> listar()
    {
        return productos;
    }

    public void agregar(Producto p)
    {
        productos.add(p);
    }
}