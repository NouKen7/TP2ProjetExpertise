import org.example.Produit;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ProduitTest {

    @Test
    public void testMultiplierPositifs() {
        assertEquals(2, Produit.multiplier(2,1));
    }

    @Test
    public void testMultiplierNegatifs() {
        assertEquals(-2, Produit.multiplier(-1, 2));
    }
}

