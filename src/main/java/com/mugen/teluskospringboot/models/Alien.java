package com.mugen.teluskospringboot.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component on specifie que l'on souhaite instancier cette classe (objet)
// creation d'un spring bean (objet) qui sera disponible au sein du conteneur
@Component
// @Scope(value = "prototype")
public class Alien {
    private int aid;
    private  String aname;
    private String atech;
    // les deux objets seront creer au sein du conteneur
    // Mais il faudra les connecter et pour ce faire, nous allons utiliser l'annotation suivante :
    @Autowired // va permettre connecter Alien.class et Laptop.class qui sont au sein du conteneur
    private Laptop laptop;

    public Alien() {
        System.out.println("object created....");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAtech() {
        return atech;
    }

    public void setAtech(String atech) {
        this.atech = atech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show(){
        System.out.println("in show");
        laptop.compiler();
    }
}
