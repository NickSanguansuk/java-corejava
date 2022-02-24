package trainings.bfs.week1.day4.collection;

//public class Teacher implements Comparable<Teacher> {
//    private int id;
//
//    public Teacher(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    @Override
//    public String toString() {
//        return "Teacher " + this.id;
//    }
//
//    @Override
//    public int compareTo(Teacher o) {
//        return this.id - o.getId();
//    }
//}

public class Teacher {
    private int id;

    public Teacher(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher " + this.id;
    }
}