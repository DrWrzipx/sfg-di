package com.maticmatic.sfgdi.controllers;

import com.maticmatic.sfgdi.services.GreetingService;
import com.maticmatic.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        GreetingService greetingService = new GreetingServiceImpl();
        constructorInjectedController = new ConstructorInjectedController(greetingService);
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.GetGreeting());
    }
}