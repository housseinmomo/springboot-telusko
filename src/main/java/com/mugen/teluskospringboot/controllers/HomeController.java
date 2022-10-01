package com.mugen.teluskospringboot.controllers;

// Cette classe va nous permettre de manipuler les requetes des clients

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // Pour chaque requete, une fonction se declenche
    @RequestMapping("/home")
    public String home(){
        System.out.println("Wellcome to home");
        // on retourne la page index.html qui se trouve dans le dossier webapp dans main
        // c'est le dossier par defaut pour les pages web
        return "index.html";
    }
}
