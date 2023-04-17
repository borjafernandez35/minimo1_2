


public class Producto {
    private String nombre;
   private double precio;
    private int id;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Producto(){}

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

    public Producto(String nombre, double precio, int id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }
}
