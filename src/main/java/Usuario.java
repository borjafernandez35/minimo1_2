import java.util.List;
import java.util.ArrayList;

public class Usuario {
    String nombre;
    String password;
    Integer id;
     List<Producto> listProducto;

    public void setListProducto(List<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    public List<Producto> getListProducto() {
        return listProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public Integer getId() {
        return id;
    }

    public Usuario(String nombre, String password, Integer id) {
        this.nombre = nombre;
        this.password = password;
        this.id = id;
    }
}
