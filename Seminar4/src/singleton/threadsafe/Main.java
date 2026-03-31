package singleton.threadsafe;

public class Main {

    static BazaDeDateThreadSafe bazaDeDateThreadSafe1;
    static BazaDeDateThreadSafe bazaDeDateThreadSafe2;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> bazaDeDateThreadSafe1 = BazaDeDateThreadSafe.getInstanta("Baza-ThreadSafe-01", 7));
        Thread thread2 = new Thread(() -> bazaDeDateThreadSafe2 = BazaDeDateThreadSafe.getInstanta("Baza-ThreadSafe-02", 10));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(bazaDeDateThreadSafe1);
        System.out.println(bazaDeDateThreadSafe2);

        // Mereu o sa fie true
        System.out.println(bazaDeDateThreadSafe1 == bazaDeDateThreadSafe2);
    }
}
