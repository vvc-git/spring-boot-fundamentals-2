package com.dominio.projeto2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1")
public class ControllerComponent {

    @Autowired
    private CustomComponent componentInjectBySpring;

    @GetMapping("/componentWithoutDI")
    public String getComponenentWithoutDI() {
        CustomComponent component = new CustomComponent();
        return component.getMessage();
    }

    @GetMapping("/componentWithDI")
    public String getComponenentWithDI(CustomComponent component) {
        return componentInjectBySpring.getMessage() + "com DI!";
    }
}
