package com.webexz.cdi;

import org.springframework.stereotype.Component;

@Component
public class FrasePositivaImpl implements IFrases {
    @Override
    public String getFrase() {
        return "Buen dia";
    }
}
