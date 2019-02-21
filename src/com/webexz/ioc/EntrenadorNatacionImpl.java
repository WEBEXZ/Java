package com.webexz.ioc;

import com.webexz.cdi.IFrases;
import org.springframework.beans.factory.annotation.Value;

public class EntrenadorNatacionImpl implements IEntrenador {
    private IFrases frases;

    @Value("${entrenador.nombre}")
    private String nombre;

    @Value("${entrenador.edad}")
    private int edad;

    public EntrenadorNatacionImpl(IFrases frases) {
        this.frases = frases;
    }

    @Override
    public String getSaludo() {
        return "Hola soy un entreador de natacion";
    }

    @Override
    public String getFrase() {
        return frases.getFrase();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return (edad);
    }
}
