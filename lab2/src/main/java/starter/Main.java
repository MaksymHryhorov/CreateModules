package starter;

import executors.SmallLibraryThread;
import model.Book;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        startThreads();
    }

    private static void startThreads() {
        Semaphore semaphore = new Semaphore(generateSemaphore());
        new SmallLibraryThread(semaphore, List.of(
                new Book("B1"),
                new Book("B2"),
                new Book("B3"))).start();
        new SmallLibraryThread(semaphore, List.of(
                new Book("B4"),
                new Book("B5"),
                new Book("B6"))).start();
        new SmallLibraryThread(semaphore, List.of(
                new Book("B7"),
                new Book("B8"),
                new Book("B9"))).start();
    }

    private static int generateSemaphore() {
        Random random = new Random();

        int randomInt = random.nextInt();

        if (randomInt <= 0) {
            randomInt += randomInt;
        }

        return randomInt;
    }

}
