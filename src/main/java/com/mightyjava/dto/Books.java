package com.mightyjava.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.mightyjava.domain.Book;

@XmlRootElement
public class Books extends ArrayList<Book> {

	private static final long serialVersionUID = -3739114145281445129L;

	public Books() {

	}

	@XmlElement
	public List<Book> getBooks() {
		return this;
	}
}
