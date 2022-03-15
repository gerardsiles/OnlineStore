package modelo;


import java.time.LocalDate;
import java.util.List;


public class Datos {
    // GESTION ARTICULOS
    private static ArrayDatos baseDeDatos = new ArrayDatos();

    public static void cargarDatos() {
        ArrayDatos.cargarDatos();
    }

    public static boolean crearArticulo(List<Object> parametros) {

        // crear un nuevo objeto de tipo Articulo
        Articulo articulo = new Articulo(parametros.get(0).toString(),parametros.get(1).toString(),
                (Double)parametros.get(2), (Double)parametros.get(3), (Integer)parametros.get(4));

        // agregarlo a la arraylist en main
        ArrayDatos.addArticulo(articulo);
        // enviar al controlador si el articulo se ha creado o no
        return ArrayDatos.articuloExiste(parametros.get(0).toString());
    }

    public static boolean articuloExiste(String codArticulo) {
        boolean existe;
        existe = ArrayDatos.articuloExiste(codArticulo);
        return existe;
    }

    public static List listarArticulos() {
        List lista = ListaArticulos.getArticulos();
        return lista;
    }
    // FIN GESTION ARTICULOS

    // GESTION CLIENTES
    public static boolean clienteExiste(String email) {
        boolean existe = false;

        for (Cliente cliente : ArrayDatos.getClientes()) {
            if (cliente.getEmail().equals(email)) {
                existe = true;
            }
        }
        return existe;
    }
    public static boolean crearCliente(List<Object> parametros) {
        boolean clienteExiste = false;
        if (parametros.get(0).equals(1)) {
            // crear cliente estandard
            Cliente ce = new ClienteEstandard(parametros.get(1).toString(),parametros.get(2).toString(),
                    parametros.get(3).toString(),parametros.get(4).toString());
            ArrayDatos.addCliente(ce);
            clienteExiste = ArrayDatos.clienteExiste(ce);
        } else if (parametros.get(0).equals(2)) {
            // crear cliente premium
            Cliente cp = new ClientePremium(parametros.get(1).toString(),parametros.get(2).toString(),
                    parametros.get(3).toString(),parametros.get(4).toString());
            ArrayDatos.addCliente(cp);
            clienteExiste = ArrayDatos.clienteExiste(cp);

        }
        // Comprobar que el cliente se ha creado correctamente
        // enviar ok al controlador
        return clienteExiste;
    }

    public static List recibirDatosClientes() {
        //todo
        List lista = ListaClientes.listarClientes();
        return lista;
    }

    public static List recibirDatosClientesEstandard() {
        List lista = ListaClientes.listarClientesEstandard();
        return lista;
    }

    public static List recibirDatosClientesPremium() {
        List lista = ListaClientes.listarClientesPremium();
        return lista;
    }

    // FIN GESTION CLIENTES

    // GESTION PEDIDOS
    public static boolean crearDatosPedido(List parametros) {
        boolean existe = false;
        Articulo articulo = ArrayDatos.getArticulo((String)parametros.get(0));
        Cliente cliente = ArrayDatos.getCliente((String)parametros.get(1));
        // calcular el precio total del pedido
        // calcular los gastos de envio
        // calcular si tiene descuento al ser cliente premiuem
        // creamos nuevo pedido
        // el numero de pedido se recibe automaticamente
        Pedido pedido = new Pedido(Pedido.recibirNumeroPedido(), articulo,
                cliente, (Integer)parametros.get(2), (LocalDate)parametros.get(3), (Boolean)parametros.get(4));
        // agregar datos al pedido
        ArrayDatos.addPedido(pedido);

        // Comprobar que el pedido se haya creado correctamente
        existe = ArrayDatos.pedidoExiste(pedido);
        // enviar informacion al controlador
        return existe;
    }

    public static Pedido getPedido(int numPedido) {
        Pedido pedido = ArrayDatos.getPedido(numPedido);
        return pedido;
    }

    // metodo para comprobar si un pedido existe
    public static boolean pedidoExiste(int numPedido) {
        Pedido pedido = ArrayDatos.getPedido(numPedido);
        boolean existe = ArrayDatos.pedidoExiste(pedido);
        return existe;
    }

    // metodo para eliminar un pedido existente
    public static boolean eliminarPedido(int numPedido) {
        boolean eliminado = false;
        eliminado = ArrayDatos.eliminarPedido(numPedido);
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

