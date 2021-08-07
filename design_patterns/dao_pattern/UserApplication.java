package design_patterns.dao_pattern;

import java.util.Optional;

public class UserApplication {
    private static Dao<User> userDao;

    public static void main(String[] args) {
        userDao = new UserDao();

        // id == 0
        User user1 = getUser(0);
        System.out.println(user1);
        System.out.println(user1.getName());
        userDao.update(user1, new String[]{"Jake", "jake@domain.com"});

        // id == 1
        User user2 = getUser(1);
        userDao.delete(user2);
        userDao.save(new User("Julie", "julie@domain.com"));

        System.out.println("----------");

        userDao.getAll().forEach(user -> System.out.println(user.getName()));
    }

    private static User getUser(long id) {
        Optional<User> user = userDao.get(id);

        return user.orElseGet(() -> new User("non-existing user", "no-email"));
    }

}
