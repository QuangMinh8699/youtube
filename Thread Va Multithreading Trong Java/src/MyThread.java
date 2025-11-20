class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread đang chạy: " + getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(500); // ngủ 0.5s để thấy rõ luồng hoạt động
            } catch (InterruptedException e) {
                System.out.println("Đại ca ơi, có biến rồi");
            }
        }
    }
}