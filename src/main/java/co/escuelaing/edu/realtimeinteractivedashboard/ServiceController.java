/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.escuelaing.edu.realtimeinteractivedashboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ServiceController {

 @GetMapping("/status")
 public String status() {
 return "{\"status\":\"Greetings from Spring Boot. " +
 java.time.LocalDate.now() + ", " +
 java.time.LocalTime.now() +
 ". " + "The server is Runnig!\"}";
 }
 
}
