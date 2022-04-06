package modelo;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class Datos {
    // Instanciar las implementaciones del DAO
    private ClienteDAOImpl cliente = new ClienteDAOImpl();

    // constructor
    public Datos() {
    }

    // GESTION ARTICULOS

    public void cargarDatos() {
        ListaArticulos.cargarDatosArticulos();
        ListaPedidos.cargarDatosPedidos();
    }

    public static boolean crearArticulo(List<Object> parametros) {

        // crear un nuevo objeto de tipo Articulo
        Articulo articulo = new Articulo(parametros.get(0).toString(),parametros.get(1).toString(),
                (Double)parametros.get(2), (Double)parametros.get(3), (Integer)parametros.get(4));

        // Comprobar si el articulo existe antes de agregarlo
        if (!ListaArticulos.articuloExiste(parametros.get(0).toString())){
            // agregarlo a la arraylist en main
            ListaArticulos.addArticulo(articulo);
        }

        // enviar al controlador si el articulo se ha creado o no
        return ListaArticulos.articuloExiste(parametros.get(0).toString());
    }

    public static boolean articuloExiste(String codArticulo) {
        return ListaArticulos.articuloExiste(codArticulo);
    }

    public static List listarArticulos() {
        List lista = ListaArticulos.getArticulos();
        return lista;
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

    public List recibirDatosClientes() {
        List lista = cliente.getClientes();
        return lista;
    }

    public List recibirDatosClientesEstandard() {
        List lista = cliente.listarClientesEstandard();
        return lista;
    }

    public List recibirDatosClientesPremium() {
        List lista = cliente.listarClientesPremium();
        return lista;
    }

    // FIN GESTION CLIENTES

    // GESTION PEDIDOS
    public static boolean crearDatosPedido(List parametros) {
        boolean existe = false;
        Articulo articulo = ListaArticulos.getArticulo((String)parametros.get(0));
        Cliente cliente = ListaClientes.getCliente((String)parametros.get(1));

        // el numero de pedido se recibe automaticamente
        Pedido pedido = new Pedido(Pedido.recibirNumeroPedido(), articulo,
                cliente, (Integer)parametros.get(2), (LocalDate)parametros.get(3), (Boolean)parametros.get(4));
        // agregar datos al pedido
        ListaPedidos.addPedido(pedido);

        // Comprobar que el pedido se haya creado correctamente
        existe = ListaPedidos.pedidoExiste(pedido);
        // enviar informacion al controlador
        return existe;
    }

    public static Pedido getPedido(int numPedido) {
        Pedido pedido = ListaPedidos.getPedido(numPedido);
        return pedido;
    }

    // metodo para comprobar si un pedido existe
    public static boolean pedidoExiste(int numPedido) {
        Pedido pedido = ListaPedidos.getPedido(numPedido);
        boolean existe = ListaPedidos.pedidoExiste(pedido);
        return existe;
    }

    // metodo para eliminar un pedido existente
    public static boolean eliminarPedido(int numPedido) {
        boolean eliminado = false;
        eliminado = ListaPedidos.eliminarPedido(numPedido);
        return eliminado;
    }

    public static List recibirDatosPedidosPendientes() {
        // recibir todos los pedidos WHERE enviado == FALSE
        List lista = ListaPedidos.getPedidosPendientes();
        // enviar arraylist a controlador
        return lista;
    }

    public static List recibirDatosPedidosEnviados() {
        // recibir todos los pedidos enviados
        List lista = ListaPedidos.getPedidosEnviados();
        return lista;
    }
    // FIN GESTION PEDIDOS
}

