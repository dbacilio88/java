package fundamental.basic.poo.objects;

//definir a partir de esta clase se llaman Instancias:
//CuentaBancaria => cuenta de ahorros
//CuentaBancaria => cuenta de ahorros millonaria
//CuentaBancaria => cuenta de cts
//CuentaBancaria => cuenta de ahorros simple
public class CuentaBancaria {
    //atributos, estado o propiedades:
    //Los datos del cuenta habiente
    // La manera de acceder a los atributos desde afuera de la clase es
    //por medio de los métodos getter y la manera de modificar los atributos desde afuera
    //de la clase es usando los métodos setter.
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private float saldo; // 30.40
    private String tipoCuenta;
    private float interes;

    //constructores:

    //métodos:


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

    //métodos get (obtener el valor del atributo) y set (modificar): deben ser públicos

    //nombre: String
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }
}
