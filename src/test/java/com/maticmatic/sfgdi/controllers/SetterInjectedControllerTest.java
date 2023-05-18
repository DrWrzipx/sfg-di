package com.maticmatic.sfgdi.controllers;

import com.maticmatic.sfgdi.services.GreetingService;
import com.maticmatic.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

     @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
     }
}