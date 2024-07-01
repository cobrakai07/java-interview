public class Demo {
    public static void main(String args[]) {

        Thread t = new Thread(() -> {
            while (true)
                System.out.println("Hello " + Thread.currentThread());

        }, "ThreadName");
        int i = 0;
        t.start();
        while (true) {
            System.out.println("Main " + i);
            i++;
        }
    }
} 