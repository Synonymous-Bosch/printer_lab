import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50, 20);
    }

    @Test
    public void hasPaper() {
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void reducePaperByTenToPrintFiveCopiesOfTwoPageDoc() {
        printer.print(5, 2);
        assertEquals(40, printer.getPaper());
    }

    @Test
    public void reduceTonerByTenToPrintFiveCopiesOfTwoPageDoc() {
        printer.print(5, 2);
        assertEquals(10, printer.getToner());
    }

    @Test
    public void notEnoughPaper() {
        Printer badPrinter = new Printer(5, 10);
        badPrinter.print(5, 2);
        assertEquals(5, badPrinter.getPaper());
    }
}
