import java.util.ArrayList;
import java.util.List;

public class Order {
    private String userId;
    List<LP> listProducts;

    public Order(String Id) {
        this.userId = Id;
        listProducts = new ArrayList<LP>();
    }
    public void addLP(int q, String product) {
        listProducts.add(new LP(q, product));
    };

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setListProducts(List<LP> listProducts) {
        this.listProducts = listProducts;
    }

    public String getUserId() {
        return userId;
    }

    public List<LP> getListProducts() {
        return listProducts;
    }
}
