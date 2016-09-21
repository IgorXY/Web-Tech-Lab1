package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.Book;
import Logic.ProgrammerBook;

public class ProgrammerBookTestCase {

	ProgrammerBook book1 = new ProgrammerBook();
	ProgrammerBook book2 = new ProgrammerBook();
	@Test
	public void TestRightHash() {
		book1.setAuthor("");
		book1.setTitle("");
		book1.setPrice(0);
		book1.setEdition(1);
		book1.setLanguage("");
		book1.setLevel(0);
		int hash = book1.hashCode();
		assertTrue(hash == 31);
	}
	
	@Test
	public void TestRightEquals() {
		book1.setAuthor("");
		book1.setTitle("");
		book1.setPrice(0);
		book1.setEdition(1);
		book1.setLanguage("");
		book1.setLevel(0);
		book2.setAuthor("");
		book2.setTitle("");
		book2.setPrice(0);
		book2.setEdition(1);
		book2.setLanguage("");
		book2.setLevel(0);
		assertTrue(book1.equals(book2));
	}
	
	@Test
	public void TestWrongEquals() {
		book1.setAuthor("Igor");
		book1.setTitle("");
		book1.setPrice(0);
		book1.setEdition(1);
		book2.setAuthor("");
		book2.setTitle("");
		book2.setPrice(0);
		book2.setEdition(1);
		assertFalse(book1.equals(book2));
	}
	
	@Test
	public void TestRightToString() {
		book1.setAuthor("Igor");
		book1.setTitle("Java for students");
		book1.setPrice(50000);
		book1.setEdition(1);
		book1.setLanguage("Java");
		book1.setLevel(1);
		String bookString = book1.toString();
		String res = "Title: \"Java for students\", ";
		res += "Author: \"Igor\", ";
		res += "Price: 50000, ";
		res += "Edition: 1, ";
		res += "Language: \"Java\", ";
		res += "Level: 1";
		assertTrue(bookString.equals(res));
	}

}
