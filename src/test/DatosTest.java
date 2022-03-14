package test;

import modelo.ArrayDatos;
import modelo.Articulo;
import org.junit.jupiter.api.Test;

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
}