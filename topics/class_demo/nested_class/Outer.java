package topics.class_demo.nested_class;

public class Outer {
    public int x = 5;
    private int y = 8;
    public int valueOut;
    //public static int g;

    public Outer(int valueOut) {
        this.valueOut = valueOut;
        //g++;
    }

    class Inner {
        public int a = 1;
        private int b = 2;
        public int valueIn;

        public Inner(int valueIn) {
            this.valueIn = valueIn;
        }

        public int methodTwo() {

            return x + y + a + b;
        }
    }

    public int methodOne() {

        Inner in = new Inner(201);

        return x + y + in.a + in.b;
    }

    public static void main(String[] args) {

        Outer out01 = new Outer(101);
        System.out.println(out01.methodOne());
        System.out.println(out01.valueOut);

        System.out.println("----------");

        Outer.Inner in01 = new Outer(102).new Inner(202);
        System.out.println(in01.methodTwo());
        System.out.println(in01.valueIn);

        System.out.println("----------");

        Outer.Inner in02 = out01.new Inner(203);
        Outer.Inner in03 = out01.new Inner(204);

        System.out.println(in02.methodTwo());
        System.out.println(in02.valueIn);
        System.out.println(in03.methodTwo());
        System.out.println(in03.valueIn);
    }
}
