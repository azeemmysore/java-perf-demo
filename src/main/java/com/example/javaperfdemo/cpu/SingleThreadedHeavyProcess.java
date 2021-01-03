package com.example.javaperfdemo.cpu;

import java.util.UUID;

import org.springframework.stereotype.Component;

/**
 * Created by Azeem on 1/4/21.
 */

@Component
public class SingleThreadedHeavyProcess implements Runnable {
    public SingleThreadedHeavyProcess() {
        Thread t1 = new Thread(this);
        t1.start();
    }

    public void run() {
        while (true) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }
    }
}
