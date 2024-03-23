// Создайте класс Library, который будет представлять библиотеку. У этого 
// класса должны быть методы для добавления книг и выдачи библиотечных карточек.
// Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.
import java.util.HashMap;
import java.util.Map;

public class Library<K, V> {
    
    Map<LibraryCard<K, V>, Book<V>> librMap;

    public Library() {
        librMap = new HashMap<>();
    }
    
    public void addBook(LibraryCard<K, V> card, Book<V> book) {
        librMap.put(card, book);
    }

    public void GiveLibraryCard(LibraryCard<K, V> card) {
        card.setGiveCard(true);
    }

    public void givenBooksInfo() {
        System.out.println("Выданные книги:");
        for (LibraryCard<K, V> item : librMap.keySet()) {
            if (item.GiveCard()) {
                System.out.println(item);  
            }
        }
    }
}
