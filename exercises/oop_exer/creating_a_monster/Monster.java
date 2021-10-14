package exercises.oop_exer.creating_a_monster;

public class Monster {

    static {
        System.out.println("A01");
    }

    {
        System.out.println("A02");
    }

    protected String name;

    public Monster(String name) {
        this.name = name;
    }

    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }

    static {
        System.out.println("A03");
    }

    {
        System.out.println("A04");
    }
}
