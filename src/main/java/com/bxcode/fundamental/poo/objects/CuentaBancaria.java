package com.bxcode.fundamental.poo.objects;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@Log4j2
public class CuentaBancaria {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private float saldo; // 30.40
    private String tipoCuenta;
    private float interes;


    public CuentaBancaria(String nom) {
        this.nombre = nom;
    }


    //comportamientos, métodos o funciones:
    //this = pertenencia
    void set(String nombre, String apellidos, float saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.saldo = saldo;
    }

    void consultarSaldo() {
        log.info("Su saldo actual es S/ {}", +this.saldo);
    }

    //el saldo es : 30 soles
    void retirarDinero(float retiro) {
        //10 soles
        this.saldo = this.saldo - retiro;
        log.info("Retiro: {}", retiro);
    }

    void depositarDinero(float deposito) {
        //10 soles
        this.saldo = this.saldo + deposito;
        log.info("Depósito: {}", deposito);
    }

    void bonificaciones() {
        //2 bonificaciones
        float saldoActual = this.saldo + 10;
        log.info("Bonificación 10  y tengo disponible {}", saldoActual);
    }

    void actualizarDatos() {
        this.nombre = "Carlos";
        this.apellidos = "bonifacio";
        log.info("Mi nombre es {} y mi apellido {}", this.nombre, this.apellidos);
    }

    void consultarDatos() {
        log.info("Mi nombre es: {} y mi apellido: {}", this.nombre, this.apellidos);
    }

}
