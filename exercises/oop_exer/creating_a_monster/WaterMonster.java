package exercises.oop_exer.creating_a_monster;

public class WaterMonster extends Monster {

    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}
