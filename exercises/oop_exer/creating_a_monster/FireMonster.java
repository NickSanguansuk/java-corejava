package exercises.oop_exer.creating_a_monster;

public class FireMonster extends Monster {

    static {
        System.out.println("B01");
    }

    {
        System.out.println("B02");
    }

    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        //System.out.println(this.name + super.name);
        return "Attack with fire!";
    }

    static {
        System.out.println("B03");
    }

    {
        System.out.println("B04");
    }
}
