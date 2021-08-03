package topics.class_demo.finalize_demo;

public class FinalizeMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            new Box();
        }

        System.out.println("----------");
        System.out.println("Make infinite loop (Ctrl+C to exit)");

        //while (true) {
        //    new Box();
        //}

        System.out.println("----------");

        // 3 things that are totally different
        // - final
        // - finally
        // - finalize()

    }
}
