


public class Producto {
    private String nombre;
   private double precio;
    private int id;

    private int ventas;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Producto(){}

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setId(int id) {
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

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public Producto(String nombre, double precio, int id, int ventas) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.ventas=ventas;
    }
}
