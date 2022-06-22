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

			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Guest customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			System.out.println("Benvenuti al Casotto");

			System.out.println("Premere 1 per Accedere oppure 0 per Registrarsi");

			Scanner scanner = new Scanner(System.in);
			int inputInt= scanner.nextInt();
			if(inputInt == 0){
				scanner.skip("\n");
				System.out.print("Nome: ");
				String name = scanner.nextLine();
				System.out.print("Cognome: ");
				String surname = scanner.nextLine();
				System.out.print("Email: ");
				String email = scanner.nextLine();
				System.out.print("Password: ");
				String password = scanner.nextLine();


				if(repository.findAll().stream().anyMatch(guest -> email.equals(guest.getEmail()))){
					throw new Exception("Utente già Registrato");
				}
				else {
					Guest guest = repository.save(new Guest(name, surname, email, password));
				}

			}
			else {

				System.out.println("Selezionare una delle seguenti attività");

			}


			//if(repository.findAll().stream().anyMatch(guest -> email.equals(guest.getEmail()) || password.equals(guest.getPassword()))){

			// save a few customers
			Guest guest = new Guest( "Bauer", "pippocca@gmial.com");
			repository.save(guest);

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Guest customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Guest customer = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");


			// for (Customer bauer : repository.findByLastName("Bauer")) {
			//  log.info(bauer.toString());
			// }
			log.info("");

			//repository.deleteAll(repository.findAll());
		};


	}
}
