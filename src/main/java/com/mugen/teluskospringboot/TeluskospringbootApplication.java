package com.mugen.teluskospringboot;

import com.mugen.teluskospringboot.models.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class TeluskospringbootApplication {

	public static void main(String[] args) {

		// Creation du conteneur spring
		// Le conteneur spring se trouve dans la JMV
		// A l'interieure de ce conteneur on a: spring bean
		// On va definir nos objets au sein de ce conteneur
		ConfigurableApplicationContext context = SpringApplication.run(TeluskospringbootApplication.class, args);

		// injecter l'objet se trouvant dans le conteneur ayant pour type Alien.class dans notre objet alien
		// on utilise par defaut le design patter : singleton qui consiste a creer un seule instance
		// On avoir un nouvel objet a chaque (context.getBean(Alien.class) il faut utiliser le design pattern : prototype
		Alien alien01 = context.getBean(Alien.class);

		alien01.show();

	}

}
