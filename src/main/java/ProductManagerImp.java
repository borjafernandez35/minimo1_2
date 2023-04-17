import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProductManagerImp implements ProductManager{


    List<Producto> productoList;
    Queue<Order> peticiones;

    public ProductManagerImp() {
        this.productoList = new ArrayList<>();
        this.productoList.add(new Producto("cafe",1.5,1));
        this.productoList.add(new Producto("donuts",2,2));
        this.productoList.add(new Producto("hielo",0.25,3));

        this.peticiones=new LinkedList<>();

    }

    @Override
    public List<Producto> productsByPrice() {
        return productoList;
    }

    @Override
    public List<Producto> productsBySales() {
        return null;
    }

    @Override
    public void addOrder(Order order) {
        peticiones.add(order);

    }

    @Override
    public Order processOrder() {
        return null;
    }

    @Override
    public List<Order> ordersByUsuario(Integer id) {
        return null;
    }

    @Override
    public void addUsuario(String nombre, String password, Integer id) {

    }

    @Override
    public void addProducto(Integer id, String name, double price) {

    }

    @Override
    public Producto getProducto(Integer id) {
        return null;
    }

    @Override
    public int numUsuario() {
        return 0;
    }

    @Override
    public int numProducto() {
        return 0;
    }

    @Override
    public int numOrders() {
        return 0;
    }

    @Override
    public int numSales(String b001) {
        return 0;
    }
}
