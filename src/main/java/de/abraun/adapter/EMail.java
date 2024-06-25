package de.abraun.adapter;

import java.time.LocalDateTime;

public class EMail implements Message {

    final private String from, to, body;
    final private LocalDateTime sendAt;


    public EMail(String from, String to, String body) {
        this.from = from;
        this.to = to;
        this.body = body;
        sendAt = LocalDateTime.now();
    }

    @Override
    public void output() {
        System.out.println("--- SEND E-MAIL ---");
        System.out.println("--- AT: " + sendAt);
        System.out.println("--- FROM: " + from);
        System.out.println("--- TO: " + to);
        System.out.println("--- BODY: " + body);
        System.out.println();
    }
}
