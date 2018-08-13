package com.cooksys.assignment_4;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Library {

	@XmlElement
	private String name;
	@XmlElementWrapper
	@XmlElement(name = "librarian")
	private List<Librarian> librarians;
	@XmlElementWrapper
	@XmlElement(name = "author")
	private List<Author> authors;

	public Library() {

	}

	public Library(String name, List<Librarian> librarians, List<Author> authors) {
		this.name = name;
		this.librarians = librarians;
		this.authors = authors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Librarian> getLibrarians() {
		return librarians;
	}

	public void setLibrarians(List<Librarian> librarians) {
		this.librarians = librarians;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", librarians=" + librarians + ", authors=" + authors + "]";
	}

}
