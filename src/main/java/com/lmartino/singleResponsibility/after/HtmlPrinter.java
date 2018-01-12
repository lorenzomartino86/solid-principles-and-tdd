package com.lmartino.singleResponsibility.after;

/**
 * Created by lore on 13/01/18.
 */
public class HtmlPrinter implements Printer{
    public String print(String text) {
        return "<div class='page'>" + text + "</div>";
    }
}
