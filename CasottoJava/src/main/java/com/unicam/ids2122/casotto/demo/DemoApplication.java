package com.unicam.ids2122.casotto.demo;

import com.unicam.ids2122.casotto.demo.Entity.*;
import com.unicam.ids2122.casotto.demo.Repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {


	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner demo(UserRepository userRepository,
								  OmbrelloneRepository ombrelloneRepository,
								  LettinoRepository lettinoRepository,
								  AttivitaRepository attivitaRepository,
								  PrenotazioneRepository prenotazioneRepository) {
		return (args) -> {

			/*ombrelloneRepository.save(new Ombrellone(10.0f, "2° fila"));
			ombrelloneRepository.save(new Ombrellone(15.0f, "1° fila"));
			ombrelloneRepository.save(new Ombrellone(10.0f, "3° fila"));
			ombrelloneRepository.save(new Ombrellone(10.0f, "3° fila"));
			ombrelloneRepository.save(new Ombrellone(8.0f, "6 fila° fila"));*/

			/*lettinoRepository.save(new Lettino(10.0f, "LETTINO"));
			lettinoRepository.save(new Lettino(8.0f, "SDRAIO"));
			lettinoRepository.save(new Lettino(6.0f, "SEDIA"));*/

			/*attivitaRepository.save(new Attivita("Torneo di calcetto", "Breve torneo di calcetto squadre miste 5 vs 5", 60, 12, LocalDate.ofYearDay(LocalDate.now().getYear(), 200), LocalTime.ofSecondOfDay(36000)));
			attivitaRepository.save(new Attivita("Torneo di briscola", "Breve torneo di calcetto squadre miste 5 vs 5", 40, 7, LocalDate.ofYearDay(LocalDate.now().getYear(), 212), LocalTime.ofSecondOfDay(32000)));*/



			boolean isLoggedIn;
			Optional<Guest> user = null;

			do {

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

						if (emailAlreadyUsed(email, userRepository)) {
							System.out.println("Errore: Email già presente nel database".toUpperCase());
						} else {
							Guest guest = userRepository.save(new Guest(name, surname, email, password));
							accessoEffettuato = true;
							System.out.println("Benvenuto, " + guest.getName());
						}
					}
					user = Optional.of(new Guest(name, surname, email, password));
				}
				// ACCESSO
				else if (inputInt == 1) {
					boolean accessoEffettuato = false;
					String email = "", password = "";

					while (!accessoEffettuato) {
						System.out.print("Email: ");
						email = scanner.next();
						System.out.print("Password: ");
						password = scanner.next();

						if (!passwordMatches(email, password, userRepository)) {
							System.out.println("Errore: Email o password errate, prova ancora".toUpperCase());
						} else {
							accessoEffettuato = true;
							String usedEmail = email, userPassword = password;
							user = userRepository.findAll().stream().filter(g -> emailAlreadyUsed(usedEmail, userRepository) && passwordMatches(usedEmail, userPassword, userRepository)).findFirst();
							System.out.println("Bentornato, " + user.get().getName());
						}
					}
				}
				// SE UTENTE NON INSERISCE NE 0 NE 1
				else {
					throw new IllegalArgumentException("Inserire 0 o 1");
				}

				isLoggedIn = true;
				boolean back = false;

				do {
					System.out.println("---------------------------------");
					System.out.println("\t\t\tHOME\t\t\t");
					System.out.println("---------------------------------");
					System.out.println("Seleziona un'attività");
					System.out.println("1: Prenota ombrellone, 2: Prenota lettino, 3: Prenota attività, 4: Visualizza le tue prenotazioni, 5: Logout");

					int operazione = scanner.nextInt();

					switch (operazione) {
						case 1:
							if (scegliAttivita(user.get(), ombrelloneRepository, prenotazioneRepository, scanner)) {
								back = true;
							}
							break;
						case 2:
							if (scegliAttivita(user.get(), lettinoRepository, prenotazioneRepository, scanner)) {
								back = true;
							}
							break;
						case 3:
							if(scegliAttivita(user.get(), attivitaRepository, prenotazioneRepository, scanner)){
							back = true;
						}
							break;
						case 5:
							Thread.sleep(500);
							back = false;
							isLoggedIn = false;
							break;
						default:
							back = false;
							break;
					}
				} while (back);


				System.out.println("A presto!");
				//repository.deleteAll(repository.findAll());
			} while (!isLoggedIn);

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

	boolean scegliAttivita(Guest user, CrudRepository itemRepository, CrudRepository prenotazioniRepository, Scanner scanner) throws InterruptedException {
		List<Object> attivita = (List<Object>) itemRepository.findAll();
		System.out.println("\n");
		for(int i = 0; i < attivita.size(); i++){
			System.out.println(i+": "+attivita.get(i));
			Thread.sleep(200);

		}
		System.out.println("\n");
		System.out.println("Selezionare il numero desiderato tra quelli elencati.");
		int input = scanner.nextInt();
		boolean fontCorrect;

		long idCliente = user.getIdGuest();
		LocalDate inputStartDate = null, inputEndDate = null;
		String prenotationType = attivita.get(input).toString();
		String oggettoPrenotato = attivita.get(input).toString();
		do{
			System.out.println("Seleziona una data di inizio in formato DD/MM/YYYY: ");
			String startDate = scanner.next();
			try{
				inputStartDate = parseFormat(startDate);
				fontCorrect = true;
			}catch(Exception e){
				fontCorrect = false;
			}

		} while (!fontCorrect);
		fontCorrect = false;
		do{
			System.out.println("Seleziona una data di fine in formato DD/MM/YYYY: ");
			String endDate = scanner.next();
			try {
				inputEndDate = parseFormat(endDate);
				fontCorrect = true;
			} catch(Exception e){
				fontCorrect = false;
			}

		} while (!fontCorrect);

		prenotazioniRepository.save(new Prenotazione(idCliente, inputStartDate, inputEndDate, prenotationType, oggettoPrenotato));
		Thread.sleep(500);
		System.out.println("Prenotazione per "+attivita.get(input).toString()+" effettuata correttamente.");
		Thread.sleep(500);
		System.out.println("\n");
		System.out.println("Vuoi fare altro? Y se si N se no");

		String more = scanner.next();
		return more.equals("Y") || more.equals("y");

	}

	LocalDate parseFormat(String date) throws InputMismatchException {
		return LocalDate.of(Integer.parseInt(date.substring(6,10)),Integer.parseInt(date.substring(3,5)),Integer.parseInt(date.substring(0,2)));
	}
}
