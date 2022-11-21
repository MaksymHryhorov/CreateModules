package executors;

import model.Book;

import java.util.List;
import java.util.concurrent.Semaphore;

public class SmallLibraryThread extends Thread {
    private final Semaphore semaphore;
    private final List<Book> bookList;

    public SmallLibraryThread(Semaphore semaphore, List<Book> bookList) {
        this.semaphore = semaphore;
        this.bookList = bookList;
    }

    public void run() {
        try {
            for (Book book : bookList) {
                semaphore.acquire();
                System.out.println(book.getName() + " is giving to the human");
                sleep(3000);

                System.out.println(book.getName() + " is giving back to the library");
                semaphore.release();

                sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
