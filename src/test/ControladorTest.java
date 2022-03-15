package test;

import modelo.ArrayDatos;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ControladorTest {

    @Test
    void agregarArticulo() {
        Articulo articulo1 = new Articulo("AS235D", "descripcion1", 34.5, 4.24, 67);
        ArrayDatos.addArticulo(articulo1);
        assertEquals(articulo1, ArrayDatos.getArticulo("AS235D"));
    }

    @Test
    void mostrarArticulos() {
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
            Articulo articulo1 = ArrayDatos.getArticulo("AS235D");
            Cliente cl1 = ArrayDatos.getCliente("email1@prueba.com");
            Cliente cl4 = ArrayDatos.getCliente("email14@prueba.com");
            Pedido pedido1 = new Pedido(1,articulo1, cl1, 1, LocalDate.now(), false);
            ArrayDatos.addPedido(pedido1);
            Pedido pedido2 = new Pedido(2,articulo1, cl4, 4, LocalDate.now(), false);
            ArrayDatos.addPedido(pedido2);
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