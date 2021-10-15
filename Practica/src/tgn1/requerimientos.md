# Trabajo Grupal Nro1

## Consideraciones:

1. Forma de Entrega:

- El trabajo será considerado ENTREGADO al responderse con la URL del paquete en el repositorio donde se encuentra el trabajo.

- El paquete en su repositorio de Git deberá tener el nombre de TGN1.

- Para que el trabajo sea considerado entregado a tiempo el commit realizado en su repositorio debe tener fecha y hora inferior a la de la de la programada en el campus.

- No se acepta una entrega fuera de término. De ser así el trabajo será considerado “No entregado”.

- Para la inscripción de los grupos al trabajo deben registrarse en la planilla de Drive.
  El grupo debe admitir de 4 a 5 integrantes, ni más ni menos.
  Si bien el trabajo es grupal, todos y todas quienes integran el grupo deben tener en sus respectivos repositorios el código fuente del trabajo.

2. Modalidad:

- El problema debe ser resuelto utilizando todos los recursos teóricos desarrollados hasta la fecha utilizando el lenguaje de programación JAVA.

3. Sepa que la batalla perdida es experiencia para ganar futuras batallas.

> A no ponerse nervioso y MUCHO ÉXITO!

# RESOLVER

Realice un programa que permita la gestión de salas de cine, los espectadores de cada sala, los empleados del cine y los acomodadores asignados a una sala.

El programa deberá cumplir con las siguientes funcionalidades:

1. Una sala de cine debe contener la capacidad de la sala, la película que se proyecta en la misma, el nombre de la sala y el listado de espectadores asignados a la misma.

1. Las Salas no deben permitir la asignación de una lista de Espectadores superior a su capacidad

1. Se debe poder listar los espectadores de una sala, pero en caso de que no haya sido asignada se debe capturar el error emitiendo el mensaje "SIN ESPECTADORES CARGADOS".

1. El Programa debe por lo menos una clase abstracta Personas de la cual hereden Espectadores y Empleados:

1. La clase Personas deberá tener por lo menos dos método abstractos:

1. Uno que permitirá ver si la persona es un Espectador, un Acomodador o un Empleado dependiendo de qué clase sea.

1. Uno que permitirá visualizar todos los datos de la persona.

1. Los Espectadores ademá de sus datos personales deben estar asignados a una butaca definida por la Fila (una letra) y la Silla (un número entero).

1. La clase Empleados deberá contener el Sueldo que cobra el empleado y permitir su posterior modificación.

1. El programa contendrá una clase Acomodadores que heredará de la clase Empleados e implementará la interfaz ParaAcomodadores.

1. A los Acomodadores se les podrá designar una sala o modificar la sala asignada.

1. La interfaz ParaAcomodadores deberá permitir la asignación y modificación de una sala a un acomodador.

1. El programa debe tener una clase principal llamada Cine en donde se deben realizar las siguientes operaciones:

- Cargar espectadores pidiendo los nombre, edad, fila y silla al usuario por medio de la consola. En caso de que el usuario ingrese letras en lugar de números donde no corresponda el programa debe finalizar con el error: "ERROR EN EL INGRESO DE DATOS".

- Por medio del código crear una sala con capacidad para 3 personas llamada “Sala 01” en donde se proyecte la película “Jocker”.

- Asignar a la sala los espectadores cargados.

- Imprimir la lista de espectadores que se encuentran asignado a la sala.

- Crear un acomodador por medio del código.

- Asignar a dicho Acomodador la sala creada anteriormente.

- Asignar un sueldo de $50.000 al Acomodador.

- Mostrar los datos del Acomodador en la consola.

- Crear un Empleado.

- Mostrar los datos del Empleado.

### Todas las clases instanciables del programa deben tener los métodos geters, seters para ingresar o visualizar datos necesarios para los procesos solicitados y el método toString que mostrará todos los datos relevantes de la clase.
