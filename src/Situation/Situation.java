package Situation;

import humans.Human;

public class Situation {
    private String name;
    private int score;

    public Situation(String name, int score) {

        this.name = name;
        this.score = score;

    }

    public void inflictOnHuman(Human human) {
        System.out.println(human.toString() + " " + name);
        human.addHappiness(score);
    }

}
