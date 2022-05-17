import Entity.Lettino;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LettinoTest {

    @Test
    public void testId(){
        Lettino lettino = new Lettino();
        lettino.setId("L_0000");
        assertEquals(lettino.getIdLettino(), "L_0000");
    }

    @Test
    public void testPrice(){
        Lettino lettino = new Lettino();
        lettino.setPrice(5.f);
        assertEquals(lettino.getPrice(), 5.f);
    }

    @Test
    public void testType(){
        Lettino lettino = new Lettino();
        lettino.setType("Sdraio");
        assertEquals(lettino.getType(), "Sdraio");
    }
}
