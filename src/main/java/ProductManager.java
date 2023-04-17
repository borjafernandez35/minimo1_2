import java.util.List;

public interface ProductManager {
    public List<Producto> productsByPrice();
    public List<Producto> productsBySales();
    public void addOrder(Order order);
    public Order processOrder();
    public List<Order> ordersByUsuario(Integer id);
    /////////////////////////////////////////////
    ////////////////////////////////////////////




    public void addUsuario(String nombre, String password, Integer id);
    public void addProducto(Integer id, String name, double price);

    public Producto getProducto(Integer id);

    public int numUsuario();
    public int numProducto();

    public int numOrders();

    public int numSales(String b001);
}
