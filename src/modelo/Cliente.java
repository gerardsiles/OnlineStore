package modelo;

abstract class Cliente {

    private String nombre;
    private String domicilio;
    private String NIF;
    private String email;

    public Cliente(String nombre, String domicilio, String NIF, String email) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.NIF = NIF;
        this.email = email;
    }

    public String getNombre() { return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDomicilio() { return domicilio; }
    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }

    public String getNIF() { return NIF; }
    public void setNIF(String NIF) { this.NIF = NIF; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }


    public static class ListaClientes {
    }

    public abstract Cliente tipoDeCliente (String email); //  implemented in override in childs


    public abstract double cuotaAnual(); //  implemented in override in childs

    public abstract int descuentoGastosDeEnvio(); // implemented in override in childs


    @Override
    public String toString() {
        return "\"Datos del cliente: \\n\" + \n" +
                "Tipo de cliente: Premium\" + \"\\n\" +\n" +
                "Nombre: \" + this.getNombre() + \"\\n\" +\n" +
                "Domicilio: \" + this.getDomicilio() + \"\\n\" +\n" +
                "NIF: \" + this.getNIF() + \"\\n\" +   \n" +
                "Email: \" + this.getEmail() + \"\\n\" +\n"
                ;
        // TODO
    }

}
