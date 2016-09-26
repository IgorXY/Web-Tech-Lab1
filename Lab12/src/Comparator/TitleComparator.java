package Comparator;

import java.util.Comparator;

import Logic.Book;

public class TitleComparator implements Comparator<Book> {
	@Override
	public int compare(Book x, Book y){
		return(x.getTitle().compareTo(y.getTitle()));
		}	
}
