package com.lmartino.dependencyInversion.after;

/**
 * Created by lore on 14/01/18.
 */
public class TextBook implements EBook {
    public String read() {
        return "Reading a Text Book...";
    }
}
