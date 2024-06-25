package de.abraun.singleton;

public class Singleton {

    private static final Singleton instance = new Singleton();
    private String content = "";

    private Singleton () {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void append(String content) {
        this.content += content;
    }
    public String get(){
        return content;
    }

    public void clear(){
        this.content = "";
    }
}
