public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("MyThread 1");
        t1.start();

        MyTask task = new MyTask();            // tạo object runnable
        Thread t2 = new Thread(task, "MyThread 2"); // gói runnable vào thread
        t2.start();

        System.out.println("Main thread kết thúc");
    }
}
