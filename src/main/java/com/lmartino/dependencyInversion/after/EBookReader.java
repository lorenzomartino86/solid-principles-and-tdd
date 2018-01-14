package com.lmartino.dependencyInversion.after;

public class EBookReader {

	private EBook eBook;
	
	public EBookReader(EBook eBook) {
		this.eBook = eBook;
	}

	public String read() {
		return eBook.read();
	}
	
}
