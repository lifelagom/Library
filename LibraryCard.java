// Создайте обобщенный класс LibraryCard<K, V>, который представляет 
// библиотечную карточку для определенной книги. Каждая карточка должна 
// содержать параметры типов K для номера карточки и V для информации о книге.
public class LibraryCard<K, V> {

    private K numCard;
    private V infoBook;
    private boolean givenCard = false;
    
    public LibraryCard(K numCard, V infoBook) {
        this.numCard = numCard;
        this.infoBook = infoBook;
    }

    public void setGiveCard(boolean give) {
        this.givenCard = give;
    }

    public boolean GiveCard() {
        return givenCard;
    }

    @Override
    public String toString() {
        return "Номер карточки: "+numCard+", Книга: "+infoBook;
    }
}
