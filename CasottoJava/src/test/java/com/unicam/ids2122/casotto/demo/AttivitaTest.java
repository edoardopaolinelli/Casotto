package com.unicam.ids2122.casotto.demo;

import com.unicam.ids2122.casotto.demo.Entity.Attivita;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class AttivitaTest {

    @Test
    public void testGetIdAttivita(){
        Attivita attivita = new Attivita();
        attivita.setId("A_0000");
        assertEquals(attivita.getIdAttivita(),"A_0000");
    }

    @Test
    public void testGetNomeAttivita(){
        Attivita attivita = new Attivita();
        attivita.setName("Torneo");
        assertEquals(attivita.getName(),"Torneo");
    }

    @Test
    public void testGetDescriptionAttivita(){
        Attivita attivita = new Attivita();
        attivita.setDescription("Una nuova attività");
        assertEquals(attivita.getDescription(),"Una nuova attività");
    }

    @Test
    public void testMaxParticipants(){
        Attivita attivita = new Attivita();
        attivita.setMaxPartecipants(100);
        assertEquals(attivita.getMaxParticipants(),100);
    }

    @Test
    public void testActualParticipants(){
        Attivita attivita = new Attivita();
        attivita.setActualPartecipants(10);
        assertEquals(attivita.getActualParticipants(),10);
    }

    @Test
    public void testDate(){
        Attivita attivita = new Attivita();
        attivita.setDate(LocalDate.ofYearDay(LocalDate.now().getYear(), LocalDate.now().getDayOfYear()+1));
        assertEquals(attivita.getDate(),LocalDate.ofYearDay(LocalDate.now().getYear(), LocalDate.now().getDayOfYear()+1));
        assertThrows(IllegalArgumentException.class, () -> attivita.setDate(LocalDate.ofYearDay(1999, 25)), "IllegalArgumentException expected");
    }

    @Test
    public void testHour(){
        Attivita attivita = new Attivita();
        attivita.setDate(LocalDate.now());
        attivita.setHour(LocalTime.of(LocalTime.now().getHour()+1, 0));
        assertEquals(attivita.getHour(), LocalTime.of(LocalTime.now().getHour()+1, 0));
        assertThrows(IllegalArgumentException.class, () -> attivita.setHour(LocalTime.of((LocalTime.now().getHour()-LocalTime.of(0, 1).getHour()), 0)), "IllegalArgumentException expected");
    }


}
