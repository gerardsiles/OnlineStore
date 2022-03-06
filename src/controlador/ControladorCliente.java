package controlador;

import vista.*;
import modelo.*;

public class ControladorCliente {
    private Cliente modelo;
    private VistaCliente vista;

    public ControladorCliente (Cliente modelo, VistaCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public String getNombreCliente() {
        return modelo.getNombre();
    }
    public void setNombreCliente(String nombre) {
        modelo.setNombre(nombre);
    }

    public String getDomicilioCliente() {
        return modelo.getDomicilio;
    }
    public void setDomicilioCliente(String domicilio) {
        modelo.setDomicilio(domicilio);
    }

    // todo geters y setters

    public void actualizarVista() {
        vista.imprimirDatosCliente(modelo.getNombre(), modelo.getDomicilio,
                modelo.getNIF(), modelo.getEmail());
    }

}
