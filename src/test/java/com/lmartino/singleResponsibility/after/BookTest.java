package com.lmartino.singleResponsibility.after;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lore on 13/01/18.
 */
public class BookTest {

    private Book book;

    @Before
    public void setUp(){
        List<String> pages = new ArrayList<String>();
        pages.add("Hello 1");
        pages.add("Hello 2");
        pages.add("Hello 3");
        pages.add("Hello 4");
        book = new Book("Test", "Pippo", pages);
    }

    @Test
    public void getTitle() throws Exception {
        assertThat(book.getTitle(), is("Test"));
    }

    @Test
    public void getAuthor() throws Exception {
        assertThat(book.getAuthor(), is("Pippo"));
    }

    @Test
    public void getCurrentPage() throws Exception {
        assertThat(book.getCurrentPage(), is(1));
        book.turnPage();
        assertThat(book.getCurrentPage(), is(2));
        book.turnPage();
        assertThat(book.getCurrentPage(), is(3));
    }


}