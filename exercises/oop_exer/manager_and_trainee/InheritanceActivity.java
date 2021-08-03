package exercises.oop_exer.manager_and_trainee;

public class InheritanceActivity {

    public static void main(String[] args) {

        System.out.println("Problem Statement 1");

        // Test case #1
        Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        manager.calculateSalary();

        // Test case #2
        Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        trainee.calculateSalary();

        System.out.println("----------");

        System.out.println("Problem Statement 2");



    }
}
