package com.lmartino.singleResponsibility.book.after;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lore on 13/01/18.
 */
public class HtmlPrinterTest {

    @Test
    public void print() throws Exception {
        Printer printer = new HtmlPrinter();
        assertThat(printer.print("Printing a sample text"),
                is("<div class='page'>Printing a sample text</div>"));
    }
}