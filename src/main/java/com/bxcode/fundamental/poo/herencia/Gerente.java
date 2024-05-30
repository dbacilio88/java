package com.bxcode.fundamental.poo.herencia;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Getter
@Setter
@Log4j2
public class Gerente extends Empleado {
    private float comisiones;
    private float extra;

}
