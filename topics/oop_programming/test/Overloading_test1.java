package topics.oop_programming.test;

// - EXTRACTION1 TRANSFORMATION2 LOADING3
// - extraction1transformation2loading3
// - EXTRACTION1TRANSFORMATION2LOADING3
// - mySQLSqoophdfs

class A {

    void ETL() {
        String E = "mySQL";
        String T = "Sqoop";
        String L = "hdfs";
        System.out.println(E + T + L);
    }

    void ETL(String ETL) {
        System.out.println(ETL.toUpperCase());
    }

    void ETL(String E, String T, String L) {
        System.out.println(E + T + L);
    }
}

public class Overloading_test1 {

    public static void main(String[] args) {

        String E = "extraction1";
        String T = "transformation2";
        String L = "loading3";

        A obj = new A();
        obj.ETL(E + T + L);
    }
}
