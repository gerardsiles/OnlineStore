package test;

import controlador.Controlador;
import modelo.ArrayDatos;
import modelo.ClienteEstandard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorTest {

    @Test
    void comprobarClienteExiste() {
        ClienteEstandard cl1 = new ClienteEstandard("nombre1", "domicilio1", "nif1", "email1@prueba.com");
        ArrayDatos.addClienteEstandard(cl1);
        assertEquals(true, Controlador.comprobarClienteExiste("email1@prueba.com"));
    }
}