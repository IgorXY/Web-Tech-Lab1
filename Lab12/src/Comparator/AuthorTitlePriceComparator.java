package Comparator;

import java.util.Comparator;

import Logic.Book;

public class AuthorTitlePriceComparator  implements Comparator<Book>{
	
	@Override
	public int compare(Book x, Book y){
		if((x.getAuthor().compareTo(y.getAuthor())) > 0)
			return 1;
		else
			if((x.getAuthor().compareTo(y.getAuthor())) == 0)
				if((x.getTitle().compareTo(y.getTitle())) > 0)
					return 1;
				else
					if((x.getTitle().compareTo(y.getTitle())) == 0)
						if(x.getPrice()>y.getPrice())
							return 1;
		return -1;
	}

}
