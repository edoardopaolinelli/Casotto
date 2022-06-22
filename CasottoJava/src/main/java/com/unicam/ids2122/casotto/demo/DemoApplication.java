package com.unicam.ids2122.casotto.demo;

import com.unicam.ids2122.casotto.demo.Entity.Guest;
import com.unicam.ids2122.casotto.demo.Repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Iterator;
import java.util.Scanner;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {


	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {

			System.out.println("\t\t\tCASOTTO\t\t\t");
			System.out.println("---------------------------------");
			System.out.println("Premere 0 per Registrarsi oppure 1 per Accedere");

			Scanner scanner = new Scanner(System.in);
			int inputInt = scanner.nextInt();


			// REGISTRAZIONE
			if (inputInt == 0) {
				String name = "", surname = "", email = "", password = "";
				boolean accessoEffettuato = false;
				while (!accessoEffettuato) {
					scanner.reset();
					System.out.print("Nome: ");
					name = scanner.next();
					System.out.print("Cognome: ");
					surname = scanner.next();
					System.out.print("Email: ");
					email = scanner.next();
					System.out.print("Password: ");
					password = scanner.next();

					if (emailAlreadyUsed(email, repository)) {
						System.out.println("Errore: Email già presente nel database".toUpperCase());
					} else {
						Guest guest = repository.save(new Guest(name, surname, email, password));
						accessoEffettuato = true;
						System.out.println("Benvenuto, " + guest.getName());
					}
				}
			}
			// ACCESSO
			else if (inputInt == 1) {
				boolean accessoEffettuato = false;

				while (!accessoEffettuato) {
					System.out.print("Email: ");
					String email = scanner.next();
					System.out.print("Password: ");
					String password = scanner.next();

					if (!passwordMatches(email, password, repository)) {
						System.out.println("Errore: Email o password errate, prova ancora".toUpperCase());
					} else {
						accessoEffettuato = true;
						Guest guest = repository.findAll().stream().filter(g -> emailAlreadyUsed(email, repository) && passwordMatches(email, password, repository)).findFirst().get();
						System.out.println("Bentornato, " + guest.getName());
					}
				}
			}
			// SE UTENTE NON INSERISCE NE 0 NE 1
			else {
				throw new IllegalArgumentException("Inserire 0 o 1");
			}

			//repository.deleteAll(repository.findAll());
		};
	}
	boolean emailAlreadyUsed(String email, UserRepository repository){
		for (Guest guest : repository.findAll()) {
			if (guest.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}

	boolean passwordMatches(String email, String password, UserRepository repository){
		for (Guest guest : repository.findAll()) {
			if (guest.getEmail().equals(email)) {
				if(guest.getPassword().equals(String.valueOf(password.hashCode() * 31)))return true;
			}
		}
		return false;
	}
}
