package topics.functional_programming.demo1;

public class HumanDemo {

    HumanInterface h = new HumanInterface() {
        @Override
        public void say() {
            String msg = "bra bra bra bra";
            System.out.println(msg);
        }
    };

    HumanInterface2 h2 = new HumanInterface2() {
        @Override
        public String eat(Integer num) {
            return "I ate " + num + " dishes";
        }
    };

    TeacherInterface<String> tString = new TeacherInterface<String>() {
        @Override
        public String teach(String str) {
            return "Teaching " + str;
        }
    };

    TeacherInterface<Integer> tInteger = new TeacherInterface<Integer>() {
        @Override
        public String teach(Integer num) {
            if (num % 2 == 0) {
                return "Number " + num + " is even";
            } else {
                return "Number " + num + " is odd";
            }
        }
    };

}
