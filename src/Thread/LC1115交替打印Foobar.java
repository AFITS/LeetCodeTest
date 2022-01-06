package Thread;

import java.util.concurrent.Semaphore;

public class LC1115交替打印Foobar {
    public static void main(String[] args) throws InterruptedException {
         Semaphore fooSema = new Semaphore(2);

        fooSema.acquire();
        System.out.println(fooSema.getQueueLength());

    }
}
