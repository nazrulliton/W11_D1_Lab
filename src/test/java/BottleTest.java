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
}
