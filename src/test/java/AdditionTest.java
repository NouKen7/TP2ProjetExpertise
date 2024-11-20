import org.example.Addition;
import org.example.Produit;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AdditionTest {

    @Test
    public void testSomme() {
        assertEquals(3, Addition.add(2, 1));
    }


}

