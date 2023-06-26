# README - Proyecto de Aplicación Java CRUD

Este es un proyecto de aplicación Java que implementa operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para usuarios y servicios, utilizando una base de datos para almacenar la información. La aplicación está desarrollada en lenguaje Java y utiliza JDBC para la conexión con la base de datos.

## Requisitos

Antes de ejecutar la aplicación, asegúrate de tener instalado lo siguiente:

- Java Development Kit (JDK) 1.8 o superior.
- servidor local apache-tomcat-7.0.65 o superior.
- Un servidor de base de datos compatible (por ejemplo, MySQL, PostgreSQL, Oracle).
- Un IDE de desarrollo Java compatible (por ejemplo, Eclipse, IntelliJ, NetBeans) o un entorno de desarrollo de tu elección.

## Configuración

Sigue los pasos a continuación para configurar el proyecto:

1. Clona este repositorio en tu máquina local o descárgalo como archivo ZIP.
2. Abre el proyecto en tu IDE de desarrollo Java.
3. Configura la conexión a la base de datos en el archivo `conexion.Conexion`. Aquí podrás especificar la URL de la base de datos, el nombre de usuario y la contraseña.
4. Asegúrate de tener el controlador JDBC correspondiente a tu base de datos incluido en el classpath del proyecto.

## Estructura del Proyecto

El proyecto sigue una estructura de paquetes de:

- `package.modelo` - Contiene las clases de modelo para los usuarios y servicios.
- `package.Controlador` - Contiene las clases de acceso a datos para usuarios y servicios.
- `package.DAO` - Contiene clases de utilidad para la conexión a la base de datos.
- `package.conexion` - Contiene datos de conexion a la base de datos.
- `package.log` - Contiene control y registro de errores.
- `package.adsi.rest` - Api rest consulta de datos de perfiles de usuarios.
- `package.servicio` - Contiene interfaces de metodos.
- `Testpackages.DAO` - Contiene pruebas unitarias
 
## Uso

1. Cargar Script de base de datos en MySQL.
2. Ejecuta la aplicación desde tu IDE de desarrollo.
3. 4. La aplicación iniciará y mostrará pagina index.jsp con diferentes de navegacion, entre ellas inicio de sesion.
5. Una vez la sesion iniciada (segun los permisos de cuenta) se mostraran diferentes opciones para realizar operaciones CRUD en usuarios y servicios.
6. Sigue las instrucciones en pantalla para interactuar con la aplicación y realizar las operaciones deseadas.

## Puntos rubrica

1. Consulta a la base de datos
- `package.DAO.usuarioDAO`
- `package.DAO.servicioDAO`

2. Algoritmo de cálculo y unidades de prueba
- `package.Controlador.UsuarioControlador`
- `WebPages.Usuarios.AdministrarUsuarios.jsp`
- `package.conexion`
- `package.servicio`
- `Testpackages.DAO.ServicioDAOTest`

3. Página web html y css
- `WebPages.index.jsp`

4. Spring MVC
- `package.Controlador`
- `WebPages.Usuarios.administrarUsuario.jsp`
- `package.DAO`

5. API Rest
- `package.adsi.rest`

## Contacto
Si tienes alguna pregunta o sugerencia relacionada con este proyecto, no dudes en contactarme a través del siguiente correo electrónico: alex.lazcano95@gmail.com.

¡Gracias por utilizar esta aplicación! Espero que sea de utilidad.
