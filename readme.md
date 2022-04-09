## Programacion orientada a objetos con acceso a bases de datos
<br>

### Producto 1
<br>
En el producto 1 hemos realizado el diagrama uml con el patron
de diseno MVC.
<br>

[link al uml](https://drive.google.com/file/d/1I1cvdOLk6Yn9HK_WoC_wMYl8NhQNS6OM/view?usp=sharing)

A parte, hemos implementado el esqueleto de la aplicacion con todas las clases en cada parte del modelo.

### Producto 2
Apartados implementados en el producto 2:
* Implementar el modelo estático de clases en lenguaje Java.
<br>
las clases estan declaradas como estaticas, de esta manera no hace falta instanciarlas para poder acceder a sus metodos.
<br>
* En la implementación deberán utilizarse como mínimo las Clases Genéricas o Java Generics.
<br>
La clase cliente es una clase generica, implementando sus metodos en las especificaciones de cliente estandard y
la de cliente permium.
<br>
* Elegir el Tipo de Colecciones en Java óptimo para cada caso en función de la necesidad o requisito a implementar.
<br>
Cada clase solamente importara los paquetes y clases con las que interactue.
<br>
* Se debe tener en cuenta la correcta gestión de Excepciones, así como implementar Excepciones personalizadas.
* Realizar un programa en Java en modo de consola que almacene la información en estructuras dinámicas de datos.
* Realizar pruebas unitarias utilizando el entorno JUnit. Elegir dos métodos que apliquen lógica de negocio y realizar las pruebas unitarias con JUnit para evaluar su correcto funcionamiento.

#### **Implementacion del menu**
Gestión Artículos:
* Añadir Articulo.<br>
* Mostrar Artículos.<br>

Gestión de Clientes:
* Añadir Clientes
* Mostrar Clientes
* Mostrar Clientes Estándar
* Mostrar Clientes Premium

Gestión de Pedidos<br>
* Añadir Pedido. En caso de que al pedir los datos del pedido el cliente no existe, es decir, se trata de un nuevo cliente, se deben pedir los datos del nuevo cliente y se añadirá a la lista de clientes. El articulo en el momento de añadir un pedido debe existir.
* Eliminar Pedido. Un pedido puede ser borrado únicamente si no ha sido enviado, es decir, si el tiempo transcurrido a desde la fecha y hora del pedido no supera el tiempo de preparación para el envío del artículo.
* Mostar pedidos pendientes de envío con la opción de filtrar por cliente.
* Mostrar pedidos enviados con la opción de filtrar por cliente.

Implementacion del MVC:
* **grupofp.vista**: la vista contendrá todas las clases relacionadas con el manejo del menú de opciones, así como la entrada y visualización de los datos. Este paquete contendrá las clases OnlineStore y GestionOS.
* **grupofp.controlador**: el paquete controlador únicamente contendrá la clase Controlador, que hará de puente entre la vista y el modelo. La vista sólo podrá utilizar esta clase para acceder a la información del modelo.
* **grupofp.modelo**: el modelo contendrá todas las clases que modelan los datos que deben gestionarse dentro de la aplicación. Dentro del modelo, merece especial mención la clase Datos, que contendrá todos los datos de la aplicación y llevará a cabo todas las acciones que afectan a las mismas. Este paquete contendrá las clases Datos, Cliente, ListaClientes así como el resto de clases necesarias en la capa Modelo.

### Clases del proyecto

**Clase Artículo**

La clase Artículo almacena toda la información relevante de los artículos.
Se debe añadir un constructor que permita inicializar los valores, los getters y setters y el toString.

**Clase Cliente y Clases Heredadas**

La clase Cliente guardará la información de los clientes. Esta información incluye el correo electrónico, nombre y dirección de cada cliente. Debe declararse la clase Cliente como clase abstracta, incorporando un constructor que inicialice sus atributos, así como los getters y setters necesarios. Además, será necesario declarar los métodos abstractos, que devuelven el tipo de cliente y los que calculan la cuota anual de cada cliente dependiendo del tipo de cliente, así como el descuento de gastos de envío:

```java
public abstract String tipoCliente();

public abstract float calcAnual();

public abstract float descuentoEnv();
```




Las clases hijas, ClienteEstandard y ClientePremium, implementarán los métodos abstractos indicados.

Además, también se necesita definir un método toString con los datos de todos los atributos.

<br>

**Clase Pedido**

La clase Pedido almacena toda la información relacionada con cada pedido.

El articulo y el cliente del pedido no deben ser de tipo String, sino que deben ser de tipo Articulo y Cliente respectivamente.

Se debe añadir un constructor que permita inicializar los valores, los getters y setters y el toString.

También debe contener los métodos siguientes:


```java
public boolean pedidoEnviado();

public float precioEnvio();
```

El método toString debe construir una cadena con los datos siguientes: número de pedido, fecha y hora del pedido, Nif y nombre del cliente, código y descripción del artículo, cantidad, precio artículo, coste envío, precio total y si ya se ha enviado.

<br>

**Clase Lista**

La aplicación que debemos implementar debe gestionar colecciones de tres tipos de objetos: Artículo, Cliente y Pedido. Dado que las operaciones que necesitamos realizar son muy similares para las tres colecciones, deberemos implementar la mayoría de estas operaciones en una clase genérica, y a partir de ella derivar clases para las tres listas que se necesitan.

Las clases genéricas en Java constituyen una herramienta muy útil para reutilizar software. En concreto, son clases similares a las clases convencionales pero que reciben tipos como parámetro a la hora de instanciarse. El esqueleto de la clase genérica que se debe desarrollar en este producto se muestra en el Anexo II y se declara de la siguiente forma:

```java
public class Lista<T> {

protected ArrayList<T> lista;

…

}
```


En la declaración anterior, T constituye un parámetro que incide en el tipo de elemento que se gestiona en el atributo lista, de tipo ArrayList.

A partir de la clase Lista, se definirán las clases derivadas: ListaArticulos, ListaClientes y ListaPedidos, según el tipo de objeto a gestionar. Por ejemplo, la definición de ListaArticulos se realizará de la siguiente forma:

```java
public class ListaArticulos extends Lista<Articulo>{….}
```

<br>

**Clase Controlador**

La clase Controlador será utilizada para intervenir entre la vista y los datos del modelo. Con este objetivo, la clase Controlador utilizará una instancia de la clase Datos, por ser la clase principal de la capa modelo.



### PRODUCTO 3
- Crear la estructura en la base de datos, a partir del Modelo Relacional, es decir: tablas, claves primarias y foráneas, atributos, relaciones, etc., con base de datos relacional MySQL. 

hemos trabajado con esta base de datos:

```sql
create database FP_206_Java_con_MYSQL;
use FP_206_Java_con_MYSQL;
 
CREATE TABLE articulos (
  codigo VARCHAR(10) NOT NULL PRIMARY KEY,
  descripcion VARCHAR(200) NOT NULL,
  pvp DECIMAL(6,2) NOT NULL,
  gastos_envio DECIMAL(3,2) NOT NULL,
  tiempo_preparacion INT NOT NULL
 );
 
CREATE TABLE clientes (
  email VARCHAR(50) NOT NULL PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  domicilio VARCHAR(200) NOT NULL,
  nif CHAR(9) NOT NULL,
  cuota INT ,
  descuento INT
);
 
CREATE TABLE pedidos(
  numero_pedido INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  email_cliente VARCHAR(50) NOT NULL,
  codigo_articulo VARCHAR(10) NOT NULL,
  cantidad INT NOT NULL,
  fecha DateTime NOT NULL,
  procesado BOOLEAN NOT NULL
);
ALTER TABLE pedidos ADD CONSTRAINT fk_email_cliente FOREIGN KEY (email_cliente) REFERENCES clientes (email) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE pedidos ADD CONSTRAINT fk_codigo_articulo FOREIGN KEY (codigo_articulo) REFERENCES articulos (codigo) ON DELETE NO ACTION ON UPDATE NO ACTION;

```
- Realizar un programa en Java en modo de consola que almacene la información en una base de datos relacional utilizando JDBC en lugar de estructuras dinámicas como ArrayList. 

Para empezar con esta parte, hemos creado la base de datos de mysql, y hemos adaptado el codigo para que los tipos de datos que se envian des de Java a Mysql sean los mismos.

Luego, hemos creado la conexion a MySQL en la clase conexionMYSQL, hemos ido adaptando todas las funciones que se encargaban de agregar o listar informacion, para que en lugar de agregarlo a los arreglos, lo agregara a la base de datos.
Podemos ver un ejemplo con el cliente:
```java
// Ejemplo del refactoring
// Metodo para agregar a un cliente
public static void addCliente(Cliente cliente) {clientes.add(cliente);}

// despues de la adaptacion del codigo
public boolean addCliente(Cliente cliente) {
        try {
            // preparar el mysql statement
            PreparedStatement pstm = con.prepareStatement(SQL_CREATE_CLIENTE);
            // dar valores a los campos ?
            pstm.setString(1, cliente.getEmail());
            pstm.setString(2, cliente.getNombre());
            pstm.setString(1, cliente.getDomicilio());
            pstm.setString(1, cliente.getNIF());
            pstm.setBigDecimal(1, cliente.getDescuento());
            pstm.setBigDecimal(1, cliente.getCuota());
            // Ejecutamos
            pstm.execute();
            return true;

        } catch (SQLException e) { //  si ocurre una excepcion
            System.err.println(e);
            return false;
        } finally { // para terminar cerramos la conexion
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
```
  - En este producto se debe cambiar la forma de almacenar los datos, de forma que en lugar de almacenarlos en ArrayLists se almacenarán en una base de datos, todo ello manteniendo el patrón de diseño MVC, de esta forma, solo es necesario modificar o adaptar la implementación realizada en la capa del Modelo. 

La implementacion de almacenar la informacion en la base de datos se ha aplicaco en el modelo, con la implementacion del DAO explicado en el siguiente punto.
  - Además, para separar la persistencia de los datos del resto de funcionalidades del sistema se deberá utilizar el patrón de diseño DAO (Data Access Object). Uno de los beneficios de DAO es la independencia del almacén de datos, así pues, el cambio de motor de base de datos solo afectará al DAO y no a las clases encargadas de la lógica de negocio o de presentación. o el cambio de motor de base de datos. 

Para implementar el DAO, nos basamos en su logica para implementar el patron de diseno, vamos a poner un ejemplo con el DAO de cliente: 

ClienteDAO: Una interfaz que define que debe tener la implementacion.
ClienteDAOImpl: esta clase extiende la conexion con la base de datos, e implementa la interface. Tambien se encarga de comunicarse con la clase Cliente.
ClienteService: La capa del modelo que se encarga de la logica de negocio, recibiendo y devolviendo datos. En este caso, 
hemos mantenido el paquede Datos como el servicio general de todos los DAO.
ClienteServlet: Seria la capa de presentacion generando enrutados web, en nuestro caso es una aplicacion de escritorio y solo cargaremos vistas, no endpoints. Utilizaremos el controlador para crear esas vistas.

El modelo (en este caso, hemos mantenido la capa de datos como la unica clase para interactuar con el controlador),
se encarga de llamar a las diferentes implementaciones de los DAO para que ejecuten su logica. De esta manera, hacemos
independiente el hecho de que tipo de base de datos utilizamos, solo cambiariamos el metodo al que llamamos.

Se puede ver la implementacion en el proyecto.

  - Con el objeto de conseguir la independencia del almacén de datos se usará el patrón Factory para instanciar los DAOs. 
Si tuvieramos bases de datos diferentes, necesitariamos el Factory para crear diferentes instancias del DAO para trabajar 
con la informacion de cada una de ellas. Esto lo conseguimos con el siguiente codigo:

```java
public class ObjectDAOFactory{

    public static ObjectDAO getObjectDAO(String type){ 
        if (type.equalsIgnoreCase("mysql")){
            return new ObjectDAOMySQLImpl();
        }else{
            return new ObjectDAOMSSQLImpl();
        }
    }
}
```

Este codigo nos direccionaria a las diferentes bases de datos que tuvieramos. En esta implementacion, solo trabajamos 
con MySQL, asi que realmente no nos afecta.

  - Utilizar el SGBD MySQL para realizar la persistencia. 

Hemos utilizado MySQL workbench para crear la base de datos y sus tablas, y toda la implementacion esta hecha en MySQL.

  - Utilizar una clase utilidad para controlar las conexiones a la Base de datos. 

La conexion con la base de datos se encuentra en la clase ConexionMysql.java, una clase que se encarga unicamente de 
controlar la conexion con la base de datos.

  - Utilizar JDBC de forma adecuara para evitar los ataques SQL Injection. 
  
Hemos implementado el codigo con PreparedStatement combinado con los valores ? para evitar las inyecciones
Mysql introducidas por los usuarios:

```sql
' OR '1'='1' --
' OR '1'='1' {
' OR '1'='1' /* 
```

Al combinar las sentencias con los campos ?, con el setString por ejemplo, evitamos que los usuarios puedan introducir 
esos comandos:

```java
    private final static String SQL_CREATE_PEDIDO = "INSERT INTO pedidos(email_cliente, codigo_articulo," +
        " cantidad, fecha, procesado) VALUES(?,?,?,?,?)";
@Override
public boolean addPedido(Pedido pedido) {
        try {
        // preparar el statement
        PreparedStatement pstm = con.prepareStatement(SQL_CREATE_PEDIDO);
        // Dar los valores a los campos
        pstm.setObject(1, pedido.getCliente().getEmail());
        pstm.setString(2, pedido.getArticulo().getCodigoProducto());
        pstm.setInt(3, pedido.getCantidad());
        pstm.setTimestamp(4, pedido.getFecha());
        pstm.setBoolean(5, pedido.getProcesado());
        // Ejecutamos el prepared statement
        pstm.executeUpdate();
        return true;
        } catch (SQLException ex) {
        System.err.println(ex);
        return false;
        }

        }
```
  - Aplicar transacciones y procedimientos almacenados en todas las operaciones DML que así lo requieran.

Las operaciones DML (data modification language) estan implementadas en als clasded de DAOImpl (cliente, articulo y pedido), 
alli nos encontramos con sus sentencias almacenadas en strings para ser llamadas cuando sean necesarias:

```java
    private final static String SQL_CREATE_PRODUCT = "INSERT INTO articulos(codigo, descripcion, pvp, gastos_envio, tiempo_preparacion) VALUES (?, ?, ?, ?, ?)";
    private final static String SQL_GET_PRODUCT_ID = "SELECT * FROM articulos WHERE codigo = ?";
    private final static String SQL_GET_ALL_PRODUCTS = "SELECT * FROM articulos";
```
 luego cuando son llamadas ( en este caso, las de articulos) los valores "?" son cambiados por
el valor necesario en ese momento:

```java
    public List getArticulos() {
        // Declarar lista para guardar los articulos
        List<Articulo> list = new ArrayList<>();
        // preparar el mysql statement
        try (PreparedStatement psmt = con.prepareStatement(SQL_GET_ALL_PRODUCTS)) {
            try(ResultSet rs = psmt.executeQuery()) {
                // iniciar loop para todos los resultados
                while (rs.next()) {
                    Articulo articulo = new Articulo();
                    articulo.setCodigoProducto(rs.getString(1));
                    articulo.setDescripcion(rs.getString(2));
                    articulo.setPvp(rs.getDouble(3));
                    articulo.setGastosDeEnvio(rs.getDouble(4));
                    articulo.setTiempoDePreparacion(rs.getInt(5));

                    // Una vez adquiridos todos los campos, agregar la informacion a la lista
                    list.add(articulo);
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        //
        return list;
    }
```

