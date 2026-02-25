import java.util.ArrayList;

public interface IRepositorioProductos
{
    ArrayList<Producto> listar();
    void agregar(Producto p);
}