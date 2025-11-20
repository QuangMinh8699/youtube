public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("MyThread 1");
        t1.start();

        System.out.println("Main thread kết thúc");
    }
}
