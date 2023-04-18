import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProductManagerImp implements ProductManager{


    List<Producto> productoList;




    Queue<Order> peticiones;

//    final static Logger logger = Logger.getLogger(ProductManagerImpl.class);

    public ProductManagerImp() {
        this.productoList = new ArrayList<>();
        this.productoList.add(new Producto("cafe",1.5,1));
        this.productoList.add(new Producto("donuts",2,2));
        this.productoList.add(new Producto("hielo",0.25,3));



        this.peticiones=new LinkedList<>();

    }

    @Override
    public List<Producto> productsByPrice() {
        List<Producto> list= productoList;
        list.sort(list.sort((p1,p2)-> Double.compare(p1.getPrecio(), p2.getPrecio())));
        return list;
    }

    @Override
    public List<Producto> productsBySales() {
        return productoList;
    }

    @Override
    public void addOrder(Order order) {
        peticiones.add(order);

    }

    @Override
    public Order processOrder() {
        /*Order t = this.getProducto(id);
        if (t==null) {
            logger.warn("not found " + t);
        }
        else{
        addOrder(t);
        logger.info(t+" deleted ");
        }

        this.productoList.remove(t);*/

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
    public Producto getProducto(int id) {

       /* logger.info("getProducto("+id+")");

        for (Producto t: this.productoList) {
            if (t.getId().equals(id)) {
                logger.info("getProducto("+id+"): "+t);

                return t;
            }
        }

        logger.warn("not found " + id);*/

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
