package TestController;

import Controller.AttivitaController;
import Entity.Attivita;
import Repository.AttivitaRepository;
import Service.AttivitaService;
import Service.AttivitaServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAttivitaController {

    @Test
    public void testGetAttivita(AttivitaRepository attivitaRepository){
        AttivitaService service = new AttivitaServiceImpl(attivitaRepository);
        AttivitaController controller = new AttivitaController(service);
        Attivita attivita = new Attivita();
        attivita.setId("A_0000");
        controller.addAttivita(attivita);
        assertEquals(controller.getAttivita("A_0000"), attivita);
    }
}
