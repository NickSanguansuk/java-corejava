package topics.static_demo;

public class MyMain {

    int number = 5;

    public static void main(String[] args) {

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

        // Recommended (for static variables)
        System.out.println(StaticDemo.var1);
        System.out.println(StaticDemo.var2);

        // Not recommended (for static variables)
        System.out.println(obj1.var1);
        System.out.println(obj1.var2);

        System.out.println("----------");
        System.out.println("static variables");

        obj1.var1 = 30;
        obj2.var1 = 40;
        obj3.var1 = 50;

        System.out.println(obj1.var1);
        System.out.println(obj2.var1);
        System.out.println(obj3.var1);

        System.out.println("----------");
        System.out.println("non-static variables");

        obj1.var3 = 33;
        obj2.var3 = 44;
        obj3.var3 = 55;

        System.out.println(obj1.var3);
        System.out.println(obj2.var3);
        System.out.println(obj3.var3);

        System.out.println("----------");
        System.out.println("static methods");

        StaticDemo.addingNumber(100, 200);

        System.out.println("----------");
        System.out.println("Testing01");

        MyMain myMain = new MyMain();
        System.out.println(StaticDemo.var1 + myMain.number);

        System.out.println("----------");
        System.out.println("abstract class with only static method");

        Announcement.announce();

        System.out.println("----------");

    }
}
