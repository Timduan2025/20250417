package org.example.model;

public class BeefStewWithPotato {
    private int onion;
    private int beef;
    private int potato;
    private int scallion;
    private int sauce;

    public BeefStewWithPotato(int onion, int beef, int potato, int scallion, int sauce) {
        this.onion = onion;
        this.beef = beef;
        this.potato = potato;
        this.scallion = scallion;
        this.sauce = sauce;
    }

    public void serve() {
        System.out.println("主廚特餐");
    }

    public String serve(String name) {
        return name + "主廚特餐";
    }
}
