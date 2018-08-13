package com.cooksys.assignment_4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		JAXBContext context = null;

		try {
			context = JAXBContext.newInstance(Library.class, Librarian.class, Author.class, Book.class);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Librarian librarianOne = new Librarian(27, 32119, "Samantha North");
		Librarian librarianTwo = new Librarian(62, 60398, "Bill Johnson");

		List<Librarian> librarians = new ArrayList<Librarian>();
		librarians.add(librarianOne);
		librarians.add(librarianTwo);

		List<Book> bookListOne = new ArrayList<Book>();
		List<Book> bookListTwo = new ArrayList<Book>();

		Book bookOne = new Book("fantasy", "1997", "Harry Potter and the Sorcerer's Stone");
		Book bookTwo = new Book("fantasy", "1998", "Harry Potter and the Chamber of Secrets");
		Book bookThree = new Book("fantasy", "1998", "Harry Potter and the Prisoner of Azkaban");
		Book bookFour = new Book("fantasy", "2000", "Harry Potter and the Goblet of Fire");
		Book bookFive = new Book("fantasy", "2003", "Harry Potter and the Order of the Phoenix");
		Book bookSix = new Book("fantasy", "2005", "Harry Potter and the Half Blood Prince");
		Book bookSeven = new Book("fantasy", "2007", "Harry Potter and the Deathly Hallows");

		bookListOne.add(bookOne);
		bookListOne.add(bookTwo);
		bookListOne.add(bookThree);
		bookListOne.add(bookFour);
		bookListOne.add(bookFive);
		bookListOne.add(bookSix);
		bookListOne.add(bookSeven);

		Book bookEight = new Book("fantasy", "2007", "The Name of the Wind");
		Book bookNine = new Book("fantasy", "2011", "The Wise Man's Fear");
		Book bookTen = new Book("fantasy", "2014", "The Slow Regard of Silent Things");

		bookListTwo.add(bookEight);
		bookListTwo.add(bookNine);
		bookListTwo.add(bookTen);

		Author authorOne = new Author(bookListOne, "J.K. Rowling");
		Author authorTwo = new Author(bookListTwo, "Patrick Rothfuss");

		List<Author> authors = new ArrayList<Author>();
		authors.add(authorOne);
		authors.add(authorTwo);

		Library library = new Library("Memphis Library", librarians, authors);

		try {
			Marshaller marshal = context.createMarshaller();
			marshal.setProperty(marshal.JAXB_FORMATTED_OUTPUT, true);
			File file = new File("library.xml");
			marshal.marshal(library, file);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			context.generateSchema(new MySchemaOutputResolver("librarySchema.xsd"));
			System.out.print("Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
