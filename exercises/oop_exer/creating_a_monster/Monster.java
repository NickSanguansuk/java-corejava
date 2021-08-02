package exercises.oop_exer.creating_a_monster;

public class Monster {
    protected String name;

    public Monster(String name) {
        this.name = name;
    }

    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}
