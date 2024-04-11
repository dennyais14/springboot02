package com.example.essprinboot2;

import org.springframework.web.bind.annotation.*;

//Scrivi una applicazione web Spring Boot che alla endpoint
// GET v2/ciao/Lombardia?nome=Giuseppe
// risponde con un oggetto JSON formato cosi:
//
//{
//    "nome": "Giuseppe",
//    "regione": "Lombardia",
//    "saluto": "Ciao Giuseppe, com'è il tempo in Lombardia?"
//}
@RestController
@RequestMapping("v2")
public class Es2SpringController{
    @GetMapping(path = "/ciaoUser/{regione}")
    public User ciaoUser(
            @RequestParam (required = true) String nome,
            @PathVariable (name="regione") String regione
            ){
        return new User(nome,regione, User.saluto(nome, regione));
    }
}
