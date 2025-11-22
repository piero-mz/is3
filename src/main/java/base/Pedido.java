package base;

import modelo.Producto;
import java.util.List;

public class Pedido {
    private List<Producto> detallesPedido;
    public boolean agregarProducto(Producto producto, int cantidad) { if (cantidad <= 0) {
        System.err.println("Error: La cantidad a agregar debe ser positiva.");

        return false;
        }

    // Busca si el producto ya existe en la lista
        boolean productoYaExiste = detallesPedido.stream()
                .anyMatch(p -> p.getNombre().equals(producto.getNombre()));

        if (productoYaExiste) {
            return false; // Falla porque ya existe
        } else {
// Creamos una nueva instancia con la cantidad especificada y la añadimos a la lista detallesPedido.add(new Producto(producto.getNombre(), producto.getPrecio(), cantidad)); return true;
        }
        return productoYaExiste;
    }
    public boolean validarStock(Producto producto) { for (Producto producto1 : detallesPedido) {
        if (producto.getCantidad() <= 0) { return false;
        }
    }
        return true;
    }


}
//comentario random 2da prueba
