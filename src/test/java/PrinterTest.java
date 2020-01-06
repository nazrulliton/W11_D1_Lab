import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){
        printer = new Printer (100, 10, 2);
    }
    @Test
    public void hasVolume(){
        assertEquals(100, printer.getVolume());
    }
    @Test
    public void toPrint(){
        assertEquals(80, printer.print());
    }

}
