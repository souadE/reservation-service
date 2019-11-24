package tn.esprit.arctic.reservationservice.ressource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloRessource {

    @GetMapping
    public String hello(){
        return "Hello you";
    }
}
