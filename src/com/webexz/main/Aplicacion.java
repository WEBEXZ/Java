package com.webexz.main;

import com.webexz.configuracion.Configuracion;
import com.webexz.ioc.EntrenadorNatacionImpl;
import com.webexz.ioc.IEntrenador;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
        IEntrenador entrenador = context.getBean("entrenadorFutbolImpl", IEntrenador.class);
        System.out.println(entrenador.getSaludo());
        System.out.println(entrenador.getFrase());

        EntrenadorNatacionImpl entrenador2 = context.getBean("entrenadorNatacionImpl", EntrenadorNatacionImpl.class);
        System.out.println(entrenador2.getSaludo());
        System.out.println(entrenador2.getFrase());
        System.out.println("Mi nombre es: " + entrenador2.getNombre());
        System.out.println(entrenador2.getEdad());
    }
}
