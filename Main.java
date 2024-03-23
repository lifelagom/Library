public class Main {

    public static void main(String[] args) {
        Book<String> book1 = new Book<>("Java головного мозга");
        Book<String> book2 = new Book<>("Python для чайников");
        Book<String> book3 = new Book<>("Основы Pascal");
        LibraryCard<Integer, String> card1 = new LibraryCard<>(100, book1.getName());
        LibraryCard<Integer, String> card2 = new LibraryCard<>(101, book2.getName());
        LibraryCard<Integer, String> card3 = new LibraryCard<>(102, book3.getName());
        Library<Integer, String> library = new Library<>();
        library.addBook(card1, book1);
        library.addBook(card2, book2);
        library.addBook(card3, book3);
        library.GiveLibraryCard(card1);
        library.GiveLibraryCard(card2);
        library.givenBooksInfo();
    }
}