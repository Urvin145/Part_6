public class P6_1b implements Runnable {
    public void run() {
        System.out.println("HELLO WORD");
    }

    public static void main(String args[]) {
        P6_1b m1 = new P6_1b();
        Thread t1 = new Thread(m1);   // Using the constructor Thread(Runnable r)
        t1.start();
    }
}

