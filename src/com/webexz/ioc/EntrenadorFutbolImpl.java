package com.webexz.ioc;
import com.webexz.cdi.IFrases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EntrenadorFutbolImpl implements IEntrenador {

    @Autowired
    @Qualifier("frasePositivaImpl")
    private IFrases frases;

    @Override
    public String getSaludo() {
        return "Hola soy entrenador de futbol";
    }

    @Override
    public String getFrase() {
        return frases.getFrase();
    }
}
