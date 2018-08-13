package com.cooksys.assignment_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Book {

	@XmlAttribute(name = "genre")
	private String genre;
	@XmlAttribute(name = "date")
	private String date;
	@XmlValue
	private String name;

	public Book() {

	}

	public Book(String genre, String date, String name) {
		this.genre = genre;
		this.date = date;
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [genre=" + genre + ", date=" + date + ", name=" + name + "]";
	}

}
