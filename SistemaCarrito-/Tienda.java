
public class Tienda
{
    private IRepositorioProductos repo;

    public Tienda(IRepositorioProductos repo)
    {
        this.repo = repo;
    }

    public void agregarProducto(Producto p)
    {
        repo.agregar(p);
    }
}