package de.abraun.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Server serv1 = new Server();

        //pushes mails to the server
        serv1.receive(new EMail("p.parker@shield.de", "b.banner@shield.de", "Hallo, ich bin Spiderman."));
        serv1.receive(new EMail("p.parker@shield.de", "t.stark@shield.de", "Hallo, ich bin Spiderman."));
        serv1.receive(new EMail("p.parker@shield.de", "n.romanov@shield.de", "Hallo, ich bin Spiderman."));
        serv1.receive(new EMail("n.romanov@shield.de", "p.parker@shield.de", "Ich weiß!"));

        Tweet t1 = new Tweet("PParker", "Avengers GO!!!", "Spiderman", "Avengers", "Hero", "Power");
        t1.addTag("New York", "NY");
        //push tweet as mail to server
        serv1.receive(new TweetToMessageAdapter(t1));

        serv1.stop();
    }
}
