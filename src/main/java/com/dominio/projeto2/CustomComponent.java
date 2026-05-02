package com.dominio.projeto2;

import org.springframework.stereotype.Component;

@Component
public class CustomComponent {
    
    public String getMessage() {
        return "Hello from Component!";
    }
}
