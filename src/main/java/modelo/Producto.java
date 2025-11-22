package modelo;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private String sku;
    private String categoria;
    private boolean esActivo;
    private boolean descuentoAplicable;


    public Producto(String nombre, double precio, int cantidad, String sku, String categoria, boolean esActivo, boolean descuentoAplicable) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.sku = sku;
        this.categoria = categoria;
        this.esActivo = esActivo;
        this.descuentoAplicable = descuentoAplicable;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public String getSku() { return sku; }
    public String getCategoria() { return categoria; }
    public boolean getEsActivo() { return esActivo; }
    public boolean getDescuentoAplicable() { return descuentoAplicable; }
}
