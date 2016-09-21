package Data;

import java.util.Scanner;

import Logic.Book;

public class Task12 {

	public static void main(String[] args) {
		Book book = new Book();
		
		Scanner scanner = new Scanner(System.in);		
		//scanner.nextLine();
		System.out.print("Title =");
		String title = scanner.nextLine();
		//scanner.nextLine();
		System.out.print("Author =");
		String author = scanner.nextLine();
		System.out.print("Price =");
		int price = scanner.nextInt();
		System.out.print("Edition =");
		int edition = scanner.nextInt();
		
		scanner.close();
		
		book.setAuthor(author);
		book.setEdition(edition);
		book.setPrice(price);
		book.setTitle(title);
		
		int hash = book.hashCode();
		System.out.println("hash="+hash);
		String sBook = book.toString();		
		System.out.println(sBook);
		
		}

}
