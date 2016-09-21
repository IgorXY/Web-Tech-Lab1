package Data;

import java.util.Scanner;

import Logic.Book;
import Logic.ProgrammerBook;

public class Task13 {

	public static void main(String[] args) {
		ProgrammerBook book = new ProgrammerBook();
		
		Scanner scanner = new Scanner(System.in);		
		//scanner.nextLine();
		System.out.print("Title =");
		String title = scanner.nextLine();
		//scanner.nextLine();
		System.out.print("Author =");
		String author = scanner.nextLine();
		System.out.print("Language =");
		String language = scanner.nextLine();
		System.out.print("Price =");
		int price = scanner.nextInt();
		System.out.print("Edition =");
		int edition = scanner.nextInt();
		System.out.print("Level =");
		int level = scanner.nextInt();
		
		scanner.close();
		
		book.setAuthor(author);
		book.setEdition(edition);
		book.setPrice(price);
		book.setTitle(title);
		book.setLanguage(language);
		book.setLevel(level);
		
		int hash = book.hashCode();
		System.out.println("hash="+hash);
		String sBook = book.toString();		
		System.out.println(sBook);

	}

}
