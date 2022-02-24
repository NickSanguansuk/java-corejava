package trainings.bfs.week1.day3.oop;

public class InterfaceDemo {

    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.simpleMethod();
        demoClass.test();
        Interface3.test();

    }
}

class DemoClass extends C implements Interface1, Interface3 {

    @Override
    public void simpleMethod() {
        System.out.println("override method");
    }

    /*
     * notes: since we allow default method in Java 8 that might cause diamond
     * problem we must override test() here since both Interface1 and Interface2 has default method test().
     * the super keyword: can be used from the implementing class to invoke the interface default method.
     */
    //@Override
    //public void test() {
    //	System.out.println("Hello World");
    //	//Interface1.super.test();
    //	//Interface2.super.test();
    //}

}

class C {
    //public void test(){
    //	System.out.println("CCC");
    //}
}