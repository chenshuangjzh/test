package party.chenshuangjzh.test;

import party.chenshuangjzh.thread.TaskThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        int i = 0;
        while(i != 10){
            i++;
            executorService.execute(new TaskThread());
        }
    }
}
