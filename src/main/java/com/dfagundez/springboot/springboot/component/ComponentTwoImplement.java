package com.dfagundez.springboot.springboot.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Probando el segundo componente...");
    }
}
