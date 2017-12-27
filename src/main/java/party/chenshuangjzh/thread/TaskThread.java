package party.chenshuangjzh.thread;

public class TaskThread extends Thread {
    @Override
    public void run() {
        System.out.println("hello");
        System.out.println(System.currentTimeMillis());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
