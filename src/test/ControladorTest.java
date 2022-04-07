package test;

import controlador.ArticuloNoExisteException;
import controlador.Controlador;
import modelo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControladorTest {

    @Test
    void agregarArticulo() {
        Articulo articulo1 = new Articulo("AS235D", "descripcion1", 34.5, 4.24, 67);
        ListaArticulos.addArticulo(articulo1);
        assertEquals(articulo1, ListaArticulos.getArticulo("AS235D"));
    }

    @Test
    @DisplayName("No deberia agregar un articulo al pedido si el articulo no existe")
    public void deberiaDevolverArticuloNoExisteException() {
        Cliente cliente = ListaClientes.getCliente("email8@prueba.com");
        Articulo articulo = ListaArticulos.getArticulo("AS235j");
        Pedido pedido9 = new Pedido(9,articulo, cliente, 11, LocalDate.now(), true);
        Assertions.assertThrows(RuntimeException.class, () -> {
            ListaPedidos.addPedido(pedido9);
        });
    }

    @Test
    void mostrarArticulos() {
        Articulo articulo1 = new Articulo("AS235D", "descripcion1", 34.5, 4.24, 67);
        ListaArticulos.addArticulo(articulo1);
//todo
//        List<Articulo> articulos = Datos.listarArticulos();
//        // comprobar que la lista no esta vacia
//        assertFalse(ListaArticulos.getArticulos().isEmpty());
//        // comprobar que el tamano es de solamente 1
//        assertEquals(articulos.size(), 1);
    }

    @Test
    void agregarCliente() {
    }

    @Test
    void comprobarClienteExiste() {
    }

    @Test
    void mostrarClientes() {
    }

    @Test
    void mostrarClientesEstandard() {
    }

    @Test
    void mostrarClientesPremium() {
    }

    @Test
    void agregarPedido() {
    }

    @Test
    void eliminarPedido() {
    }

    @Test
    void mostrarPedidosPendientes() {
    }

    @Test
    void mostrarPedidosEnviados() {
    }

    static class PedidoTest {

        @Test
        void recibirNumeroPedido() {
            Articulo articulo1 = ListaArticulos.getArticulo("AS235D");
            Cliente cl1 = ListaClientes.getCliente("email1@prueba.com");
            Cliente cl4 = ListaClientes.getCliente("email14@prueba.com");
            Pedido pedido1 = new Pedido(1,articulo1, cl1, 1, LocalDate.now(), false);
            ListaPedidos.addPedido(pedido1);
            Pedido pedido2 = new Pedido(2,articulo1, cl4, 4, LocalDate.now(), false);
            ListaPedidos.addPedido(pedido2);
            int numero = Pedido.recibirNumeroPedido();
            assertEquals(3, numero);
        }

        @Test
        void pedidoEnviado() {
        }

        @Test
        void pedidoProcesado() {
        }

        @Test
        void cancelarPedido() {
        }

        @Test
        void calcularPrecio() {
        }

        @Test
        void precioEnvio() {
        }
    }
}