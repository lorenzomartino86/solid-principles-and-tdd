package main.java.com.lmartino.singleResponsibility.book.before;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lore on 13/01/18.
 */
public class Book {
    private String title;
    private String author;
    private List<String> pages;
    private int currentPageIndex = 0;

    public Book(String title, String author, ArrayList<String> pages) {
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

    public String printCurrentPage(String displayType) {
        if (displayType.equals("plainText")) {
            return pages.get(currentPageIndex);
        } else if (displayType.equals("html")) {
            return "<div class='page'>" + pages.get(currentPageIndex) + "</div>";
        }
        return "Unknown type";
    }

    public int getCurrentPage() {
        return currentPageIndex + 1;
    }
}
