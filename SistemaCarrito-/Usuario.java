
public class Usuario
{
    private String nombre;
    private Carrito carrito;

    public Usuario(String nombre)
    {
        this.nombre = nombre;
        this.carrito = new Carrito();
    }

    public Carrito getCarrito()
    {
        return carrito;
    }
}