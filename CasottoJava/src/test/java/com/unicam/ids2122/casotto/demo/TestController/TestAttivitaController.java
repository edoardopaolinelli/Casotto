package TestController;

import com.unicam.ids2122.casotto.demo.Controller.AttivitaController;
import com.unicam.ids2122.casotto.demo.Entity.Attivita;
import com.unicam.ids2122.casotto.demo.Repository.AttivitaRepository;
import com.unicam.ids2122.casotto.demo.Service.AttivitaService;
import com.unicam.ids2122.casotto.demo.Service.AttivitaServiceImpl;
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
