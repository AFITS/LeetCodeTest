package Thread;

public class AL多线程打印1到10 {


    public static void main(String[] args) {
        Print print = new Print();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i += 2) {
                    print.print(i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i += 2) {
                    print.print(i);
                }
            }
        });

        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();

    }
}

class Print {
    public synchronized void print(int i) {
        try {
            this.notify();
            System.out.println("this is：" + i + Thread.currentThread().getName());
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
