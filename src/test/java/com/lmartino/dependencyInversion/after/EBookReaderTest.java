package com.lmartino.dependencyInversion.after;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lore on 14/01/18.
 */
public class EBookReaderTest {

    @Test
    public void readPdfBook() throws Exception {
        EBookReader reader = new EBookReader(new PDFBook());
        assertThat(reader.read(), is("Reading a PDF Book..."));
    }

    @Test
    public void readMobileBook() throws Exception {
        EBookReader reader = new EBookReader(new MobileBook());
        assertThat(reader.read(), is("Reading a Mobile Book..."));
    }

    @Test
    public void readTextBook() throws Exception {
        EBookReader reader = new EBookReader(new TextBook());
        assertThat(reader.read(), is("Reading a Text Book..."));
    }
}