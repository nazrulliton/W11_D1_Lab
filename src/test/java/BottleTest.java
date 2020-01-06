import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BottleTest {

    Bottle bottle;
    @Before
    public void before(){
        bottle = new Bottle();

    }
    @Test
    public void hasVolume(){
        assertEquals (100, bottle.getVolume());
    }
    @Test
    public void takeDrink(){
        assertEquals(90, bottle.takesDrink());
    }
    @Test
    public void takeThreeDrinks(){
        bottle.takesDrink();
        bottle.takesDrink();
        assertEquals(70, bottle.takesDrink());
    }

    @Test
    public void emptiesBottle(){
        assertEquals(0, bottle.emptyBottle());
    }
    @Test
    public void fillsBottle(){
        assertEquals(100, bottle.fillBottle());
    }
}
