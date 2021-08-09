package topics.basic_demo.test;

// - false false
// - true false
// - false true
// - true true

public class Bool_operator {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = !true;
        boolean c = a || b;
        boolean d = a && b;
        boolean e = d ? b : c;
        System.out.println(d + " " + e);
    }
}
