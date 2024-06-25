package de.abraun.adapter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tweet {

    final private String author, body;
    final private LocalDateTime tweetAt;
    private List<String> tags;


    public Tweet(String author, String body, String... tags) {
        this.author = author;
        this.body = body;
        this.tags = new ArrayList<>(Arrays.asList(tags));
        this.tweetAt = LocalDateTime.now();
    }

    public void addTag(String tag, String... tags) {
        this.tags.add(tag);
        if (tags.length > 0) {
            this.tags.addAll(Arrays.asList(tags));
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getTweetAt() {
        return tweetAt;
    }

    public List<String> getTags() {
        return tags;
    }

    public void output() {
        //here the tweet should be emitted to Twitter or such.
        System.out.println("!! TWEET !!");
        System.out.println("Date: " + tweetAt);
        System.out.println("Autor: " + author);
        System.out.println("Tags: #" + (String.join(", #", tags)));
        System.out.println("Body: " + body);
        System.out.println();
    }
}
