package com.lmartino.dependencyInversion.ebook.after;

/**
 * Created by lore on 14/01/18.
 */
public class TextBook implements EBook {
    public String read() {
        return "Reading a Text Book...";
    }
}
