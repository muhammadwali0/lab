public class LMS {

  public static void main(String[] args) {
    Book book1 = new Book("Atomic Habits", "James Clear", "978-0735211292", 2018, 2);
    book1.displayBookInfo();
    System.out.println();
    book1.updateCopies(9);
    book1.displayBookInfo();
    System.out.println();
    Book book2 = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari");
    book2.displayBookInfo();
    System.out.println();
    Book book3 = new Book("Thinking, Fast and Slow", "Daniel Kahneman", "978-0374275631");
    book3.displayBookInfo();
    System.out.println();
  }

}

class Book {
  String title;
  String author;
  String ISBN;
  int yearPublished;
  int copiesAvailable;

  Book(String title, String author) {
    this(title, author, "Unavailable", 0, 0);
  }

  Book(String title, String author, String ISBN) {
    this(title, author, ISBN, 0, 0);

  }

  Book(String title, String author, String ISBN, int yearPublished, int copiesAvailable) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.yearPublished = yearPublished;
    this.copiesAvailable = copiesAvailable;
  }

  void displayBookInfo() {
    String yearStr = (yearPublished == 0) ? "Unavailable" : String.valueOf(yearPublished);
    System.out.printf("Title: %s\nAuthor: %s\nISBN: %s\nYear Published: %s\nCopies Available: %d\n", title, author,
        ISBN, yearStr, copiesAvailable);
  }

  void updateCopies(int newCopies) {
    copiesAvailable += newCopies;
  }

}
