# SOLID

**`"Solid"`** es un acrónimo en inglés que representa una serie de principios para el diseño de software. Fue propuesto
por Robert C. Martin, también conocido como "Uncle Bob". Aquí están los principios que abarca:

* **`S`** - **Principio de responsabilidad única** `(Single Responsibility Principle)`: Una clase debe tener una única
  razón para cambiar, es decir, debe tener una única responsabilidad.

`Supongamos que estás desarrollando una aplicación de gestión de empleados. En lugar de tener una clase llamada Empleado que se encargue de almacenar los datos del empleado y también de enviar correos electrónicos a los empleados, deberías dividir estas responsabilidades en dos clases separadas. Por ejemplo, podrías tener una clase Empleado que se ocupe exclusivamente de almacenar los datos del empleado y otra clase ServicioCorreo que maneje el envío de correos electrónicos.`

```java
// Empleado.java
public class Empleado {
    private String nombre;
    private String correo;

    public Empleado(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    // Métodos para obtener los datos del empleado
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}

// GestorCorreo.java
public class GestorCorreo {
    public void enviarCorreo(Empleado empleado, String mensaje) {
        System.out.println("Enviando correo a " + empleado.getCorreo() + ": " + mensaje);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", "juan@example.com");
        GestorCorreo gestorCorreo = new GestorCorreo();
        gestorCorreo.enviarCorreo(empleado, "¡Hola Juan! Este es un mensaje de prueba.");
    }
}

```

* **`O`** - **Principio de abierto/cerrado** `(Open/Closed Principle)`: Las entidades de software (clases, módulos,
  funciones, etc.) deben estar abiertas para su extensión pero cerradas para su modificación. Esto significa que uno
  puede extender su comportamiento sin modificar su código fuente.

`Digamos que tienes una clase Forma con un método calcularArea(), y tienes diferentes formas como subclases: Cuadrado, Círculo, etc. Si más tarde deseas agregar una nueva forma, como un Triángulo, no deberías modificar la clase Forma para agregar un nuevo método calcularArea() específico para el triángulo. En su lugar, debes extender la clase Forma y crear una nueva subclase Triángulo que implemente el método calcularArea() según las características específicas del triángulo.`

```java
// Forma.java
public abstract class Forma {
    public abstract double calcularArea();
}

// Cuadrado.java
public class Cuadrado extends Forma {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}

```

* **`L`** - **Principio de sustitución de Liskov** `(Liskov Substitution Principle)`: Las subclases deben ser
  sustituibles por sus clases base sin afectar el comportamiento del programa. En otras palabras, los objetos de un tipo
  base deben poder ser reemplazados por objetos de un tipo derivado sin afectar la integridad del programa.

`Imagina que tienes una clase Ave con un método volar(). Ahora, si creas una subclase llamada Pingüino que hereda de Ave, debería poder volar también, ya sea que se desplace en el aire o en el agua. Aunque los pingüinos no vuelen en el aire, siguen siendo aves, por lo que la subclase Pingüino debería poder substituir a la clase base Ave sin cambiar el comportamiento del programa.`

```java
// Ave.java
public class Ave {
    public void volar() {
        System.out.println("Volando...");
    }
}

// Pinguino.java
public class Pinguino extends Ave {
    @Override
    public void volar() {
        // Los pingüinos no pueden volar, por lo que este método podría lanzar una excepción
        throw new UnsupportedOperationException("Los pingüinos no pueden volar");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Ave ave = new Pinguino();
        ave.volar(); // Esto lanzará una excepción ya que los pingüinos no pueden volar
    }
}

```

* **`I`** - **Principio de segregación de interfaces** `(Interface Segregation Principle)`: Un cliente no debe verse
  obligado a depender de interfaces que no utiliza. Esto significa que es mejor tener interfaces específicas para
  diferentes clientes en lugar de una sola interfaz general que contenga métodos para todos los clientes.

`Supongamos que tienes una interfaz llamada Impresora que tiene dos métodos: imprimir() y escanear(). Si tienes una clase ImpresoraLaser que implementa esta interfaz, pero solo necesita el método imprimir() y no escanear(), entonces la interfaz debería dividirse en dos interfaces más pequeñas: Impresora y Escáner, para que las clases que solo necesiten uno de estos métodos no se vean obligadas a implementar ambos.`

```java
// Impresora.java
public interface Impresora {
    void imprimir();
}

// Escaner.java
public interface Escaner {
    void escanear();
}

// ImpresoraLaser.java
public class ImpresoraLaser implements Impresora {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        ImpresoraLaser impresora = new ImpresoraLaser();
        impresora.imprimir();
    }
}

```

* **`D`** - **Principio de inversión de dependencias** `(Dependency Inversion Principle)`: Los módulos de alto nivel no
  deben depender de los módulos de bajo nivel, ambos deben depender de abstracciones. Además, las abstracciones no deben
  depender de los detalles, sino que los detalles deben depender de las abstracciones.

`Supongamos que tienes una clase GestorCorreo que envía correos electrónicos a los empleados. En lugar de que GestorCorreo dependa directamente de una clase concreta como ServicioCorreoGmail, deberías invertir la dependencia para que GestorCorreo dependa de una abstracción, como una interfaz ServicioCorreo, y luego puedes tener diferentes implementaciones de esta interfaz para diferentes servicios de correo electrónico (por ejemplo, ServicioCorreoGmail, ServicioCorreoOutlook, etc.). De esta manera, GestorCorreo no está directamente acoplado a ninguna implementación concreta de servicio de correo electrónico, lo que hace que el código sea más flexible y fácil de mantener.`

```java
// ServicioCorreo.java
public interface ServicioCorreo {
    void enviarCorreo(Empleado empleado, String mensaje);
}

// GestorCorreo.java
public class GestorCorreo implements ServicioCorreo {
    @Override
    public void enviarCorreo(Empleado empleado, String mensaje) {
        System.out.println("Enviando correo a " + empleado.getCorreo() + ": " + mensaje);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", "juan@example.com");
        ServicioCorreo gestorCorreo = new GestorCorreo();
        gestorCorreo.enviarCorreo(empleado, "¡Hola Juan! Este es un mensaje de prueba.");
    }
}
```
