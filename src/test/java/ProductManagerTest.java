import java.util.List;

public class ProductManagerTest {

   private ProductManager pm;
   public void init(){
       pm=new ProductManagerImp();

   }
    public void listByPriceTest(){
       init();
       List<Producto> listaDeProductos = pm.productsByPrice();

       for (Producto p:listaDeProductos){
           System.out.println(p.getNombre()+p.getPrecio());
       }

    }
    public void listBySaleTest(){

        init();
        List<Producto> listaDeProductos = pm.productsBySales();

        for (Producto p:listaDeProductos){
            System.out.println(p.getNombre()+p.getPrecio()+p.getVentas());
        }
    }

    public void crearPedidoTest() {
       Order miPeticion=new Order("Borja");
       miPeticion.addLP(2,"Cafe");
        miPeticion.addLP(1,"Hielo");
        miPeticion.addLP(3,"Donuts");
        pm.addOrder(miPeticion);
    }

    public static void main(String[] args) {
        ProductManagerTest productManagerTest=new ProductManagerTest();
        productManagerTest.listByPriceTest();
        productManagerTest.listBySaleTest();
    }

}
