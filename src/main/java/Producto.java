public class Producto {
    String nombre;
    Double precio;
    Integer id;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getId() {
        return id;
    }

    public Producto(String nombre, Double precio, Integer id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }
}