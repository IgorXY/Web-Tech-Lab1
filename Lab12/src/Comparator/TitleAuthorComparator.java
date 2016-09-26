package Comparator;

import java.util.Comparator;

import Logic.Book;

public class TitleAuthorComparator implements Comparator<Book>{
	
	@Override
	public int compare(Book x, Book y){
		if((x.getTitle().compareTo(y.getTitle())) > 0)
			return 1;
		else
			if((x.getTitle().compareTo(y.getTitle())) == 0)
				if((x.getAuthor().compareTo(y.getAuthor())) > 0)
					return 1;
		return -1;
	}

}
