package trainings.bfs.week1.day4.collection;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getId() - o2.getId();
    }
}
