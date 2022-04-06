package test;

import modelo.Cliente;
import modelo.ClienteEstandard;
import modelo.ListaClientes;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListaClientesTest {

    @Test
    void getClientes() {
        ClienteEstandard cl1 = new ClienteEstandard("nombre1", "domicilio1", "nif1", "email1@prueba.com");
        ListaClientes.addCliente(cl1);
        List<Cliente> clientes = ListaClientes.getClientes();
        // comprobar que no esta vacio
        assertFalse(ListaClientes.getClientes().isEmpty());
        // comprobar que solo devuelve 1
        assertEquals(clientes.size(), 1);
    }

}