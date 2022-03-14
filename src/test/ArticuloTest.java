package test;

import modelo.Articulo;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticuloTest {

    @org.junit.jupiter.api.Test
    void getCodigoProducto() {
        Articulo a = new Articulo("test1", "descripcion1 test", 34.5, 4.24, 67);
        assertEquals("test1", a.getCodigoProducto());
    }

    @org.junit.jupiter.api.Test
    void setCodigoProducto() {
        Articulo a = new Articulo("test1", "descripcion1 test", 34.5, 4.24, 67);
        a.setCodigoProducto("test2");
        assertEquals("test2", a.getCodigoProducto());
    }

    @org.junit.jupiter.api.Test
    void getDescripcion() {
        Articulo a = new Articulo("test1", "descripcion1 test", 34.5, 4.24, 67);
        assertEquals("descripcion1 test", a.getDescripcion());
    }

    @org.junit.jupiter.api.Test
    void setDescripcion() {
        Articulo a = new Articulo("test1", "descripcion1 test", 34.5, 4.24, 67);
        a.setDescripcion("descripcion2 test");
        assertEquals("descripcion2 test", a.getDescripcion());

    }

    @org.junit.jupiter.api.Test
    void getPvp() {
        Articulo a = new Articulo("test1", "descripcion1 test", 34.5, 4.24, 67);
        assertEquals(34.5, a.getPvp());

    }

    @org.junit.jupiter.api.Test
    void setPvp() {
        Articulo a = new Articulo("test1", "descripcion1 test", 34.5, 4.24, 67);
        a.setPvp(12.2);
        assertEquals(12.2, a.getPvp());
    }

    @org.junit.jupiter.api.Test
    void getGastosDeEnvio() {
        Articulo a = new Articulo("test1", "descripcion1 test", 34.5, 4.24, 67);
        assertEquals(4.24, a.getGastosDeEnvio());
    }

    @org.junit.jupiter.api.Test
    void setGastosDeEnvio() {
        Articulo a = new Articulo("test1", "descripcion1 test", 34.5, 4.24, 67);
        a.setGastosDeEnvio(2.3);
        assertEquals(2.3, a.getGastosDeEnvio());
    }

    @org.junit.jupiter.api.Test
    void getTiempoDePreparacion() {
        Articulo a = new Articulo("test1", "descripcion1 test", 34.5, 4.24, 67);
        assertEquals(67, a.getTiempoDePreparacion());
    }

    @org.junit.jupiter.api.Test
    void setTiempoDePreparacion() {
        Articulo a = new Articulo("test1", "descripcion1 test", 34.5, 4.24, 67);
        a.setTiempoDePreparacion(12);
        assertEquals(12, a.getTiempoDePreparacion());
    }
}