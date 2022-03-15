package test;

import modelo.ArrayDatos;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DatosTest {



    @Test
    void crearArticulo() {
        Articulo articulo = new Articulo("codigoTest", "descripcion test", 12.3, 2.7, 14);
        ArrayDatos.addArticulo(articulo);
        assertEquals(articulo, ArrayDatos.getArticulo("codigoTest"));
    }

    @Test
    void listarArticulos() {
    }

    @Test
    void clienteExiste() {
    }

    @Test
    void crearCliente() {
    }

    @Test
    void recibirDatosClientes() {
    }

    @Test
    void recibirDatosClientesEstandard() {
    }

    @Test
    void recibirDatosClientesPremium() {
    }

    @Test
    void crearDatosPedido() {
        boolean existe = false;
        Articulo articulo = ArrayDatos.getArticulo("AS235D");
        Cliente cliente = ArrayDatos.getCliente("email1@prueba.com");
        Pedido pedido = new Pedido(Pedido.recibirNumeroPedido(),articulo, cliente, 2, LocalDate.now(), false);
        // agregar datos al pedido
        ArrayDatos.addPedido(pedido);

        // Comprobar que el pedido se haya creado correctamente
        existe = ArrayDatos.pedidoExiste(pedido);
        assertEquals(true, ArrayDatos.pedidoExiste(pedido));
    }
}