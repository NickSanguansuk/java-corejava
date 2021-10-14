package topics.class_demo.test;

public class Outer {
    public int x = 5;
    private int y = 8;

    class Inner {
        public int a = 1;
        private int b = 2;

        public int methodTwo() {

            return x + y + a + b;
        }
    }

    public int methodOne() {

        Inner in = new Inner();

        return x + y + in.a + in.b;
    }

    public static void main(String[] args) {

        Outer out01 = new Outer();

        System.out.println(out01.methodOne());

        Outer.Inner in01 = new Outer().new Inner();

        System.out.println(in01.methodTwo());
    }
}
