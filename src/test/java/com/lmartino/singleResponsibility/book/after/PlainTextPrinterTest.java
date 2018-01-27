package com.lmartino.singleResponsibility.book.after;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lore on 13/01/18.
 */
public class PlainTextPrinterTest {

    @Test
    public void print() throws Exception {
        Printer printer = new PlainTextPrinter();
        assertThat(printer.print("Printing a sample text"),
                is("Printing a sample text"));
    }
}