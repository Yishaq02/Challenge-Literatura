package com.aluracursos.challengeliteratura;

import com.aluracursos.challengeliteratura.repository.iLibroRepository;
import com.aluracursos.challengeliteratura.Libreria.Libreria;
import com.aluracursos.challengeliteratura.repository.iAutorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeliteraturaApplication implements CommandLineRunner {

	@Autowired
	private iLibroRepository libroRepository;
	@Autowired
	private iAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeliteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();

	}
}
