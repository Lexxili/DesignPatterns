package de.abraun.adapter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    final private ExecutorService service;

    public Server() {
        service = Executors.newSingleThreadExecutor();
    }

    public void receive(Message message) {
        service.execute(() -> {
            message.output();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public void stop() {
        service.shutdown();
    }
}
