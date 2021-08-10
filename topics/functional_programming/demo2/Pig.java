package topics.functional_programming.demo2;

public class Pig implements Animal {

    @Override
    public String cry(String sound) {
        return "Pig: " + sound;
    }
}
