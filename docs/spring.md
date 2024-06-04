# Spring Framework

Spring Framework es un marco de trabajo (framework) de código abierto para el desarrollo de aplicaciones en Java. Fue
creado para simplificar el desarrollo de aplicaciones empresariales, proporcionando una infraestructura integral para
crear aplicaciones robustas y bien estructuradas. Aquí hay algunos de sus principales aspectos y componentes:

Spring Framework es una herramienta poderosa para los desarrolladores de Java que buscan construir aplicaciones
robustas, escalables y mantenibles, proporcionando una infraestructura sólida y flexible para abordar diversos aspectos
del desarrollo de software.

## Principales Características del Spring Framework

### Inversión de Control (IoC) y Inyección de Dependencias (DI):

Spring promueve el uso de IoC para gestionar los objetos y sus dependencias. Esto se logra a través de la Inyección de
Dependencias, donde el contenedor de Spring se encarga de crear y ensamblar los objetos necesarios.

La Inversión de Control (IoC) y la Inyección de Dependencias (DI) son conceptos fundamentales del Spring Framework que
facilitan la creación de aplicaciones de manera flexible y mantenible. A continuación se explica cada uno en detalle:

#### Inversión de Control (IoC)

IoC es un principio de diseño en el que el control de la creación y gestión de objetos se invierte desde el programa
principal hacia un contenedor o framework. En lugar de que el código de la aplicación cree y gestione directamente las
dependencias de los objetos, un contenedor IoC lo hace por nosotros.

#### Beneficios de IoC:

- **Reducción del acoplamiento**: Facilita que los componentes sean más independientes y reutilizables.
- Facilita la prueba: Los objetos son más fáciles de probar porque pueden recibir dependencias mock o stub.
- Mejor gestión del ciclo de vida: El contenedor IoC gestiona el ciclo de vida de los objetos, incluyendo la
  inicialización y destrucción.

#### Inyección de Dependencias (DI)

- Inyección por Constructor: Las dependencias se pasan al objeto a través de su constructor.

```java
public class MyService {
    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    // Métodos del servicio
}
```

- Inyección por Setter: Las dependencias se inyectan a través de métodos setter.

```java
public class MyService {
    private MyRepository myRepository;

    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    // Métodos del servicio
}
```

- Inyección por Campo: Las dependencias se inyectan directamente en los campos del objeto (usualmente con anotaciones).

```java
public class MyService {
    @Autowired
    private MyRepository myRepository;

    // Métodos del servicio
}
```

### Contenedor IoC de Spring

El contenedor IoC de Spring se encarga de gestionar los objetos de la aplicación, incluyendo su creación, ensamblaje,
configuración y ciclo de vida completo. Los principales tipos de contenedores IoC en Spring son:

#### BeanFactory

Es la interfaz más básica del contenedor IoC de Spring, proporcionando las funcionalidades básicas de IoC y DI.

#### ApplicationContext

Una extensión de BeanFactory que ofrece características adicionales como eventos de aplicación, soporte para
internacionalización (i18n), y más.

#### Contextos

- **`@Bean`**
  En el contexto del Spring Framework, **`@Bean`** es una anotación utilizada en las clases de configuración para
  definir métodos que generan y configuran objetos gestionados por el contenedor de Spring, conocidos como beans. *
  *`La anotación @Bean`** se coloca en un método de una clase anotada con @Configuration, indicando que el método
  producirá un bean que se gestionará en el contenedor IoC de Spring.

  En el contexto del Spring Framework, un **bean** definido con la anotación **`@Bean`** tiene un ámbito predeterminado
  de singleton. Esto significa que Spring creará y gestionará una única instancia de ese bean para toda la aplicación.
  Siempre que se solicite ese bean, Spring proporcionará la misma instancia.

- **`Singleton en Spring`**
  El patrón Singleton es un patrón de diseño que asegura que una clase tenga solo una instancia y proporciona un punto
  de acceso global a ella. En Spring, este patrón se implementa de manera automática para los beans con el ámbito
  singleton.
  **`¿Cómo funciona el Singleton en Spring?`**
  Cuando defines un bean con **`@Bean`** o en un archivo de configuración XML sin especificar el ámbito, Spring creará
  una única instancia del bean y la reutilizará cada vez que sea necesario.

```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
```

### POJO

Un **`POJO (Plain Old Java Object)`** es un objeto simple en Java que no depende de ningún framework o biblioteca
externa, y generalmente no sigue ninguna convención o restricción particular impuesta por el lenguaje de programación.
Los **`POJOs`** se utilizan comúnmente para modelar datos en aplicaciones debido a su simplicidad y flexibilidad.

```java
public class Empleado {
    private int id;
    private String nombre;
    private double salario;

    // Constructor por defecto
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', salario=" + salario + "}";
    }
}

```

### DTO

Un **`DTO (Data Transfer Object)`** es un patrón de diseño utilizado para transferir datos entre diferentes capas de una
aplicación, especialmente entre la capa de presentación y la capa de negocio, o entre la capa de negocio y la capa de
persistencia. Los **`DTOs`** son objetos simples que contienen solo datos y no tienen lógica de negocio ni
comportamiento.

### Diferencias

- **`POJO`**: Un objeto Java simple y flexible, que puede contener lógica de negocio y es independiente de frameworks
  específicos. Se utiliza principalmente para modelar datos y entidades de la aplicación.
- **`DTO`**: Un objeto especializado en la transferencia de datos entre diferentes capas de una aplicación. No contiene
  lógica de negocio y se utiliza para desacoplar las capas, facilitando la evolución independiente y la optimización de
  la transferencia de datos.

Tanto los **`POJOs`** como los **`DTOs`** juegan roles importantes en el diseño y desarrollo de aplicaciones,
permitiendo una separación clara de responsabilidades y mejorando la mantenibilidad y la escalabilidad del código.

| Aspecto           | POJO                                              | DTO                                                  |
|-------------------|---------------------------------------------------|------------------------------------------------------|
| Propósito         | Modelar datos y lógica de negocio                 | Transferir datos entre capas                         |
| Lógica de Negocio | Puede contener lógica de negocio	                 | No contiene lógica de negocio                        |
| Dependencia	      | Independiente de frameworks	                      | Independiente, pero específico para transferir datos |
| Campos	           | Privados, con getters y setters	                  | Privados, con getters y setters                      |
| Constructores	    | Puede tener constructores variados	               | Puede tener constructores para inicialización        |     
| Uso Principal		   | Modelado de entidades y datos	                    | Transferencia de datos                               |
| Flexibilidad		    | Alta, puede evolucionar con la lógica de negocio	 | Limitado a la transferencia de datos                 |

### Patrones de Arquitectura

Los patrones de arquitectura son soluciones reutilizables y probadas para problemas comunes en el diseño de software en
estructura y organización. Estos patrones ayudan a organizar la estructura general de una aplicación o sistema,
definiendo cómo interactúan los componentes principales.

#### Ejemplos de Patrones de Arquitectura

* Modelo-Vista-Controlador (MVC)
* Arquitectura de Microservices
* Arquitectura en Capas
* Arquitectura Orientada a Servicios (SOA)
* Arquitectura de Eventos

#### Ejemplo: Arquitectura Modelo-Vista-Controlador (MVC)

El patrón Modelo-Vista-Controlador (MVC) es uno de los más utilizados en el desarrollo de aplicaciones web. Divide una
aplicación en tres componentes principales para separar las preocupaciones:

**`Modelo`**: Gestiona los datos y la lógica de negocio.
**`Vista`**: Representa la interfaz de usuario.
**`Controlador`**: Maneja las entradas del usuario y coordina la interacción entre el modelo y la vista.

#### Estructura del Patrón MVC

Modelo:

* Encapsula los datos de la aplicación.
* Implementa la lógica de negocio.
* Puede interactuar con la base de datos para recuperar y guardar datos.

Vista:

* Representa la información al usuario.
* Recibe los datos del modelo y los presenta de una forma adecuada.

Controlador:

* Recibe las entradas del usuario desde la vista.
* Procesa la entrada, interactúa con el modelo y selecciona la vista para mostrar.

### Patrones de diseño

Los patrones de diseño son soluciones reutilizables a problemas comunes que se encuentran durante el diseño de software.
Estos patrones son prácticas probadas que los desarrolladores pueden aplicar para solucionar problemas específicos de
una manera estructurada y eficiente. Los patrones de diseño se clasifican en tres categorías principales: patrones de
creaciones, patrones estructurales y patrones de comportamiento.

##### Patrones Creacionales

Los patrones creacionales se centran en la manera de crear objetos, ayudando a controlar la creación de instancias.

**`Singleton`**: Garantiza que una clase tenga solo una instancia y proporciona un punto de acceso global a ella.

```java
public class Singleton {
    private static Singleton instancia;

    private Singleton() {
    }

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
```

- **`Factory Method`**: Define una interfaz para crear objetos, pero permite a las subclases decidir qué clase
  instanciar.

```java
public interface Producto {
    void usar();
}

public class ProductoConcretoA implements Producto {
    @Override
    public void usar() {
        System.out.println("Usando ProductoConcretoA");
    }
}

public abstract class Creador {
    public abstract Producto crearProducto();

    public void operacion() {
        Producto producto = crearProducto();
        producto.usar();
    }
}

public class CreadorConcretoA extends Creador {
    @Override
    public Producto crearProducto() {
        return new ProductoConcretoA();
    }
}
```

* **`Abstract Factory`**: Proporciona una interfaz para crear familias de objetos relacionados o dependientes sin
  especificar sus clases concretas.

```java
public interface AbstractFactory {
    ProductoA crearProductoA();

    ProductoB crearProductoB();
}

public class FactoryConcreta1 implements AbstractFactory {
    @Override
    public ProductoA crearProductoA() {
        return new ProductoA1();
    }

    @Override
    public ProductoB crearProductoB() {
        return new ProductoB1();
    }
}
```

* **`Builder`**: Separa la construcción de un objeto complejo de su representación, permitiendo que el mismo proceso de
  construcción cree diferentes representaciones.

```java
public class Producto {
    private String parteA;
    private String parteB;

    public void setParteA(String parteA) {
        this.parteA = parteA;
    }

    public void setParteB(String parteB) {
        this.parteB = parteB;
    }
}

public interface Constructor {
    void construirParteA();

    void construirParteB();

    Producto obtenerResultado();
}

public class ConstructorConcreto implements Constructor {
    private Producto producto = new Producto();

    @Override
    public void construirParteA() {
        producto.setParteA("Parte A");
    }

    @Override
    public void construirParteB() {
        producto.setParteB("Parte B");
    }

    @Override
    public Producto obtenerResultado() {
        return producto;
    }
}

```

* **`Prototype`**: Permite la creación de nuevos objetos copiando un prototipo existente.

```java
public class Prototipo implements Cloneable {
    private String nombre;

    public Prototipo(String nombre) {
        this.nombre = nombre;
    }

    public Prototipo clonar() {
        try {
            return (Prototipo) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

```

#### Patrones Estructurales

Los patrones estructurales se ocupan de la composición de clases u objetos para formar estructuras más grandes.

- **`Adapter`**: Permite que clases con interfaces incompatibles trabajen juntas.

```java
public interface EnchufeEuropeo {
    void encender();
}

public class EnchufeAmericano {
    public void plugIn() {
        System.out.println("Enchufe Americano conectado.");
    }
}

public class Adaptador implements EnchufeEuropeo {
    private EnchufeAmericano enchufeAmericano;

    public Adaptador(EnchufeAmericano enchufeAmericano) {
        this.enchufeAmericano = enchufeAmericano;
    }

    @Override
    public void encender() {
        enchufeAmericano.plugIn();
    }
}
```

* **`Composite`**: Compone objetos en estructuras de árbol para representar jerarquías parte-todo.

```java
public interface Componente {
    void operacion();
}

public class Hoja implements Componente {
    @Override
    public void operacion() {
        System.out.println("Operación de hoja.");
    }
}

public class Compuesto implements Componente {
    private List<Componente> hijos = new ArrayList<>();

    public void agregar(Componente componente) {
        hijos.add(componente);
    }

    @Override
    public void operacion() {
        for (Componente hijo : hijos) {
            hijo.operacion();
        }
    }
}
```

* **`Decorator`**: Agrega responsabilidades adicionales a un objeto de manera dinámica.

```java
public interface Componente {
    void operacion();
}

public class ComponenteConcreto implements Componente {
    @Override
    public void operacion() {
        System.out.println("Operación de Componente Concreto.");
    }
}

public abstract class Decorador implements Componente {
    protected Componente componente;

    public Decorador(Componente componente) {
        this.componente = componente;
    }

    @Override
    public void operacion() {
        componente.operacion();
    }
}

public class DecoradorConcreto extends Decorador {
    public DecoradorConcreto(Componente componente) {
        super(componente);
    }

    @Override
    public void operacion() {
        super.operacion();
        System.out.println("Operación adicional del Decorador Concreto.");
    }
}
```

* **`Facade`**: Proporciona una interfaz simplificada a un subsistema complejo.

```java
public class Subsistema1 {
    public void metodo1() {
        System.out.println("Método 1 del Subsistema 1");
    }
}

public class Subsistema2 {
    public void metodo2() {
        System.out.println("Método 2 del Subsistema 2");
    }
}

public class Fachada {
    private Subsistema1 subsistema1;
    private Subsistema2 subsistema2;

    public Fachada() {
        this.subsistema1 = new Subsistema1();
        this.subsistema2 = new Subsistema2();
    }

    public void operacion() {
        subsistema1.metodo1();
        subsistema2.metodo2();
    }
}
```

* **`Proxy`**: Proporciona un sustituto o marcador de posición para otro objeto para controlar el acceso a él.

```java
public interface Servicio {
    void solicitud();
}

public class ServicioReal implements Servicio {
    @Override
    public void solicitud() {
        System.out.println("Solicitud atendida por Servicio Real.");
    }
}

public class Proxy implements Servicio {
    private ServicioReal servicioReal;

    @Override
    public void solicitud() {
        if (servicioReal == null) {
            servicioReal = new ServicioReal();
        }
        servicioReal.solicitud();
    }
}
```

### Patrones de Comportamiento

Los patrones de comportamiento se centran en la comunicación entre objetos.

* **`Chain of Responsibility`**: Permite que un objeto pase la solicitud a una cadena de objetos para manejar la
  solicitud.

```java
public abstract class Manejador {
    protected Manejador sucesor;

    public void setSucesor(Manejador sucesor) {
        this.sucesor = sucesor;
    }

    public abstract void manejarSolicitud(String solicitud);
}

public class ManejadorConcreto1 extends Manejador {
    @Override
    public void manejarSolicitud(String solicitud) {
        if (solicitud.equals("Solicitud1")) {
            System.out.println("ManejadorConcreto1 maneja la Solicitud1");
        } else if (sucesor != null) {
            sucesor.manejarSolicitud(solicitud);
        }
    }
}

public class ManejadorConcreto2 extends Manejador {
    @Override
    public void manejarSolicitud(String solicitud) {
        if (solicitud.equals("Solicitud2")) {
            System.out.println("ManejadorConcreto2 maneja la Solicitud2");
        } else if (sucesor != null) {
            sucesor.manejarSolicitud(solicitud);
        }
    }
}
```

* **`Observer`**: Define una dependencia uno a muchos entre objetos para que cuando uno cambie de estado, todos sus
  dependientes sean notificados y actualizados automáticamente.

 ```java
 public interface Observador {
    void actualizar();
}

public class Sujeto {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }
}

public class ObservadorConcreto implements Observador {
    @Override
    public void actualizar() {
        System.out.println("Observador actualizado.");
    }
}

 ```

* **`Strategy`**: Define una familia de algoritmos, encapsula cada uno y los hace intercambiables. Permite que el
  algoritmo varíe independientemente de los clientes que lo utilizan.

```java
public interface Estrategia {
    void ejecutar();
}

public class EstrategiaConcretaA implements Estrategia {
    @Override
    public void ejecutar() {
        System.out.println("EstrategiaConcretaA ejecutada.");
    }
}

public class Contexto {
    private Estrategia estrategia;

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutarEstrategia() {
        estrategia.ejecutar();
    }
}

```

- **`Saga`** El patrón Saga es un patrón de diseño de arquitectura de software que se utiliza para mantener la
  consistencia de los datos en sistemas distribuidos y transacciones largas. Este patrón se basa en la idea de dividir
  una transacción larga en una secuencia de pasos más pequeños y atómicos, donde cada paso puede desencadenar uno o más
  pasos subsecuentes. Si ocurre un fallo en uno de los pasos, el patrón Saga se encarga de deshacer las operaciones
  anteriores para mantener la consistencia del sistema.

  Componentes del Patrón Saga
    - Coordinador de Saga: Es responsable de orquestar la ejecución de los pasos de la saga y coordinar su compensación
      en caso de fallo.

    - Pasos de la Saga: Representan las operaciones individuales que forman parte de la saga. Cada paso tiene una
      operación principal y una operación de compensación asociada.

    - Registro de Saga: Almacena el estado de la saga y registra el progreso de cada paso.

  El patrón Saga es un patrón de diseño que generalmente se clasifica como un patrón de comportamiento, ya que se centra
  en cómo los objetos interactúan entre sí para lograr un objetivo común y manejan situaciones de fallo de manera
  coordinada. Este patrón se preocupa principalmente por la coordinación de transacciones largas y distribuidas, lo cual
  es un aspecto del comportamiento del sistema en lugar de su estructura o creación de objetos.

  Por lo tanto, el patrón Saga se clasifica dentro de la categoría de patrones de comportamiento. Aunque puede tener
  algunos elementos relacionados con la creación y estructura de objetos, como la definición de los pasos de la saga y
  la coordinación de su ejecución, su enfoque principal es cómo los objetos interactúan para mantener la consistencia
  del sistema durante operaciones distribuidas y complejas.





















