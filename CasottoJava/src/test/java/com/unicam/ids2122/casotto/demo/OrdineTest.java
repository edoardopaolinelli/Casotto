package com.unicam.ids2122.casotto.demo;

import com.unicam.ids2122.casotto.demo.Entity.Ordine;
import com.unicam.ids2122.casotto.demo.Entity.Piatto;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
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
        assertEquals(ordine.getIdCliente(), "C_0000");
    }
    @Test
    public void testStartDate(){
        Ordine ordine = new Ordine();
        ordine.setStartOrder(LocalDate.now());
        assertEquals(ordine.getStartOrder(), LocalDate.now());
        assertThrows(IllegalArgumentException.class, () -> ordine.setStartOrder(LocalDate.ofYearDay(1999, 25)), "IllegalArgumentException expected");
    }
    @Test
    public void testEndDate(){
        Ordine ordine = new Ordine();
        ordine.setEndOrder(LocalDate.now().plusDays(1));
        assertEquals(ordine.getEndOrder(), LocalDate.now().plusDays(1));
        assertThrows(IllegalArgumentException.class, () -> ordine.setEndOrder(LocalDate.now().minusDays(1)), "IllegalArgumentException expected");
    }

}
