package Logic;

public class Book implements Cloneable, Comparable{
	
	
	private String title;
	private String author;
	private int price;
	private int edition;
	private int isbn;
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setPrice(int price){
		if(price>0)
			this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void setEdition(int edition){
		if(edition>0)
			this.edition = edition;
	}
	
	public int getEdition(){
		return edition;
	}
	
	public void setIsbn(int isbn){
		if(isbn>0)
			this.isbn = isbn;
	}
	
	public int getIsbn(){
		return isbn;
	}
	
	@Override
	public boolean equals(Object object){
		if(!(object instanceof Book))
			return false;
		Book book = (Book)object;
		if(!(this.title.equals(book.getTitle())))
				return false;
		if(!(this.author.equals(book.getAuthor())))
			return false;
		if(this.price != book.getPrice())
			return false;
		if(this.edition != book.getEdition())
			return false;
		return true;		
	}
	
	@Override
	public int hashCode(){
		int res = 0;
		for(int i =0 ;i<title.length(); i++)
			res+=title.codePointAt(i);
		for(int i =0 ;i<author.length(); i++)
			res+=author.codePointAt(i);
		res+=price;
		res+=(edition * 31) % 65536;
		return res;
	}
	
	@Override
	public String toString(){
		String res = "Title: \""+title+"\", ";
		res += "Author: \""+author+"\", ";
		res += "Price: "+price+", ";
		res += "Edition: "+edition;
		return res;
	}
	
	@Override
	public Book clone(){
		Book cloneBook = new Book();
		cloneBook.setAuthor(author);
		cloneBook.setEdition(edition);
		cloneBook.setPrice(price);
		cloneBook.setTitle(title);
		return cloneBook;
	}

	@Override
	public int compareTo(Object obj) {
		Book book = (Book)obj;
		if(isbn>book.getIsbn())
			return 1;
		if(isbn==book.getIsbn())
			return 0;
		return -1;
	}

}
