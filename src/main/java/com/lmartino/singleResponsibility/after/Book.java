package com.lmartino.singleResponsibility.after;

import java.util.List;

/**
 * Created by lore on 13/01/18.
 */
public class Book {
    private String title;
    private String author;
    private List<String> pages;
    private int currentPageIndex = 0;

    public Book(String title, String author, List<String> pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void turnPage() {
        if (currentPageIndex < pages.size() - 1) {
            currentPageIndex++;
        }
    }

    public int getCurrentPage() {
        return currentPageIndex + 1;
    }
}
