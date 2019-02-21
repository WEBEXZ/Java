package com.webexz.configuracion;

import com.webexz.cdi.FraseNegativaImpl;
import com.webexz.cdi.IFrases;
import com.webexz.ioc.EntrenadorNatacionImpl;
import com.webexz.ioc.IEntrenador;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.webexz")
@PropertySource("classpath:propiedades.properties")
public class Configuracion {
    @Bean
    public IFrases frasesNegativasImpl() {
        return new FraseNegativaImpl();
    }

    @Bean
    public IEntrenador entrenadorNatacionImpl() {
        return new EntrenadorNatacionImpl(frasesNegativasImpl());
    }
}
