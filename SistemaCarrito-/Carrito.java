import java.util.ArrayList;

public class Carrito
{
    private ArrayList<ItemCarrito> items;

    public Carrito()
    {
        items = new ArrayList<ItemCarrito>();
    }

    public void agregarItem(ItemCarrito item)
    {
        items.add(item);
    }

    public double calcularTotal()
    {
        double total = 0;
        for(ItemCarrito item : items)
        {
            total += item.calcularSubtotal();
        }
        return total;
    }
}