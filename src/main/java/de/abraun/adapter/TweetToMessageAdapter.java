package de.abraun.adapter;

public class TweetToMessageAdapter implements Message {

    private Tweet tweet;

    public TweetToMessageAdapter(Tweet tweet) {
        this.tweet = tweet;
    }

    @Override
    public void output() {
        System.out.println("--- SEND TWEET ---");
        System.out.println("--- AT: " + tweet.getTweetAt());
        System.out.println("--- FROM: " + tweet.getAuthor());
        System.out.println("--- TAGS: #" + String.join(", #", tweet.getTags()));
        System.out.println("--- BODY: " + tweet.getBody());
        System.out.println();

        //output of tweet is to show the difference
        tweet.output();
    }
}
