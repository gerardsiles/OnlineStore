package controlador;

import vista.*;
import modelo.*;

public class ControladorCliente {
    private Cliente modelo;
    private VistaCliente vista;

    public ControladorCliente(Cliente modelo, VistaCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setNombreCliente (String nombre) {
        modelo.setNombre(nombre);
    }

    public String getNombreCliente () {
        return modelo.getNombre();
    }

    public void setDomicilioCliente (String domicilio) {
        modelo.setDomicilio(domicilio);
    }

    public String getDomicilioCliente () {
        return modelo.getDomicilio();
    }

    public void setNifCliente(String nif) {
        modelo.setNIF(nif);
    }

    public String getNifCliente() {
        return modelo.getNIF();
    }

    public void setEmailCliente(String email) {
        modelo.setEmail(email);
    }

    public String getEmailcliente() {
        return modelo.getEmail();
    }
}
