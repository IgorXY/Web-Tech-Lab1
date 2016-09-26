package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import Comparator.*;
import Logic.Book;


public class BookTestCase {
	Book book1 = new Book();
	Book book2 = new Book();
	ArrayList<Book> bookArray = new ArrayList<Book>();
	@Test
	public void TestRightHash() {
		book1.setAuthor("");
		book1.setTitle("");
		book1.setPrice(0);
		book1.setEdition(1);
		int hash = book1.hashCode();
		assertTrue(hash == 31);
	}
	
	@Test
	public void TestRightEquals() {
		book1.setAuthor("");
		book1.setTitle("");
		book1.setPrice(0);
		book1.setEdition(1);
		book2.setAuthor("");
		book2.setTitle("");
		book2.setPrice(0);
		book2.setEdition(1);
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
		String bookString = book1.toString();
		String res = "Title: \"Java for students\", ";
		res += "Author: \"Igor\", ";
		res += "Price: 50000, ";
		res += "Edition: 1";
		assertTrue(bookString.equals(res));
	}
	
	@Test
	public void TestClone() {
		book1.setAuthor("Igor");
		book1.setTitle("Java for students");
		book1.setPrice(50000);
		book1.setEdition(1);
		book2 = book1.clone();
		assertTrue(book1.equals(book2));
	}
	
	public static void FillArray(ArrayList<Book> bookArray) {
		Book book1 = new Book();
		book1.setAuthor("Igor");
		book1.setTitle("Java for students");
		book1.setPrice(50000);
		book1.setEdition(1);
		bookArray.add(book1);
		book1 = new Book();
		book1.setAuthor("Igor");
		book1.setTitle("C# for students");
		book1.setPrice(50000);
		book1.setEdition(1);
		bookArray.add(book1);
		book1 = new Book();
		book1.setAuthor("Igor");
		book1.setTitle("Delphi for students");
		book1.setPrice(50000);
		book1.setEdition(1);
		bookArray.add(book1);
		book1 = new Book();
		book1.setAuthor("Igor");
		book1.setTitle("Assembler for students");
		book1.setPrice(50000);
		book1.setEdition(1);
		bookArray.add(book1);
		book1 = new Book();
		book1.setAuthor("Igor");
		book1.setTitle("PHP for students");
		book1.setPrice(50000);
		book1.setEdition(1);
		bookArray.add(book1);
	}
	
	@Test
	public void TestSortTitle() {
		FillArray(bookArray);
		bookArray.sort(new TitleComparator());		
		assertTrue(bookArray.get(0).getTitle().equals("Assembler for students"));
	}
	
	@Test
	public void TestSortTitleAuthor() {
		FillArray(bookArray);
		book1 = new Book();
		book1.setAuthor("Vasya");
		book1.setTitle("Assembler for students");
		book1.setPrice(50000);
		book1.setEdition(1);
		bookArray.add(book1);
		bookArray.sort(new TitleAuthorComparator());		
		assertTrue(bookArray.get(0).getAuthor().equals("Igor"));
	}
	
	@Test
	public void TestSortAuthorTitle() {
		FillArray(bookArray);
		book1 = new Book();
		book1.setAuthor("Asya");
		book1.setTitle("SQL for students");
		book1.setPrice(50000);
		book1.setEdition(1);
		bookArray.add(book1);
		bookArray.sort(new AuthorTitleComparator());		
		assertTrue(bookArray.get(0).getAuthor().equals("Asya"));
	}
	
	@Test
	public void TestSortAuthorTitlePrice() {
		FillArray(bookArray);
		book1 = new Book();
		book1.setAuthor("Asya");
		book1.setTitle("SQL for students");
		book1.setPrice(50000);
		book1.setEdition(1);
		bookArray.add(book1);
		book1 = new Book();
		book1.setAuthor("Asya");
		book1.setTitle("SQL for students");
		book1.setPrice(10000);
		book1.setEdition(1);
		bookArray.add(book1);
		bookArray.sort(new AuthorTitlePriceComparator());		
		assertTrue(bookArray.get(0).getPrice() == 10000);
	}
	
}
