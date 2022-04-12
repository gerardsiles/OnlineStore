package modelo;


import java.util.Date;
import java.util.List;


public class Datos {
    // Instanciar las implementaciones del DAO
    private final ClienteDAOImpl cliente = new ClienteDAOImpl();
    private final ArticuloDAOImpl articulo = new ArticuloDAOImpl();
    private final PedidoDAOImpl pedido = new PedidoDAOImpl();

    // constructor
    public Datos() {
    }

    // GESTION ARTICULOS
    public boolean crearArticulo(List<Object> parametros) {

        // crear un nuevo objeto de tipo Articulo
        Articulo articuloACrear = new Articulo(parametros.get(0).toString(),parametros.get(1).toString(),
                (Double)parametros.get(2), (Double)parametros.get(3), (Integer)parametros.get(4));

        // Comprobar si el articulo existe antes de agregarlo
        if (!articulo.articuloExiste(parametros.get(0).toString())){
            // agregarlo a la arraylist en main
            articulo.addArticulo(articuloACrear);
        }

        // enviar al controlador si el articulo se ha creado o no
        return articuloExiste(parametros.get(0).toString());
    }

    // Comprobar si el articulo existe en la base de datos
    public boolean articuloExiste(String codArticulo) {
        return articulo.articuloExiste(codArticulo);
    }

    public List<Articulo> listarArticulos() {
        return articulo.getArticulos();
    }
    // FIN GESTION ARTICULOS

    // GESTION CLIENTES
    // comprobar si el cliente existe
    public boolean clienteExiste(String email) {
        return cliente.clienteExiste(email);
    }

    public boolean crearCliente(List<Object> parametros) {
        boolean clienteCreado = false;
        // en la primera posicion de los parametros tenemos el tipo de cliente
        if (parametros.get(0).equals(1)) {
            // crear cliente estandard
            Cliente clienteEstandard = new ClienteEstandard(parametros.get(1).toString(),parametros.get(2).toString(),
                    parametros.get(3).toString(),parametros.get(4).toString());
            cliente.addCliente(clienteEstandard);
            clienteCreado = cliente.clienteExiste(parametros.get(1).toString());
        } else if (parametros.get(0).equals(2)) {
            // crear cliente premium
            Cliente cp = new ClientePremium(parametros.get(1).toString(),parametros.get(2).toString(),
                    parametros.get(3).toString(),parametros.get(4).toString());
            cliente.addCliente(cp);
            clienteCreado = cliente.clienteExiste(parametros.get(1).toString());
        }
        // enviar si el cliente exista en la base de datos al controlador
        return clienteCreado;
    }

    public List<Cliente> recibirDatosClientes() {
        return cliente.getClientes();
    }

    public List<Cliente> recibirDatosClientesEstandard() {
        return cliente.listarClientesEstandard();
    }

    public List<Cliente> recibirDatosClientesPremium() {
        return cliente.listarClientesPremium();
    }

    // FIN GESTION CLIENTES

    // GESTION PEDIDOS
    public boolean crearDatosPedido(List<Object> parametros) {
        boolean existe;
        Pedido nuevoPedido = new Pedido();
        Articulo articuloPedido = articulo.getArticuloByID((String)parametros.get(0));
        Cliente clientePedido = cliente.getClienteByEmail((String)parametros.get(1));

        // Declarar la fecha
        Date date = new Date();
        java.sql.Timestamp dateSQL = new java.sql.Timestamp(date.getTime());
        // Set valores del pedido
        // el numero de pedido es autoincrement, no hace falta agregarlo
        nuevoPedido.setArticulo(articuloPedido);
        nuevoPedido.setCliente(clientePedido);
        nuevoPedido.setCantidad((Integer)parametros.get(2));
        nuevoPedido.setFecha(dateSQL);
        nuevoPedido.setProcesado(false);

        // agregar datos al pedido
        existe = pedido.addPedido(nuevoPedido);

        return existe;
    }

    public Pedido getPedido(int numPedido) {
        return pedido.getPedido(numPedido);
    }



    // metodo para eliminar un pedido existente
    public boolean eliminarPedido(int numPedido) {
        return pedido.eliminarPedido(numPedido);
    }

    public List<Pedido> recibirDatosPedidosPendientes() {
        // actualizar los pedidos si se han enviado
        pedido.actualizarPedidos();
        // recibir todos los pedidos WHERE enviado == FALSE
        return pedido.getPedidosPendientes();
    }

    public List<Pedido> recibirDatosPedidosEnviados() {
        // actualizar los pedidos
        pedido.actualizarPedidos();
        // recibir todos los pedidos enviados
        return pedido.getPedidosEnviados();

    }
    // FIN GESTION PEDIDOS
}

