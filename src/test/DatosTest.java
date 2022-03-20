package test;

import modelo.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DatosTest {



    @Test
    void crearArticulo() {
        Articulo articulo = new Articulo("codigoTest", "descripcion test", 12.3, 2.7, 14);
        ListaArticulos.addArticulo(articulo);
        assertEquals(articulo, ListaArticulos.getArticulo("codigoTest"));
    }

    @Test
    void clienteExiste() {
        ClientePremium cl10 = new ClientePremium("nombre10", "domicilio10", "nif10", "email10@prueba.com");
        ListaClientes.addCliente(cl10);
        assertEquals(true, ListaClientes.clienteExiste(cl10));
    }



    @Test
    void crearDatosPedido() {
        boolean existe = false;
        Articulo articulo = ListaArticulos.getArticulo("AS235D");
        Cliente cliente = ListaClientes.getCliente("email1@prueba.com");
        Pedido pedido = new Pedido(1,articulo, cliente, 2, LocalDate.now(), false);
        // agregar datos al pedido
        ListaPedidos.addPedido(pedido);

        // Comprobar que el pedido se haya creado correctamente
        existe = ListaPedidos.pedidoExiste(pedido);
        assertEquals(true, ListaPedidos.pedidoExiste(pedido));
    }
}