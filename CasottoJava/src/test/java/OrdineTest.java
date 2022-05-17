import Entity.Ordine;
import Entity.Piatto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrdineTest {

    @Test
    public void testId(){
        Ordine ordine = new Ordine();
        ordine.setIdOrdine("OR_0000");
        assertEquals(ordine.getIdOrdine(), "OR_0000");
    }

    @Test
    public void testPrice(){
        Ordine ordine = new Ordine();
        ordine.setPrice(25.f);
        assertEquals(ordine.getPrice(), 25.f);
        assertThrows(IllegalArgumentException.class, () -> ordine.setPrice(-5.f), "Expected Illegal Argument Exception for negative values");

    }

    @Test
    public void testOrderedDishes(){
        Ordine ordine = new Ordine();
        List<Piatto> piatti = new ArrayList<>();
        Piatto primo = new Piatto();
        Piatto secondo = new Piatto();
        primo.setId(00001);
        secondo.setId(00002);
        piatti.add(primo);
        piatti.add(secondo);
        ordine.setOrderedDishes(piatti);
        assertEquals(ordine.getOrderedDishes(), piatti);
    }
    @Test
    public void testIdCliente(){
        Ordine ordine = new Ordine();
        ordine.setIdCliente("C_0000");
        assertEquals(ordine.getIdOrdine(), "C_0000");
    }
    @Test
    public void testStartDate(){

    }
    @Test
    public void testEndDate(){

    }

}
