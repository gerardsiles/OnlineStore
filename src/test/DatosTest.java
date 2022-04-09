package test;

import modelo.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import modelo.ClienteDAOImpl;
import static org.junit.jupiter.api.Assertions.*;

class DatosTest {

    @Test
    void crearCliente() {
        ClienteDAOImpl cliente = new ClienteDAOImpl();
        ClienteEstandard cl1 = new ClienteEstandard("nombre1", "domicilio1", "nif1", "email1@prueba.com");
        cliente.addCliente(cl1);
    }

    @Test
    void crearArticulo() {

    }

    @Test
    void clienteExiste() {

    }



    @Test
    void crearDatosPedido() {
//        boolean existe = false;
//        Date date = new Date();
//        Articulo articulo = ListaArticulos.getArticulo("AS235D");
//        Cliente cliente = ListaClientes.getCliente("email1@prueba.com");
//        Pedido pedido = new Pedido(1,articulo, cliente, 2, date, false);
//        // agregar datos al pedido
//        ListaPedidos.addPedido(pedido);
//
//        // Comprobar que el pedido se haya creado correctamente
//        existe = ListaPedidos.pedidoExiste(pedido);
//        assertEquals(true, ListaPedidos.pedidoExiste(pedido));
    }
}