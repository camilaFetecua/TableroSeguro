/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.InteractiveBlackBoardLife.controllers;

import co.edu.escuelaing.InteractiveBlackBoardLife.repository.Memoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Clase que utilizamos controlamos el tablero , llamaos el puerto y el ticket
 */

@RestController
public class DrawingServiceController {
    @Autowired
    public HttpServletRequest request;
    
    @GetMapping("/status")
    public String status() {
        return "{\"status\":\"Greetings from Spring Boot. " +
                java.time.LocalDate.now() + ", " +
                java.time.LocalTime.now() +
                ". " + "The server is Runnig!\"}";
    }
    @GetMapping("/getTicket")
    public String getTicket() throws Exception {
        return Memoria.getInstance().setNumerodeMemoria(request.getRemoteHost());
    }
}