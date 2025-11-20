public class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread đang chạy: " + Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyTask: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Bị gián đoạn");
            }
        }
    }
}
