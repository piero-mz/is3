package grupo3;
import java.util.List;
import modelo.Producto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Servicio3Test {

    //Pruebas Unitarias para funcionalidad secundaria 1
    @Test
    void verificarLimiteValidoTest() {
        int totalCantidad = 0;
        assertTrue(Servicio3.verificarCantidad(totalCantidad));
    }
    
    @Test
    void verificarSKUDuplicadoTest() {
        Producto producto1 = new Producto("Laptop",10.00,1,"111","Tecno",true,true);
        String sku1=producto1.getSku();
        Producto producto2 = new Producto("Laptop2",12.00,1,"111","Tecno",true,true);
        String sku2=producto2.getSku();
        assertFalse(Servicio3.validarSKU(sku1,sku2));
    }

    @Test
    void verificarAgregadoCorrectoTest() {
        Producto producto = new Producto("Laptop",10.00,1,"111","Tecno",true,true);
        int cantidad =producto.getCantidad();
        assertTrue(Servicio3.agregarProducto(producto));
    }

    @Test
    void verificarAtributosTest() {
        Producto producto = new Producto("Laptop",10.00,1,"111","Tecno",true,true);
        assertTrue(Servicio3.respetoAtributos(producto));
    }

    //Pruebas unitarias para funcionalidad secundaria 2
    @Test
    void descuentoValidoTest(){
        double descuento = 49.0; //Dentro del rango (0 - 50)
        boolean resultado = Servicio3.validarDescuento(descuento);

        assertTrue(resultado);
    }

    @Test
    void descuentoInvalidoTest(){
        double descuento = 51.0; //Fuera del rango (0 - 50)
        boolean resultado = Servicio3.validarDescuento(descuento);

        assertFalse(resultado);
    }

    //Pruebas unitarias para funcionalidad secundaria 3    
    @Test
    void testIGVConProductoSimulado() {
        Producto producto = new Producto("Laptop", 200.0, 1);
        double total = producto.getPrecio() * producto.getCantidad();
        double totalConIGV = Servicio3.calcularIGV(total);
        assertEquals(236.0, totalConIGV);
    }

    //Pruebas unitarias para funcionalidad secundaria 4
    @Test
    void validarCliente_NombreValidoTest(){
        String nombreValido = " Juan Pérez ";
        boolean resultado = Servicio3.validarCliente(nombreValido);
        assertTrue(resultado);
    }

    @Test
    void validarCliente_NombreVacioTest(){
        String nombreVacio = "  ";
        boolean resultado = Servicio3.validarCliente(nombreVacio);
        assertFalse(resultado);
    }
    
    
    //Pruebas unitarias para funcionalidad secundaria 5
    @Test
    void verificarStock_cantidadCeroTest() {
        List<Producto> productosConUnoEnCero = List.of(
                new Producto("Mouse", 100.0, 2),
                new Producto("Teclado", 50.0, 0),
                new Producto("Monitor", 20.0, 1)
        );
        boolean resultado = Servicio3.verificarStock(productosConUnoEnCero);
        assertFalse(resultado);
    }

    @Test
    void verificarStock_cantidadValidaTest() {
        List<Producto> productosConStockValido = List.of(
                new Producto("Mouse", 100.0, 2),
                new Producto("Teclado", 50.0, 1),
                new Producto("Monitor", 20.0, 3)
        );
        boolean resultado = Servicio3.verificarStock(productosConStockValido);
        assertTrue(resultado);
    }
}

