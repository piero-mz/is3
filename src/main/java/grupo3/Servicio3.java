package grupo3;
import java.util.List;
import modelo.Producto;

public class Servicio3 {

    //Funcion1
    public static boolean verificarCantidad(int cantidad){
        int limite_cantidad = 0;
        if(cantidad <= limite_cantidad){
            throw new IllegalArgumentException("Error, ingrese una cantidad válida");
        }
        return true;
    }

    //Funcion2
    public static boolean validarSKU(String sku1, String sku2) {
        if (sku1== sku2) {
            return false;
        }
        String nombreLimpio = sku1.trim(); //limpia espacios al inicio y final
        String nombreLimpio2 = sku2.trim(); //limpia espacios al inicio y final
        //if(nombreLimpio.isEmpty()){
        //    return false;
        //}
        return true;
    }

    public static boolean agregarProducto(Producto producto) {
        if (producto.getCantidad() <= 0) {
            throw new IllegalArgumentException("El producto no cuenta con una cantidad valida")
        }else {
            System.out.println(producto.getNombre()+":"+producto.getCantidad()+":"+producto.getPrecio());
        }
        return true;
    }
    public static boolean respetoAtributos(Producto producto) {
        if (producto != null) {
            producto.toString();
        }
        return true;
    }
    //FuncionSecundaria2
    public static boolean validarDescuento(double descuento) {
        if  (descuento < 0 || descuento > 50) {
            return false;
        }
        return true;
    }

    //FuncionSecundaria3
    public static double calcularIGV(double total) {
        if (total < 0) {
            throw new IllegalArgumentException("Total inválido");
        }
        return total * 1.18; // IGV = 18%
    }


    
    
    //FunciónSecundaria5
    public static boolean verificarStock(List<Producto> productos) {
        if (productos == null || productos.isEmpty()) {
            throw new IllegalArgumentException("Lista de productos invalida");
        }

        for (Producto producto : productos) {
            if (producto == null) {
                throw new IllegalArgumentException("Producto nulo en la lista");
            }
            if (producto.getCantidad() <= 0) {
                return false;
            }
        }
        return true;
    }

}
