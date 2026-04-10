public class LMS {

  public static void main(String[] args) {
    Book book1 = new Book("Atomic Habits", "James Clear", 2);
    System.out.print(book1.getBookInfo());
    System.out.println();
    book1.addCopies(9);
    System.out.print(book1.getBookInfo());
    System.out.println();

    Book book2 = new Book("Sapiens)): A Brief History of Humankind", "Yuval Noah Harari", 5);
    System.out.print(book2.getBookInfo());
    System.out.println();

    Book book3 = new Book("Thinking, Fast and Slow", "Daniel Kahneman", 3);
    System.out.print(book3.getBookInfo());
    System.out.println();
    book3.borrowBook();
    System.out.println();
    System.out.print(book3.getBookInfo());
    System.out.println();

    Book[] books = { book1, book2 };
    Library lib1 = new Library(books);
    lib1.addBook(book3);
    System.out.print(lib1.findBookByTitle("Atomic Habits").getBookInfo());
    System.out.println();
    System.out.print(lib1.totalBooks());
    System.out.println();
    lib1.borrowBookFromLibrary("Thinking, Fast and Slow");
    System.out.println();
  }

}

class Book {
  String title;
  String author;
  int copiesAvailable;

  Book(String title, String author, int copiesAvailable) {
    this.title = title;
    this.author = author;
    this.copiesAvailable = copiesAvailable;
  }

  String getBookInfo() {
    return "Title: " + title + "\nAuthor: " + author + "\nCopies Available: " + copiesAvailable + "\n";
  }

  void addCopies(int newCopies) {
    copiesAvailable += newCopies;
  }

  void borrowBook() {

    if (copiesAvailable > 0) {
      copiesAvailable--;
      System.out.print("Borrowing was successful.\n");
    }

    else {
      System.out.print("Book out of stock.\n");
    }

  }

}

class Library {
  Book[] books = {};

  Library(Book[] books) {
    this.books = books.clone();
  }

  void addBook(Book book) {
    Book[] temp = new Book[books.length + 1];

    for (int i = 0; i < books.length; i++) {
      temp[i] = books[i];
    }

    temp[books.length] = book;
    this.books = temp;
  }

  Book findBookByTitle(String title) {

    for (Book book : books) {

      if (book.title.equalsIgnoreCase(title)) {
        return book;
      }

    }

    System.out.printf("Book not found.\n");
    return null;
  }

  int totalBooks() {
    return books.length;
  }

  void borrowBookFromLibrary(String title) {

    for (Book book : books) {

      if (book.title.equalsIgnoreCase(title)) {
        book.borrowBook();
      }

    }

  }

}
