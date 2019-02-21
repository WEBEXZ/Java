package com.webexz.cdi;

import org.springframework.cache.annotation.Cacheable;

@Cacheable
public class FraseNegativaImpl implements IFrases {
    @Override
    public String getFrase() {
        return "No es un buen día.";
    }
}
