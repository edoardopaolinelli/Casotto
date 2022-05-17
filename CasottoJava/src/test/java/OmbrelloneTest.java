import Entity.Lettino;
import Entity.Ombrellone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OmbrelloneTest {

    @Test
    public void testId(){
        Ombrellone ombrellone = new Ombrellone();
        ombrellone.setId("OM_0000");
        assertEquals(ombrellone.getIdOmbrellone(), "OM_0000");
    }

    @Test
    public void testPrice(){
        Ombrellone ombrellone = new Ombrellone();
        ombrellone.setPrice(10.f);
        assertEquals(ombrellone.getPrice(), 10.f);
    }

    @Test
    public void testType(){
        Ombrellone ombrellone = new Ombrellone();
        ombrellone.setType("Sdraio");
        assertEquals(ombrellone.getType(), "Sdraio");
    }
}
