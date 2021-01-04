package com.example.javaperfdemo.cpu;

import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

import org.springframework.stereotype.Component;

/**
 * Created by Azeem on 1/4/21.
 */

@Component
public class MultiThreadedHeavyProcess extends TimerTask {

    public MultiThreadedHeavyProcess() {
        Timer timer = new Timer();
        timer.schedule(this, 0, 5000);
    }

    public void run() {
        Thread t1 = new Thread(new HeavyProcess());
        t1.start();
    }

    public class HeavyProcess implements Runnable {
        public void run() {
            while (true) {
                UUID uuid = UUID.randomUUID();
                System.out.println(Thread.currentThread().getName() + uuid.toString());
            }
        }
    }
}
