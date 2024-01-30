package fundamental.basic.poo.objects;

//definir a partir de esta clase se llaman Instancias:
//CuentaBancaria => cuenta de ahorros
//CuentaBancaria => cuenta de ahorros millonaria
//CuentaBancaria => cuenta de cts
//CuentaBancaria => cuenta de ahorros simple
public class CuentaBancaria {
    //atributos, estado o propiedades:
    //Los datos del cuenta habiente
    String nombre;
    String apellidos;
    String direccion;
    String email;
    float saldo; // 30.40
    String tipoCuenta;
    float interes;

    //comportamientos, métodos o funciones:
    //this = pertenencia
    void set(String nombre, String apellidos, float saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.saldo = saldo;
    }

    void consultarSaldo() {
        System.out.println("Su saldo actual es S/ " + this.saldo);
    }

    //el saldo es : 30 soles
    void retirarDinero(float retiro) {
        //10 soles
        this.saldo = this.saldo - retiro;
        System.out.println("Retiro: " + retiro);
    }

    void depositarDinero(float deposito) {
        //10 soles
        this.saldo = this.saldo + deposito;
        System.out.println("Depósito: " + deposito);
    }

    void bonificaciones() {
        //2 bonificaciones
        float saldoActual = this.saldo + 10;
        System.out.println("Bonificación 10  y tengo disponible " + saldoActual);
    }

    void actualizarDatos() {
        this.nombre = "Carlos";
        this.apellidos = "bonifacio";
        System.out.println("Mi nombre es " + this.nombre + " y mi apellido " + this.apellidos);
    }

    void consultarDatos() {
        System.out.println("Mi nombre es " + this.nombre + " y mi apellido " + this.apellidos);
    }
}
