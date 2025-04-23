package Views;

import Models.Book;

public class ViewConsole {
    public void showMessage(String message){
        System.out.println(message);
    }

    public void printArray(Book[] books){
        for (Book b: books)
        System.out.println(b);
    }
    
}
