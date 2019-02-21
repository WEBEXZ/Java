package com.webexz.ioc;

import com.webexz.cdi.IFrases;

public class EntrenadorNatacionImpl implements IEntrenador {
    private IFrases frases;

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
}
