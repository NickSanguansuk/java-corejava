package topics.advanced_string.demo3_split;

public class Main {

    public static void main(String[] args) {

        String Str = new String("Welcome-to-TutorialsPoint.com");

        System.out.println("Return Value :" );
        for (String retval: Str.split("-", 2)) {
            System.out.println(retval);
        }

        System.out.println("----------");

        System.out.println("Return Value :" );
        for (String retval: Str.split("-", 3)) {
            System.out.println(retval);
        }

        System.out.println("----------");

        System.out.println("Return Value :" );
        for (String retval: Str.split("-", 0)) {
            System.out.println(retval);
        }

        System.out.println("----------");
    }
}
