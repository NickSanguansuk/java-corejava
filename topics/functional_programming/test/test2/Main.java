package topics.functional_programming.test.test2;

public class Main {

    public static void main(String[] args) {

        // Chinese
        Human h1 = new Chinese();

        // Indian
        Human h2 = new Human() {
            @Override
            public String speak(String words) {
                return "Indian speak " + words;
            }
        };

        // Thai
        Human h3 = (words) -> {
            return "Thai speak " + words;
        };

        // Speaking
        System.out.println(h1.speak("aaaaa"));
        System.out.println(h2.speak("bbbbb"));
        System.out.println(h3.speak("ccccc"));
    }
}
