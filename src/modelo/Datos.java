package modelo;
import controlador.Controlador;

public class Datos {
    // GESTION ARTICULOS
    public static void crearArticulo() {
        //todo
        // agregar parametros de entrada
        // crear un nuevo objeto de tipo Articulo
        // crear clase temporal que sustituye la base de datos
        // agregarlo a la arraylist
        // enviar OK al controlador
    }

    public static void listarArticulos() {
        //todo
        // crear metodo en lista
        // override en listaArticulos
        // llamar al metodo
        // enviarlo al controlador
    }
    // FIN GESTION ARTICULOS

    // GESTION CLIENTES
    public static void crearCliente() {
        //todo
        // agregar parametros de entrada
        // crear un nuevo bojeto de tipo Cliente
        // agregarlo a la arraylist en clase temporal
        // enviar ok al controlador
    }

    public void recibirDatosClientes() {
        //todo
        // crear metodo en lista
        // override en listaClientes
        // llamar al metodo
        // enviarlo al controlador
    }

    public void recibirDatosClientesEstandard() {
        //todo
        // override en listaClientes
        // llamar al metodo
        // enviarlo al controlador
    }

    public void recibirDatosClientesPremiuem() {
        //todo
        // override en listaClientes
        // llamar al metodo
        // enviarlo al controlador
    }

    // FIN GESTION CLIENTES

    // GESTION PEDIDOS
    public static void crearDatosPedido() {
        //todo
        // conseguir el articulo
        // conseguir el cliente
        // crear nuevo pedido
        // agregar datos al pedido
        // agregar pedido a la arraylist
        // enviar informacion al controlador
    }

    public static void eliminarPedido() {
        //todo
        // recibir numero de pedido
        // buscar pedido en la arraylist
        // informar si encontrado o no
        // si encontrado enviar informacion pedido
        // confirmar eliminar
        // eliminar o cancelar

    }

    public static void recibirDatosPedidosPendientes() {
        //todo
        // recibir todos los pedidos WHERE enviado == FALSE
        // meterlos en una nueva arraylist
        // enviar arraylist a controlador
    }

    public static void recibirDatosPedidosEnviados() {
        //todo
        // recibir todos los pedidos WHERE enviado == TRUE
        // meterlos en ujna nueva arraylist
        // enviar arraylist al controlador
    }
    // FIN GESTION PEDIDOS
}

